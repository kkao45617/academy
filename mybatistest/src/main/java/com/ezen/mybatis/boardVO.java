package com.ezen.mybatis;

import lombok.Data;
//create table board( id number(5) primary key, name VARCHAR(20), phone VARCHAR(20),address VARCHAR2(60));
@Data
public class boardVO {
	private int id;
	private String name;
	private String phone;
	private String address;
}
