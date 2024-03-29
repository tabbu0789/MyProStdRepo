package com.tabbu.OnlineEducationSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tabbu.OnlineEducationSystem.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {

}
