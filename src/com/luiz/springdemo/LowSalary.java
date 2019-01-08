package com.luiz.springdemo;

import org.springframework.stereotype.Component;

@Component
public class LowSalary implements Salary {

	@Override
	public String getSalary() {
		return "sorry, you have a bad salary";
	}

}
