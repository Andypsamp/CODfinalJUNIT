/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajunit;

import mcd.Calculo;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author ANDY PEÑA SAMPEDRO
 */
@RunWith(Parameterized.class)
public class CalculoBateria {
    int num1;
    int num2;
    int result;
    private Calculo calculobj;
    
    /**
     * Clase de prueba
     */
    @Before
 public void init(){
     calculobj=new Calculo();
 }
    
    
}
