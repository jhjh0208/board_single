package web.mvc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.util.HashMapBinder;

public class JhBoardController extends MultiActionController{
	
	Logger logger = Logger.getLogger(JhBoardController.class);

	private JhBoardLogic jhBoardLogic = null;

	// setter 메소드를 통해 게으른 객체 주입
	public void setJhBoardLogic(JhBoardLogic jhBoardLogic) {
		this.jhBoardLogic = jhBoardLogic;
	}
	
	public ModelAndView getJhBoardList(HttpServletRequest req, HttpServletResponse res) throws Exception {
		logger.info("getJhBoardList 호출 성공");	
		System.out.println("호풀성공");
		HashMapBinder hmb = new HashMapBinder(req);
		Map<String, Object> target = new HashMap<>();
		hmb.bind(target);
		List<Map<String,Object>> jhBoardList = null;
		jhBoardList=jhBoardLogic.getJhBoardList(target);
		logger.info("jhBoardList:"+jhBoardList);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("board/getJhBoardList");
		mav.addObject("jhBoardList", jhBoardList);
		return mav;		
	}
	
}
