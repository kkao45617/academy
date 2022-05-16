package com.example.demo.info;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class infocontroller {
	@GetMapping("/info")
	public Object projectinfo() {
		Project project = new Project();
		project.projectname = "preword";
		project.author = " hello-bryan";
		project.createdDate=new Date();
		return project;
	}
}
