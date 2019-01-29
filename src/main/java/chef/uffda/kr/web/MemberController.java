package chef.uffda.kr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController extends UffdaController {
	@RequestMapping(value="/member/delete", method=RequestMethod.GET)
	public ModelAndView getDeleteView(ModelAndView mv) {
		return mv;
	}
	@RequestMapping(value="/member/edit", method=RequestMethod.GET)
	public ModelAndView getEditView(ModelAndView mv) {
		return mv;
	}
	@RequestMapping(value="/member/find", method=RequestMethod.GET)
	public ModelAndView getFindView(ModelAndView mv) {
		return mv;
	}
	@RequestMapping(value="/member/findEdit", method=RequestMethod.GET)
	public ModelAndView getFindEditView(ModelAndView mv) {
		return mv;
	}
	@RequestMapping(value="/member/join_step1", method=RequestMethod.GET)
	public ModelAndView getJoinStep1View(ModelAndView mv) {
		return mv;
	}
	@RequestMapping(value="/member/login", method=RequestMethod.GET)
	public ModelAndView getLoginView(ModelAndView mv) {
		return mv;
	}
	@RequestMapping(value="/member/view", method=RequestMethod.GET)
	public ModelAndView getView(ModelAndView mv) {
		return mv;
	}
}
