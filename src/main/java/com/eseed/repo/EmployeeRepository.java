package com.eseed.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eseed.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
