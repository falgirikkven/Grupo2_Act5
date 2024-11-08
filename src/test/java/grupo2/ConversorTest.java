package grupo2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeAll;

/**
 *
 * @author Grupo-2
 */
public class ConversorTest {

    public ConversorTest() {
    }

    @BeforeAll
    public static void init() {
    }

    @Before
    public void antes() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @After
    public void despues() {
        System.out.println("Prueba finalizada, campos en 0");
    }

    @AfterClass
    public static void despuesClase() {
        System.out.println("La operación ha finalizado");
    }

    @Test
    public void testConvertirAPeso() {
        System.out.println("convertirAPeso");
        double dolar = 1620.;
        double expResult = 1838700.;
        double result = Conversor.convertirAPeso(dolar);
        System.out.println(result);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testConvertirADolar() {
        System.out.println("convertirADolar");
        double peso = 2270.;
        double expResult = 2.0;
        double result = Conversor.convertirADolar(peso);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testCalcularCotizacion() throws Exception {
        System.out.println("calcularCotizacion");
        double dolar = 1620.;
        double peso = 1838700.;
        double expResult = 1135.;
        double result = Conversor.calcularCotizacion(dolar, peso);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testAumetarSaldo() throws Exception {
        System.out.println("aumetarSaldo");
        double cantidad = 100;
        Conversor instance = new Conversor(100);
        double expResult = 200;
        instance.aumetarSaldo(cantidad);
        double result = instance.getSaldo();
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testRetirarSaldo() throws Exception {
        System.out.println("retirarSaldo");
        double cantidad = 100;
        Conversor instance = new Conversor(100);
        boolean expResult = true;
        boolean result = instance.retirarSaldo(cantidad);
        assertEquals(expResult, result);
        assertEquals(0, instance.getSaldo(), 0);
    }

}
