
package ModelosUsuario;

import java.io.File;
import java.util.Scanner;


public class Usuario {
    private String Nombre;
    private String Contraseña;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    

    Scanner lectura = new Scanner(System.in);

    public void verificarUsuario() {
        System.out.println("Ingresa Tu nombre de usuario");
        Nombre = lectura.next();
        System.out.println("Ingresa Tu nombre contrasena");
        Contraseña = lectura.next();
        System.out.println("MENSAJE DE PRUEBA: tu nombre ingresado es " + Nombre + " y tu contrasena es " + Contraseña);
        
        File archivo = new File(Nombre +".txt");

        if (archivo.exists()) {
            LeerArchivo.leerArchivo(Nombre);
            System.out.println("MENSAJE DE PRUEBA: El archivo" + Nombre +".txt ya existe.");
        } else {
            GuardarArchivo.guardarArchivo(Nombre, Contraseña);
            System.out.println("MENSAJE DE PRUEBA: El archivo " + Nombre + ".txt NO existia");
        }
    }
 
    

}
