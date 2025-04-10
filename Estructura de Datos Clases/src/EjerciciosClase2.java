
import java.util.Scanner;

public class EjerciciosClase2 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String cadena= "Universidad Tecnica";
        char letra;
        int cont=0;
        System.out.println("Ingrese una letra de la cadena:");
        letra = tcl.next().charAt(0);

        for (int i = 0; i < cadena.length(); i++) {
             if (cadena.charAt(i) == letra) {
                cont++; 
            }
        }
        System.out.println("El caracter '" + letra + "' se repite " + cont + " veces.");

    }
}
