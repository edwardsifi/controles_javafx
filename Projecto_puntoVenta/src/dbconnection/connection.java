package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection extends configs{
	Connection con;
	
	public Connection getconnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		
		String str  = "jdbc:mysql://"+configs.dbhost+":"+configs.dbport+"/"+configs.dbname;
		con = DriverManager.getConnection(str,configs.dbuser,configs.dbpassword);
		return con;
	}

}
