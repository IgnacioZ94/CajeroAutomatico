package clases;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sueldo = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Indique cual es su suedo para depositarlo en su cuenta: ");
        sueldo = scan.nextInt();
        OperacionesCajero object = new Consulta();
        object.setSaldo(sueldo);
        object.operaciones();

    }
}
