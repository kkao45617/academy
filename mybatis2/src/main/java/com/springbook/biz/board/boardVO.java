package com.springbook.biz.board;

import java.sql.Date;
import org.springframework.web.multipart.MultipartFile;



public class boardVO {
	private int seq,cnt;
	private String title, writer, content;
	private Date regdate;	
	private String serchcondition;
	private String serchkeyword;
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public String getSerchcondition() {
		return serchcondition;
	}
	public void setSerchcondition(String serchcondition) {
		this.serchcondition = serchcondition;
	}
	public String getSerchkeyword() {
		return serchkeyword;
	}
	public void setSerchkeyword(String serchkeyword) {
		this.serchkeyword = serchkeyword;
	}
	
	
	@Override
	public String toString() {
		return "boardVO [seq=" + seq + ", cnt=" + cnt + ", title=" + title + ", writer=" + writer + ", content="
				+ content + ", regdate=" + regdate + ", serchcondition=" + serchcondition + ", serchkeyword="
				+ serchkeyword + "]";
	}

	
	
	
}
