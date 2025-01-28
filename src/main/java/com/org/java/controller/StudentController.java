/*
 * package com.org.java.controller;
 * 
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.http.HttpStatus; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.org.java.entity.Student; import
 * com.org.java.repository.StudentRepository;
 * 
 * @RestController
 * 
 * @RequestMapping("/student") public class StudentController {
 * 
 * @Autowired private StudentRepository studentRepository;
 * 
 * @PostMapping("/save") public ResponseEntity<Student> saveStudent(@RequestBody
 * Student student) { Student students = studentRepository.save(student); return
 * new ResponseEntity("Sucessfully saved in to a Db", HttpStatus.CREATED);
 * 
 * }
 * 
 * @GetMapping("/findAll") public ResponseEntity<List<Student>>
 * findAllStudents() { List<Student> studentList = studentRepository.findAll();
 * return new ResponseEntity<List<Student>>(studentList, HttpStatus.OK);
 * 
 * }
 * 
 * }
 */