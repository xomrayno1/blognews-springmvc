package com.tampro.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Users {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	@OneToOne(mappedBy = "user")
	private News news;
	private String username;
	private String password;
	private String email;
	private String role; // 1 user chỉ đc có 1 role , 
	private String phone ;
	private String address;
	private int active; 
	
	
	public boolean checkActive() {
		if(active==0) {
			return true; // chết 
		}else { 
			return false; // sống
		}
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public News getNews() {
		return news;
	}
	public void setNews(News news) {
		this.news = news;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int isActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	
	
}
