package JDBC;
import java.sql.*;
import java.util.Scanner;

public class JdbcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		Scanner sc=new Scanner(System.in);
		try {
			Class.
			forName
			("com.mysql.cj.jdbc.Driver");	
			}
		catch
			(ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();}
				try {
					 con=DriverManager.getConnection
							("jdbc:mysql://localhost:3306/hr","root","Aamir@489");
					System.out.println("Connection Established...");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				PreparedStatement s;
				try {
					System.out.println("Enter the employee id to search:");
					int empid=sc.nextInt();
					s=con.prepareStatement("select employee_id,first_name,hire_date from employees where employee_id=?");
					s.setInt(1, empid);
					ResultSet rs=s.executeQuery();
					while(rs.next()) {
						System.out.println("Employee id :"+rs.getInt("employee_id"));
						System.out.println("Employee Name :"+rs.getString(2));
						System.out.println("Date Of Joining:"+rs.getDate(3));
						System.out.println("---------------xxx--------------");
					}
						} 
				catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
}

				
