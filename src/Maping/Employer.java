/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maping;

import java.util.Date;

/**
 *
 * @author finoana
 */
public class Employer {
    private int idEmployer;
    private String nom;
    private String prenom;
    private String address;
    private String cin;
    private Date date_Embauche;
    
    public Employer(int id,String nom,String prenom,String address,String cin,Date dateEmbauche)
    {
        this.setidEmployer(id);
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setaddress(address);
        this.setCin(cin);
        this.setDate_Embauche(dateEmbauche);
    }
    public Employer()
    {
        
    }
    
        public void setidEmployer(int i)
	{
		idEmployer = i;
	}
	
	public int getidEmployer()
	{
		return idEmployer;
	}
        
         public void setNom(String i)
	{
                nom = i;
	}
	
	public String getNom()
	{
		return nom;
	}
        
          public void setPrenom(String i)
	{
                prenom = i;
	}
	
	public String getPrenom()
	{
		return prenom;
	}
        
            public void setaddress(String i)
	{
                address = i;
	}
	
	public String getaddress()
	{
		return address;
	}
        
              public void setCin(String i)
	{
                cin = i;
	}
	
	public String getCin()
	{
		return cin;
	}
        
               public void setDate_Embauche(Date i)
	{
                date_Embauche = i;
	}
	
	public Date getDate_Embauche()
	{
		return date_Embauche;
	}
}
