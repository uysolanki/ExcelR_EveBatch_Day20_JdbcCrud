package day20.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteUsingPreparedStatement {
	public static void main(String[] args) throws Exception
	{
		Connection con=MySqlConnect.getConnection();
		//accept the jno, mp & rs and update  for that player
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Jersey Number");
		int jno=sc.nextInt();
		
		String query="delete from player where jerseyno=?";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setInt(1, jno);
		int n=ps.executeUpdate();
		System.out.println(n+ "Records Deleted");
		
}
}