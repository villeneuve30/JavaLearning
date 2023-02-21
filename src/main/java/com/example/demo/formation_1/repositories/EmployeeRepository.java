package com.example.demo.formation_1.repositories;

import com.example.demo.formation_1.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
