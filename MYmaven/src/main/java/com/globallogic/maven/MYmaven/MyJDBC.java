package com.globallogic.maven.MYmaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyJDBC {
	public static void main(String[] args) {

//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			String username = "root";
//			String password = "root";
//			String url = "jdbc:mysql://localhost:3306/buddy";
//			Connection con = DriverManager.getConnection(url, username, password);
//			Statement st = con.createStatement();
//			String query = "select * from employee";
//			ResultSet rs = st.executeQuery(query);
//			while (rs.next()) {
//				System.out.println("emp_id " + "  " + rs.getInt(1) + " ");
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//}

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String username = "root";
			String password = "root";
			String url = "jdbc:mysql://localhost:3306/buddy";
			Connection con = DriverManager.getConnection(url, username, password);
			Statement st = con.createStatement();

			String insertQuery = "insert into employee(emp_id,emp_name,salary,dep_id) values (10,'pooja',50000,1)";
			st.execute(insertQuery);

			// update query starts

			// delete query starts
			String deleteQuery = "delete from employee where emp_id=9";
			st.executeUpdate(deleteQuery);

			// delete query ends

			String updateQuery = "update employee set salary=50001 where emp_id=9";
			st.executeUpdate(updateQuery);

			// update query ends

			// Select using executeQuery
			String query = "select * from employee";

			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				// rs.getint()
				// pass the index
				// pass the columnname
				System.out.println("emp_id : " + " " + rs.getInt("emp_id") + " name : " + rs.getString(2)   + " salary : " + rs.getInt(4));

			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

}
}
