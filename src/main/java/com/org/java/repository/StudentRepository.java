package com.org.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.java.entity.Student;



@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
