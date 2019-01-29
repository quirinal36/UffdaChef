package chef.uffda.kr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AskController extends UffdaController {

	/**
	 * 자주묻는질문 
	 * @param mv
	 * @return
	 */
	@RequestMapping(value="/ask/faq", method=RequestMethod.GET)
	public ModelAndView getFaqView(ModelAndView mv) {
		return mv;
	}
	
}
