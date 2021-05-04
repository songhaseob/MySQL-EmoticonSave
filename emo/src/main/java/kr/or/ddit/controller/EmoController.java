package kr.or.ddit.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.ddit.service.EmoService;
import kr.or.ddit.vo.emoVo;

@RequestMapping("spring")
@Controller
public class EmoController {
	
	private static final Logger logger = LoggerFactory.getLogger(EmoController.class);
	
	@Resource(name="emoService")
	private EmoService emoService;
	
	
	@RequestMapping("view")
	public String view(Model model) {
		model.addAttribute("emolist", emoService.selectemo());
		return "main";
	}
	
	@RequestMapping("emosave")
	public String emosave(Model md,emoVo emoVo) {
		emoService.insertEmo(emoVo);
		return "redirect:/spring/view";
	}
	

	
}
