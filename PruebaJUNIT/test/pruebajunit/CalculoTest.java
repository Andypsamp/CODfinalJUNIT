/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajunit;

import mcd.Calculo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ANDY PEÑA SAMPEDRO
 */
public class CalculoTest {
    
    public CalculoTest() {
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
     * Test of getMensajeResultado method, of class Calculo.
     */
    @Test
    public void testGetMensajeResultado() {
        Calculo instance = new Calculo();
        instance.setNumero1(-15);
        System.out.println("Test mensaje nume1 negativo:" + instance.getMensajeResultado());
        instance.setNumero2(-5);
        System.out.println("Test mensaje nume2 negativo:" + instance.getMensajeResultado());
        int result = instance.obtenerMCD(40, 10);
        assertEquals(10, result, 0);
        System.out.println("Test mensaje operacion correcta:" + instance.getMensajeResultado());
        result = instance.obtenerMCD(0, 0);
        assertEquals(0, result, 0);
        System.out.println("Test mensaje operacion invalida:" + instance.getMensajeResultado());

    }

    /**
     * Test of obtenerMCD method, of class Calculo.
     */
    @Test
    public void testObtenerMCD() {
        System.out.println("obtenerMCD");
        int num1 =40;//num 1
        int num2 =10;//num 2
        Calculo instance = new Calculo();
        int expResult = 10;//resul
        int result = instance.obtenerMCD(num1, num2);
        assertEquals(expResult, result);
        System.out.println("Resultado="+expResult);//visualizacion
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
}
