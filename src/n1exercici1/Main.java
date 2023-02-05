package n1exercici1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Introduce una opción (1-10)");
        System.out.println("10. Cerrar el programa");
        Scanner sc = new Scanner(System.in);
        int option;
        Undo undo = Undo.getInstance();
        do {
            System.out.println("Introduce una opción (1-10)");
            //System.out.println(Aquí habría que introducir el resto de opciones)
            System.out.println("10. Cerrar el programa");
            option = sc.nextInt();
            if ((option>0) && (option<10)) {
                undo.trackAction(option);
            } else if (option==10) {
                System.out.println("Cerrando el programa");
            } else {
                System.out.println("Introduce un valor válido. Un número del 1 al 10");
            }
        } while (option!=10);

        undo.listActions();
        undo.deleteAction();
        undo.listActions();









    }
}