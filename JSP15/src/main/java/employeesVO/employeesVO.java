package employeesVO;

import java.sql.Timestamp;

import lombok.Data;
@Data
public class employeesVO {
	private String id,pass,name,phone,lev,gender;
	private Timestamp enter;
	
}
