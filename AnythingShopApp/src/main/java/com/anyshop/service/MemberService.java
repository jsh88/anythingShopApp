package com.anyshop.service;

import javax.servlet.http.HttpServletRequest;

public interface MemberService {

	public void  addMember(HttpServletRequest request);

	public void checkId(HttpServletRequest request);

	public void checkEmail(HttpServletRequest request);

}