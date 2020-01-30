package clases;

public class Consulta extends OperacionesCajero {

    @Override
    public void transacciones() {
        System.out.println("---------------------------------");
        System.out.println("Su saldo actual es: " + getSaldo());
        System.out.println("---------------------------------");
    }
}
