package com.wen.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.wen.po.Mobile;

@WebService
public interface MobileService {
	@WebMethod
	Mobile getByNumber(String Number);
}
