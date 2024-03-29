package com.tabbu.OnlineEducationSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	

	private String name;
	@Id
	private String rollno;
	private String school;


	public Student(String name, String rollno, String school) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.school = school;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

}
