
package ModelosUsuario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


//NO TOCAR ESTA BIEN
public class LeerArchivo {
   
    public static void leerArchivo(String Nombre) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(Nombre + ".txt"));

            String linea;
            System.out.println("Contenido del archivo leido:");

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
    
    
}
