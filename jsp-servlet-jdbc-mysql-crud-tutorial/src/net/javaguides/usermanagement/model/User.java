package net.javaguides.usermanagement.model;


public class User {
	protected int nicid;
	protected String name;
	protected String department;
	protected String designation;
	protected String joined_date;
	
	public User() {
	}
	
	public User(int nicid,String name, String department, String designation,String joined_date) {
		super();
		this.name = name;
		this.department = department;
		this.designation =designation;
		this.joined_date =joined_date;
	}

	public User(int nicid,String name, String department, String designation,String joined_date) {
		super();
		this.name = name;
		this.department = department;
		this.designation =designation;
		this.joined_date =joined_date;
	}

	public int getnicid() {
		return nicid;
	}
	public void setnicid(int id) {
		this.id = nicid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String department() {
		return department;
	}
	public void setdepartment(String department) {
		this.department = department;
	}
	public String designation() {
		return designation;
	}
	public void setCountry(String designation) {
		this.designation= designation;
	}
	public String joined_date() {
		return joined_date;
	}
	public void setjoined_date(String joined_date) {
		this.joined_date= joined_date;
	}
}
