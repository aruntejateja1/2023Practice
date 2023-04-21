package com.example.demo;

import java.sql.SQLIntegrityConstraintViolationException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.model.Employee;

@Controller
public class AppController {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@GetMapping("registerUser")
	public String show(@ModelAttribute Employee employee) {
	
		return "registerPage";
	}
	
	
	@PostMapping("Register2")
	public String show2(@Valid  @ModelAttribute Employee employee,BindingResult result, Model model) {
		
		model.addAttribute("emp",employee);
		//try {
		jdbcTemplate.update("insert into employee values(?,?,?)",employee.getId(),employee.getName(),employee.getSalary());
		String msg="Employee with name "+ employee.getName() +" is added successfully. ";
		model.addAttribute("message", msg );
		//}catch(Exception e) {
		//	model.addAttribute("error", "Id already exists");
		//	return "registerPage";
		//}
		
		if(result.hasErrors()) {
			return "registerPage";
		}
		return "success";	
	}
	
	
	@ExceptionHandler(SQLIntegrityConstraintViolationException.class)
	public String handleDuplicateID() {
		
		return "error";
	}
	
	
	@GetMapping("deleteUser")
	public String deleteUser() {
		
		return "deleteForm";
	}
	
	@PostMapping("deleteUser2")
	public String deleteUser2(String id, Model model) {
		
		jdbcTemplate.update("Delete from employee where id=?",id);
		String msg="employee with " +id +" Deleted successfully";
		model.addAttribute("message", msg);
		return "success";
		
	}
	
}
