package com.banking.Controller;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.banking.Model.*;
public class Dao {
public static int AddUser(AddUser user)
{
	int status=0;
	Connection con=null;
	try
	{
		con=DB.getconnection();
    PreparedStatement ps=con.prepareStatement("Insert INTO HR.Customer(NAME,Email,Credit) VALUES(?,?,?)");
	ps.setString(1, user.getName());
	ps.setString(2, user.getEmail());
	ps.setInt(3, user.getCredit());
	status=ps.executeUpdate();
	}
	catch(SQLException e)
	{
	e.printStackTrace();	
	}
	return status;
}
public static List<AddUser> ViewUser()
{
	List<AddUser> Userbean=new ArrayList<AddUser>();
	Connection con=null;
	try
	{
		con=DB.getconnection();
	PreparedStatement ps=con.prepareStatement("Select * From HR.Customer");
	ResultSet rs=ps.executeQuery();
	while(rs.next())
	{
		AddUser bean=new AddUser();
		bean.setAccountId(rs.getInt("AccountNo"));
		bean.setName(rs.getString("Name"));
		bean.setEmail(rs.getString("Email"));
		bean.setCredit(rs.getInt("Credit"));
	    Userbean.add(bean);
		}
	}
	catch(SQLException e)
	{
		
	e.printStackTrace();
	}
	return Userbean;	
	}
public static AddUser viewById(int id) {
	AddUser bean= null;
	Connection con=DB.getconnection();
	try {
		PreparedStatement ps=con.prepareStatement("Select * From HR.Customer where AccountNo=?");
		ps.setInt(1,id);
	  	ResultSet rs = ps.executeQuery();
	  	bean=new AddUser();
	  	while(rs.next()) {
	  		bean.setAccountId(rs.getInt("AccountNo"));
	  		bean.setName(rs.getString("Name"));
	  		bean.setEmail(rs.getString("Email"));
	  		bean.setCredit(rs.getInt("Credit"));
	  	}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return bean;
	
}
public static List<AddUser> ViewAllName()
{
	List<AddUser> Userbean=new ArrayList<AddUser>();
	Connection con=null;
	try
	{
		con=DB.getconnection();
	PreparedStatement ps=con.prepareStatement("Select Name From HR.Customer");
	ResultSet rs=ps.executeQuery();
	while(rs.next())
	{
		AddUser bean=new AddUser();
		bean.setName(rs.getString("Name"));
	    Userbean.add(bean);
		}
	}
	catch(SQLException e)
	{
		
	e.printStackTrace();
	}
	return Userbean;	
	}
public static int UpdateBalance(String sname,String rname,int amount)
{
	int status=0;
	Connection con=null;
	try
	{
		con=DB.getconnection();
		
	PreparedStatement ps=con.prepareStatement("Update HR.Customer set Credit=Credit+? where NAME=?");
	ps.setInt(1,amount);
	ps.setString(2, rname);
	status=ps.executeUpdate();
	}
	catch(SQLException e)
	{
	e.printStackTrace();	
	}
	try {
		con=DB.getconnection();
	if(status>0) {
		PreparedStatement ps1=con.prepareStatement("Update HR.Customer set Credit=Credit-? where NAME=?");
		ps1.setInt(1,amount);
		ps1.setString(2, sname);
		status=ps1.executeUpdate();
	}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
		return status;
}
}
