package net.javaguides.springboot.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.model.Employee;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	//get all employees
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
	
	// get employee by Id
	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable Long id) {
		
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(()-> new ResourceNotFoundExeption("Employee Not found"));
		return employee;
	}


}
