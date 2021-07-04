package web.mvc;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

public class JhBoardLogic {
	Logger logger = Logger.getLogger(JhBoardLogic.class);
	
	private JhBoardMDao jhBoardMDao = null;
	private JhBoardSDao jhBoardSDao = null;

	public void setJhBoardMDao(JhBoardMDao jhBoardMDao) {
		this.jhBoardMDao = jhBoardMDao;
	}

	public void setJhBoardSDao(JhBoardSDao jhBoardSDao) {
		this.jhBoardSDao = jhBoardSDao;
	}

	public List<Map<String,Object>> getJhBoardList(Map<String, Object> pmap) {
		logger.info("getBoardList 호출 성공"+pmap.containsKey("gubun"));
		List<Map<String,Object>> jhBoardList = null;
		String gubun = null;
		if(pmap.get("gubun")!=null) {
			gubun = pmap.get("gubun").toString();			
		}
		if(gubun!=null && "detail".equals(gubun)) {
			int bm_no = 0;
			bm_no = Integer.parseInt(pmap.get("bm_no").toString());
			jhBoardMDao.hitCount(bm_no);
		}
		jhBoardList = jhBoardMDao.getJhBoardList(pmap);
		return jhBoardList;
	}
}
