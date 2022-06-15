package com.saeyan.controller;

import com.saeyan.controller.action.action;
import com.saeyan.controller.action.boardfromaction;
import com.saeyan.controller.action.boardlistaction;
import com.saeyan.controller.action.boardwriteaction;

public class actionfactory{
	private static actionfactory instance = new actionfactory();
	private actionfactory() {
		
	}
	public static actionfactory getinstance() {
		return instance;
	}
	
	public action getacAction(String command) {
		action action=null;
		System.out.println("actionfactory : "+command);
		
		if(command.equals("board_list")) {
			action= new boardlistaction();
			System.out.println(" 들어왔어요");
		}else if(command.equals("board_write_form")){
			action =new boardfromaction();
		}else if(command.equals("board_write")) {
			action=new boardwriteaction();
		}
		return action;
	}
}
