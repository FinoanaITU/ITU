/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import Connexion.conecter;
import Maping.CongeAttente;
import Maping.CongerAccepter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author finoana
 */
public class InsertionAllTest {
    
    public InsertionAllTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of insert_Conge method, of class InsertionAll.
     */
    @Test
    public void testInsert_Conge() throws Exception {
        System.out.println("insert_Conge");
        CongeAttente attente = null;
        conecter con = null;
        InsertionAll.insert_Conge(attente, con);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertion_Conge_Valider method, of class InsertionAll.
     */
    @Test
    public void testInsertion_Conge_Valider() {
        System.out.println("insertion_Conge_Valider");
        CongerAccepter conge = null;
        conecter con = null;
        InsertionAll instance = new InsertionAll();
        instance.insertion_Conge_Valider(conge, con);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
