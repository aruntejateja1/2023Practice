package com.example.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class Employee {

	@Min(value=5, message ="Less than 5")
@Max(value=10, message="Greater than 10")	
private int id;

@NotEmpty(message="Name is mandatory")
//@Pattern(regexp="[a-z][A-Z]{2}", message="pattern is not matching")
private String name;

@Min(value=1000, message="Salary less than 1000")
private int salary;
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


}
