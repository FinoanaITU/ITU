
package Maping;

public class CongeAttente {
    private int idAttente;
    private int idEmployer;
    private String heureDepart;
    private String heureArriver;
    private String date_depart;
    private String date_arriver;
    private boolean vue;
    private boolean accepter;
    private boolean rejeter;
    private String remarque;
    
    public CongeAttente(int idAttente,int idEmployer,String heureD,String heureAr,String date_depart,String date_arriver,boolean vue,boolean accepter,boolean rejeter,String remq)
    {
        this.setidAttente(idAttente);
        this.setidEmployer(idEmployer);
        this.setHeureDepart(heureD);
        this.setHeureAriver(heureAr);
        this.setDate_Arriver(date_arriver);
        this.setDate_Depart(date_depart);
        this.setAccepter(accepter);
        this.setVue(vue);
        this.setRejeter(rejeter);
        this.setRemarque(remq);
    }
       public void setidEmployer(int i)
	{
		idEmployer = i;
	}
	
	public int getidEmployer()
	{
		return idEmployer;
	}
        //
           public void setidAttente(int i)
	{
		idAttente = i;
	}
	
	public int getidAttente()
	{
		return idAttente;
	}
        //
              public void setHeureDepart(String i)
	{
                heureDepart = i;
	}
	
	public String getHeureDepart()
	{
		return heureDepart;
	}
        //
              public void setHeureAriver(String i)
	{
                heureArriver = i;
	}
	
	public String getHeureArriver()
	{
		return heureArriver;
	}
        //
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
              public void setVue(boolean i)
	{
		vue = i;
	}
	
	public boolean getVue()
	{
		return vue;
	}
        //
              public void setAccepter(boolean i)
	{
		accepter = i;
	}
	
	public boolean getAccepter()
	{
		return accepter;
	}
        //
              public void setRejeter(boolean i)
	{
		rejeter = i;
	}
	
	public boolean getRejeter()
	{
		return rejeter;
	}
        //
                public void setRemarque(String i)
	{
		remarque = i;
	}
	
	public String getRemarque()
	{
		return remarque;
	}
        //
        
        
        
        
}
