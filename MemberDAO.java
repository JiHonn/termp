package term_proj;

import java.sql.*;

public class MemberDAO {
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/shxdb";

	private static final String USER = "root"; // DB ID
	private static final String PASS = "wl100301"; // DB �н�����
	
	public static void main(String[] args) {
		try {
			Class.forName(DRIVER);
			Connection con = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Connect Success");
			// ���尴ü ����
			Statement stmt = con.createStatement();
			String sql = "select * from personal_info";
			java.sql.ResultSet rs = stmt.executeQuery(sql);
			// ����
			rs.beforeFirst();
			
			while(rs.next()) {
				System.out.println(rs.getString("id") +"\n"+ rs.getString("password"));
			}
		} catch (Exception e) {
			System.out.println("Connection Failed");
		}
	}

}