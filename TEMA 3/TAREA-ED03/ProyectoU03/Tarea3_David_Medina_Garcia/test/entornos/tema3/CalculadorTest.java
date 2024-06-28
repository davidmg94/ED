package entornos.tema3;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadorTest {
      
    /**
     * Test of cuentaCifras method, of class Calculador.
     */
    @Test
    public void testCuentaCifras() {
            
        System.out.println("Primer caso cuentaCifrasS.");
        int num = 5787;
        int expResult = 4;
        int result = Calculador.cuentaCifras(num);
        assertEquals(expResult, result);
        if (result!=expResult) {
                    fail("El test ha fallado");
        }
        
        System.out.println("Segundo caso cuentaCifras.");
        num = -875330;
        expResult = 6;
        result = Calculador.cuentaCifras(num);
        assertEquals(expResult, result);
        if (result!=expResult) {
                    fail("El test ha fallado");

        }
        
        System.out.println("Tercer caso cuentaCifras.");
        num = 0;
        expResult = 1;
        result = Calculador.cuentaCifras(num);
        assertEquals(expResult, result);
        if (result!=expResult) {
                    fail("El test ha fallado");

        }
        
        System.out.println("Cuarto caso cuentaCifras.");
        num = -132;
        expResult = 3;
        result = Calculador.cuentaCifras(num);
        assertEquals(expResult, result);
        if (result!=expResult) {
                    fail("El test ha fallado");

        }
    }

    /**
     * Test of potencia method, of class Calculador.
     */
    @Test
    public void testPotencia() {
        System.out.println("Primer caso potencia.");
        int base = 5;
        int expo = 0;
        int expResult = 1;
        int result = Calculador.potencia(base, expo);
        assertEquals(expResult, result);
        if (result!=expResult) {
                    fail("El test ha fallado.");
        }
        
        System.out.println("Segundo caso potencia.");
        base = 5;
        expo = -10;
        expResult = 1;
        result = Calculador.potencia(base, expo);
        assertEquals(expResult, result);
        if (result!=expResult) {
                    fail("El test ha fallado");
        }
        
        System.out.println("Tercer caso potencia.");
        base = 0;
        expo = 5;
        expResult = 0;
        result = Calculador.potencia(base, expo);
        assertEquals(expResult, result);
        if (result!=expResult) {
                    fail("El tercer test ha fallado");
        }
    }
    
}
