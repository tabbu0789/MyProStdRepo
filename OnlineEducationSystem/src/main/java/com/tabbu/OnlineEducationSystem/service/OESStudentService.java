package com.tabbu.OnlineEducationSystem.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tabbu.OnlineEducationSystem.model.Student;
import com.tabbu.OnlineEducationSystem.repository.StudentRepository;

import jakarta.annotation.PostConstruct;

@Service
public class OESStudentService {
	@Autowired
	StudentRepository stdRepository;
	List<Student> Studentlist = new ArrayList<>();

	@PostConstruct 
	public void init() {
		Student s = new Student("tabbu", "23", "KSAW Universty");
		Student A = new Student("Neha", "67", "KSAW Universty");
		Studentlist.add(s);
		Studentlist.add(A);
		stdRepository.saveAll(Studentlist);
	}

	//Read (get) opration
	public Student getStudent(String rollno) {
		// List<Student> Studentlist = new ArrayList<>();
		// Student s = new Student("tabbu", "23", "KSAW Universty");
		// Student A = new Student("Neha", "67", "KSAW Universty");
		// Studentlist.add(s);
		// Studentlist.add(A);
		Student Student=stdRepository.findById(rollno).get();

		//for (int i = 0; i <= Studentlist.size(); i++) {
		//	if (Studentlist.get(i).getRollno().equals(rollno)) {
		//		System.out.println("index of Studentlist i=" + i);
		//		return Studentlist.get(i);
       //
		//	}
	//	}
		return Student;
	
	}

	//create (post) opration
	public Student postStudent(Student std) {
		// List<Student> Studentlist = new ArrayList<>();
		// Student s = new Student("tabbu", "23", "KSAW Universty");
		// Student A = new Student("Neha", "67", "KSAW Universty");
		// Studentlist.add(s);
		// Studentlist.add(A);
		if (std != null) {
			Studentlist.add(std);
			return std;
		}
		return new Student();

	}
      //update(put)opration
	public Student updateStudent(String rollno, String name, String school) {
		// List<Student> Studentlist = new CopyOnWriteArrayList<>();
		// Student s = new Student("tabbu", "23", "KSAW Universty");
		// Student A = new Student("Neha", "67", "KSAW Universty");
		// Studentlist.add(s);
		// Studentlist.add(A);

		for (int i = 0; i <= Studentlist.size(); i++) {
			Student a = Studentlist.get(i);
			if (a.getRollno().equals(rollno)) {
				Studentlist.get(i).setName(name);
				Studentlist.get(i).setSchool(school);
				return Studentlist.get(i);
			}else {
				Student s = new Student(rollno,name,school);
				Studentlist.add(a);
				return Studentlist.get(i);
			}
		}
		return new Student();
	}

	// delete(delete) opration
	public String deleteStudent(String rollno) {
		// ArrayList<Student> Studentlist = new ArrayList<>();
		// Student s = new Student("tabbu", "23", "KSAW Universty");
		// Student A = new Student("Neha", "67", "KSAW Universty");
		// Studentlist.add(s);
		// Studentlist.add(A);

		Iterator<Student> it = Studentlist.iterator();
		while (it.hasNext()) {
			Student a = it.next();
			if (a.getRollno().equals(rollno)) {
				it.remove();
				return "record has been deleted succesfully";

			}
		}

		return "record is not present to delete";

	}
}
