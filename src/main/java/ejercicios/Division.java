
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class Division {
    public static String evaluar(int dividendo, int divisor) {
        if (divisor == 0) {
            return "Error: División por cero no permitida.";
        }

        int cociente = dividendo / divisor;
        int residuo = dividendo % divisor;
        String respuesta;

        if (residuo == 0) {
            respuesta = "La división es exacta. \n" +
                        "Cociente: " + cociente + "\n" +
                        "Residuo: " + residuo;
        } else {
            respuesta = "La división no es exacta. \n" +
                        "Cociente: " + cociente + "\n" +
                        "Residuo: " + residuo;
        }

        return respuesta;
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Dividendo:");
        int dividendo = lector.nextInt();
        System.out.print("Divisor:");
        int divisor = lector.nextInt();

        String respuesta = evaluar(dividendo, divisor);
        System.out.println(respuesta);
    }
}
