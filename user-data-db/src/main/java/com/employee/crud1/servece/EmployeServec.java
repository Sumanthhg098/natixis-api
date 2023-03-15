package com.employee.crud1.servece;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.crud1.model.Employe;
import com.employee.crud1.repo.EmployeRepo;


@Service
public class EmployeServec {
	
	@Autowired
	private EmployeRepo empRepo;

//	// To fetch all the data
//	public List<Employe> getAllData() {
//		// TODO Auto-generated method stub
//		return empRepo.findAll();
//	}
//
//	
//	//to add the new data
//	public void addNewEmployee(Employe emp) {
//		empRepo.save(emp);
//	}
//
//	
//	//to delete the data
//	public void deleteOldEmp(int id) {
//		empRepo.deleteById(id);
//	}
//
//	
//	//To fetch the data By ID
//	public Optional<Employe> fetchById(int id) {
//		return empRepo.findById(id);
//	}
//
//	
//	
//	public String update(Employe emp) {
//		try
//		{
//			Employe employee = empRepo.findById(emp.getId()).get();
//			if(employee!=null)
//			{
//				empRepo.save(emp); 
//				return "Records updated for ID="+emp.getId();
//			}
//		}
//		catch(Exception e)
//		{
//			return "Record not found to update";
//		}
//		return "Record not found to update";
//			
//	}
//	
//	
//	
//	public String addNewEmployee1( List<Employe> empList) {
//		empRepo.saveAll(empList);
//		return  "added data Id's are ";
//	}
//	
//	public String update1( List<Employe> empList) {
//		try
//		{
//			for(Employe x :empList)
//			{
//				Employe employee = empRepo.findById(x.getId()).get();
//				if(employee!=null)
//				{
//					empRepo.save(x); 
//					
//				}
//			}
//			return "Records updated";
//		}
//		catch(Exception e)
//		{
//			return "Record not found to update";
//		}
//			
//	}


	public String getPassword(String user) {
		
		List<Employe> l =  empRepo.findAll();
		for(Employe x:l)
		{
			if(x.getName()==user) return x.getPassword();
		}
		return null;
	}
	
}
