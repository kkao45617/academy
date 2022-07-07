package com.springbook.biz.utill;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class sqlsessionfactorybean {
	private static SqlSessionFactory sessionfactory =null;
	
	static {
		try {
			
			if(sessionfactory ==null) {
				Reader reader = Resources.getResourceAsReader("sql-map-config.xml");
				sessionfactory = new SqlSessionFactoryBuilder().build(reader);

			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static SqlSession getsqlsessSessioninatance() {
		return sessionfactory.openSession();
	}
	
	
	
}
