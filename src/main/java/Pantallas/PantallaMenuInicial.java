
package Pantallas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;


public class PantallaMenuInicial extends javax.swing.JFrame {

    private String usuarioIngresado;

    public PantallaMenuInicial(String usuarioIngresado) {  //constructor recibe usuario de pantalla de ingreso como parametro
        initComponents();
        this.usuarioIngresado = usuarioIngresado;
        EtiquetaMenu.setText("Bienvenido " + usuarioIngresado + " a la plataforma financiera UTS");
        actualizarDuts();
        
        }
    
        public void actualizarDuts(){
        int duts = Duts.InformacionDuts(usuarioIngresado); 
        ContadorDUTSactuales.setText(String.valueOf(duts));
        }
        
 
        

    PantallaMenuInicial() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoPantalla = new javax.swing.JPanel();
        EtiquetaMenu = new javax.swing.JLabel();
        EtiquetaDutsActuales = new javax.swing.JLabel();
        BotonMiPerfil = new javax.swing.JButton();
        ContadorDUTSactuales = new javax.swing.JLabel();
        BotonEnviarDUTS = new javax.swing.JButton();
        BotonVerEventosDIsponibles = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        FondoTitulo = new javax.swing.JPanel();
        EtiquetaGuia1 = new javax.swing.JLabel();
        IconoMoneda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 700));

        FondoPantalla.setBackground(new java.awt.Color(224, 225, 221));
        FondoPantalla.setLayout(null);

        EtiquetaMenu.setBackground(new java.awt.Color(60, 61, 55));
        EtiquetaMenu.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        EtiquetaMenu.setForeground(new java.awt.Color(255, 255, 255));
        EtiquetaMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaMenu.setLabelFor(FondoPantalla);
        EtiquetaMenu.setText("Bienvenido _______ a la plataforma financiera UTS");
        EtiquetaMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        EtiquetaMenu.setIconTextGap(20);
        EtiquetaMenu.setMaximumSize(new java.awt.Dimension(300, 300));
        EtiquetaMenu.setName(""); // NOI18N
        FondoPantalla.add(EtiquetaMenu);
        EtiquetaMenu.setBounds(0, 0, 1000, 120);

        EtiquetaDutsActuales.setBackground(new java.awt.Color(24, 28, 20));
        EtiquetaDutsActuales.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EtiquetaDutsActuales.setForeground(new java.awt.Color(255, 255, 255));
        EtiquetaDutsActuales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaDutsActuales.setText("DUTS actuales");
        EtiquetaDutsActuales.setAlignmentY(0.0F);
        EtiquetaDutsActuales.setOpaque(true);
        FondoPantalla.add(EtiquetaDutsActuales);
        EtiquetaDutsActuales.setBounds(190, 470, 120, 30);

        BotonMiPerfil.setBackground(new java.awt.Color(60, 61, 55));
        BotonMiPerfil.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BotonMiPerfil.setForeground(new java.awt.Color(255, 255, 255));
        BotonMiPerfil.setText("Mi Perfil");
        BotonMiPerfil.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonMiPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMiPerfilActionPerformed(evt);
            }
        });
        FondoPantalla.add(BotonMiPerfil);
        BotonMiPerfil.setBounds(140, 560, 210, 40);

        ContadorDUTSactuales.setBackground(new java.awt.Color(243, 243, 224));
        ContadorDUTSactuales.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ContadorDUTSactuales.setForeground(new java.awt.Color(0, 0, 0));
        ContadorDUTSactuales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ContadorDUTSactuales.setText("00");
        ContadorDUTSactuales.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        ContadorDUTSactuales.setOpaque(true);
        FondoPantalla.add(ContadorDUTSactuales);
        ContadorDUTSactuales.setBounds(190, 510, 120, 30);

        BotonEnviarDUTS.setBackground(new java.awt.Color(60, 61, 55));
        BotonEnviarDUTS.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BotonEnviarDUTS.setForeground(new java.awt.Color(255, 255, 255));
        BotonEnviarDUTS.setText("Enviar DUTS");
        BotonEnviarDUTS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonEnviarDUTS.setPreferredSize(new java.awt.Dimension(100, 100));
        BotonEnviarDUTS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEnviarDUTSActionPerformed(evt);
            }
        });
        FondoPantalla.add(BotonEnviarDUTS);
        BotonEnviarDUTS.setBounds(550, 250, 400, 40);

        BotonVerEventosDIsponibles.setBackground(new java.awt.Color(60, 61, 55));
        BotonVerEventosDIsponibles.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BotonVerEventosDIsponibles.setForeground(new java.awt.Color(255, 255, 255));
        BotonVerEventosDIsponibles.setText("Ver Eventos Disponibles");
        BotonVerEventosDIsponibles.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonVerEventosDIsponibles.setPreferredSize(new java.awt.Dimension(100, 100));
        BotonVerEventosDIsponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVerEventosDIsponiblesActionPerformed(evt);
            }
        });
        FondoPantalla.add(BotonVerEventosDIsponibles);
        BotonVerEventosDIsponibles.setBounds(550, 310, 400, 40);

        botonSalir.setBackground(new java.awt.Color(65, 90, 119));
        botonSalir.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(255, 255, 255));
        botonSalir.setText("Salir");
        botonSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        FondoPantalla.add(botonSalir);
        botonSalir.setBounds(770, 610, 168, 40);

        FondoTitulo.setBackground(new java.awt.Color(105, 117, 101));

        EtiquetaGuia1.setBackground(new java.awt.Color(164, 180, 101));
        EtiquetaGuia1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        EtiquetaGuia1.setForeground(new java.awt.Color(255, 255, 255));
        EtiquetaGuia1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaGuia1.setText("SELECCIONA LA OPCION QUE DESEAS REALIZAR");

        javax.swing.GroupLayout FondoTituloLayout = new javax.swing.GroupLayout(FondoTitulo);
        FondoTitulo.setLayout(FondoTituloLayout);
        FondoTituloLayout.setHorizontalGroup(
            FondoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoTituloLayout.createSequentialGroup()
                .addContainerGap(161, Short.MAX_VALUE)
                .addComponent(EtiquetaGuia1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
        );
        FondoTituloLayout.setVerticalGroup(
            FondoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoTituloLayout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addComponent(EtiquetaGuia1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        FondoPantalla.add(FondoTitulo);
        FondoTitulo.setBounds(0, 0, 1000, 230);

        IconoMoneda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantallas/download.png"))); // NOI18N
        IconoMoneda.setText("jLabel2");
        FondoPantalla.add(IconoMoneda);
        IconoMoneda.setBounds(180, 290, 150, 160);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonMiPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMiPerfilActionPerformed
        PantallaMiPerfil pmp = new PantallaMiPerfil(usuarioIngresado); // se pasa usuarioIngresado como parametro 
        pmp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonMiPerfilActionPerformed

    private void BotonVerEventosDIsponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVerEventosDIsponiblesActionPerformed
        PantallaEventosDisponibles ped = new PantallaEventosDisponibles(usuarioIngresado); // se pasa usuarioIngresado como parametro 
        ped.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonVerEventosDIsponiblesActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        PantallaIngreso pi = new PantallaIngreso();
        pi.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void BotonEnviarDUTSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEnviarDUTSActionPerformed
        String destinatario = JOptionPane.showInputDialog(this, "¿A quién deseas enviar los DUTS?");
        if (destinatario == null || destinatario.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Destinatario inválido.");
            return;
        }

        String cantidadStr = JOptionPane.showInputDialog(this, "¿Cuántos DUTS deseas enviar?");
        if (cantidadStr == null || cantidadStr.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Cantidad inválida.");
            return;
        }

        try {
            int cantidadEnviar = Integer.parseInt(cantidadStr);

            java.util.List<String> nuevasLineas = new java.util.ArrayList<>();
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
                                JOptionPane.showMessageDialog(this, "No tienes suficientes DUTS para enviar.");
                                return;
                            }
                            duts -= cantidadEnviar;
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

            // Si el destinatario no existe, lo agregamos al final
            if (!receptorEncontrado) {
                nuevasLineas.add(destinatario + "," + cantidadEnviar);
                JOptionPane.showMessageDialog(this, "El destinatario no existía, fue creado y se le enviaron los DUTS.");
            }

            if (!emisorEncontrado) {
                JOptionPane.showMessageDialog(this, "Tu usuario no fue encontrado en el archivo.");
                return;
            }

            try (PrintWriter pw = new PrintWriter("UsuariosDuts.txt")) {
                for (String linea : nuevasLineas) {
                    pw.println(linea);
                }
            }

            JOptionPane.showMessageDialog(this, "DUTS enviados con éxito.");
            actualizarDuts();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "La cantidad debe ser un número válido.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al acceder al archivo.");
            e.printStackTrace();
        }
    }//GEN-LAST:event_BotonEnviarDUTSActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEnviarDUTS;
    private javax.swing.JButton BotonMiPerfil;
    private javax.swing.JButton BotonVerEventosDIsponibles;
    private javax.swing.JLabel ContadorDUTSactuales;
    private javax.swing.JLabel EtiquetaDutsActuales;
    private javax.swing.JLabel EtiquetaGuia1;
    private javax.swing.JLabel EtiquetaMenu;
    private javax.swing.JPanel FondoPantalla;
    private javax.swing.JPanel FondoTitulo;
    private javax.swing.JLabel IconoMoneda;
    private javax.swing.JButton botonSalir;
    // End of variables declaration//GEN-END:variables
}
