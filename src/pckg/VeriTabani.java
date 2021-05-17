package pckg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class VeriTabani 
{
	static String url="jdbc:postgresql://localhost:5432/AkilliCihaz";
	static Connection conn=null;
	
	static void Baglan()
	{
		try
		{
			conn=DriverManager.getConnection(url,"postgres","2886206");
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}
	
	

		public static boolean LoginCtrl(String username,String password) 
		{
			Baglan();
			boolean ctrl=false;
	
			String sorgu = "SELECT *  FROM \"User\" WHERE \"UserName\"='" + username + "' and \"UserPassword\"='" + password + "'";
			
			Statement st = null;
			try 
			{
				st = conn.createStatement();
			} 
			catch (SQLException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ResultSet rs = null;
			try 
			{
				rs = st.executeQuery(sorgu);
			} 
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			
				try {
					if (!rs.next()) 
					{ 
						System.out.println("Hatali giris");
						ctrl = false;
					} 
					else 
					{
						ctrl=true;
      
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			return ctrl;
		}
}

