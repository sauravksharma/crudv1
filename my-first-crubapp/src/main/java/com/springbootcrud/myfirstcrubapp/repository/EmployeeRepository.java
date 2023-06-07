package com.springbootcrud.myfirstcrubapp.repository;

import org.hibernate.Session;
import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootcrud.myfirstcrubapp.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{


	
}
