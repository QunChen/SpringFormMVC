package com.form.app.service;

import org.springframework.stereotype.Service;

import com.form.app.domain.Student;

@Service(value="studentService")
public class StudentService {

	public int generateHashValue(Student student){
		return student.hashCode();
	}
}
