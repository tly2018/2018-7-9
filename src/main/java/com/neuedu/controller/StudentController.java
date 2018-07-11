package com.neuedu.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neuedu.pojo.Two;
import com.neuedu.service.TwoService;

@Controller
public class StudentController {
	@Resource
	private TwoService service;
	@RequestMapping("/list.do")
	public String get(Two two,ModelMap map){
		if(StringUtils.isBlank(two.getPname())){
			two.setPname(null);
		}
		
		
		List<Two> all = service.getAll(two);
		map.addAttribute("two", two);
		map.addAttribute("all", all);
		return "list";
	}
	@RequestMapping("/a")
	public String atest(){
		return "add";
	}
	
	
	
	
	
	
	
}
