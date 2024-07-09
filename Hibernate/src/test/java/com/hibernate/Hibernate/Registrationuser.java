package com.hibernate.Hibernate;
@Entity
public class Registrationuser {
	@Id
private int registernumber;
public int getRegisternumber() {
	return registernumber;
}
public void setRegisternumber(int registernumber) {
	this.registernumber = registernumber;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
private String name;
private String department;
}
