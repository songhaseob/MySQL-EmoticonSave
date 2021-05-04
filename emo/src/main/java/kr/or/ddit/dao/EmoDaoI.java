package kr.or.ddit.dao;

import java.util.List;

import kr.or.ddit.vo.emoVo;

public interface EmoDaoI {
	
	//이모지 조회
	List<emoVo> selectemo();
	
	//이모지 등록
	int insertEmo(emoVo emoVo);
}
