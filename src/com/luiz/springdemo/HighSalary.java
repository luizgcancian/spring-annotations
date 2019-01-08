package com.luiz.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HighSalary implements Salary {

	@Override
	public String getSalary() {
		return "you have a good salary";
	}

}
