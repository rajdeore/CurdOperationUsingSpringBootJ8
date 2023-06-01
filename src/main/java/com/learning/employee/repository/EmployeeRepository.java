package com.learning.employee.repository;

import com.learning.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*@Repository*/
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    //all CRUD database methods

}
