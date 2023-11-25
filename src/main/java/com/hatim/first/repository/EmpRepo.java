package com.hatim.first.repository;

import com.hatim.first.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<Employee, Integer> {

}
