package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.StudentModel;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	StudentRepo rep;
	public List<StudentModel> getAllStudents()
	{
		List<StudentModel>studList=rep.findAll();
		return studList;
	}
	public StudentModel saveStudent(StudentModel s)
	{
		StudentModel obj=rep.save(s);
		return obj;
	}
}
