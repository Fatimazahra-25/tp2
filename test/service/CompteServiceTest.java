/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Compte;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hp
 */
public class CompteServiceTest {
    
    public CompteServiceTest() {
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
     * Test of ouvrirCompte method, of class CompteService.
     */
    @Test
    public void testOuvrirCompte() {
        System.out.println("ouvrirCompte");
        String rib = "EE1";
        double soldeInitial = 100.0;
        CompteService instance = new CompteService();
        Compte expResult = null;
        Compte result = instance.ouvrirCompte(rib, soldeInitial);
        assertEquals(expResult, result);
    
    }

    /**
     * Test of fermerCompte method, of class CompteService.
     */
    @Test
    public void testFermerCompte() {
        System.out.println("fermerCompte");
        Compte compte = null;
        CompteService instance = new CompteService();
        int expResult = 0;
        int result = instance.fermerCompte(compte);
        assertEquals(expResult, result);
    }

    /**
     * Test of crediter method, of class CompteService.
     */
    @Test
    public void testCrediter() {
        System.out.println("crediter");
        Compte compte = new Compte("EE1", 120, true, 'D');
        double montantCredit = 2.0;
        CompteService instance = new CompteService();
        int expResult = 1;
        int result = instance.crediter(compte, montantCredit);
        assertEquals(expResult, result);
    }

    /**
     * Test of debiter method, of class CompteService.
     */
    @Test
    public void testDebiter() {
        System.out.println("debiter");
        Compte compte = new Compte("EE1", 120, true, 'D');
        double montantDebit = 100.0;
        CompteService instance = new CompteService();
        int expResult = -3;
        int result = instance.debiter(compte, montantDebit);
        assertEquals(expResult, result);
    }
    
}
