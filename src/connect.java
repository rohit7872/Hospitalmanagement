import java.sql.*;
import javax.swing.*;
public class connect {
	connect con=null;
	public static connect ConnectDB(){
		try{
	        Class.forName("com.mysql.jdbc.Driver");
	        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?&serverTimezone=UTC","root","");
	        return (connect) con;
	    }catch(ClassNotFoundException | SQLException e) {
	        JOptionPane.showMessageDialog(null, e);
	        return null;
	        
	        
	        
	    }
	}

	


	}


