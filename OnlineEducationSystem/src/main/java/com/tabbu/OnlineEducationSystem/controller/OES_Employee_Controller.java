package com.tabbu.OnlineEducationSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tabbu.OnlineEducationSystem.model.Employee;
import com.tabbu.OnlineEducationSystem.service.OESEmployeeService;
import com.tabbu.OnlineEducationSystem.service.OESStudentService;

@RestController
public class OES_Employee_Controller {
	@Autowired
	OESEmployeeService service;

	@GetMapping("/getEmployee")
	public Employee getEmployee(@RequestParam String id) {
		Employee A = service.getEmployee(id);
		return A;

	}

	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestParam String id, @RequestParam String name,@RequestParam String salary) {
		Employee emp = new Employee(id, name, salary);
		Employee e = service.postEmployee(emp);
		return e;
	}

	@PutMapping("/updateEmployee")
	public Employee updateEmployee(@RequestParam String id,@RequestParam String name,@RequestParam String salary) {
		Employee e = service.updateEmployee(id, name, salary);
		return e;

	}

	@DeleteMapping("/deleteEmployee")
	public String deleteEmployee(@RequestParam String id) {

		return service.deleteEmployee(id);

	}
}