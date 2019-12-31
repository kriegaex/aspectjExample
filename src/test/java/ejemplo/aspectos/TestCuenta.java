package ejemplo.aspectos;

import org.junit.Before;
import org.junit.Test;

import ejemplo.aspectos.Cuenta;

import static org.junit.Assert.*;

public class TestCuenta {
    private Cuenta cuenta;
 
    @Before
    public void before() {
        cuenta = new Cuenta();
    }
 
    @Test
    public void dado20yMinimo10_retira5_tieneExito() {
    	System.out.println("aaaa");
    	cuenta.retirar(5);
        assertTrue(cuenta.retirar(5));
    }
    
    @Test
    public void dado20yMinimo10_entoncesRetira15_tieneFallo() {
        assertFalse(cuenta.retirar(15));
    }
     
    @Test
    public void dado20yMinimo10_entoncesRetira100_tieneFallo() {
        assertFalse(cuenta.retirar(100));
    }
}