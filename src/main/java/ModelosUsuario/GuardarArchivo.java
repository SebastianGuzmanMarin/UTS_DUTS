
package ModelosUsuario;

import java.io.FileWriter;
import java.io.IOException;

//NO TOCAR ESTA BIEN
public class GuardarArchivo {
    
    public static void guardarArchivo(String Nombre, String Contraseña) {
        try {
            FileWriter guardaArchivo = new FileWriter(Nombre + ".txt");
            guardaArchivo.write("Nombre: " + Nombre + ", Contrasena: " + Contraseña + "\n");
            guardaArchivo.close();
            System.out.println("Usuario guardado exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar con el archivo: " + e.getMessage());
        }
    }
    
}
