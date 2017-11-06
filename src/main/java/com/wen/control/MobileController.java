package com.wen.control;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wen.po.Mobile;
import com.wen.service.MobileService;

@Controller
public class MobileController {
	@Resource
	MobileService ms;
	
	@RequestMapping("/query")
	public String getMobile(Model model,@RequestParam(value="number") String number){
		Mobile mobile = ms.getByNumber(number);
		model.addAttribute("number", number);
		if(mobile!=null){
		
		model.addAttribute("mobile", "归属地："+mobile.getMobilearea()+"  号码类型："+mobile.getMobiletype()+"  区号："+mobile.getAreacode()+"  邮编："+mobile.getPostcode());
		}else{
			model.addAttribute("mobile", "该号段在号段库暂不存在");
		}
		
		return "index.jsp";
		
	}
	
}
