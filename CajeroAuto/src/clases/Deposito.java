package clases;

public class Deposito extends OperacionesCajero {

    @Override
    public void transacciones() {
        System.out.print("¿Cuanto desa depostiar?: ");
        deposito();
        transacciones = getSaldo();
        setSaldo(transacciones + deposito);
        System.out.println("---------------------------------");
        System.out.println("Depositaste: " + deposito);
        System.out.println("Su saldo actual es: " + getSaldo());
        System.out.println("---------------------------------");
    }
}
