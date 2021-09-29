package com.example.projectdemo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usertable")
public class User {
	
@Id
private int id;
	 private String fullname;
	 private  int age;
	 private  String majorteams;
	 private String country;
	 private String playerrole;
	 private String battingstyle;
	 private String bowlingstyle;
	 private String password;
	 
	 public User() {
		 
	 }
	 
	 
	public User( int id,String fullname, int age, String majorteams, String country, String playerrole, String battingstyle,
			String bowlingstyle , String password) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.age = age;
		this.majorteams = majorteams;
		this.country = country;
		this.playerrole = playerrole;
		this.battingstyle = battingstyle;
		this.bowlingstyle = bowlingstyle;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMajorteams() {
		return majorteams;
	}
	public void setMajorteams(String majorteams) {
		this.majorteams = majorteams;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPlayerrole() {
		return playerrole;
	}
	public void setPlayerrole(String playerrole) {
		this.playerrole = playerrole;
	}
	public String getBattingstyle() {
		return battingstyle;
	}
	public void setBattingstyle(String battingstyle) {
		this.battingstyle = battingstyle;
	}
	public String getBowlingstyle() {
		return bowlingstyle;
	}
	public void setBowlingstyle(String bowlingstyle) {
		this.bowlingstyle = bowlingstyle;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
