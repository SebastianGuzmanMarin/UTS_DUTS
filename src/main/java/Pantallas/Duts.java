
package Pantallas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;


public class Duts {

    public static int InformacionDuts(String usuarioIngresado) {
        int cantidadDuts = 0;
        File archivo = new File("UsuariosDuts.txt");

        // Si el archivo no existe, crea uno y asigna el valor de 10000 al usuario.
        if (!archivo.exists()) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
                bw.write(usuarioIngresado + ",10000");
                bw.newLine();
                bw.close();
                cantidadDuts = 10000;
                System.out.println("Archivo creado y usuario registrado con 10000 DUTS.");
                return cantidadDuts;
            } catch (IOException e) {
                System.out.println("Error al crear el archivo: " + e.getMessage());
                return 0;
            }
        }

        boolean encontrado = false;

        // Si el archivo y el usuario ya existen, se devuelve la cantidad leida.
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 2 && partes[0].equals(usuarioIngresado)) {
                    cantidadDuts = Integer.parseInt(partes[1]);
                    encontrado = true;
                    System.out.println("Usuario existente y leido");
                    break;
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error al leer: " + e.getMessage());
        }

        // Si ya existe el archivo  pero el usuario no está, se agrega en la linea sigueinte con un valor por defecto de 10000
        if (!encontrado) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))) { // true significa agregar al final y no sobreescribir
                bw.write(usuarioIngresado + ",10000");
                bw.newLine();
                bw.close();
                cantidadDuts = 10000;
                System.out.println("Usuario agregado al archivo con 10000 DUTS.");
            } catch (IOException e) {
                System.out.println("Error al agregar usuario: " + e.getMessage());
            }
        }

        return cantidadDuts;
    }
    
    
    public static boolean actualizarDuts(String usuarioIngresado, int cambio) {
        File archivo = new File("UsuariosDuts.txt");
        if (!archivo.exists()) {
            System.out.println("Archivo de DUTS no existe.");
            return false;
        }

        boolean actualizado = false;
        Map<String, Integer> usuariosDuts = new LinkedHashMap<>();

        // Leer todo el archivo y guardar en mapa
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 2) {
                    String usuario = partes[0];
                    int duts = Integer.parseInt(partes[1]);
                    usuariosDuts.put(usuario, duts);
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error al leer DUTS para actualizar: " + e.getMessage());
            return false;
        }

        // Actualizar el saldo del usuario
        if (usuariosDuts.containsKey(usuarioIngresado)) {
            int saldoActual = usuariosDuts.get(usuarioIngresado);
            int nuevoSaldo = saldoActual + cambio;
            if (nuevoSaldo < 0) {
                System.out.println("Saldo insuficiente para actualizar DUTS.");
                return false; // No se permite saldo negativo
            }
            usuariosDuts.put(usuarioIngresado, nuevoSaldo);
            actualizado = true;
        } else {
            // Si el usuario no existe, agregar con saldo inicial + cambio si es positivo
            if (cambio >= 0) {
                usuariosDuts.put(usuarioIngresado, 10000 + cambio);
                actualizado = true;
            } else {
                System.out.println("Usuario no encontrado y cambio negativo.");
                return false;
            }
        }

        // Escribir el archivo con los nuevos valores
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, false))) {
            for (Map.Entry<String, Integer> entry : usuariosDuts.entrySet()) {
                bw.write(entry.getKey() + "," + entry.getValue());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al escribir archivo DUTS actualizado: " + e.getMessage());
            return false;
        }

        return actualizado;
    }
}
