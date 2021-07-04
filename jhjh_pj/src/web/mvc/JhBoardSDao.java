package web.mvc;

import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;

public class JhBoardSDao {
	Logger logger = Logger.getLogger(JhBoardSDao.class);
	private SqlSessionTemplate sqlSessionTemplate = null;

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
}
