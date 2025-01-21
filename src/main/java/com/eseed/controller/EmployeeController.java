package com.eseed.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eseed.entity.Employee;
import com.eseed.service.EmployeeService;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService EmployeeService;
	
	
    @GetMapping
     public String employeeList(Model model) {
	 model.addAttribute("employee", EmployeeService.findAll());
	 return "employee";
	 
 }
    @GetMapping("/new")
public String employeeForm(Model model, Long id) {
    	model.addAttribute("emp",new Employee());
	return "employee-form";	
}
    @PostMapping
    public String saveEmployee(@ModelAttribute Employee employee ) {
    	EmployeeService.save(employee);
        return "redirect:/employee";
    }
  
    @GetMapping("/edit/{id}")
    public String editById(@PathVariable Long id, Model model) {
        Employee employee = EmployeeService.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid employee ID: " + id));
        model.addAttribute("emp", employee);
        return "employee-form";
    }

    @GetMapping("/delete/{id}")
    public String deleteById(@PathVariable Long id) {
    	EmployeeService.deleteById(id);
		return "redirect:/employee";}
}