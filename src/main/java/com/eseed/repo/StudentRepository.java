package com.eseed.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eseed.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
