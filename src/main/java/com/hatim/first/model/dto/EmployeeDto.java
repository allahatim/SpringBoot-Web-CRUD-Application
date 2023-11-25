package com.hatim.first.model.dto;

import com.hatim.first.model.entity.Employee;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
    private Integer Id;
    private String firstName;
    private String lastName;
    private Double salary;
    public static EmployeeDto toDto(Employee Entity){
        return EmployeeDto.builder()
                .Id(Entity.getId())
                .firstName(Entity.getFirstName())
                .lastName(Entity.getLastName())
                .salary(Entity.getSalary())
                .build();
    }
}
