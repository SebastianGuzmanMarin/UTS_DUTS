package Pantallas;

import javax.swing.JOptionPane;

public class PantallaIngreso extends javax.swing.JFrame {

    public PantallaIngreso() {
        initComponents();
    }

    
      public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaIngreso().setVisible(true);
            }
        });
    }
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        FondoPantalla = new javax.swing.JPanel();
        FondoCuerpo = new javax.swing.JPanel();
        CampoContraseña = new javax.swing.JPasswordField();
        EtiquetaIngreseContraseña = new javax.swing.JLabel();
        botonIngresar = new javax.swing.JButton();
        EtiquetaIngreseContraseña1 = new javax.swing.JLabel();
        CampoIngresarUsuario = new javax.swing.JTextField();
        botonIngresar1 = new javax.swing.JButton();
        EtiquetaTitulo = new javax.swing.JLabel();
        EtiquetaTitulo1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FondoPantalla.setBackground(new java.awt.Color(164, 180, 101));
        FondoPantalla.setForeground(new java.awt.Color(255, 255, 255));
        FondoPantalla.setLayout(null);

        FondoCuerpo.setBackground(new java.awt.Color(243, 243, 224));

        CampoContraseña.setBackground(new java.awt.Color(255, 255, 255));
        CampoContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CampoContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoContraseñaActionPerformed(evt);
            }
        });

        EtiquetaIngreseContraseña.setBackground(new java.awt.Color(164, 180, 101));
        EtiquetaIngreseContraseña.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        EtiquetaIngreseContraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaIngreseContraseña.setText("Ingresa tu usuario");
        EtiquetaIngreseContraseña.setAlignmentY(0.0F);
        EtiquetaIngreseContraseña.setOpaque(true);

        botonIngresar.setBackground(new java.awt.Color(221, 168, 83));
        botonIngresar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        botonIngresar.setText("Registrarse");
        botonIngresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarActionPerformed(evt);
            }
        });

        EtiquetaIngreseContraseña1.setBackground(new java.awt.Color(164, 180, 101));
        EtiquetaIngreseContraseña1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        EtiquetaIngreseContraseña1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaIngreseContraseña1.setText("Ingresa tu contraseña");
        EtiquetaIngreseContraseña1.setAlignmentY(0.0F);
        EtiquetaIngreseContraseña1.setOpaque(true);

        CampoIngresarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        CampoIngresarUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CampoIngresarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoIngresarUsuarioActionPerformed(evt);
            }
        });

        botonIngresar1.setBackground(new java.awt.Color(221, 168, 83));
        botonIngresar1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        botonIngresar1.setText("Ingresar");
        botonIngresar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonIngresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FondoCuerpoLayout = new javax.swing.GroupLayout(FondoCuerpo);
        FondoCuerpo.setLayout(FondoCuerpoLayout);
        FondoCuerpoLayout.setHorizontalGroup(
            FondoCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoCuerpoLayout.createSequentialGroup()
                .addGroup(FondoCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoCuerpoLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(FondoCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EtiquetaIngreseContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonIngresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoIngresarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EtiquetaIngreseContraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FondoCuerpoLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(botonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        FondoCuerpoLayout.setVerticalGroup(
            FondoCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoCuerpoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EtiquetaIngreseContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoIngresarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EtiquetaIngreseContraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonIngresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        CampoIngresarUsuario.getAccessibleContext().setAccessibleName("\n");

        FondoPantalla.add(FondoCuerpo);
        FondoCuerpo.setBounds(70, 170, 520, 300);

        EtiquetaTitulo.setBackground(new java.awt.Color(240, 187, 120));
        EtiquetaTitulo.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        EtiquetaTitulo.setForeground(new java.awt.Color(245, 236, 213));
        EtiquetaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaTitulo.setText("Plataforma Financiera UTS");
        EtiquetaTitulo.setToolTipText("");
        FondoPantalla.add(EtiquetaTitulo);
        EtiquetaTitulo.setBounds(120, 110, 410, 30);

        EtiquetaTitulo1.setBackground(new java.awt.Color(240, 187, 120));
        EtiquetaTitulo1.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        EtiquetaTitulo1.setForeground(new java.awt.Color(243, 243, 224));
        EtiquetaTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaTitulo1.setText("BIENVENIDO");
        EtiquetaTitulo1.setToolTipText("");
        FondoPantalla.add(EtiquetaTitulo1);
        EtiquetaTitulo1.setBounds(120, 20, 430, 80);

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

    private void CampoContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoContraseñaActionPerformed
        char[] ContraseñaChar = CampoContraseña.getPassword();  //char lo devuelve en caracteres extraños
        String Contraseña = new String(ContraseñaChar);

        if (Contraseña.isEmpty()) {
            JOptionPane.showMessageDialog(this, "️La contraseña no puede estar vacía.");
        } else {
            System.out.println("La contraseña es: " + Contraseña);
        }
    }//GEN-LAST:event_CampoContraseñaActionPerformed

    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarActionPerformed
        PantallaRegistro pr = new PantallaRegistro();
        pr.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_botonIngresarActionPerformed

    private void CampoIngresarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoIngresarUsuarioActionPerformed
        String Usuario = CampoIngresarUsuario.getText();
        
        if (Usuario.isEmpty()) {
            JOptionPane.showMessageDialog(this, "️El campo Usuario no puede estar vacío.");
        } else {
            System.out.println("el usuario es" + Usuario);
        }

    }//GEN-LAST:event_CampoIngresarUsuarioActionPerformed

    private void botonIngresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresar1ActionPerformed

        String usuarioIngresado = CampoIngresarUsuario.getText();
        String contraseñaIngresada = new String(CampoContraseña.getPassword());

        if (usuarioIngresado.equals("admin") && contraseñaIngresada.equals("1234")) {
            
            PantallaMenuInicial pmi = new PantallaMenuInicial();
            pmi.setVisible(true);
            this.setVisible(false);
            
        } else {
            JOptionPane.showMessageDialog(this, " Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_botonIngresar1ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField CampoContraseña;
    private javax.swing.JTextField CampoIngresarUsuario;
    private javax.swing.JLabel EtiquetaIngreseContraseña;
    private javax.swing.JLabel EtiquetaIngreseContraseña1;
    private javax.swing.JLabel EtiquetaTitulo;
    private javax.swing.JLabel EtiquetaTitulo1;
    private javax.swing.JPanel FondoCuerpo;
    private javax.swing.JPanel FondoPantalla;
    private javax.swing.JButton botonIngresar;
    private javax.swing.JButton botonIngresar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
