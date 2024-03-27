package day20.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectUsingStatement {
public static void main(String[] args) throws Exception
{
	Connection con=MySqlConnect.getConnection();
	ResultSet rs;
	String query="select runscored,playername from player where runscored>5000";
	Statement st=con.createStatement(); 
	rs=st.executeQuery(query);
	while(rs.next())
	{
		if(rs.getInt("runscored")>10000)
		System.out.println(rs.getString("playername")+" "+rs.getInt("runscored"));
	}
	
	rs.close();
	con.close();

}
}
