
package Maping;

import java.util.Date;


public class CongerAccepter {
    private int idAccepter;
    private String heureAccepter;
    private String date_depart;
    private String date_arriver;
    private boolean retoure;
    private String heure_depart;
    private String heure_arriver;
    private int idEmployer; 
    
    public CongerAccepter(int idAc,String hAcc,boolean retoure,String heureDepart,String heureArriv,int idEmployer,String depart,String arriver)
    {
        this.setidAccepter(idAc);
        this.setHeureAccepter(hAcc);
        this.setRetoure(retoure);
        this.setHeureDepart(heureDepart);
        this.setHeureArriver(heureArriv);
        this.setidEmployer(idEmployer);
        this.setDate_Depart(depart);
        this.setDate_Arriver(arriver);
    }
           public void setDate_Depart(String i)
	{
		date_depart = i;
	}
         public String getDate_Depart()
	{
		return date_depart;
	}
        //
              public void setDate_Arriver(String i)
	{
		date_arriver = i;
	}
	
	public String getDate_Arriver()
	{
		return date_arriver;
	}
        //
           public void setidAccepter(int i)
	{
                idAccepter = i;
	}
	
	public int getidAttente()
	{
		return idAccepter;
	}
        //
    
        //
           public void setHeureAccepter(String i)
	{
		heureAccepter = i;
	}
	
	public String getHeureAccepter()
	{
		return heureAccepter;
	}
        //
            public void setRetoure(boolean i)
	{
		retoure = i;
	}
	
	public boolean getRetoure()
	{
		return retoure;
	}
        //
            public void setHeureArriver(String i)
	{
		heure_arriver = i;
	}
	
	public String getHeureArriver()
	{
		return heure_arriver;
	}
        //
             public void setHeureDepart(String i)
	{
		heure_depart = i;
	}
	
	public String getHeureDepart()
	{
		return heure_depart;
	}
        //
                public void setidEmployer(int i)
	{
                idEmployer = i;
	}
	
	public int getidEmployer()
	{
		return idEmployer;
	}
}
