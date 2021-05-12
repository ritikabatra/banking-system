package com.banking.Model;

public class AddUser {
private String Name;
private String Email;
private int Credit;
private int AccountId;
public AddUser() {
	super();
	// TODO Auto-generated constructor stub
}
public AddUser(String name, String email, int credit) {
	super();
	Name = name;
	Email = email;
	Credit = credit;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}


public int getAccountId() {
	return AccountId;
}
public void setAccountId(int accountId) {
	AccountId=accountId;
}







public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public int getCredit() {
	return Credit;
}
public void setCredit(int credit) {
	Credit = credit;
}

}
