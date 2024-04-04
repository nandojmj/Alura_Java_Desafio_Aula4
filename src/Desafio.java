import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        String nombre = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion = 0;

        //Ingresando valores iniciales de la cuenta

        System.out.println("*****************************************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("Tipo de cuenta: " + tipoDeCuenta);
        System.out.println("Saldo disponible: $ " + saldo);
        System.out.println("\n*****************************************");

        //Menú de opciones de las operaciones

        String menu = """
                ** Escriba el número de la opción deseada **
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;
        Scanner teclado = new Scanner(System.in);

        //Realizando cálculos y mostrando saldos posteriores

        while (opcion != 9) {
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El saldo actualizado es: " + saldo + " $");
                    break;
                case 2:
                    System.out.println("Cuál es el valor que deseas retirar?");
                    double valorARetirar = teclado.nextDouble();
                    if (valorARetirar > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo = saldo - valorARetirar;
                        System.out.println("Saldo restante: " + saldo + " $");
                    }
                    break;
                case 3:
                    System.out.println("Cuál es el valor que vas a depositar?");
                    double valorADepositar = teclado.nextDouble();
                    saldo += valorADepositar;//saldo = saldo + valorADepositar;
                    System.out.println("El saldo actualizado es: " + saldo + " $");
                    break;
                case 9:
                    System.out.println("Finalizando el programa. Muchas gracias por usar nuestros servicios");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;

            }

        }
    }
}
