package com.beaver.oct042.test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.beaver.oct042.student.StudentDAO;

@Controller
public class TestController {
	
	@Autowired
	private TestDAO tDAO;
	
	@Autowired
	private StudentDAO sDAO;
	
	@RequestMapping(value = "/test.reg", method = RequestMethod.GET)
	public String regTest(Test t, HttpServletRequest req) {
		tDAO.regTest(t, req);
		tDAO.getAllTest(req);
		return "index";
		
		
	}

	
	
}
