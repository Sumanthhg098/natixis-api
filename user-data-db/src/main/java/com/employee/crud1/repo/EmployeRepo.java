package com.employee.crud1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.crud1.model.Employe;

public interface EmployeRepo extends JpaRepository<Employe, Integer>{

}
