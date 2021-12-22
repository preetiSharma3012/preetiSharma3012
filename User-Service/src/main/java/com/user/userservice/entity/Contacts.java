package com.user.userservice.entity;

public class Contacts {
	
	private Long contactid;
	private String email;
	private String contactName;
	
	private Long userid;

	public Contacts(Long contactid, String email, String contactName, Long userid) {
		super();
		this.contactid = contactid;
		this.email = email;
		this.contactName = contactName;
		this.userid = userid;
	}

	public Contacts() {
		super();
	}

	public Long getContactid() {
		return contactid;
	}

	public void setContactid(Long contactid) {
		this.contactid = contactid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	
	

}
