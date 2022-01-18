package com.gom.s1.member;

import java.util.Calendar;

public class MemberDTO {

	private String name;
	private String nick;
	private String email;
	private String number;
	private Calendar birth;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Calendar getBirth() {
		
		
		return birth;
	}
	public void setBirth(Calendar birth) {
		this.birth = birth;
	}

	
}
