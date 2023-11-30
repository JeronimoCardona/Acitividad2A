import java.io.PrintStream;
import java.util.Scanner;

public class ejer28 {
     static PrintStream screen = System.out;
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        screen.println("Ingresa el nombre del mes: ");
        String mes = keyboard.nextLine().toLowerCase();
        int festivos = 0;

        if (mes.equals("enero")) {
            festivos = 1;
        } else if (mes.equals("febrero")) {
            festivos = 0;
        } else if (mes.equals("marzo")) {
            festivos = 1;
        } else if (mes.equals("abril")) {
            festivos = 2;
        } else if (mes.equals("mayo")) {
            festivos = 2;
        } else if (mes.equals("junio")) {
            festivos = 2;
        } else if (mes.equals("julio")) {
            festivos = 2;
        } else if (mes.equals("agosto")) {
            festivos = 2;
        } else if (mes.equals("septiembre")) {
            festivos = 0;
        } else if (mes.equals("octubre")) {
            festivos = 1;
        } else if (mes.equals("noviembre")) {
            festivos = 2;
        } else if (mes.equals("diciembre")) {
            festivos = 2;
        }

        if (festivos == 0) {
            System.out.println(mes.substring(0, 1).toUpperCase() + mes.substring(1) + " no tiene festivos.");
        } else if (festivos == 1) {
            System.out.println(mes.substring(0, 1).toUpperCase() + mes.substring(1) + " tiene 1 festivo.");
        } else {
            System.out.println(mes.substring(0, 1).toUpperCase() + mes.substring(1) + " tiene " + festivos + " festivos.");
        }
    }
}