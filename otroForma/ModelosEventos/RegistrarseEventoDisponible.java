
package ModelosEventos;

import java.util.Scanner;


public class RegistrarseEventoDisponible {
    
    public  static void registrarseEventoDisponible(){
        
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduce el nombre del evento que te quieres registrar");
        String EventoRegistrado = lectura.nextLine();
        lectura.close();// para liberar recursos
        
        System.out.println("te has registrado a " + EventoRegistrado);
        
        
    }
    
}
