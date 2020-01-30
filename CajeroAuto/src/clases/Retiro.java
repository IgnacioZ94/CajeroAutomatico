package clases;

public class Retiro extends OperacionesCajero {

    @Override
    public void transacciones() {
        System.out.print("¿Cuanto desea retirar?: ");
        retiro();
        if (retiro <= getSaldo()) {
            transacciones = getSaldo();
            setSaldo(transacciones - retiro);
            System.out.println("---------------------------------");
            System.out.println("Retiraste: " + retiro);
            System.out.println("Tu saldo actual es: " + getSaldo());
            System.out.println("---------------------------------");
        } else {
            System.out.println("---------------------------------");
            System.out.println("Saldo insuficiente...");
            System.out.println("No puede retirar mas de: " + getSaldo());
            System.out.println("---------------------------------");
        }
    }
}
