package com.ciq.service;

public class LoginServiceImpl implements LoginService {

	@Override
	public boolean isLoggin(String username, String password) {
		if ("balaji".equals(password)) {
			return true;
		}
		return false;
	}

}
