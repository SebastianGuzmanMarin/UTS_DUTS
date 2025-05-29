
package Pantallas;


public class PantallaRegistro extends javax.swing.JFrame {

    
    public PantallaRegistro() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoPantalla = new javax.swing.JPanel();
        FondoCuerpo = new javax.swing.JPanel();
        CampoRegistraContraseña = new javax.swing.JPasswordField();
        EtiquetaRegistroNombreUsuario = new javax.swing.JLabel();
        botonIngresar = new javax.swing.JButton();
        EtiquetaRegistraContraseña = new javax.swing.JLabel();
        CampoRegistraNombreUsuario = new javax.swing.JTextField();
        CampoTerminosCondiciones = new javax.swing.JCheckBox();
        botonVolverPantallaIngreso = new javax.swing.JButton();
        EtiquetaTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FondoPantalla.setBackground(new java.awt.Color(63, 114, 175));
        FondoPantalla.setForeground(new java.awt.Color(255, 255, 255));
        FondoPantalla.setLayout(null);

        FondoCuerpo.setBackground(new java.awt.Color(219, 226, 239));
        FondoCuerpo.setForeground(new java.awt.Color(0, 0, 0));

        CampoRegistraContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CampoRegistraContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoRegistraContraseñaActionPerformed(evt);
            }
        });

        EtiquetaRegistroNombreUsuario.setBackground(new java.awt.Color(17, 45, 78));
        EtiquetaRegistroNombreUsuario.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        EtiquetaRegistroNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        EtiquetaRegistroNombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaRegistroNombreUsuario.setText("Ingresa tu Nombre de usuario");
        EtiquetaRegistroNombreUsuario.setAlignmentY(0.0F);
        EtiquetaRegistroNombreUsuario.setOpaque(true);

        botonIngresar.setBackground(new java.awt.Color(221, 168, 83));
        botonIngresar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        botonIngresar.setText("Registrarse");
        botonIngresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarActionPerformed(evt);
            }
        });

        EtiquetaRegistraContraseña.setBackground(new java.awt.Color(17, 45, 78));
        EtiquetaRegistraContraseña.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        EtiquetaRegistraContraseña.setForeground(new java.awt.Color(255, 255, 255));
        EtiquetaRegistraContraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaRegistraContraseña.setText("Ingresa tu contraseña");
        EtiquetaRegistraContraseña.setAlignmentY(0.0F);
        EtiquetaRegistraContraseña.setOpaque(true);

        CampoRegistraNombreUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CampoRegistraNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoRegistraNombreUsuarioActionPerformed(evt);
            }
        });

        CampoTerminosCondiciones.setText("Aceptas Terminos  y condiciones");
        CampoTerminosCondiciones.setOpaque(true);
        CampoTerminosCondiciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoTerminosCondicionesActionPerformed(evt);
            }
        });

        botonVolverPantallaIngreso.setBackground(new java.awt.Color(221, 184, 98));
        botonVolverPantallaIngreso.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        botonVolverPantallaIngreso.setText("Volver");
        botonVolverPantallaIngreso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonVolverPantallaIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverPantallaIngresoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FondoCuerpoLayout = new javax.swing.GroupLayout(FondoCuerpo);
        FondoCuerpo.setLayout(FondoCuerpoLayout);
        FondoCuerpoLayout.setHorizontalGroup(
            FondoCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoCuerpoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CampoTerminosCondiciones)
                .addGap(160, 160, 160))
            .addGroup(FondoCuerpoLayout.createSequentialGroup()
                .addGroup(FondoCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoCuerpoLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(FondoCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EtiquetaRegistroNombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                            .addComponent(EtiquetaRegistraContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CampoRegistraNombreUsuario)
                            .addComponent(CampoRegistraContraseña)))
                    .addGroup(FondoCuerpoLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addGroup(FondoCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FondoCuerpoLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(botonVolverPantallaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(botonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        FondoCuerpoLayout.setVerticalGroup(
            FondoCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoCuerpoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EtiquetaRegistroNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoRegistraNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EtiquetaRegistraContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoRegistraContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CampoTerminosCondiciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonVolverPantallaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        CampoRegistraNombreUsuario.getAccessibleContext().setAccessibleName("\n");

        FondoPantalla.add(FondoCuerpo);
        FondoCuerpo.setBounds(70, 150, 520, 320);

        EtiquetaTitulo.setBackground(new java.awt.Color(240, 187, 120));
        EtiquetaTitulo.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        EtiquetaTitulo.setForeground(new java.awt.Color(243, 243, 224));
        EtiquetaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaTitulo.setText("Registro");
        EtiquetaTitulo.setToolTipText("");
        FondoPantalla.add(EtiquetaTitulo);
        EtiquetaTitulo.setBounds(120, 20, 430, 80);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoRegistraContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoRegistraContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoRegistraContraseñaActionPerformed

    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonIngresarActionPerformed

    private void CampoRegistraNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoRegistraNombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoRegistraNombreUsuarioActionPerformed

    private void CampoTerminosCondicionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoTerminosCondicionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoTerminosCondicionesActionPerformed

    private void botonVolverPantallaIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverPantallaIngresoActionPerformed
        PantallaIngreso pi = new PantallaIngreso ();
        pi.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonVolverPantallaIngresoActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField CampoRegistraContraseña;
    private javax.swing.JTextField CampoRegistraNombreUsuario;
    private javax.swing.JCheckBox CampoTerminosCondiciones;
    private javax.swing.JLabel EtiquetaRegistraContraseña;
    private javax.swing.JLabel EtiquetaRegistroNombreUsuario;
    private javax.swing.JLabel EtiquetaTitulo;
    private javax.swing.JPanel FondoCuerpo;
    private javax.swing.JPanel FondoPantalla;
    private javax.swing.JButton botonIngresar;
    private javax.swing.JButton botonVolverPantallaIngreso;
    // End of variables declaration//GEN-END:variables
}
