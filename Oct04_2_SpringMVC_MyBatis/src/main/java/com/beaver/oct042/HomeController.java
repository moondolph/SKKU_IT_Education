package com.beaver.oct042;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.beaver.oct042.student.Student;
import com.beaver.oct042.student.StudentDAO;
import com.beaver.oct042.test.TestDAO;

@Controller
public class HomeController {
	
	@Autowired
	private StudentDAO sDAO;
	
	@Autowired
	private TestDAO tDAO;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Student s, HttpServletRequest req) {
		sDAO.regStudent(s, req);
		sDAO.getAllStudent(req);
		return "index";
	}
	
}
