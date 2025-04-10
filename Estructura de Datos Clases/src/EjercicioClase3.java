
import java.util.Scanner;

public class EjercicioClase3 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String cadena = "Anita lava la tina";
        cadena = cadena.replace(" ", "").toLowerCase();
        String reversa = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            reversa += cadena.charAt(i);
        }
        if (cadena.equals(reversa)) {
            System.out.println(cadena + " es palindrome");
        } else {
            System.out.println(cadena + " no es palindrome");
        }
    }
}
