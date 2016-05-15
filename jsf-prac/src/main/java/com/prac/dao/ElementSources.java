package com.prac.dao;

import java.util.List;

import com.prac.vo.Employee;
import com.prac.vo.Option;

public interface ElementSources {
	public List<Option> getFavColors();
	public List<Employee> getEmployeeList();

}
