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
     * Clase de pruebas inicializada
     */
    @Before
 public void inicializada(){
     calculobj=new Calculo();
 }
 /**
  * Creamos un constructor con parametros
  * @param nume1 q es el primer dato q incertaremos
  * @param nume2 es el segundo dato q incertaremos
  * @param resulta es el resultado esperado
  */
    public CalculoBateria(int nume1,int nume2,int resulta){
        this.num1=nume1;
        this.num2=nume2;
        this.result=resulta;
    }
 
 
 
 
 
 
 
    
}
