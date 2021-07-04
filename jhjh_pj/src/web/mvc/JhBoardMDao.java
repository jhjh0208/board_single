package web.mvc;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;

public class JhBoardMDao {
	Logger logger = Logger.getLogger(JhBoardMDao.class);
	private SqlSessionTemplate sqlSessionTemplate = null;
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	public List<Map<String, Object>> getJhBoardList(Map<String, Object> pmap) {
		List<Map<String, Object>> jhBoardList = null;
		jhBoardList = sqlSessionTemplate.selectList("getJhBoardList",pmap);
		return jhBoardList;
	}
	
	public void hitCount(int bm_no) {
		logger.info("hitCount 호출 성공");
		sqlSessionTemplate.update("hitCount",bm_no);		
	}
}
