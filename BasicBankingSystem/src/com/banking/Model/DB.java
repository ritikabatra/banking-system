package com.banking.Model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
public static Connection getconnection()
{
	Connection con=null;
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","1234");
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    return con;

}
}
