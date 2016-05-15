package com.prac.daoImpl;

import java.util.ArrayList;
import java.util.List;

import com.prac.dao.ElementSources;
import com.prac.util.AppUtils;
import com.prac.vo.Employee;
import com.prac.vo.Option;

public class ElementSourceImpl implements ElementSources {

	@Override
	public List<Option> getFavColors() {
		List<Option> selectManyList;

		selectManyList = new ArrayList<Option>();
		selectManyList.add(new Option("Red", "RED"));
		selectManyList.add(new Option("White", "WHITE"));
		selectManyList.add(new Option("Blue", "BLUE"));

		return selectManyList;
	}

	@Override
	public List<Employee> getEmployeeList() {
		List<Employee> employeeList = new ArrayList<Employee>();
		Employee empObj = null;
		for(int index = 0; index < 10; index++){
			empObj = new Employee();
			empObj.setAge(AppUtils.getRandomNumber(25, 60));
			empObj.setDept("Division"+AppUtils.getRandomNumber(0, 10));
			empObj.setEmpName("Name"+AppUtils.getRandomNumber(10, 20));
			empObj.setEmpNum(""+AppUtils.getRandomNumber(10000, 20000));
			empObj.setRole("Role"+AppUtils.getRandomNumber(30, 50));
			empObj.setSal(AppUtils.getRandomNumber(4000, 8000));
			employeeList.add(empObj);
		}
		return employeeList;
	}
	
	 

}
