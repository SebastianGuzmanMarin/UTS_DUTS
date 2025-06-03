
package Pantallas;

public class PantallaMenuInicial extends javax.swing.JFrame {

    
    public PantallaMenuInicial() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoPantalla = new javax.swing.JPanel();
        EtiquetaMenu = new javax.swing.JLabel();
        EtiquetaDutsActuales = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BotonCancelarAsistenciaEvento = new javax.swing.JButton();
        BotonEnviarDUTS = new javax.swing.JButton();
        BotonVerEventosDIsponibles = new javax.swing.JButton();
        BotonRegistrarseEvento = new javax.swing.JButton();
        EtiquetaGuia1 = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FondoPantalla.setBackground(new java.awt.Color(39, 84, 138));
        FondoPantalla.setLayout(null);

        EtiquetaMenu.setBackground(new java.awt.Color(148, 180, 193));
        EtiquetaMenu.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        EtiquetaMenu.setForeground(new java.awt.Color(255, 255, 255));
        EtiquetaMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaMenu.setLabelFor(FondoPantalla);
        EtiquetaMenu.setText("MENU");
        EtiquetaMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        EtiquetaMenu.setIconTextGap(20);
        EtiquetaMenu.setMaximumSize(new java.awt.Dimension(300, 300));
        EtiquetaMenu.setName(""); // NOI18N
        EtiquetaMenu.setOpaque(true);
        FondoPantalla.add(EtiquetaMenu);
        EtiquetaMenu.setBounds(110, 40, 700, 60);

        EtiquetaDutsActuales.setBackground(new java.awt.Color(243, 243, 224));
        EtiquetaDutsActuales.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        EtiquetaDutsActuales.setForeground(new java.awt.Color(24, 59, 78));
        EtiquetaDutsActuales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaDutsActuales.setText("DUTS actuales");
        EtiquetaDutsActuales.setOpaque(true);
        FondoPantalla.add(EtiquetaDutsActuales);
        EtiquetaDutsActuales.setBounds(110, 200, 120, 30);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("00");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabel1.setOpaque(true);
        FondoPantalla.add(jLabel1);
        jLabel1.setBounds(110, 240, 120, 30);

        BotonCancelarAsistenciaEvento.setBackground(new java.awt.Color(243, 243, 224));
        BotonCancelarAsistenciaEvento.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BotonCancelarAsistenciaEvento.setForeground(new java.awt.Color(0, 0, 0));
        BotonCancelarAsistenciaEvento.setText("Cancelar Asistencia Evento");
        BotonCancelarAsistenciaEvento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonCancelarAsistenciaEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarAsistenciaEventoActionPerformed(evt);
            }
        });
        FondoPantalla.add(BotonCancelarAsistenciaEvento);
        BotonCancelarAsistenciaEvento.setBounds(370, 350, 400, 40);

        BotonEnviarDUTS.setBackground(new java.awt.Color(243, 243, 224));
        BotonEnviarDUTS.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BotonEnviarDUTS.setForeground(new java.awt.Color(0, 0, 0));
        BotonEnviarDUTS.setText("Enviar DUTS");
        BotonEnviarDUTS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonEnviarDUTS.setPreferredSize(new java.awt.Dimension(100, 100));
        FondoPantalla.add(BotonEnviarDUTS);
        BotonEnviarDUTS.setBounds(370, 200, 400, 40);

        BotonVerEventosDIsponibles.setBackground(new java.awt.Color(243, 243, 224));
        BotonVerEventosDIsponibles.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BotonVerEventosDIsponibles.setForeground(new java.awt.Color(0, 0, 0));
        BotonVerEventosDIsponibles.setText("Ver Eventos Disponibles");
        BotonVerEventosDIsponibles.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonVerEventosDIsponibles.setPreferredSize(new java.awt.Dimension(100, 100));
        BotonVerEventosDIsponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVerEventosDIsponiblesActionPerformed(evt);
            }
        });
        FondoPantalla.add(BotonVerEventosDIsponibles);
        BotonVerEventosDIsponibles.setBounds(370, 250, 400, 40);

        BotonRegistrarseEvento.setBackground(new java.awt.Color(243, 243, 224));
        BotonRegistrarseEvento.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BotonRegistrarseEvento.setForeground(new java.awt.Color(0, 0, 0));
        BotonRegistrarseEvento.setText("Registrarse en un Evento");
        BotonRegistrarseEvento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonRegistrarseEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarseEventoActionPerformed(evt);
            }
        });
        FondoPantalla.add(BotonRegistrarseEvento);
        BotonRegistrarseEvento.setBounds(370, 300, 400, 40);

        EtiquetaGuia1.setBackground(new java.awt.Color(164, 180, 101));
        EtiquetaGuia1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        EtiquetaGuia1.setForeground(new java.awt.Color(243, 243, 224));
        EtiquetaGuia1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaGuia1.setText("SELECCIONA LA OPCION QUE DESEAS REALIZAR");
        FondoPantalla.add(EtiquetaGuia1);
        EtiquetaGuia1.setBounds(120, 120, 700, 50);

        botonSalir.setBackground(new java.awt.Color(221, 184, 98));
        botonSalir.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(0, 0, 0));
        botonSalir.setText("Salir");
        botonSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        FondoPantalla.add(botonSalir);
        botonSalir.setBounds(120, 330, 100, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCancelarAsistenciaEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarAsistenciaEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonCancelarAsistenciaEventoActionPerformed

    private void BotonVerEventosDIsponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVerEventosDIsponiblesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonVerEventosDIsponiblesActionPerformed

    private void BotonRegistrarseEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarseEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonRegistrarseEventoActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        PantallaIngreso pi = new PantallaIngreso ();
        pi.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonSalirActionPerformed

    
    
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCancelarAsistenciaEvento;
    private javax.swing.JButton BotonEnviarDUTS;
    private javax.swing.JButton BotonRegistrarseEvento;
    private javax.swing.JButton BotonVerEventosDIsponibles;
    private javax.swing.JLabel EtiquetaDutsActuales;
    private javax.swing.JLabel EtiquetaGuia1;
    private javax.swing.JLabel EtiquetaMenu;
    private javax.swing.JPanel FondoPantalla;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
