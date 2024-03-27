package day20.jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.util.concurrent.ConcurrentHashMap;

public class UpdateUsingStatement {
public static void main(String[] args) throws Exception
{
	Connection con=MySqlConnect.getConnection();
	
	Statement st=con.createStatement();
	String query="update player set runscored=runscored+0.1*runscored where matchesplayed>100";
	int n=st.executeUpdate(query);
	System.out.println(n+ "Records Updated");
	st.close();
	con.close();
}
}
