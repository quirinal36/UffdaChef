package chef.uffda.kr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ReturnController extends UffdaController {
	@RequestMapping(value="/return/confirm", method=RequestMethod.GET)
	public ModelAndView getConfirmView(ModelAndView mv) {
		return mv;
	}
	@RequestMapping(value="/return/edit", method=RequestMethod.GET)
	public ModelAndView getEditView(ModelAndView mv) {
		return mv;
	}
	@RequestMapping(value="/return/info", method=RequestMethod.GET)
	public ModelAndView getInfoView(ModelAndView mv) {
		return mv;
	}
	@RequestMapping(value="/return/receive", method=RequestMethod.GET)
	public ModelAndView getReceiveView(ModelAndView mv) {
		return mv;
	}
	@RequestMapping(value="/return/stack", method=RequestMethod.GET)
	public ModelAndView getStackView(ModelAndView mv) {
		return mv;
	}
}
