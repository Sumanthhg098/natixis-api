package com.login.crud.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.crud.Repo.ModelRepo;
import com.login.crud.model.Model;

@Service
public class ModelService {

	@Autowired
	private ModelRepo repo;
	
	public String getAns1(String email, String pass) {
		List<Model> list = repo.findAll();
		
		for(Model x:list)
		{
			String name=x.getEmail();
			System.out.println(name);
			System.out.println(email);
			if(name.equals(email)) 
			{
				String password=x.getPassword();
				System.out.println(password);
				System.out.println(pass);
				if(password.equals(pass)) return "true";
			}
;
		}
		return "false";
	}

	public void addNewData(Model model) {
		
		repo.save(model);
	}

}
