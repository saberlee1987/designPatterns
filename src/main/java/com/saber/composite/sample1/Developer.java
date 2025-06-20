package com.saber.composite.sample1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Developer implements Employee {
    private String name;
    private String position;
    @Override
    public void displayDetails() {
        System.out.printf("Developer : [Name : %s ] , [ Position : %s ]\n",
                getName(), getPosition());
    }
}
