package com.prac.daoImpl;

import java.util.ArrayList;
import java.util.List;

import com.prac.dao.ElementSources;
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

}
