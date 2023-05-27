package com.app.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.model.Employee;

@Controller
public class EmployeeController {
	@GetMapping("reg")
	public String regPage(ModelMap map) {
		Employee emp = new Employee();
		map.addAttribute("employee", emp);
		return "Register";
	}

	@PostMapping(value = "save")
	public String saveData(@ModelAttribute Employee employee, ModelMap map) {
		map.addAttribute("emp", employee);
		return "Info";
	}

	@GetMapping("all")
	public String showDates( ModelMap map) {
		map.addAttribute("message", "Hello UI");
		List<Employee> emps = Arrays.asList(new Employee());
		map.addAttribute("list", emps);
		return "Demo";
	}
}
