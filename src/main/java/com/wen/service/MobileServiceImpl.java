package com.wen.service;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.wen.mapper.MobileMapper;
import com.wen.po.Mobile;

@Service
@WebService
public class MobileServiceImpl implements MobileService{
	@Resource
	MobileMapper mobileMapper;

	@Override
	@WebMethod
	public Mobile getByNumber(String number) {
		// TODO Auto-generated method stub
		String MobileNumber=number.substring(0, 7);
		Mobile mobile = mobileMapper.getByNumber(MobileNumber);
		return mobile;
	}

}
