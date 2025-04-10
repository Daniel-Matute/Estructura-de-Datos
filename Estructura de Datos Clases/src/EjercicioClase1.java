
import java.util.Scanner;

public class EjercicioClase1 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String cadena;
        System.out.print("Ingrese Nombre de la Universidad: ");
        cadena = tcl.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            System.out.print(cadena.charAt(i) + " ");
        }
        System.out.println("");

    
    }

}
