import java.io.PrintStream;
import java.util.Scanner;

public class ejer29 extends base {
    static PrintStream screen = System.out;
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        screen.println("Ingresa el número de un mes (1-12): ");
        int numeroMes = keyboard.nextInt();
        keyboard.close();

        String nombreMes;
        int diasEnMes;

        switch (numeroMes) {
            case 1:
                nombreMes = "Enero";
                diasEnMes = 31;
                break;
            case 2:
                nombreMes = "Febrero";
                diasEnMes = 28; // O 29 en años bisiestos
                break;
            case 3:
                nombreMes = "Marzo";
                diasEnMes = 31;
                break;
            case 4:
                nombreMes = "Abril";
                diasEnMes = 30;
                break;
            case 5:
                nombreMes = "Mayo";
                diasEnMes = 31;
                break;
            case 6:
                nombreMes = "Junio";
                diasEnMes = 30;
                break;
            case 7:
                nombreMes = "Julio";
                diasEnMes = 31;
                break;
            case 8:
                nombreMes = "Agosto";
                diasEnMes = 31;
                break;
            case 9:
                nombreMes = "Septiembre";
                diasEnMes = 30;
                break;
            case 10:
                nombreMes = "Octubre";
                diasEnMes = 31;
                break;
            case 11:
                nombreMes = "Noviembre";
                diasEnMes = 30;
                break;
            case 12:
                nombreMes = "Diciembre";
                diasEnMes = 31;
                break;
            default:
                nombreMes = "Mes no válido";
                diasEnMes = -1;
        }

        if (diasEnMes != -1) {
            System.out.println("El mes " + numeroMes + " es " + nombreMes + " y tiene " + diasEnMes + " días.");
        } else {
            System.out.println("Número de mes no válido.");
        }
    }

}