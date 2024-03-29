package com.tabbu.OnlineEducationSystem.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tabbu.OnlineEducationSystem.model.Employee;
import com.tabbu.OnlineEducationSystem.repository.EmployeeRepository;

import jakarta.annotation.PostConstruct;

@Service
public class OESEmployeeService {
	@Autowired
	EmployeeRepository empRepository;
	
	List<Employee> Employeelist = new ArrayList<>();

	@PostConstruct
	public void init() {
		Employee A = new Employee("1234", "Sarita", "20,000");
		Employee B = new Employee("1235", "Sakshi", "25,000");
		Employeelist.add(A);
		Employeelist.add(B);
		empRepository.saveAll(Employeelist);

	}

	// read(get) opration
	public Employee getEmployee(String id) {
		// List<Employee> Employeelist = new ArrayList<>();
		// Employee A = new Employee("1234", "Sarita", "20,000");
		// Employee B = new Employee("1235", "Sakshi", "25,000");
		// Employeelist.add(A);
		// Employeelist.add(B);
		Employee employee=empRepository.findById(id).get();
//		for (int i = 0; i <= Employeelist.size(); i++) {
//			if (Employeelist.get(i).getId().equals(id)) {
//				System.out.println("index of Employeelist i=" + i);
//				return Employeelist.get(i);
//
//			}
//		}
		return employee;

	}

	// create (post) opration
	public Employee postEmployee(Employee emp) {
		// List<Employee> Employeelist = new ArrayList<>();
		// Employee A = new Employee("1234", "Sarita", "20,000");
		// Employee B = new Employee("1235", "Sakshi", "25,000");
		// Employeelist.add(A);
		// Employeelist.add(B);
		
		if (emp != null) {
			//Employeelist.add(emp);
			Employee employee=empRepository.save(emp);
			return employee;
		}
		return new Employee();

	}

	// update(put) opration
	public Employee updateEmployee(String id, String name, String salary) {
// List<Employee> Employeelist = new CopyOnWriteArrayList();
//	Employee A = new Employee("1234", "Sarita", "20,000");
//	Employee B = new Employee("1235", "Sakshi", "25,000");
//	Employeelist.add(A);
//	Employeelist.add(B);
		
		Employee e=new Employee(id, name, salary);
		Employee emp=empRepository.save(e);
//		for (int i = 0; i < Employeelist.size(); i++) {
//			Employee e = Employeelist.get(i);
//			if (e.getId().equals(id)) {
//				Employeelist.get(i).setName(name);
//				Employeelist.get(i).setSalary(salary);
//				return Employeelist.get(i);
//			} else {
//				Employee s = new Employee(id, name, salary);
//				Employeelist.add(s);
//				return Employeelist.get(i);
//
//			}
//		}

		return emp;
	}

	// delete (delete) opration
	public String deleteEmployee(String id) {
		// ArrayList<Employee> Employeelist = new ArrayList<>();
		// Employee A = new Employee("1234", "Sarita", "20,000");
		// Employee B = new Employee("1235", "Sakshi", "25,000");
		// Employeelist.add(A);
		// Employeelist.add(B);
		empRepository.deleteById(id);
//		Iterator<Employee> it = Employeelist.iterator();
//
//		while (it.hasNext()) {
//			Employee e = it.next();
//			if (e.getId().equals(id)) {
//				it.remove();
//				// Employeelist.remove(it.next());
//
//				return "record has been deleted successfully";
//
//			}
//
//		}
		return "record has been deleted successfully";
	}

}
