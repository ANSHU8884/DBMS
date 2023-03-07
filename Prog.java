package conn;

import java.sql.*;

class prog{
	public static void main(String args[])
	{
	
  try{
	System.out.println("welcome....");
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/t5?useSSL=false","root","root"); 
	Statement stmt = con.createStatement();
	ResultSet rs = stmt.executeQuery("Select * from stud");

	while(rs.next())	
	{
		System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4));
	}
String sql = "insert into stud (Rollno,Name,Branch,Percent) values (8,'Anmol','prod',55)";
int rows = stmt.executeUpdate(sql);
System.out.println("nymber of rows"+rows);
/.
 /	int rows1 = stmt.executeUpdate("delete from stud where rollno=8");	
	
con.close();

}catch(Exception e)
{
e.printStackTrace();
//System.out.println(e.getMessage());
}
}
}

//http://www.coderanch.com/t/525565/JDBC/databases/MySQL-Connector
