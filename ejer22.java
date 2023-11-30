public class ejer22 extends base {

    public static void main(String[] args) {
        int num = 0;
        int res = 0;
        String mensaje = "";
        screen.println("ingrese un numero1");
        num = keyboard.nextInt();
        res = num % 2;// residuo division
        if (res == 0) {
            mensaje = "el numero ingresado es par";
        } else {
            mensaje = "el numero ingresado es inpar";
        }
        screen.println(mensaje);

        if (num < 0) {// saber si es negativo
            mensaje = "el numero es negativo";
        } else if (num == 0) {// saber si es igual a cero
            mensaje = "el numero es cero";
        } else {
            mensaje = "el numero es positivo";
        }
        screen.println(mensaje);
    }
}