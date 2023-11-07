import java.sql.*;
public class DriverCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	// step1: load the driver class
	Class.forName("oracle.jdbc.driver.OracleDriver");
	//step2: create the connection object
	Connection con;
	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "tunga" , "sravan");
	//step3: create the statement object
	Statement stmt;
	stmt=con.createStatement();
	//step4: execute query
	ResultSet rs;
	rs=stmt.executeQuery("select * from student");
	while(rs.next())
		System.out.println(rs.getInt(1)+ " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
    //step5: close  the connection object
	con.close();
	
}
catch(Exception e) {
	System.out.println(e);
	
}
	}

}
