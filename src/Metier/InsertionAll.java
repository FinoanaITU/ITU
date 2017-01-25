
package Metier;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Maping.*;
import Connexion.conecter;
public class InsertionAll 
{
    public static void insert_Conge( CongeAttente attente,conecter con ) throws SQLException
	{
               /* Date n = Date.valueOf(zaza.getNaissance());
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String daty = dateFormat.format(n);
                */
                
                Date date_depart = Date.valueOf(attente.getDate_Depart());
                Date date_arriver = Date.valueOf(attente.getDate_Arriver());
		try{
			Connection conect = con.conect();
			String requette ="INSERT INTO conge_attente VALUES(?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement prepare = conect.prepareStatement(requette);
			prepare.setInt(1,attente.getidAttente());
			prepare.setInt(2,attente.getidEmployer());
			prepare.setString(3,attente.getHeureDepart());
			prepare.setBoolean(4,attente.getVue());
			prepare.setBoolean(5,attente.getAccepter());
                        prepare.setBoolean(6,attente.getRejeter());
			prepare.setDate(7,date_depart);
                        prepare.setDate(8,date_arriver);
                        prepare.setString(9,attente.getRemarque());
			prepare.setString(10,attente.getHeureArriver());
			
			
			prepare.execute();
                        System.out.println("insertion ok");
			conect.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("insertion echouer");
			
		}
        }
    //INSERTION CONGE VALIDER
    public void insertion_Conge_Valider(CongerAccepter conge ,conecter con )
    {
            
                Date date_depart = Date.valueOf(conge.getDate_Depart());
                Date date_arriver = Date.valueOf(conge.getDate_Arriver());
		try{
			Connection conect = con.conect();
			String requette ="INSERT INTO conge_accepter VALUES(?,?,?,?,?,?,?,?)";
			PreparedStatement prepare = conect.prepareStatement(requette);
			prepare.setInt(1,conge.getidAttente());
			prepare.setString(2,conge.getHeureAccepter());
			prepare.setBoolean(3,conge.getRetoure());
			prepare.setString(4,conge.getHeureDepart());
			prepare.setString(5,conge.getHeureArriver());
                        prepare.setInt(6,conge.getidEmployer());
			prepare.setDate(7,date_depart);
                        prepare.setDate(8,date_arriver);
                        
			
			prepare.execute();
                        System.out.println("insertion valider ok");
			conect.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("insertion valider echouer");
			
		}
    }
   
}
