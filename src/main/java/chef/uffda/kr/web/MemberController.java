package chef.uffda.kr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController extends UffdaController {
	/**
	 * 회원탈퇴
	 * @param mv
	 * @return
	 */
	@RequestMapping(value="/member/delete", method=RequestMethod.GET)
	public ModelAndView getDeleteView(ModelAndView mv) {
		return mv;
	}
	
	/**
	 * 내정보수정
	 * @param mv
	 * @return
	 */
	@RequestMapping(value="/member/edit", method=RequestMethod.GET)
	public ModelAndView getEditView(ModelAndView mv) {
		return mv;
	}
	
	/**
	 * 회원정보찾기
	 * @param mv
	 * @return
	 */
	@RequestMapping(value="/member/find", method=RequestMethod.GET)
	public ModelAndView getFindView(ModelAndView mv) {
		return mv;
	}
	
	/**
	 * 회원정보찾기 - 비밀번호변경
	 * @param mv
	 * @return
	 */
	@RequestMapping(value="/member/findEdit", method=RequestMethod.GET)
	public ModelAndView getFindEditView(ModelAndView mv) {
		return mv;
	}
	
	/**
	 * 회원가입 - 본인인증
	 * @param mv
	 * @return
	 */
	@RequestMapping(value="/member/join_step1", method=RequestMethod.GET)
	public ModelAndView getJoinStep1View(ModelAndView mv) {
		return mv;
	}
	
	/**
	 * 회원가입 - 정보입력
	 * @param mv
	 * @return
	 */
	@RequestMapping(value="/member/join_step2", method=RequestMethod.GET)
	public ModelAndView getJoinStep2View(ModelAndView mv) {
		return mv;
	}
	
	/**
	 * 회원가입 - 정보입력
	 * @param mv
	 * @return
	 */
	@RequestMapping(value="/member/join_complete", method=RequestMethod.GET)
	public ModelAndView getJoinCompleteView(ModelAndView mv) {
		return mv;
	}
	
	/**
	 * 로그인
	 * @param mv
	 * @return
	 */
	@RequestMapping(value="/member/login", method=RequestMethod.GET)
	public ModelAndView getLoginView(ModelAndView mv) {
		return mv;
	}
	
	/**
	 * 내정보보기
	 * @param mv
	 * @return
	 */
	@RequestMapping(value="/member/view", method=RequestMethod.GET)
	public ModelAndView getView(ModelAndView mv) {
		return mv;
	}
}
