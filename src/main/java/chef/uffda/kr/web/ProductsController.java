package chef.uffda.kr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductsController extends UffdaController {

	/**
	 * 상세페이지
	 * 
	 * @param mv
	 * @return
	 */
	@RequestMapping(value="/products/detail", method=RequestMethod.GET)
	public ModelAndView getDetailView(ModelAndView mv) {
		return mv;
	}
	
	/**
	 * 좋아요 리스트
	 * @param mv
	 * @return
	 */
	@RequestMapping(value="/products/like", method=RequestMethod.GET)
	public ModelAndView getLikeView(ModelAndView mv) {
		return mv;
	}
	
	/**
	 * 상품목록
	 * @param mv
	 * @return
	 */
	@RequestMapping(value="/products/list", method=RequestMethod.GET)
	public ModelAndView getListView(ModelAndView mv) {
		return mv;
	}
	
	/**
	 * 검색
	 * @param mv
	 * @return
	 */
	@RequestMapping(value="/products/search", method=RequestMethod.GET)
	public ModelAndView getSearchView(ModelAndView mv) {
		return mv;
	}
}
