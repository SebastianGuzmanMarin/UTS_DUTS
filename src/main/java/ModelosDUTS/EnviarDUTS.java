
package ModelosDUTS;

import java.util.Scanner;


public class EnviarDUTS {
    
    public static void enviarDUTS(int DUTSaEnviar){
        Scanner lectura = new Scanner(System.in);
        
        
       try {
            System.out.println("Ingresa los DUTS que deseas enviar: ");
            DUTSaEnviar = lectura.nextInt(); // puede lanzar excepción
            System.out.println("Estás enviando " + DUTSaEnviar + " DUTS a:");

        } catch (Exception e) {
            System.out.println(" Error: Debes ingresar un numero entero. Intenta nuevamente.");
        }
    
       
       
       
       
       
    }
}
