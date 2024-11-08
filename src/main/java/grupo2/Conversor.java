package grupo2;

/**
 *
 * @author Grupo-2
 */
public class Conversor {

    // pesos por dolar
    private static double factor = 1135.;

    private double saldo;

    public Conversor(double saldo) {
        this.saldo = saldo;
    }

    public static double convertirAPeso(double dolar) {
        System.out.println("Factor: " + factor + ", Dolar: " + dolar);
        return dolar * factor;
    }

    public static double convertirADolar(double peso) {
        return peso / factor;
    }

    public static double calcularCotizacion(double dolar, double peso) {
        factor = peso / dolar;
        return factor;
    }

    public void aumetarSaldo(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("Bad parameters. Must be higher than zero");
        }
        saldo += cantidad;
    }

    public boolean retirarSaldo(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("Bad parameters. Must be higher than zero");
        }
        if (saldo < cantidad) {
            return false;
        }
        saldo -= cantidad;
        return true;
    }

    public double getSaldo() {
        return saldo;
    }
}
