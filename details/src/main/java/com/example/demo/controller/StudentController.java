package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StudentModel;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService stud;
	
	@GetMapping(value="fetchStudents")
	 public List<StudentModel>getAllStudents()
	 {
		 List<StudentModel>studList=stud.getAllStudents();
		 return studList;
	 }
	@PostMapping(value="/saveStudent")
	public StudentModel saveStudent(@RequestBody StudentModel s)
	{
		return stud.saveStudent(s);
	}
}
