/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Raúl
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
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
     * Test of setnumIz method, of class Calculadora.
     */
    @Test
    public void testSetnumIz() {
        System.out.println("setnumIz");
        int n = 0;
        Calculadora instance = new Calculadora();
        instance.setnumIz(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getnumIz method, of class Calculadora.
     */
    @Test
    public void testGetnumIz() {
        System.out.println("getnumIz");
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.getnumIz();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setnumDer method, of class Calculadora.
     */
    @Test
    public void testSetnumDer() {
        System.out.println("setnumDer");
        int n = 0;
        Calculadora instance = new Calculadora();
        instance.setnumDer(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumDer method, of class Calculadora.
     */
    @Test
    public void testGetNumDer() {
        System.out.println("getNumDer");
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.getNumDer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcular method, of class Calculadora.
     */
    @Test
    public void testCalcular() {
        System.out.println("calcular");
        Calculadora instancia = new Calculadora();
        instancia.setnumDer(3);
        instancia.setnumIz(3);
        instancia.setOp('-');
        assertEquals("Ha fallado",instancia.calcular(),6);
        
    }
    
}
