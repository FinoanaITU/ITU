/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TEST;

import Maping.*;
import Metier.InsertionAll;
import Connexion.conecter;
import java.sql.SQLException;
import Metier.*;
import java.util.ArrayList;
public class Teste 
{
    public static void main(String[] arguments) throws SQLException
	{
		conecter con = new conecter();
                CongeAttente mpiasa1 = new CongeAttente(1, 1,"08:00","08:00","2017-01-01","2017-02-01", true, true, true,"nul");
                InsertionAll insert = new InsertionAll();
                insert.insert_Conge(mpiasa1, con);
                Controle ver = new Controle();
                ArrayList<Employer> azo = ver.find_Employer_Designer("1232652", con);
                System.out.println("id any le Employer="+azo.get(0).getidEmployer());
	}
}
