package com.eseed.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eseed.entity.Student;
import com.eseed.repo.StudentRepository;

@Service
public class StudentService {
	@Autowired private StudentRepository studentRepository;
	
//	private final StudentRepository studentRepository;
//	public StudentService(StudentRepository studentRepository) {
//		this.studentRepository = studentRepository;
//	}
	
	
	
	public List<Student>findAll(){
	return studentRepository.findAll();
		
	}
	
	public Optional<Student> findById(Integer id){
	return studentRepository.findById(id);
		
	}
    public Student save(Student student) {
	return studentRepository.save(student);
	
   }
   public void deleteById(Integer id) {
   studentRepository.deleteById(id);
    }
}
