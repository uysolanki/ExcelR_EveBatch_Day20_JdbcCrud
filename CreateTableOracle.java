package day20.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableOracle {
public static void main(String[] args) throws Exception {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	//Class.forName("com.mysql.cj.jdbc.Driver"); latest version 8.0.3
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
	System.out.println(con.isClosed());
	Statement st=con.createStatement();
	
	String query="CREATE TABLE player(jerseyno number(5) primary key,playername varchar2(20),matchesplayed number(5),runscored number(5),notnout number(5))";
	st.executeUpdate(query);
	System.out.println("Table created");
	
	st.close();
	con.close();
	
}
}
