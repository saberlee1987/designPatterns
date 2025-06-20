package com.saber.composite.sample1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Manager implements Employee {
    private String name;
    private String position;
    private final List<Employee> subordinates = new ArrayList<>();
    public void hireEmployee(Employee employee){
        subordinates.add(employee);
    }
    public void fireEmployee(Employee employee){
        subordinates.remove(employee);
    }
    @Override
    public void displayDetails() {
        System.out.printf("Manager : [Name : %s ] , [ Position : %s ]\n",
                getName(), getPosition());
        System.out.println("subordinates : ");
        subordinates.forEach(Employee::displayDetails);
    }
}
