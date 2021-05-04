package kr.or.ddit.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.or.ddit.dao.EmoDao;
import kr.or.ddit.vo.emoVo;


@Service("emoService")
public class EmoService implements EmoServiceI{
	
	@Resource(name="emoDao")
	private EmoDao emoDao;
	
	@Override
	public int insertEmo(emoVo emoVo) {
		
		return emoDao.insertEmo(emoVo);
	}

	@Override
	public List<emoVo> selectemo() {
		return emoDao.selectemo();
	}

	
}