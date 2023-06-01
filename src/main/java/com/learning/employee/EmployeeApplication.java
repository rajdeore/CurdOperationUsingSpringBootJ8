package com.learning.employee;

import com.learning.employee.model.Employee;
import com.learning.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.transaction.Transactional;
import java.util.Optional;

@SpringBootApplication
/*@EnableJpaRepositories
@Transactional*/
public class EmployeeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}

	@Autowired
	private  EmployeeRepository employeeRepository;


	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();

		employee.setID(1);
		employee.setName("Raj");
		employee.setEmail("raj@gamil.com");

		employeeRepository.save(employee);

		}


/*
implements CommandLineRunner
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee(1, "Raj", "raj@gmail.com");
		Employee employee1 = new Employee(2, "john", "jhon@gmail.com");

		employeeRepository.save(employee);
		employeeRepository.save(employee1);

		System.out.println("Fetching details from db:****************");
		Optional<Employee> emp = employeeRepository.findById(1);
		if (emp.isPresent()){
			Employee employee3 = emp.get();
		}

	}*/
}
