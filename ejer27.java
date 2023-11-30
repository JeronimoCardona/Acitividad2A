public class ejer27 extends base {
    public static void main(String[] args) {
        int dia;
        int mes;
        screen.println("ingrese el dia en el que nacio");
        dia = keyboard.nextInt();
        screen.println("ingrese el mes en el que nacio");
        mes = keyboard.nextInt();
        switch (mes) {
            case 1:
                if (dia >= 21)
                    System.out.println("su signo es acuario");
                else
                    System.out.println("su signo es capricornio");
                break;
            case 2:
                if (dia >= 20)
                    System.out.println("su signo es piscis");
                else
                    System.out.println("su signo es acuario");
                break;
            case 3:
                if (dia >= 21)
                    System.out.println("su signo es aries");
                else
                    System.out.println("su signo es piscis");
                break;
            case 4:
                if (dia >= 20)
                    System.out.println("su signo es tauro");
                else
                    System.out.println("su signo es aries");
                break;
            case 5:
                if (dia >= 21)
                    System.out.println("su signo es geminis");
                else
                    System.out.println("su signo es tauro");
                break;
            case 6:
                if (dia >= 21)
                    System.out.println("su signo es cancer");
                else
                    System.out.println("su signo es geminis");
                break;
            case 7:
                if (dia >= 23)
                    System.out.println("su signo es leo");
                else
                    System.out.println("su signo es cancer");
                break;
            case 8:
                if (dia >= 23)
                    System.out.println("su signo es virgo");
                else
                    System.out.println("su signo es leo");
                break;
            case 9:
                if (dia >= 23)
                    System.out.println("su signo es libra");
                else
                    System.out.println("su signo es virgo");
                break;
            case 10:
                if (dia >= 23)
                    System.out.println("su signo es escorpio");
                else
                    System.out.println("su signo es libra");
                break;
            case 11:
                if (dia >= 22)
                    System.out.println("su signo es sagitario");
                else
                    System.out.println("su signo es escorpio");
                break;
            case 12:
                if (dia >= 22)
                    System.out.println("su signo es capricornio");
                else
                    System.out.println("su signo es sagitario");
                break;
        }
    }
}