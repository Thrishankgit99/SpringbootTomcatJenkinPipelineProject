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
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.org.java.relations.Laptop; import
 * com.org.java.repository.LaptopRepository;
 * 
 * @RestController public class LaptopController {
 * 
 * @Autowired private LaptopRepository laptopRepository;
 * 
 * 
 * 
 * @PostMapping("/save") public ResponseEntity<Laptop> saveLaptop(@RequestBody
 * Laptop laptop) { Laptop laps = laptopRepository.save(laptop); return new
 * ResponseEntity("Sucessfully saved in to a Db", HttpStatus.CREATED);
 * 
 * }
 * 
 * @GetMapping("/findAll") public ResponseEntity<List<Laptop>> findAllLaptops()
 * { List<Laptop> laplist = laptopRepository.findAll(); return new
 * ResponseEntity<List<Laptop>>(laplist, HttpStatus.OK);
 * 
 * }
 * 
 * 
 * }
 */