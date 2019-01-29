package chef.uffda.kr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ApplyController extends UffdaController {

	/**
	 * 등록완료
	 * @param mv
	 * @return
	 */
	@RequestMapping(value="/apply/complete", method=RequestMethod.GET)
	public ModelAndView getCompleteView(ModelAndView mv) {
		return mv;
	}
	
	/**
	 * 레시피수정
	 * @param mv
	 * @return
	 */
	@RequestMapping(value="/apply/edit", method=RequestMethod.GET)
	public ModelAndView getEditView(ModelAndView mv) {
		return mv;
	}
	
	/**
	 * 소개
	 * @param mv
	 * @return
	 */
	@RequestMapping(value="/apply/intro", method=RequestMethod.GET)
	public ModelAndView getIintroView(ModelAndView mv) {
		return mv;
	}
	
	/**
	 * 등록현황
	 * @param mv
	 * @return
	 */
	@RequestMapping(value="/apply/list", method=RequestMethod.GET)
	public ModelAndView getListView(ModelAndView mv) {
		return mv;
	}
	
	/**
	 * 안내사항 동의
	 * @param mv
	 * @return
	 */
	@RequestMapping(value="/apply/step1", method=RequestMethod.GET)
	public ModelAndView getStep1View(ModelAndView mv) {
		return mv;
	}
	
	/**
	 * 레시피 작성
	 * @param mv
	 * @return
	 */
	@RequestMapping(value="/apply/step2", method=RequestMethod.GET)
	public ModelAndView getStep2View(ModelAndView mv) {
		return mv;
	}
}
