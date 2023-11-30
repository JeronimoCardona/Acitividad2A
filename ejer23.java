public class ejer23 extends base {
    public static void main(String[] args) {
        int llanta = 0;
        int Cllanta = 120000, total = 0;
        screen.println("ingrese la cantidad de llantas compradas");
        llanta = keyboard.nextInt();
        if (llanta >= 4) {
            Cllanta = 108000;
            total = llanta * Cllanta;
            screen.println("el precio total es de: " + total);
        } else {
            total = llanta * Cllanta;
            screen.println("el precio total es de: " + total);
        }
    }
}