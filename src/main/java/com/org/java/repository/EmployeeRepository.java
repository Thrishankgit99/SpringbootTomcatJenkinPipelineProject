package com.org.java.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.org.java.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	List<Employee> findByEmpName(String empName);

	List<Employee> findByDeptName(String deptName);

	@Query("SELECT e FROM Employee e WHERE e.empName=:empName and e.deptName=:deptName")
	Employee findByEmpNameAndDeptName(@Param("empName") String empName, @Param("deptName") String deptName);

	@Query("SELECT e FROM Employee e WHERE e.empId=:empId and e.empName=:empName and e.deptName=:deptName")
	Employee findByEmpIdAndEmpNameAndDeptName(@Param("empId") int empId, @Param("empName") String empName,
			@Param("deptName") String deptName);

	@Query("SELECT e FROM Employee e WHERE e.empId=:empId")
	Optional<Employee> findByEmpId(@Param("empId") int empId);
	
    @Query("SELECT e FROM Employee e")
	List<Employee> findAllEmployees();
      
    @Query("SELECT FROM employee where salary= (select max(salary) from employee)")
     Employee findMaxSalary();

}
/*
 * Employee saveEmployeeDetails(@Param("empName") String empName, @Param("age")
 * int age,
 * 
 * @Param("salary") double salary, @Param("designation") String designation,
 * 
 * @Param("dataofJoinning") Date dataofJoinning, @Param("plateform") String
 * plateform,
 * 
 * @Param("sector") String sector, @Param("mobbileNumber") long
 * mobbileNumber, @Param("email") String email,
 * 
 * @Param("departmentId") int departmentId, @Param("deptName") String deptName);
 */

