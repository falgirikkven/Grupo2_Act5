package grupo2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Grupo-2
 */
public class cotizacionTest {

    // 
    // Esto deberia lanzar una excepcion pero no lo hace
    //
    @Test
    public void testCotizarCero() {
        System.out.println("testCotizarCero");
        double dolar = 0.;
        double peso = 1.;
        double expResult = Double.POSITIVE_INFINITY;
        double result = Conversor.calcularCotizacion(dolar, peso);
        assertEquals(expResult, result, 0);
    }

}
