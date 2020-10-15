package com.runneraverage.runneravreage.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "people")
public class People implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "sex")
	private String sex;
	
	@Column(name = "distance")
	private int distance;
	
	@Column(name = "totaltime")
	private int totalTime;
	
	@Column(name ="average")
	private double average;
	
	public People() {
		
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	
	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance * 1000;
	}


	public int getTotalTime() {
		return totalTime;
	}


	public void setTotalTime(int totalTime) {
		this.totalTime = totalTime;
	}


	public void setAverage(double average) {
		this.average = average;
	}


	public double getAverage() {
		return average;
	}


	@Override
	public String toString() {
		return "People [id=" + id + ", username=" + username + ", age=" + age + ", sex=" + sex + ", distance="
				+ distance + ", localTime=" + totalTime + ", average=" + average + "]";
	}


	
}
