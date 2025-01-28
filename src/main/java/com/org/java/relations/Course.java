package com.org.java.relations;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Course {
	
	@Id
	private int courseId;
	private String courseName;
	private int price;
	@ManyToMany(mappedBy = "courses",fetch = FetchType.LAZY)
	@JsonBackReference
	private List<Student> students;

}
