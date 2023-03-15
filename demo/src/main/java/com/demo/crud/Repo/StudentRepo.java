package com.demo.crud.Repo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.demo.crud.model.Student;

@Component
public class StudentRepo {
	List<Student> stuList = Arrays.asList(
			new Student(1,"Suraj",50,5000),
			new Student(2,"tarurn",60,6000),
			new Student(3,"Teja",70,2000),
			new Student(4,"anil",85,2500));
	
	public List<Student> getStudentList()
	{
		return stuList;
	}

	public List<Student> fetch(int id) {

		return stuList.stream().filter(x->x.getId()==id).collect(Collectors.toList());
	}

	public Student name(String name) {
		for(Student x:stuList)
		{
			if(x.getName().equalsIgnoreCase(name)) return x;
		}
		return null;
	}

	public List<Student> marks(int n) {
	
		return stuList.stream().filter(x->x.getMarks()>n).collect(Collectors.toList());
	}

	public List<Student> fetchData(int marks, int fee) {
	
		return stuList.stream().filter(x->(x.getMarks()>marks)&&(x.getFee()>=fee)).collect(Collectors.toList());
	}

	public List<Student> fetchFee(int fee) {
		// TODO Auto-generated method stub
		return stuList.stream().filter(x->x.getFee()>fee).collect(Collectors.toList());
	}
}
