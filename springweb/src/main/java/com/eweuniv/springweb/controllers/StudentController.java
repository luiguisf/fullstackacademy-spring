package com.eweuniv.springweb.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.eweuniv.springweb.domain.Student;
import com.eweuniv.springweb.domain.StudentNotFoundExeption;
import com.eweuniv.springweb.domain.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

    private StudentService studentService;
    
    public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	@PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void post(@RequestBody Student student) {
		studentService.save(student);
    }

    @GetMapping("/{id}")
    public Student findById(@PathVariable int id) {
    	return studentService.find(id);
    }
    
    @GetMapping
    public List<Student> findAll() {
    	return studentService.findAll();
    }
    
    @ExceptionHandler(StudentNotFoundExeption.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void exceptionHandler() {}


}
