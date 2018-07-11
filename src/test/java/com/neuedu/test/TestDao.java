package com.neuedu.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.neuedu.dao.TwoDao;
import com.neuedu.pojo.Two;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:config/applicationContext.xml"})
public class TestDao {
		/*Two t = new Two();
		t.setNo(1);
		List<Two> twos = dao.getOne(t);
		for (Two two : twos) {
			System.out.println(two);
		}
		List<Two> twos = dao.getAll(t);
		for (Two two : twos) {
			System.out.println(two);
		}*/
//	}
	public static void main(String[] args) {
		System.out.println(StringUtils.isBlank(null));
	}
}
