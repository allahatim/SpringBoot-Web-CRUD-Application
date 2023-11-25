package com.hatim.first.controller;

import com.hatim.first.model.dto.EmployeeDto;
import com.hatim.first.model.entity.Employee;
import com.hatim.first.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmpService empService;
    @GetMapping("/get-emp")
    public EmployeeDto getUser(@RequestParam Integer id){
        return this.empService.getUser(id);
    }
    @PostMapping("/save-emp")
    public EmployeeDto saveUser(@RequestBody EmployeeDto employee){
        return this.empService.saveUser(Employee.toEntity(employee));
    }
    @PostMapping("/update-emp")
    public EmployeeDto updateUser(@RequestBody EmployeeDto employee){
        return this.empService.saveUser(Employee.toEntity(employee));
    }
    @GetMapping("/delete-emp")
    public void deleteUser(@RequestParam Integer id){
         this.empService.deleteUser(id);
    }
    @GetMapping("/all-emp")
    public List<Employee> allUser(){
       return this.empService.allUser();
    }
}
