package DBpack;

import java.sql.*;
import com.Model.AdmissionModel;

public class DaoConnect {
	public static Connection getConnection() {
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test_schema","root","OPEN");
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return con;
	}
	
	public static int Rsave(AdmissionModel am) {
		int status=0;
		try {
			Connection con= DaoConnect.getConnection();
			PreparedStatement ps=con.prepareStatement("INSERT INTO regTrial (Fname , Lname , username, email , mobile , gender , degree ) VALUES(?,?,?,?,?,?,?)");
			
			ps.setNString(1, am.getFname());
			ps.setNString(2, am.getLname());
			ps.setNString(3, am.getUsername());
			ps.setNString(4, am.getEmail());
			ps.setNString(5, am.getMobile());
			ps.setNString(6, am.getGender());
			ps.setNString(7, am.getDegree());
			
			status= ps.executeUpdate();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return status;
	}
}
