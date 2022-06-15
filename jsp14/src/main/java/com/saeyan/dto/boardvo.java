package com.saeyan.dto;



import java.sql.Timestamp;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class boardvo {
	private Integer num, readcount;
	private String pass, name, email, title, contente;
	private Timestamp writedate;
	
	
}
