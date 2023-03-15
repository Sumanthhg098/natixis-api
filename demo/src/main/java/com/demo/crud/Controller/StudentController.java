package com.demo.crud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.crud.Service.StudentService;
import com.demo.crud.model.Student;

@RestController
public class StudentController {
	@Autowired
	StudentService stuService;
	
	//fetching all the data
	@GetMapping("/all")
	@CrossOrigin("http://localhost:4200")
	public List<Student> fetchAll()
	{
		return stuService.fetchAllStu();
	}
	
	
	//fetching single data
	@CrossOrigin("http://localhost:4200")
	@GetMapping("/single")
	public List<Student> fetch(int id)
	{
		return stuService.fetchStu(id);
	}
	
	
	//fetching the data by name
	@CrossOrigin("http://localhost:4200")
	@GetMapping("/name")
	public Student name(String name)
	{
		return stuService.findName(name);
	}
	
	
	//fetching the data by name
		@CrossOrigin("http://localhost:4200")
		@GetMapping("/fee")
		public List<Student> fee(int fee)
		{
			return stuService.findFee(fee);
		}
	
	//fetching the data by marks
	@CrossOrigin("http://localhost:4200")
	@GetMapping("/getMarks")
	public List<Student> marks(int marks)
	{
		return stuService.fetchMarks(marks);
	}
	
	
	//fetching the data by marks && fee
	@CrossOrigin("http://localhost:4200")
	@GetMapping("/getData")
	public List<Student> fetchData(int marks,int fee)
	{
		return stuService.fetchDataStu(marks,fee);
	}
	
	
	//
	
}
