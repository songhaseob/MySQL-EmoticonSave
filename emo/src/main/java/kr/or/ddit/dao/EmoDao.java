package kr.or.ddit.dao;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.or.ddit.vo.emoVo;

@Repository("emoDao")
public class EmoDao implements EmoDaoI{

	@Resource(name = "sqlSessionTemplate")
	private SqlSessionTemplate template;

	@Override
	public int insertEmo(emoVo emoVo) {
		return template.insert("emo.insertEmo", emoVo);
	}

	@Override
	public List<emoVo> selectemo() {
		return template.selectList("emo.selectemo");
	}
	
	
}
