package com.meg;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;

import javax.servlet.ServletException;

public class DAO_Signup {

	public void InsertReg(String First_Name,String Last_Name, String Address, String Contact_No, String Age, String Gender, String Username, String Password) {
		Database dbconn=new Database();
		Connection con=dbconn.DBConnection();
		try {
		Statement st=con.createStatement();
        int result=st.executeUpdate("INSERT INTO `MR_Registration`('First_Name,'Last_Name',`Address`, `Contact_No`,'Age','Gender','Username','Password',)"
        		+ "VALUES ('Jeremy','Mathew','56 Stewart Avenue, New Hyde Park, NY 11040','9178634587','22','M','jeremy_mathew','jeremy123')");
        System.out.println("Connection is successful::"+result);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
 