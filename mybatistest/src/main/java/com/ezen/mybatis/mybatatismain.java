package com.ezen.mybatis;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class mybatatismain {

	public static void main(String[] args) {
		String resource = "com/ezen/mybatis/mybatis-config.xml";
		InputStream inputStream=null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			
			SqlSession session = sqlSessionFactory.openSession();
			System.out.println("session : "+session);
			System.out.println("sql sessionfactiory : "+sqlSessionFactory);
			
			boardmethod mapper = session.getMapper(boardmethod.class);
			
			
			boardVO vo = mapper.selectone(1);
			
			System.out.println(vo.toString());
			List<boardVO> list= mapper.selectallmember();
			
			
			
			//mapper.deleteboard(3);
			session.commit();
			
			boardVO vo3 = new boardVO();
			/*vo3.setAddress("아즈카반");
			vo3.setId(11); 
			vo3.setName("헤리포터");
			vo3.setPhone("010-4815-0874");
			mapper.insertboard(vo3);*/
			
			vo.setId(1);
			vo.setAddress("호그와트");
			vo.setName("론위즐리");
			vo.setPhone("010-4235-3421");
			mapper.updateboard(vo);
			
			session.commit();
			
			for(boardVO vo2 : list) {
				System.out.println(vo2.toString());  
			}
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
