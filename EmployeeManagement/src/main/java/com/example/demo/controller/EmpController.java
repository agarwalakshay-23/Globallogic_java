package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.service.EmpService;

@Controller
public class EmpController {
	@Autowired
	private EmpService service;

	@GetMapping("/")
	public String home(Model m) {
	List<EmployeeEntity>emp=service.getAllEmployee();
	m.addAttribute("emp", emp);
		return "index";
		
		
	}

	@GetMapping("/form")
	public String addEmp() {
		return "form";
	}
	
	@GetMapping("/edit/{id}")
	public String editEmp(@PathVariable int id,Model m) {
	EmployeeEntity e=	service.getEmpById(id);
	m.addAttribute("emp",e);
		return "edit";
	}

	@PostMapping("/register")
	public String EmpRegister(@ModelAttribute EmployeeEntity e, HttpSession session) {

		System.out.println(e);

		service.addEmployee(e);
		session.setAttribute("msg", "Employee added Successfully!!");

		return "redirect:/";

	}
	
	@PostMapping("/update")
	public String updateEmp(@ModelAttribute EmployeeEntity e,HttpSession session) {
		
		service.addEmployee(e);
		session.setAttribute("msg", "Employee details updated successfully!!");
		return "redirect:/";
		
	}
	
	
	@GetMapping("/delete/{id}")
	public String deleteEmp(@PathVariable int id,HttpSession session) {
		
		service.delete(id);
		
		session.setAttribute("msg", "Employee Deleted successfully!!");

		return "redirect:/";
	}

}
