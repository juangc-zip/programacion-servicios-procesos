package org.example.activad1_1;

/**
 * Si un hilo1 está ingresando,
 *
 */
public class CuentaBancaria {
    private class Deposito {
        protected double cantidad;
        protected String moneda = "Euro";
    }

    Deposito elDeposito;

    public CuentaBancaria(double initialDeposito, String moneda) {
        elDeposito = new Deposito();
        elDeposito.cantidad = initialDeposito;
        elDeposito.moneda = moneda;
    }

    public synchronized double saldo() {
        System.out.println("dentro del saldo ");

        return elDeposito.cantidad;
    }

    public synchronized void ingresa(double cantidad) throws InterruptedException {
        System.out.println("inicio de ingresa");

        Thread.sleep(2000);
        System.out.println("termina de dormir ingresa ");

        elDeposito.cantidad = elDeposito.cantidad + cantidad;
        System.out.println("fin de ingresa");
    }
    public static void main(String[]args) throws Exception {
        CuentaBancaria cuenta = new CuentaBancaria(100.0, "Euro");

        new Thread(() -> {
            try {
                cuenta.ingresa(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> cuenta.saldo()).start();

        System.out.println("saldo de cuenta: " + cuenta.saldo());
    }
}
