package com.water.park.service;

import java.util.ArrayList;

import com.water.park.vo.MemberVO;

public interface MemberService {

	ArrayList<MemberVO> getAllMember() throws Exception;

	public String getToken() throws Exception;

	public ArrayList<String> getName_getTel(String token, String imp_uid) throws Exception;

	public MemberVO memberLogin(String id, String pw) throws Exception;
	
	public int idCheck(String m_id);
	
	public void insertMember(MemberVO memberVO);
	
	public void updateMember(MemberVO memberVO);
	
	public MemberVO getNaverInfo(String token)throws Exception;
	
	MemberVO memberGet(String m_id);

	String getMId(String name, String tel) throws Exception;
}
