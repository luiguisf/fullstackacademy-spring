package com.eweuniv.springweb.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private Set<Student> students;
    
    public StudentService() {
    	students = new HashSet<>();
	}
    
	public void save(Student student) {
		students.add(student);
	}
	
	public Student find(int id) {
		return students.stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElseThrow(() -> new StudentNotFoundExeption("No encontrado"));
		
	}
	
	public List<Student> findAll() {
		return students.stream().collect(Collectors.toList());
		
	}

}
