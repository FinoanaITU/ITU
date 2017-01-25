/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FonctionUtiile;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;


/**
 *
 * @author mbola
 */
public class Utile
{
    public static String replaceErreur(String s, int pos, char c) 
    {
        return s.substring(0,pos) + c + s.substring(pos+1);
    }
    
    public static String dateCorrection(String date) 
    
    {
        String valiny = date;
        for(int i =0; i<valiny.length();i++) 
        {
            if(valiny.charAt(i)=='/' || valiny.charAt(i)=='.' || valiny.charAt(i)==' ') 
            {
                valiny = Utile.replaceErreur(valiny, i, '-');
            }
        }
        return valiny;
    }
    public static String mamadikaHeureTsotra(String heure) 
    {
        String valiny = heure;
        for(int i =0; i<valiny.length();i++) {
            if(valiny.charAt(i)=='h' || valiny.charAt(i)=='H' || valiny.charAt(i)=='m' || valiny.charAt(i)=='M' || valiny.charAt(i)=='s' || valiny.charAt(i)=='S')  
            {
                if(i<valiny.length()-1)
                {
                    valiny = Utile.replaceErreur(valiny, i, ':');
                }
                    
                else 
                {
                    valiny = valiny.substring(0,valiny.length()-1);
                }
                    
            }
        }
        if(valiny.length()<=5)
        {
             valiny = valiny+":00";
        }
           
        return valiny;
    }
    public static String manavakaHeur(String heure) 
    {
     /*   String valiny = heure;
        String [] temp = null;
        Time normal;
        Time transition = Time.valueOf("12:00:00");
        Time izy = null;
        for(int i =0; i<valiny.length();i++) {
            if(valiny.charAt(i)==' ') {
                temp = valiny.split(" ");
                valiny = GestionDateHeure.mamadikaHeureTsotra(temp[0]);
                if(valiny.length()<=5)
                valiny = valiny+":00";
                normal = Time.valueOf(valiny);
                if(temp[1].compareToIgnoreCase("PM")==0) 
                {
                    long a = normal.getTime()+transition.getTime()+10800000;
                    izy = new Time(a);
                }
                else if(temp[1].compareToIgnoreCase("AM")==0)
                    izy = normal;
            }
        }
        return izy.toString();
      */ 
        String am_pm = heure.substring(heure.length()-2, heure.length());
        if(am_pm.compareToIgnoreCase("am")!=0 && am_pm.compareToIgnoreCase("pm")!=0) {
            return Utile.mamadikaHeureTsotra(heure);
        }
        String valiny = heure;
        String [] temp = null;
        Time normal;
        Time transition = Time.valueOf("12:00:00");
        Time izy = null;
        for(int i =0; i<valiny.length();i++) {
            if(valiny.charAt(i)==' ') {
                temp = valiny.split(" ");
                valiny = Utile.mamadikaHeureTsotra(temp[0]);
                if(valiny.length()<=5)
                valiny = valiny+":00";
                normal = Time.valueOf(valiny);
                if(temp[1].compareToIgnoreCase("PM")==0) {
                    if(temp[0].charAt(0)=='1' && temp[0].charAt(1)=='2') {
                        izy = new Time(normal.getTime());
                    }
                    else {
                        long a = normal.getTime()+transition.getTime()+10800000;
                        izy = new Time(a);
                    }
                }
                else if(temp[1].compareToIgnoreCase("AM")==0) {
                    if(temp[0].charAt(0)=='1' && temp[0].charAt(1)=='2') {
                        long a = normal.getTime()-(transition.getTime()+10800000);
                        izy = new Time(a);
                    }
                    else {
                        izy = new Time(normal.getTime());
                    }
                }
                    
            }
        }
        return izy.toString();
        
    }
    public static double comparerTime(Time t1, Time t2) 
    {
        return ((t1.getTime())-(t2.getTime()))/3600000.0f;
    }
    public static double comparerTimeString(String t1, String t2) 
    {
        Time time1 = Time.valueOf(t1);
        Time time2 = Time.valueOf(t2);
        return ((time1.getTime())-(time2.getTime()))/3600000.0f;
    }
    public static double comparerDateString(String dts1, String dts2) throws Exception 
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        java.util.Date dt1 = null;
        java.util.Date dt2 = null; 
        dt1 = dateFormat.parse(dts1);
        dt2 = dateFormat.parse(dts2);
        return ((dt1.getTime())-(dt2.getTime()))/3600000.0f;
    }
    public static String getJourAndroany(String dt) throws Exception
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        java.util.Date dt1 = dateFormat.parse(dt);
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(dt1);
        if(calendar.get(calendar.DAY_OF_WEEK)==2)
        {
           return "lundi";  
        }
           
        else if(calendar.get(calendar.DAY_OF_WEEK)==3)
        {
            return "mardi";
        }
            
        else if(calendar.get(calendar.DAY_OF_WEEK)==4)
        {
            return "mercredi";
        }
            
        else if(calendar.get(calendar.DAY_OF_WEEK)==5)
        {
           return "jeudi"; 
        }
            
        else if(calendar.get(calendar.DAY_OF_WEEK)==6)
        {
             return "vendredi";
        }
           
        else if(calendar.get(calendar.DAY_OF_WEEK)==7)
        {
            return "samedi";
        }
            
        return "dimanche";
    }
 
   
}
