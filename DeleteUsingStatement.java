package day20.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class DeleteUsingStatement {
public static void main(String[] args) throws Exception {
	Connection con=MySqlConnect.getConnection();
	String query="delete from player where jerseyno=101";
	Statement st=con.createStatement();
	int n=st.executeUpdate(query);
	System.out.println(n+ "Records Deleted");
	
	st.close();
	con.close();
}
}
