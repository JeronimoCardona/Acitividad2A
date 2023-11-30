import java.io.PrintStream;
import java.util.Scanner;

public class ejer20 extends base {
    static PrintStream screen = System.out;
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int num = 0;
        int res = 0;
        String mensaje = "";
        screen.println("ingrese un numero entero");
        num = keyboard.nextInt();
        res = (num % 2);
        if (res == 0) {
            mensaje = "el numero ingresado es par";
        } else {
            mensaje = "el numero ingresado es inpar";
        }
        screen.println(mensaje);
    }

}