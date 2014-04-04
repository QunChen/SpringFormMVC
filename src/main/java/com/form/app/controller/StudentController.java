package com.form.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.form.app.domain.Student;
import com.form.app.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	@RequestMapping(value="/student", method=RequestMethod.GET)
	public ModelAndView student(){
		
		return new ModelAndView("student", "command", new Student());
	}
	
	@RequestMapping(value="/addStudent", method=RequestMethod.POST)
	public String addStudent(Student student, ModelMap model){
		
		model.addAttribute("name", student.getName());
		model.addAttribute("email",student.getEmail());
		model.addAttribute("password",studentService.generateHashValue(student));
		model.addAttribute("isPR",student.getIsPR());
		
		return "result";
	}
}
