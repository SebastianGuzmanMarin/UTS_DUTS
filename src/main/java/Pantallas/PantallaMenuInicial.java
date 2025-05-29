
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        EtiquetaGuia1 = new javax.swing.JLabel();
        botonVolverPantallaIngreso = new javax.swing.JButton();

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
        EtiquetaMenu.setBounds(156, 12, 657, 96);

        EtiquetaDutsActuales.setBackground(new java.awt.Color(243, 243, 224));
        EtiquetaDutsActuales.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        EtiquetaDutsActuales.setForeground(new java.awt.Color(24, 59, 78));
        EtiquetaDutsActuales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaDutsActuales.setText("DUTS actuales");
        EtiquetaDutsActuales.setOpaque(true);
        FondoPantalla.add(EtiquetaDutsActuales);
        EtiquetaDutsActuales.setBounds(110, 200, 141, 40);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("00");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabel1.setOpaque(true);
        FondoPantalla.add(jLabel1);
        jLabel1.setBounds(110, 250, 141, 42);

        jButton1.setBackground(new java.awt.Color(243, 243, 224));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Cancelar Asistencia Evento");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        FondoPantalla.add(jButton1);
        jButton1.setBounds(370, 470, 480, 70);

        jButton2.setBackground(new java.awt.Color(243, 243, 224));
        jButton2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Enviar DUTS");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        FondoPantalla.add(jButton2);
        jButton2.setBounds(370, 200, 480, 70);

        jButton3.setBackground(new java.awt.Color(243, 243, 224));
        jButton3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Ver Eventos Disponibles");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        FondoPantalla.add(jButton3);
        jButton3.setBounds(370, 290, 480, 70);

        jButton4.setBackground(new java.awt.Color(243, 243, 224));
        jButton4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Registrarse en un Evento");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        FondoPantalla.add(jButton4);
        jButton4.setBounds(370, 380, 480, 70);

        EtiquetaGuia1.setBackground(new java.awt.Color(164, 180, 101));
        EtiquetaGuia1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        EtiquetaGuia1.setForeground(new java.awt.Color(243, 243, 224));
        EtiquetaGuia1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaGuia1.setText("SELECCIONA LA OPCION QUE DESEAS REALIZAR");
        FondoPantalla.add(EtiquetaGuia1);
        EtiquetaGuia1.setBounds(52, 114, 851, 57);

        botonVolverPantallaIngreso.setBackground(new java.awt.Color(221, 184, 98));
        botonVolverPantallaIngreso.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        botonVolverPantallaIngreso.setText("Volver");
        botonVolverPantallaIngreso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonVolverPantallaIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverPantallaIngresoActionPerformed(evt);
            }
        });
        FondoPantalla.add(botonVolverPantallaIngreso);
        botonVolverPantallaIngreso.setBounds(80, 530, 90, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, 951, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void botonVolverPantallaIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverPantallaIngresoActionPerformed
        PantallaIngreso pi = new PantallaIngreso ();
        pi.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonVolverPantallaIngresoActionPerformed

    
    
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EtiquetaDutsActuales;
    private javax.swing.JLabel EtiquetaGuia1;
    private javax.swing.JLabel EtiquetaMenu;
    private javax.swing.JPanel FondoPantalla;
    private javax.swing.JButton botonVolverPantallaIngreso;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
