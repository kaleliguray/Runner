package com.runneraverage.runneravreage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.runneraverage.runneravreage.dao.IPeopleDao;
import com.runneraverage.runneravreage.entity.People;

@Service
public class PeopleServiceImpl implements IPeopleService{

	private IPeopleDao peopleDao;

	@Autowired
	public PeopleServiceImpl(IPeopleDao thePeopleDao) {
		this.peopleDao = thePeopleDao;
	}
	
	
	@Override
	@Transactional
	public List<People> findAll() {
		
		return peopleDao.findAll();
	}

	@Override
	@Transactional
	public People findById(int theId) {

		return peopleDao.findById(theId);
	}

	@Override
	@Transactional
	public void save(People thePeople) {
		
		peopleDao.save(thePeople);
	}

	@Override
	@Transactional
	public void delete(int theId) {
		
		peopleDao.delete(theId);
	}

}
