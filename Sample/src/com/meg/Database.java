package com.meg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


/*Steps to connect JDBC
*1. import -------> java.sql
*2. Load and register the driver --> com.mysql.jdbc.Driver
*3. Create connection
*4. Create a statement 
*5. execute the query
*6. process the results
*7.close
*/

public class Database {
	
	public static void main(String[] args) {
		//public Connection DBConnection() {
		// TODO Auto-generated method stub
		String userName,password,url,driver;
	    Connection con = null;
	    Statement st;
		userName="2000186_upeta";
        password="Sreyo123";
        url="jdbc:mariadb://207.246.241.5:3306/2000186_upeta";
        driver="org.mariadb.jdbc.Driver";
        try {
            Class.forName(driver);
        con=DriverManager.getConnection(url, userName, password);
        System.out.println("Connection works");
        st =con.createStatement();
        int result=st.executeUpdate("INSERT INTO `MR_Registration`(`First_Name`, `Last_Name`, `Address`, `Contact_No`, `Age`, `Gender`, `Username`, `Password`) VALUES ('Jeremy','Mathew','56 Stewart Avenue, New Hyde Park, NY 11040','9178634587','22','M','jeremy_mathew','jeremy123')");
        System.out.println("Connection is successful::"+result);
        
        } catch (Exception e) {
          e.printStackTrace();
        }
        //return con;
	}

}