
package clases;

import java.util.Scanner;

public abstract class OperacionesCajero {
    protected int transacciones;
    protected int retiro;
    protected int deposito;
    private static int saldo;

    Scanner scan = new Scanner(System.in);

    public void operaciones() {
        int opcion = 0;
        int varLogica = 0;
        do {
            do {
                System.out.println("Por favor seleccione una opcion.");
                System.out.println("   1. Consultar saldo");
                System.out.println("   2. Retiro de efectivo");
                System.out.println("   3. Depositar efectivo");
                System.out.println("   4. Salir");
                opcion = scan.nextInt();

                if (opcion >= 1 && opcion <= 4) {
                    varLogica = 1;
                } else {
                    System.out.println("--------------------------------------------");
                    System.out.println("La opcion no es valida, vuelva a intentarlo.");
                    System.out.println("--------------------------------------------");
                }

            } while (varLogica == 0);
            if (opcion == 1) {
                OperacionesCajero object = new Consulta();
                object.transacciones();

            } else if (opcion == 2) {
                OperacionesCajero object = new Retiro();
                object.transacciones();
            } else if (opcion == 3) {
                OperacionesCajero object = new Deposito();
                object.transacciones();
            } else if (opcion == 4) {
                System.out.println("---------------------------------");
                System.out.println("Gracias vuelva pronto!");
                System.out.println("---------------------------------");
                varLogica = 2;
            }
        } while (varLogica != 2);
    }

    //Metodo para solicitar la cantidad de retiro de fectivo
    public void retiro() {
        retiro = scan.nextInt();

    }

    //Metodo para solicitar deposito de efectivo
    public void deposito() {
        deposito = scan.nextInt();
    }

    public abstract void transacciones();

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }
}
