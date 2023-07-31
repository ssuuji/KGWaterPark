package com.water.park;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.scribejava.core.model.OAuth2AccessToken;
import com.water.park.service.MemberService;
import com.water.park.vo.MemberVO;

@Controller
public class LoginController {

	/* NaverLoginBO */
	/*
	 * private NaverLoginBO naverLoginBO; private String apiResult = null;
	 */

	/*
	 * @Autowired private void setNaverLoginBO(NaverLoginBO naverLoginBO) {
	 * this.naverLoginBO = naverLoginBO; }
	 */

	@Autowired
	MemberService service;

	/*
	 * @RequestMapping(value="naverlogin.do", method = RequestMethod.GET) public
	 * String login(HttpSession session, Model model, String url) {
	 * 
	 * 네이버아이디로 인증 URL을 생성하기 위하여 naverLoginBO클래스의 getAuthorizationUrl메소드 호출 String
	 * naverAuthUrl = naverLoginBO.getAuthorizationUrl(session);
	 * 
	 * //https://nid.naver.com/oauth2.0/authorize?response_type=code&client_id=sE***
	 * ************&
	 * //redirect_uri=http%3A%2F%2F211.63.89.90%3A8090%2Flogin_project%2Fcallback&
	 * state=e68c269c-5ba9-4c31-85da-54c16c658125 System.out.println("네이버:" +
	 * naverAuthUrl);
	 * 
	 * //네이버 model.addAttribute("naverurl", naverAuthUrl);
	 * 
	 * 생성한 인증 URL을 View로 전달
	 * 
	 * 
	 * return "login"; }
	 * 
	 * //네이버 로그인 성공시 callback호출 메소드
	 * 
	 * @RequestMapping(value = "callback.do", method = { RequestMethod.GET,
	 * RequestMethod.POST }) public String callback(Model model, @RequestParam
	 * String code, @RequestParam String state, HttpSession session, MemberVO vo)
	 * throws Exception {
	 * 
	 * JsonParser json = new JsonParser();
	 * 
	 * //System.out.println("여기는 callback");
	 * 
	 * OAuth2AccessToken oauthToken; oauthToken =
	 * naverLoginBO.getAccessToken(session, code, state); //로그인 사용자 정보를 읽어온다. String
	 * apiResult = naverLoginBO.getUserProfile(oauthToken);
	 * 
	 * vo = json.changeJson(apiResult); // vo에 저장
	 * 
	 * 
	 * System.out.println(apiResult);
	 * 
	 * if (service.getNaverMember(vo) != null) { // 세션만들기 (이미 한번이라도 로그인한 정보가 있으면~)
	 * session.setAttribute("login", vo); }else { //로그인을 한번도 안했다면 가입!
	 * service.joinNaverMember(vo); session.setAttribute("login", vo);
	 * 
	 * }
	 * 
	 * 
	 * model.addAttribute("result", apiResult);
	 * 
	 * 네이버 로그인 성공 페이지 View 호출 return "callback"; }
	 */

}