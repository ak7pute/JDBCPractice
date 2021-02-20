package com.cjc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class StatementBsic 
{
	public static void main(String[] args) throws Exception {
		
	    Class.forName("com.mysql.jdbc.Driver");
	    
	    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");

	    
	   String sql = "Insert into student values(1,'aks','dis')";
	    
	   //String sql = "Create table student (id int(40),name char(50), address char(50))";
	    
	     
	    
	    Statement smt=con.createStatement();
	    smt.execute(sql);
	    System.out.println("Insert data Succesfully");
	    smt.close();
	    con.close();
	}

}
