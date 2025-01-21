package com.eseed.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eseed.entity.Student;
import com.eseed.service.StudentService;

import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("/students")
public class StudentController {
	@Autowired
	private StudentService studentService;

	@GetMapping
	public String studentsList(Model model) {
		model.addAttribute("students", studentService.findAll());
		return "students";

	}

	@GetMapping("/new")
	public String createStudentForm(Model model) {
		model.addAttribute("student", new Student());
		return "studentForm";
	}

//	@PostMapping
//	public String saveStudents(Student student) {
//		studentService.save(student);
//		return "redirect:/students";
//	}
	
	@PostMapping
	public String saveStudents(Student student) {
	    studentService.save(student); // JPA will handle INSERT or UPDATE based on the presence of ID
	    return "redirect:/students";
	}


	@GetMapping("/edit/{id}")
	public String editStudent(@PathVariable Integer id, Model model) {
		model.addAttribute("student", studentService.findById(id).orElse(new Student()));
		return "studentForm";
	}

	@GetMapping("/delete/{id}")
	public String getMethodName(@PathVariable Integer id) {
		studentService.deleteById(id);
		return "redirect:/students";
	}

}
