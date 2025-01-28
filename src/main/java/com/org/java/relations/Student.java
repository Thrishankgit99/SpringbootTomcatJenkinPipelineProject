package com.org.java.relations;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
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
public class Student {
	@Id
	private int studentId;
	private String studentnNme;
	private int age;
	private String department;
	
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinTable(name="Student_course_Table",joinColumns = {@JoinColumn(name="studentId",referencedColumnName = "studentId")},
		inverseJoinColumns= {@JoinColumn(name="courseId",referencedColumnName = "courseId")})
	@JsonManagedReference
	private List<Course> courses;

}
