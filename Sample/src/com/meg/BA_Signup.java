package com.meg;

import java.io.IOException;

import javax.servlet.ServletException;

public class BA_Signup {
	public void RegisterBA(String First_Name ,String Last_Name, String Address, String Contact_No, String Age, String Gender, String Username, String Password) {
		DAO_Signup objRegDAO=new DAO_Signup();
		objRegDAO.InsertReg(First_Name, Last_Name, Address, Contact_No, Age, Gender, Username, Password);
		

}
} 
