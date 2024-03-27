package day20.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertUsingStatementOracle {
public static void main(String[] args) throws Exception{

	Class.forName("oracle.jdbc.driver.OracleDriver");
	//Class.forName("com.mysql.cj.jdbc.Driver"); latest version 8.0.3
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
	
	Statement st=con.createStatement();
	
	String query="insert into player values(1,'Rahul',80,800,10)";  
	
	int numberOfRowsImpacted=st.executeUpdate(query);
	System.out.println(numberOfRowsImpacted + " Rows Inserted");
	
	st.close();
	con.close();
}
}
