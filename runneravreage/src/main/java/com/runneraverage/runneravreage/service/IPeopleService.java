package com.runneraverage.runneravreage.service;

import java.util.List;

import com.runneraverage.runneravreage.entity.People;

public interface IPeopleService {

	
	public List<People> findAll();
	
	public People findById(int theId);
	
	public void save(People thePeople);
	
	public void delete(int theId);
	
}
