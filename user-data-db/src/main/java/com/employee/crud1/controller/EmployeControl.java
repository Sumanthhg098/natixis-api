package com.employee.crud1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.crud1.servece.EmployeServec;

@CrossOrigin(origins="*")
@RestController
public class EmployeControl {
	
	@Autowired
	private EmployeServec empServec;
	
	
	@GetMapping("/pass")
    public String getPass(String user)
    {
   	 return empServec.getPassword(user);
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	// To fetch all the data
//	@GetMapping("/all")
//	public List<Employe> fetch() 
//	{
//		return empServec.getAllData();
//	}
//	
//	
//	//To fetch the data By ID
//	@GetMapping("/single")
//	public Optional<Employe> fetchId(int id)
//	{
//		return empServec.fetchById(id);
//	}
//	
//	
//	//to add the new data
//	@PostMapping("/add")
//	public String addNewEmployee(@RequestBody Employe emp)
//	{
//		empServec.addNewEmployee(emp);
//		return "successfully added new emp rec...."+emp.getId()+"---"+emp.getName();
//	}
//	
//	
//	//to delete the data
//	@DeleteMapping("/delete")
//	public String deleteEmployee(int id)
//	{
//		empServec.deleteOldEmp(id);
//		return "successfully delete emp rec...ID="+id;
//	}
//	
//	
//	//to update the data in db
//	@PutMapping("/update")
//	public String updateData(@RequestBody Employe emp)
//	{
//		return empServec.update(emp);
//	}
//	
//	
//	//adding data as an List
//	@PostMapping("/addAll")
//	public String addNewData(@RequestBody List<Employe> empList)
//	{
//		return empServec.addNewEmployee1(empList);
//	}
}
