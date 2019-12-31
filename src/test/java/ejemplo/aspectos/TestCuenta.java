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
        assertTrue(cuenta.retirar(5));
    }
    
    @Test
    public void dado20yMinimo10_entoncesRetira25_tieneFallo() {
        assertFalse(cuenta.retirar(25));
    }
     
}
