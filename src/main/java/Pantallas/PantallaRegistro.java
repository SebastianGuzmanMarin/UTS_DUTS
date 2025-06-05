package Pantallas;

import static Modelos.ValidacionUsuarioExiste.validacionUsuarioExiste;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

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
        CampoTerminosCondiciones = new javax.swing.JCheckBox();
        CampoRegistraNombreUsuario = new javax.swing.JTextField();
        botonVolverPantallaIngreso = new javax.swing.JButton();
        EtiquetaTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 700));

        FondoPantalla.setBackground(new java.awt.Color(63, 114, 175));
        FondoPantalla.setForeground(new java.awt.Color(255, 255, 255));
        FondoPantalla.setMaximumSize(new java.awt.Dimension(800, 700));
        FondoPantalla.setMinimumSize(new java.awt.Dimension(800, 700));
        FondoPantalla.setPreferredSize(new java.awt.Dimension(800, 700));
        FondoPantalla.setRequestFocusEnabled(false);
        FondoPantalla.setVerifyInputWhenFocusTarget(false);
        FondoPantalla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FondoCuerpo.setBackground(new java.awt.Color(219, 226, 239));
        FondoCuerpo.setForeground(new java.awt.Color(0, 0, 0));
        FondoCuerpo.setPreferredSize(new java.awt.Dimension(440, 710));

        CampoRegistraContraseña.setBackground(new java.awt.Color(255, 255, 255));
        CampoRegistraContraseña.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CampoRegistraContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CampoRegistraContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoRegistraContraseñaActionPerformed(evt);
            }
        });

        EtiquetaRegistroNombreUsuario.setBackground(new java.awt.Color(60, 61, 55));
        EtiquetaRegistroNombreUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EtiquetaRegistroNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        EtiquetaRegistroNombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaRegistroNombreUsuario.setText("Ingresa tu Nombre de usuario");
        EtiquetaRegistroNombreUsuario.setAlignmentY(0.0F);
        EtiquetaRegistroNombreUsuario.setMaximumSize(new java.awt.Dimension(128, 17));
        EtiquetaRegistroNombreUsuario.setMinimumSize(new java.awt.Dimension(128, 17));
        EtiquetaRegistroNombreUsuario.setOpaque(true);
        EtiquetaRegistroNombreUsuario.setPreferredSize(new java.awt.Dimension(128, 17));

        botonIngresar.setBackground(new java.awt.Color(65, 90, 119));
        botonIngresar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonIngresar.setForeground(new java.awt.Color(255, 255, 255));
        botonIngresar.setText("Registrarse");
        botonIngresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarActionPerformed(evt);
            }
        });

        EtiquetaRegistraContraseña.setBackground(new java.awt.Color(60, 61, 55));
        EtiquetaRegistraContraseña.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EtiquetaRegistraContraseña.setForeground(new java.awt.Color(255, 255, 255));
        EtiquetaRegistraContraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaRegistraContraseña.setText("Ingresa tu contraseña");
        EtiquetaRegistraContraseña.setAlignmentY(0.0F);
        EtiquetaRegistraContraseña.setOpaque(true);

        CampoTerminosCondiciones.setBackground(new java.awt.Color(255, 255, 255));
        CampoTerminosCondiciones.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CampoTerminosCondiciones.setForeground(new java.awt.Color(0, 0, 0));
        CampoTerminosCondiciones.setText("Aceptas Terminos  y condiciones");
        CampoTerminosCondiciones.setOpaque(true);
        CampoTerminosCondiciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoTerminosCondicionesActionPerformed(evt);
            }
        });

        CampoRegistraNombreUsuario.setBackground(new java.awt.Color(255, 255, 255));
        CampoRegistraNombreUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CampoRegistraNombreUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CampoRegistraNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoRegistraNombreUsuarioActionPerformed(evt);
            }
        });

        botonVolverPantallaIngreso.setBackground(new java.awt.Color(65, 90, 119));
        botonVolverPantallaIngreso.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonVolverPantallaIngreso.setForeground(new java.awt.Color(255, 255, 255));
        botonVolverPantallaIngreso.setText("Volver");
        botonVolverPantallaIngreso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonVolverPantallaIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverPantallaIngresoActionPerformed(evt);
            }
        });

        EtiquetaTitulo.setBackground(new java.awt.Color(240, 187, 120));
        EtiquetaTitulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        EtiquetaTitulo.setForeground(new java.awt.Color(0, 0, 0));
        EtiquetaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaTitulo.setText("REGISTRO");
        EtiquetaTitulo.setToolTipText("");
        EtiquetaTitulo.setMaximumSize(new java.awt.Dimension(222, 42));
        EtiquetaTitulo.setMinimumSize(new java.awt.Dimension(222, 42));
        EtiquetaTitulo.setPreferredSize(new java.awt.Dimension(222, 42));

        javax.swing.GroupLayout FondoCuerpoLayout = new javax.swing.GroupLayout(FondoCuerpo);
        FondoCuerpo.setLayout(FondoCuerpoLayout);
        FondoCuerpoLayout.setHorizontalGroup(
            FondoCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EtiquetaTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoCuerpoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonVolverPantallaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
            .addGroup(FondoCuerpoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(FondoCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoTerminosCondiciones))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoCuerpoLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(FondoCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoCuerpoLayout.createSequentialGroup()
                        .addComponent(CampoRegistraNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoCuerpoLayout.createSequentialGroup()
                        .addGroup(FondoCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoRegistraContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EtiquetaRegistraContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EtiquetaRegistroNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51))))
        );
        FondoCuerpoLayout.setVerticalGroup(
            FondoCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoCuerpoLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(EtiquetaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(EtiquetaRegistroNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoRegistraNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(EtiquetaRegistraContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoRegistraContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(CampoTerminosCondiciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonVolverPantallaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156))
        );

        CampoRegistraNombreUsuario.getAccessibleContext().setAccessibleName("\n");

        FondoPantalla.add(FondoCuerpo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 700));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/Fachada-UTS (1).png"))); // NOI18N
        jLabel2.setText("jLabel2");
        FondoPantalla.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 430, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPantalla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoRegistraContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoRegistraContraseñaActionPerformed

    }//GEN-LAST:event_CampoRegistraContraseñaActionPerformed

    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarActionPerformed
        String usuarioIngresado = CampoRegistraNombreUsuario.getText();
        String contraseñaIngresada = new String(CampoRegistraContraseña.getPassword());

        if (usuarioIngresado.isEmpty() || contraseñaIngresada.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Los datos no pueden estar vacios.");
        } else if (!CampoTerminosCondiciones.isSelected()) {
            JOptionPane.showMessageDialog(this, "Debe aceptar los Terminos y Condiciones para registrarse.");
        } else if (validacionUsuarioExiste(usuarioIngresado)) {
            JOptionPane.showMessageDialog(this, "El usuario ya esta registrado");
        } else {
            try {
                FileWriter fw = new FileWriter("usuariosRegistrados.txt", true); // 'true' para agregar al archivo
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(usuarioIngresado + "," + contraseñaIngresada);
                bw.newLine();
                bw.close();
                JOptionPane.showMessageDialog(this, "Usuario y contraseña registrados con éxito.");

                CampoRegistraNombreUsuario.setText("");
                CampoRegistraContraseña.setText("");
                CampoTerminosCondiciones.setSelected(false);

            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error al guardar el usuario: " + e.getMessage());
            }
        }

    }//GEN-LAST:event_botonIngresarActionPerformed

    private void CampoRegistraNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoRegistraNombreUsuarioActionPerformed

    }//GEN-LAST:event_CampoRegistraNombreUsuarioActionPerformed

    private void CampoTerminosCondicionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoTerminosCondicionesActionPerformed

    }//GEN-LAST:event_CampoTerminosCondicionesActionPerformed

    private void botonVolverPantallaIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverPantallaIngresoActionPerformed
        PantallaIngreso pi = new PantallaIngreso();
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
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
