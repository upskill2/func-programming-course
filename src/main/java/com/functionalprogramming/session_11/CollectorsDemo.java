package com.functionalprogramming.session_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectorsDemo {

    public static void main (String[] args) {
        List<Employee> list = new ArrayList<> ();
        list.add (new Employee ("John", 23, "New York", "IT"));
        list.add (new Employee ("Mike", 33, "London", "Finance"));
        list.add (new Employee ("Steve", 40, "Paris", "Admin"));

        TreeSet<Employee> treeSet = list.stream ()
                .collect (Collectors.toCollection (TreeSet::new));

        Map<String, Integer> map = list.stream ()
                .collect (Collectors.toMap (Employee::getName, Employee::getAge));

        final Map<Boolean, List<Employee>> collect = list.stream ()
                .collect (Collectors.partitioningBy (employee -> employee.getAge () > 30));

        final Map<String, Employee> collect1 = list.stream ()
                .collect (Collectors.groupingBy (Employee::getDepartment,
                        Collectors.collectingAndThen (Collectors.maxBy (Employee::compareTo), employee -> employee.orElse (null))));

        Map<String, List<Employee>> collect3 = list.stream ()
                .collect (Collectors.groupingBy (Employee::getDepartment));

        final String collect2 = list.stream ()
                .map (Employee::getName)
                .collect (Collectors.joining (","));

        System.out.println ();

        Map<String, Double> maps = list.stream ()
                .collect (Collectors.groupingBy (Employee::getDepartment,
                        Collectors.averagingDouble (Employee::getAge)));
        System.out.println (maps);

    }
}
