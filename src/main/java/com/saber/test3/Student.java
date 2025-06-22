package com.saber.test3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Comparable {
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Student student) {
            return Integer.compare(this.age, student.age);
        }
        return -1;
    }
}
