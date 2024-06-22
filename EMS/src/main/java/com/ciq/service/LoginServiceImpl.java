package com.ciq.service;

public class LoginServiceImpl implements LoginService {

	@Override
	public boolean doLogin(String uname, String password) {

		if ("balaji".equals(uname) && "balaji".equals(password)) {
			return true;
		}

		return false;
	}

}
