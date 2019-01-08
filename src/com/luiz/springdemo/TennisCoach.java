package com.luiz.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	/*
	// Field Injection//
	
	@Autowired
	@Qualifier("lowSalary")
	*/
	private Salary salary;
	
	@Value("${foo.team}")
	private String team;
	
	 
	public String getTeam() {
		return team;
	}



	@Autowired
	public TennisCoach(@Qualifier("lowSalary")Salary salary) {
		this.salary = salary;
	}
	
	
	
	// Setter Injection //
	
	/*
	@Autowired
	public void setSalary(Salary salary) {
		this.salary = salary;
	}
	
	*/
	
	
	
	@Override
	public String getDailyWorkout() {
		return "doing tennis stuff";
	}

	@Override
	public String getYourSalary() {
		return salary.getSalary();
	}

}
