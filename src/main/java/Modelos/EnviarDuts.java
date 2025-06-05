
package Modelos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class EnviarDuts {
    
    public static void enviarDuts(String usuarioIngresado) {
        
        String destinatario = JOptionPane.showInputDialog(null, "¿A quién deseas enviar los DUTS?");
        if (destinatario == null || destinatario.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Destinatario inválido.");
            return;
        }

        String cantidadDUTS = JOptionPane.showInputDialog(null, "¿Cuántos DUTS deseas enviar?");
        if (cantidadDUTS == null || cantidadDUTS.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Cantidad inválida.");
            return;
        }

        try {
            int cantidadEnviar = Integer.parseInt(cantidadDUTS);
            List<String> nuevasLineas = new ArrayList<>();
            boolean emisorEncontrado = false;
            boolean receptorEncontrado = false;

            try (BufferedReader br = new BufferedReader(new FileReader("UsuariosDuts.txt"))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    String[] partes = linea.split(",");
                    if (partes.length == 2) {
                        String nombre = partes[0].trim();
                        int duts = Integer.parseInt(partes[1].trim());

                        if (nombre.equalsIgnoreCase(usuarioIngresado)) {
                            if (duts < cantidadEnviar) {
                                JOptionPane.showMessageDialog(null, "No tienes suficientes DUTS para enviar.");
                                return;
                            }
                            duts -= cantidadEnviar;  //duts = duts-cantidadEnviar
                            emisorEncontrado = true;
                        }

                        if (nombre.equalsIgnoreCase(destinatario)) {
                            duts += cantidadEnviar;
                            receptorEncontrado = true;
                        }

                        nuevasLineas.add(nombre + "," + duts);
                    }
                }
            }

            // Si el destinatario no existe
            if (!receptorEncontrado) {
                nuevasLineas.add(destinatario + "," + cantidadEnviar);
                JOptionPane.showMessageDialog(null, "El destinatario no existía, fue creado y se le enviaron los DUTS.");
            }

            if (!emisorEncontrado) {
                JOptionPane.showMessageDialog(null, "Tu usuario no fue encontrado en el archivo.");
                return;
            }

            try (PrintWriter pw = new PrintWriter("UsuariosDuts.txt")) {
                for (String linea : nuevasLineas) {
                    pw.println(linea);
                }
            }

            JOptionPane.showMessageDialog(null, "DUTS enviados con éxito.");
        

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "La cantidad debe ser un número válido.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder al archivo.");
            e.printStackTrace();
        }
    }
}