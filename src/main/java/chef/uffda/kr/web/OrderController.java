package chef.uffda.kr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrderController extends UffdaController {
	
	/**
	 * 주문취소
	 * @param mv
	 * @return
	 */
	@RequestMapping(value="/order/cancel", method=RequestMethod.GET)
	public ModelAndView getCancelView(ModelAndView mv) {
		return mv;
	}
	
	/**
	 * 장바구니
	 * 
	 * @param mv
	 * @return
	 */
	@RequestMapping(value="/order/cart", method=RequestMethod.GET)
	public ModelAndView getCartView(ModelAndView mv) {
		return mv;
	}
	
	/**
	 * 교환, 반품신청
	 * @param mv
	 * @return
	 */
	@RequestMapping(value="/order/change", method=RequestMethod.GET)
	public ModelAndView getChangeView(ModelAndView mv) {
		return mv;
	}
	
	/**
	 * 결제완료
	 * @param mv
	 * @return
	 */
	@RequestMapping(value="/order/complete", method=RequestMethod.GET)
	public ModelAndView getCompleteView(ModelAndView mv) {
		return mv;
	}
	
	/**
	 * 주문내용상세보기
	 * @param mv
	 * @return
	 */
	@RequestMapping(value="/order/detail", method=RequestMethod.GET)
	public ModelAndView getDetailView(ModelAndView mv) {
		return mv;
	}
	
	/**
	 * 주문목록
	 * @param mv
	 * @return
	 */
	@RequestMapping(value="/order/list", method=RequestMethod.GET)
	public ModelAndView getListView(ModelAndView mv) {
		return mv;
	}
	
	/**
	 * 주문서작성
	 * @param mv
	 * @return
	 */
	@RequestMapping(value="/order/order", method=RequestMethod.GET)
	public ModelAndView getOrderView(ModelAndView mv) {
		return mv;
	}
}
