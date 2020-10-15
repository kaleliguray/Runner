package com.runneraverage.runneravreage.dao;

import java.util.List;

import javax.persistence.EntityManager;


import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.runneraverage.runneravreage.entity.People;

@Repository
public class PeopleDaoImpl implements IPeopleDao {
	
	private EntityManager entityManager;
	
	@Autowired
	public PeopleDaoImpl(EntityManager theEntityManager) {
		this.entityManager = theEntityManager;
	}

	@Override
	public List<People> findAll() {
		
		Session currentSession = entityManager.unwrap(Session.class);
		
		Query<People> theQuery = currentSession.createQuery("from People", People.class);
		
		List<People> humans = theQuery.getResultList();
		
		return humans;
	}

	@Override
	public People findById(int theId) {
			
		Session currentSession = entityManager.unwrap(Session.class);
		
		People people = currentSession.get(People.class, theId);
		
		return people;
	}

	@Override
	public void save(People thePeople) {
		
		Session currentSession = entityManager.unwrap(Session.class);
		
		currentSession.save(thePeople);
		
	}

	@Override
	public void delete(int theId) {
		
		Session currentSession = entityManager.unwrap(Session.class);
		
		Query<People> theQuery = currentSession.createQuery("delete from people where id=userId");
		
		theQuery.setParameter("userId", theId);
		
		theQuery.executeUpdate();
		
	}

}














