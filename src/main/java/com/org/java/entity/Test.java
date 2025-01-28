package com.org.java.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Test {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<Student>();
		list.add(new Student(101, "sreenivasarao", 35,
				Arrays.asList("9676919080", "9948605040", "9708584924", "8247758848")));
		list.add(new Student(100, "naresh", 34, Arrays.asList("8975662222", "9676919080", "9708584924", "9948605070")));
		list.add(new Student(103, "suresh", 38, Arrays.asList("7895456622", "9676919080", "8479566265", "9948605070")));
		list.add(new Student(105, "naveen", 42, Arrays.asList("8874622625", "9676919080", "8495785648", "9948605070")));
		list.add(new Student(107, "mahesh", 47, Arrays.asList("8485795622", "9676919080", "9784587958", "9948605070")));
		List<List<String>> listsofMap=list.stream().map(s1->s1.getMobbileNumbers()).collect(Collectors.toList());
		System.out.println(listsofMap);
		List<String> listsofFlatMap=list.stream().flatMap(s1->s1.getMobbileNumbers().stream()).collect(Collectors.toList());
		System.out.println(listsofFlatMap);
		Map<Object, List<com.org.java.entity.Student>> student1=list.stream().collect(Collectors.groupingBy(emp->emp.getMobbileNumbers()));
		System.out.println(student1);

	}

}
