package com.cn.zjh.service.output;

import java.io.Serializable;

public class CustomerProfileOutput implements Serializable {

	private static final long serialVersionUID = -1065690250647580853L;

	private String userId;

	private String username;

	private String pwd;

	private String status;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
