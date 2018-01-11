package com.erye.entity;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

/**
 * 测试  校验
 */
public class Consumer implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@NotNull // 不允许为null
	@Size(min=1, max=2) // 长度，不可用在Integer类型的参数上
	private String username;
	
	private String password;
	
	private String email;
	
	@Min(1) // 数字的最小值
	@Max(10) // 数字的最大值
	private Integer age;
	
	@Past // 必须为一个过去的时间
	private Date loginDate;
	
	@Future // 必须为一个未来的时间
	private Date expiryDate;

	public Consumer(String username, String password, String email, Integer age, Date loginDate, Date expiryDate) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.age = age;
		this.loginDate = loginDate;
		this.expiryDate = expiryDate;
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getLoginDate() {
		return loginDate;
	}

	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "Consumer [username=" + username + ", password=" + password + ", email=" + email + ", age=" + age
				+ ", loginDate=" + loginDate + ", expiryDate=" + expiryDate + "]";
	}
}
