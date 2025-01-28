package com.org.java.entity;

import java.util.List;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
	
	private int id;
	private String studentName;
	private int age;
	private List<String> mobbileNumbers;

}
