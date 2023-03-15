package com.login.crud.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.crud.model.Model;

public interface ModelRepo extends JpaRepository<Model,Integer>{

}
