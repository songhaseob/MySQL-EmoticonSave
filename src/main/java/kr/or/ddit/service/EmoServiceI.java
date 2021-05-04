package kr.or.ddit.service;

import java.util.List;

import kr.or.ddit.vo.emoVo;

public interface EmoServiceI {
	
	//이모지 조회
	List<emoVo> selectemo();
	
	//이모지 등록
	int insertEmo(emoVo emoVo);
		
}
