package com.functionalprogramming.session_11;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Employee implements Comparable<Employee> {

    private String name;
    private int age;
    private String city;
    private String department;

    @Override
    public int compareTo (final Employee o) {
        if(this.age > o.age){
            return 1;
        } else if(this.age < o.age){
            return -1;
        }
      else  return 0;
    }
}
