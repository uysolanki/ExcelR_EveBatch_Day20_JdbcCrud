package day20.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertUsingStatement {
	public static void main(String[] args)throws Exception {
		
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/execommdb","root","");
	
	Statement st=con.createStatement();
	
	st.addBatch("insert into player values(1,'Rahul',80,800,10)");  
	st.addBatch("insert into player values(77,'Shubman',50,500,5)"); 
	st.addBatch("insert into player values(97,'Sarfaraz',5,200,2)"); 
	
	int numberOfRowsImpacted[]=st.executeBatch();
	System.out.println(numberOfRowsImpacted.length + " Rows Inserted");
	
	st.close();
	con.close();
	
	}	
}
