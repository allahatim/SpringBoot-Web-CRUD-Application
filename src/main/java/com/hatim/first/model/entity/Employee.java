package com.hatim.first.model.entity;

import com.hatim.first.model.dto.EmployeeDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "employees")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")  // Corrected typo here
    private String lastName;

    @Column(name = "salary")  // Consider using camelCase for consistency
    private Double salary;

    public static Employee toEntity(EmployeeDto dto){
        return Employee.builder()
                .Id(dto.getId())
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .salary(dto.getSalary())
                .build();
    }
}
