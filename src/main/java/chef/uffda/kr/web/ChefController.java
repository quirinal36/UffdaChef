package chef.uffda.kr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ChefController extends UffdaController {
	/**
	 * 프로필수정
	 * @param mv
	 * @return
	 */
	@RequestMapping(value="/chef/edit", method=RequestMethod.GET)
	public ModelAndView getEditView(ModelAndView mv) {
		return mv;
	}
	/**
	 * 셰프프로필
	 * @param mv
	 * @return
	 */
	@RequestMapping(value="/chef/view", method=RequestMethod.GET)
	public ModelAndView getView(ModelAndView mv) {
		return mv;
	}
}
