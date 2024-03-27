package day20.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectEcommerceDb {

	public static void main(String[] args)throws Exception
	{
		Connection con=MySqlConnect.getConnection();
		ResultSet rs;
		String query="SELECT pro_name, supp_price\r\n"
				+ "FROM Supplier\r\n"
				+ "JOIN Supplier_pricing\r\n"
				+ "USING ( supp_id )\r\n"
				+ "JOIN Product\r\n"
				+ "USING ( pro_id )\r\n"
				+ "WHERE supp_name LIKE 'Rajesh Retails'";
		
		Statement st=con.createStatement(); 
		rs=st.executeQuery(query);
		while(rs.next())
		{
			System.out.println(rs.getString("pro_name") + " "+ rs.getInt("supp_price"));	
		}
		
		rs.close();
		st.close();
		con.close();
	}

}
