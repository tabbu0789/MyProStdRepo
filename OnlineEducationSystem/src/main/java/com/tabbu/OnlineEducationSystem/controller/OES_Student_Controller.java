package com.tabbu.OnlineEducationSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tabbu.OnlineEducationSystem.model.Student;
import com.tabbu.OnlineEducationSystem.service.OESStudentService;

@RestController
public class OES_Student_Controller {
	@Autowired
	OESStudentService service;

	@GetMapping("/getStudent") // read
	public Student getStudent(@RequestParam String rollno) {
		Student s = service.getStudent(rollno);
		return s;

	}

	@PostMapping("/addStudent") // craete,add,post
	public Student addStudent(@RequestParam String rollno, String name, String school) {
		Student std = new Student(rollno, name, school);
		Student a = service.postStudent(std);
		return a;
	}

	@PutMapping("/updateStudent") // update
	public Student updateStudent(@RequestParam String rollno, String name, String school) {
		Student a = service.updateStudent(rollno, name, school);
		return a;
	}

	@DeleteMapping("/deleteStudent") // delete
	public String deleteStudent(@RequestParam String rollno) {
		return service.deleteStudent(rollno);
	}
}