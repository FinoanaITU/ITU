
package Connexion;



import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Connection;
import java.sql.DriverManager;

public class conecter
{
    public Connection conect()
	{
		Connection con = null;
		try
		{
			Class.forName("org.postgresql.Driver");
			System.out.println("azo driver");
			String url ="jdbc:postgresql://localhost:5432/conge";
			String user ="postgres";
			String pass ="fietmito";
			
			con = DriverManager.getConnection(url,user,pass);		
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("Connexion Lost");
		}
		return con;
		
	}
}