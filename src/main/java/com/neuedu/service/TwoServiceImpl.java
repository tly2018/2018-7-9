package com.neuedu.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.neuedu.dao.TwoDao;
import com.neuedu.pojo.Two;
@Service
public class TwoServiceImpl implements TwoService{
	@Resource
	private TwoDao dao;
	@Override
	public List<Two> getAll(Two two) {
		// TODO Auto-generated method stub
		return dao.getAll(two);
	}
	@Override
	public List<Two> getOne(Two two) {
		// TODO Auto-generated method stub
		return dao.getOne(two);
	}

}
