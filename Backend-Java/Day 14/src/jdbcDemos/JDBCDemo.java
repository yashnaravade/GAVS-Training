package jdbcDemos;


import java.sql.*;

public class JDBCDemo {
	public static void main(String[] ar) {
		// TODO Auto-generated method stub
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			 con=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/school","root","Sandeep@77");
			System.out.println("Connection Established...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Statement s;
		try {
			s = con.createStatement();
			int res=s.executeUpdate("insert into studies(PNAME, INSTITUTE, COURSE,COURSE_FEE) values('GAURAV','LPU','CSE', '1000000')");
			System.out.println(res + " record(s) inserted..");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


