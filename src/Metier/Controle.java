
package Metier;

import FonctionUtiile.*;
import Connexion.conecter;
import Maping.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Controle {
    
    Utile comparaison = new Utile();
    public boolean controlle_Date(String daty_depart,String daty_arriver)
    {
        Boolean valiny = true;
       
        return valiny;
    }
    
    //CONTROLE S'IL ES DEJA EN CONGE
        
        //MAKA EMPLOYER REHETRA
        public ArrayList<Employer> find_All_Employer(conecter con)
        {
             ArrayList<Employer> mpiasa = new ArrayList<>();
            try
		{                    
			Connection conect = con.conect();
                        ResultSet azo = null;
                        String requette ="select * from employer ";
			PreparedStatement prepare = conect.prepareStatement(requette);
			azo = prepare.executeQuery();
			
			
			while(azo.next())
			{
				mpiasa.add(new Employer(azo.getInt(1),azo.getString(2),azo.getString(3),azo.getString(4),azo.getString(5),azo.getDate(6)));
                                
			}
                        System.out.println("Poins le recherche");
                      
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("tsy tafa le recherhce");
		}
            return mpiasa;
        }
        //MAKA EMPLOYER DESIGNER
         public ArrayList<Employer> find_Employer_Designer(String cin,conecter con)
        {
             ArrayList<Employer> mpiasa = new ArrayList<>();
            try
		{                    
			Connection conect = con.conect();
                        ResultSet azo = null;
                        String requette ="select * from employer where cin ='"+cin+"'";
			PreparedStatement prepare = conect.prepareStatement(requette);
			azo = prepare.executeQuery();
			
			
			while(azo.next())
			{
				mpiasa.add(new Employer(azo.getInt(1),azo.getString(2),azo.getString(3),azo.getString(4),azo.getString(5),azo.getDate(6)));
                                
			}
                        System.out.println("Poins le recherche employer");
                      
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("tsy tafa le recherhce employer");
		}
            return mpiasa;
        }
        //MAKA ISA ATTENTE 
            public int find_Isa_attente(conecter con)
        {
            int valiny = 0;
            try
		{                    
			Connection conect = con.conect();
                        ResultSet azo = null;
                        String requette ="select count(idconge_attente) from conge_attente";
			PreparedStatement prepare = conect.prepareStatement(requette);
			azo = prepare.executeQuery();
                        azo.next();
                        valiny=azo.getInt(1);
                        System.out.println("nbr attente="+valiny);
                      
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("tsy azo nbr attente");
		}
            return valiny;
        }
        //MAKA CONGE EN ATTENTE
          public ArrayList<CongeAttente> find_Conge_Attente(conecter con)
        {
             ArrayList<CongeAttente> conge = new ArrayList<>();
            try
		{                    
			Connection conect = con.conect();
                        ResultSet azo = null;
                        String requette ="select * from conge_attente ";
			PreparedStatement prepare = conect.prepareStatement(requette);
			azo = prepare.executeQuery();
			
			
			while(azo.next())
			{
                            DateFormat fd = new SimpleDateFormat("yyyy/MM/dd");    
                            Date depart = azo.getDate(7);
                            Date arriver = azo.getDate(8);
                            String date_dep = fd.format(depart);
                            String date_ar = fd.format(arriver); 
                                                            
				conge.add(new CongeAttente(azo.getInt(1),azo.getInt(2),azo.getString(3),azo.getString(10),date_dep,date_ar,azo.getBoolean(4),azo.getBoolean(5),azo.getBoolean(6), azo.getString(9)));
                                
			}
                        System.out.println("azo ny Attente conge");
                      
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("tsy azo attente");
		}
            return conge;
        }
         
    //COMPARAISON ID EMPLOYER SY NY CONGE
          public boolean verification_Conge_Existant(ArrayList<Employer> mpiasa,ArrayList<CongeAttente> conge)
          {
              boolean valiny = true;
              
              return valiny;
          }
     //verification retoure conge
    public boolean verification_retoure_Conge(int idEmployer,conecter con)
    {
        boolean valiny = true;
          try
		{                    
			Connection conect = con.conect();
                        ResultSet azo = null;
                        String requette ="select count(idemployer) from conge_accepter where idemployer ="+idEmployer+"and retoure = false";
			PreparedStatement prepare = conect.prepareStatement(requette);
			azo = prepare.executeQuery();
                        azo.next();
                        if(azo.getInt(1)==0)
                        {
                            valiny = false;
                        }
                        else if(azo.getInt(1)!=0)
                        {
                            valiny = true;
                        }
                }
          catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("erreu de verification conge valider");
		}
          return valiny;
    }      
   //FONCTION AVOIRE  LISTE OBJECT EMPLOYER
    public Object[][] object_Employer(ArrayList<CongeAttente> conge)
    {
        Object[][] listEmployer = new Object[conge.size()][10];
        int i = 0;
        for(i=0;i<conge.size();i++)
        {
            listEmployer[i][0] = conge.get(i).getidAttente();
            listEmployer[i][1] = conge.get(i).getidEmployer();
            listEmployer[i][2] = conge.get(i).getHeureDepart();
            listEmployer[i][3] = conge.get(i).getVue();
            listEmployer[i][4] = conge.get(i).getAccepter();
            listEmployer[i][5] = conge.get(i).getRejeter();
            listEmployer[i][6] = conge.get(i).getDate_Depart();
            listEmployer[i][7] = conge.get(i).getDate_Arriver();
            listEmployer[i][8] = conge.get(i).getRemarque();
            listEmployer[i][9] = conge.get(i).getHeureArriver();
            
        }
        return listEmployer;
    }
}
