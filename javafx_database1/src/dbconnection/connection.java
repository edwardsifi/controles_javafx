package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class connection {
	public void getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con;
		
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","eduardo");
		System.out.println("connected to database");
		java.sql.Statement st = con.createStatement();
		
		String str = "insert into employee values('maria')";
		
		st.executeUpdate(str);
		
		System.out.println("data is inserted");
		
		String str2 = "select *from employee";
		
		ResultSet rs = st.executeQuery(str2);
		
		while (rs.next()) {
			System.out.println("info: "+rs.getString("INF_employee"));
		}
		
		st.close();
		con.close();
		System.out.println("connection close");
	}
}
