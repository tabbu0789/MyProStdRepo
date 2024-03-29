package com.tabbu.OnlineEducationSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tabbu.OnlineEducationSystem.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String>{

}
