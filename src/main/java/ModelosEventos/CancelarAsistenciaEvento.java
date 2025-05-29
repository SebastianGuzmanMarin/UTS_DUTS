
package ModelosEventos;

import java.util.Scanner;


public class CancelarAsistenciaEvento {
    
    public static void cancelarAsistenciaEvento(){
        
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduce el nombre del evento que te quieres cancelar");
        String AsistenciaCancelada = lectura.nextLine();
        lectura.close();// para liberar recursos
        System.out.println("Has cancelado correctamtene la asistencia al evento " + AsistenciaCancelada);
     
    }
    
}
