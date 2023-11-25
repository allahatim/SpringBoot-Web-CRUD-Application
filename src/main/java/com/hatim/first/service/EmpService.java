package com.hatim.first.service;

import com.hatim.first.model.dto.EmployeeDto;
import com.hatim.first.model.entity.Employee;
import com.hatim.first.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EmpService {
    @Autowired
    private EmpRepo empRepo;
    public EmployeeDto getUser(Integer id){
        Optional<Employee> emp= this.empRepo.findById(id);
        if (emp.isPresent())
            return EmployeeDto.toDto(emp.get());

        else
            return null;
    }
    public EmployeeDto saveUser(Employee employee){
         return EmployeeDto.toDto(empRepo.save(employee));
    }
    public void deleteUser(Integer id){
         this.empRepo.deleteById(id);
    }
    public List<Employee> allUser(){
        return this.empRepo.findAll();
    }
}
