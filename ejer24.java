public class ejer24 extends base {

    public static void main(String[] args) {
        int A1 = 0;
        int A2 = 0;
        int A3 = 0;
        screen.println("ingrese la altura de la primera persona: ");
        A1 = keyboard.nextInt();
        screen.println("ingrese la altura de la segunda persona: ");
        A2 = keyboard.nextInt();
        screen.println("ingrese la altura de la tercera persona: ");
        A3 = keyboard.nextInt();

        if (A1 > A2) {
            if (A2 > A3) {
                if (A1 > A3) {
                    screen.println("el orden de altura es: " + A1 + "," + A2 + "," + A3);
                } else {
                    screen.println("el orden de altura es: " + A1 + "," + A3 + "," + A2);
                }
            } else {
                screen.println("el orden de altura es: " + A3 + "," + A1 + "," + A2);
            }
        } else if (A2 > A3) {
            if (A3 > A1)
                screen.println("el orden de la altura es: " + A2 + "," + A3 + "," + A1);
            else {
                screen.println("el orden de la altura es: " + A2 + "," + A1 + "," + A3);
            }
        } else {
            screen.println("el orden de la altura es: " + A3 + "," + A2 + "," + A1);
        }
    }
}