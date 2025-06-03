
package Pantallas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ValidacionUsuarioExiste {
    public static boolean validacionUsuarioExiste(String usuarioBuscado) {
    try (BufferedReader br = new BufferedReader(new FileReader("usuariosRegistrados.txt"))) {
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] partes = linea.split(","); // separa por coma
            if (partes.length > 0) {
                String usuario = partes[0].trim(); // usuario guardado   //trim() = elimina espacios al final y al inicio, para evitar que los lea
                if (usuario.equalsIgnoreCase(usuarioBuscado.trim())) {
                    return true; // usuario ya existe
                }
            }
        }
    } catch (IOException e) {
         System.err.println("Error al leer el archivo " + e.getMessage());
    }
    return false; // usuario no encontrado
}
    
}
