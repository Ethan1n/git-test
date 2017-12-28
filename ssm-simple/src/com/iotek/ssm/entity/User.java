package com.iotek.ssm.entity;
public class User {
	private int uId;
	private String uName;
    //set,get·½·¨
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	@Override
	public String toString() {
		return "User [uId=" + uId + ", uName=" + uName + "]";
	}
	public User(int uId, String uName) {
		super();
		this.uId = uId;
		this.uName = uName;
	}
	public User() {
		super();
	}
	
}