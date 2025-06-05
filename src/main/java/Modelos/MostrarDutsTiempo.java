package Modelos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MostrarDutsTiempo {

    public static int[] mostrarDutsTiempo(String usuarioIngresado) {
        try (BufferedReader br = new BufferedReader(new FileReader("UsuariosDuts.txt"))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 2) {
                    String nombre = partes[0].trim();
                    String dutStr = partes[1].trim();

                    if (nombre.equalsIgnoreCase(usuarioIngresado)) {
                        int dutTotal = Integer.parseInt(dutStr);
                        int años = dutTotal / 365;
                        int semestres = dutTotal / 182;
                        int meses = dutTotal / 30;
                        int semanas = dutTotal / 7;

                        return new int[]{años, semestres, meses, semanas};  //devuelve un nuevo arreglo de entero con las posiciones [0,1,2,3]
                    }
                }
            }

            System.out.println("Usuario no encontrado en el archivo.");
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        return null;
    }
}
