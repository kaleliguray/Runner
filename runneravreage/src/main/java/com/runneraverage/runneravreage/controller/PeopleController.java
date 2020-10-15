package com.runneraverage.runneravreage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.runneraverage.runneravreage.entity.People;
import com.runneraverage.runneravreage.service.IPeopleService;

@RestController
@RequestMapping("/api")
public class PeopleController {

	private IPeopleService peopleService;
	
	@Autowired
	public PeopleController(IPeopleService thePeopleService) {
		this.peopleService = thePeopleService;
	}
	
	@GetMapping("/people")
	public List<People> findAll(){
		
		List<People> thePeople = peopleService.findAll();
		

		return thePeople;
	}
	
	
	@GetMapping("/people/{id}")
	public People getPeople(@PathVariable int id) {
		
		People thePeople = peopleService.findById(id);
		
		if (thePeople == null) {
			throw new RuntimeException("People is not found : " +id); 
		}
		
		return thePeople;
	}
	
	
	@PostMapping("/people")
	public People addPeople(@RequestBody People thePeople) {
		
		thePeople.setId(0);
		
		peopleService.save(thePeople);
		
		return thePeople;
	}
	
	
	@PutMapping("/people")
	public People updatePeople(@RequestBody People thePeople) {
		
		peopleService.save(thePeople);
		
		return thePeople;
	}
	
	@DeleteMapping("/people/{theId}")
	public String deletePeopleId(@PathVariable int theId) {
		
		People thePeople = peopleService.findById(theId);
		
		if (thePeople == null) {
			
			throw new RuntimeException("People id not found  " + theId);
			
		}
		
		peopleService.delete(theId);
		
		return "Delete people id " + theId;
	}
	
	
}




























