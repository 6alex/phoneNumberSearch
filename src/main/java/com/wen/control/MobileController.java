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
		
		model.addAttribute("mobile", "�����أ�"+mobile.getMobilearea()+"  �������ͣ�"+mobile.getMobiletype()+"  ���ţ�"+mobile.getAreacode()+"  �ʱࣺ"+mobile.getPostcode());
		}else{
			model.addAttribute("mobile", "�úŶ��ںŶο��ݲ�����");
		}
		
		return "index.jsp";
		
	}
	
}
