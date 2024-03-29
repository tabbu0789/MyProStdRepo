package com.tabbu.OnlineEducationSystem.model;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
	private String id;
	private String name;
	private String salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String id, String name, String salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public static Object get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
