
package Pantallas;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JOptionPane;



public class PantallaEventosDisponibles extends javax.swing.JFrame {
    private String usuarioIngresado;
    private JButton[] botonesEvento;
    private Color colorOriginal;
    private JButton botonSeleccionado = null;

    public PantallaEventosDisponibles(String usuarioIngresado) {
        initComponents();
        botonesEvento = new JButton[]{Evento1, Evento2, Evento3, Evento4, Evento5, Evento6, Evento7};
        colorOriginal = Evento1.getBackground();
        this.usuarioIngresado = usuarioIngresado;
    }
    
    
    private void seleccionarBoton(JButton boton) {
    for (JButton b : botonesEvento) {
        if (b == boton) {
            b.setBackground(Color.GRAY); // Seleccionado
            botonSeleccionado = b;       // 🔸 Guardar selección
        } else {
            b.setBackground(new Color(60, 61, 55)); // Restaurar color
        }
    }
}

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        EtiquetaMenu = new javax.swing.JLabel();
        Evento1 = new javax.swing.JButton();
        Evento3 = new javax.swing.JButton();
        Evento4 = new javax.swing.JButton();
        Evento6 = new javax.swing.JButton();
        Evento2 = new javax.swing.JButton();
        Evento5 = new javax.swing.JButton();
        Evento7 = new javax.swing.JButton();
        botonVolver = new javax.swing.JButton();
        BotonRegistrarseEvento = new javax.swing.JButton();
        BotonCancelarAsistenciaEvento1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(900, 550));

        jPanel1.setBackground(new java.awt.Color(238, 238, 238));
        jPanel1.setForeground(new java.awt.Color(125, 10, 10));

        EtiquetaMenu.setBackground(new java.awt.Color(125, 10, 10));
        EtiquetaMenu.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        EtiquetaMenu.setForeground(new java.awt.Color(255, 255, 255));
        EtiquetaMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaMenu.setText("Eventos Disponibles");
        EtiquetaMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        EtiquetaMenu.setIconTextGap(20);
        EtiquetaMenu.setMaximumSize(new java.awt.Dimension(300, 300));
        EtiquetaMenu.setName(""); // NOI18N
        EtiquetaMenu.setOpaque(true);

        Evento1.setBackground(new java.awt.Color(60, 61, 55));
        Evento1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Evento1.setForeground(new java.awt.Color(255, 255, 255));
        Evento1.setText("Primera ceremonia de grado 2do semestre 2025 (17 SEP 2025)");
        Evento1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Evento1.setPreferredSize(new java.awt.Dimension(100, 100));
        Evento1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Evento1MouseClicked(evt);
            }
        });
        Evento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Evento1ActionPerformed(evt);
            }
        });

        Evento3.setBackground(new java.awt.Color(60, 61, 55));
        Evento3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Evento3.setForeground(new java.awt.Color(255, 255, 255));
        Evento3.setText("‘Respira vida’ Cápsulas BI, Estar Bien es Bienestar");
        Evento3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Evento3.setPreferredSize(new java.awt.Dimension(100, 100));
        Evento3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Evento3ActionPerformed(evt);
            }
        });

        Evento4.setBackground(new java.awt.Color(60, 61, 55));
        Evento4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Evento4.setForeground(new java.awt.Color(255, 255, 255));
        Evento4.setText("Taller ‘Comprender para Avanzar’");
        Evento4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Evento4.setPreferredSize(new java.awt.Dimension(100, 100));
        Evento4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Evento4ActionPerformed(evt);
            }
        });

        Evento6.setBackground(new java.awt.Color(60, 61, 55));
        Evento6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Evento6.setForeground(new java.awt.Color(255, 255, 255));
        Evento6.setText("Principios del Emprendedor: la confianza como base del éxito");
        Evento6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Evento6.setPreferredSize(new java.awt.Dimension(100, 100));
        Evento6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Evento6ActionPerformed(evt);
            }
        });

        Evento2.setBackground(new java.awt.Color(60, 61, 55));
        Evento2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Evento2.setForeground(new java.awt.Color(255, 255, 255));
        Evento2.setText("Segunda ceremonia de grado 2do semestre 2025 (10 Dic 2025)");
        Evento2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Evento2.setPreferredSize(new java.awt.Dimension(100, 100));
        Evento2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Evento2ActionPerformed(evt);
            }
        });

        Evento5.setBackground(new java.awt.Color(60, 61, 55));
        Evento5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Evento5.setForeground(new java.awt.Color(255, 255, 255));
        Evento5.setText("Taller de Salud Mental ‘Comprender para aliviar’");
        Evento5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Evento5.setPreferredSize(new java.awt.Dimension(100, 100));
        Evento5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Evento5ActionPerformed(evt);
            }
        });

        Evento7.setBackground(new java.awt.Color(60, 61, 55));
        Evento7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Evento7.setForeground(new java.awt.Color(255, 255, 255));
        Evento7.setText("Clausura de la 7.ª cohorte de la incubadora de negocios CafeUTS");
        Evento7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Evento7.setPreferredSize(new java.awt.Dimension(100, 100));
        Evento7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Evento7ActionPerformed(evt);
            }
        });

        botonVolver.setBackground(new java.awt.Color(65, 90, 119));
        botonVolver.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonVolver.setForeground(new java.awt.Color(255, 255, 255));
        botonVolver.setText("Volver");
        botonVolver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        BotonRegistrarseEvento.setBackground(new java.awt.Color(65, 90, 119));
        BotonRegistrarseEvento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BotonRegistrarseEvento.setForeground(new java.awt.Color(255, 255, 255));
        BotonRegistrarseEvento.setText("Registrarse a Evento");
        BotonRegistrarseEvento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonRegistrarseEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarseEventoActionPerformed(evt);
            }
        });

        BotonCancelarAsistenciaEvento1.setBackground(new java.awt.Color(65, 90, 119));
        BotonCancelarAsistenciaEvento1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BotonCancelarAsistenciaEvento1.setForeground(new java.awt.Color(255, 255, 255));
        BotonCancelarAsistenciaEvento1.setText("Cancelar Asistencia Evento");
        BotonCancelarAsistenciaEvento1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonCancelarAsistenciaEvento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarAsistenciaEvento1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EtiquetaMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 164, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Evento7, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Evento6, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Evento5, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Evento4, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Evento3, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Evento2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Evento1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(136, 136, 136))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonCancelarAsistenciaEvento1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(BotonRegistrarseEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(EtiquetaMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(Evento1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Evento2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Evento3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Evento4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Evento5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Evento6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Evento7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonRegistrarseEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonCancelarAsistenciaEvento1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Evento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Evento1ActionPerformed
       seleccionarBoton(Evento1);
    }//GEN-LAST:event_Evento1ActionPerformed

    private void Evento3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Evento3ActionPerformed
        seleccionarBoton(Evento3);
    }//GEN-LAST:event_Evento3ActionPerformed

    private void Evento4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Evento4ActionPerformed
        seleccionarBoton(Evento4);
    }//GEN-LAST:event_Evento4ActionPerformed

    private void Evento6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Evento6ActionPerformed
       seleccionarBoton(Evento6);
    }//GEN-LAST:event_Evento6ActionPerformed

    private void Evento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Evento2ActionPerformed
        seleccionarBoton(Evento2);
    }//GEN-LAST:event_Evento2ActionPerformed

    private void Evento5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Evento5ActionPerformed
        seleccionarBoton(Evento5);
    }//GEN-LAST:event_Evento5ActionPerformed

    private void Evento7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Evento7ActionPerformed
        seleccionarBoton(Evento7);
    }//GEN-LAST:event_Evento7ActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        PantallaMenuInicial pmi = new PantallaMenuInicial(usuarioIngresado);
        pmi.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonVolverActionPerformed

    private void BotonRegistrarseEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarseEventoActionPerformed
       if (botonSeleccionado != null) {
        String nombreEvento = botonSeleccionado.getText();

        // Validar si el usuario ya se registró a ese evento
        boolean yaRegistrado = false;
        File archivo = new File("registro_eventos.txt");

        if (archivo.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
                String linea;
                while ((linea = reader.readLine()) != null) {
                    if (linea.contains(usuarioIngresado) && linea.contains(nombreEvento)) {
                        yaRegistrado = true;
                        break;
                    }
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this,
                        "Error al leer el archivo de registros:\n" + e.getMessage(),
                        "Error de lectura",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        if (yaRegistrado) {
            JOptionPane.showMessageDialog(this,
                    "Ya te has registrado previamente a este evento.",
                    "Registro duplicado",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            // Sumamos DUTS por asistir al evento
            int aumentoDuts = 10000;  // cantidad que gana el usuario al asistir
            boolean pudoActualizar = Pantallas.Duts.actualizarDuts(usuarioIngresado, aumentoDuts);

            if (!pudoActualizar) {
                JOptionPane.showMessageDialog(this,
                        "Error al actualizar DUTS.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Registrar evento y guardar en archivo
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true))) {
                java.time.format.DateTimeFormatter dtf = java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                String fechaHora = dtf.format(java.time.LocalDateTime.now());

                String lineaRegistro = usuarioIngresado + " - " + nombreEvento + " - Registrado el: " + fechaHora;
                writer.write(lineaRegistro);
                writer.newLine();

                JOptionPane.showMessageDialog(this,
                        "Te has registrado al evento:\n" + nombreEvento + "\nHas ganado 10000 DUTS.",
                        "Registro exitoso",
                        JOptionPane.INFORMATION_MESSAGE);

            } catch (IOException e) {
                JOptionPane.showMessageDialog(this,
                        "Error al guardar el registro:\n" + e.getMessage(),
                        "Error de escritura",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    } else {
        JOptionPane.showMessageDialog(this,
                "Por favor selecciona un evento primero.",
                "Evento no seleccionado",
                JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_BotonRegistrarseEventoActionPerformed

    private void Evento1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Evento1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Evento1MouseClicked

    private void BotonCancelarAsistenciaEvento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarAsistenciaEvento1ActionPerformed
       if (botonSeleccionado != null) {
        String nombreEvento = botonSeleccionado.getText();
        File archivo = new File("registro_eventos.txt");

        if (!archivo.exists()) {
            JOptionPane.showMessageDialog(this,
                    "No hay registros para cancelar.",
                    "Archivo no encontrado",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader(archivo));
            String linea;
            StringBuilder contenidoActualizado = new StringBuilder();
            boolean registroEncontrado = false;

            while ((linea = reader.readLine()) != null) {
                if (linea.contains(usuarioIngresado) && linea.contains(nombreEvento)) {
                    registroEncontrado = true;
                    // No añadimos esta línea para eliminar el registro
                    continue;
                }
                contenidoActualizado.append(linea).append(System.lineSeparator());
            }
            reader.close();

            if (registroEncontrado) {
                // Sobrescribimos archivo sin la línea eliminada
                BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, false));
                writer.write(contenidoActualizado.toString());
                writer.close();

                // Restar 100 DUTS al cancelar asistencia
                int restaDuts = -10000;
                boolean pudoActualizar = Pantallas.Duts.actualizarDuts(usuarioIngresado, restaDuts);

                if (!pudoActualizar) {
                    JOptionPane.showMessageDialog(this,
                            "Error al actualizar DUTS tras cancelar asistencia.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

                JOptionPane.showMessageDialog(this,
                        "Has cancelado tu asistencia al evento:\n" + nombreEvento + "\nSe restaron 10000 DUTS.",
                        "Cancelación exitosa",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this,
                        "No se encontró registro de asistencia para cancelar.",
                        "Registro no encontrado",
                        JOptionPane.WARNING_MESSAGE);
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(this,
                    "Error al modificar el archivo:\n" + e.getMessage(),
                    "Error de archivo",
                    JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this,
                "Por favor selecciona un evento primero.",
                "Evento no seleccionado",
                JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_BotonCancelarAsistenciaEvento1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCancelarAsistenciaEvento1;
    private javax.swing.JButton BotonRegistrarseEvento;
    private javax.swing.JLabel EtiquetaMenu;
    private javax.swing.JButton Evento1;
    private javax.swing.JButton Evento2;
    private javax.swing.JButton Evento3;
    private javax.swing.JButton Evento4;
    private javax.swing.JButton Evento5;
    private javax.swing.JButton Evento6;
    private javax.swing.JButton Evento7;
    private javax.swing.JButton botonVolver;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
