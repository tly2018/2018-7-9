package com.neuedu.dao;

import java.util.List;

import com.neuedu.pojo.Two;

public interface TwoDao {
	public List<Two> getAll(Two two);
	public List<Two> getOne(Two two);
	public int add(Two two);
}
