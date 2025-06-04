package Pantallas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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

        FondoPantalla = new javax.swing.JPanel();
        FondoCuerpo = new javax.swing.JPanel();
        EtiquetaTitulo1 = new javax.swing.JLabel();
        EtiquetaTitulo = new javax.swing.JLabel();
        EtiquetaIngreseContraseña = new javax.swing.JLabel();
        CampoIngresarUsuario = new javax.swing.JTextField();
        EtiquetaIngreseContraseña1 = new javax.swing.JLabel();
        CampoContraseña = new javax.swing.JPasswordField();
        botonIngresar1 = new javax.swing.JButton();
        botonIngresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 700));
        setMinimumSize(new java.awt.Dimension(800, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 700));

        FondoPantalla.setBackground(new java.awt.Color(164, 180, 101));
        FondoPantalla.setForeground(new java.awt.Color(255, 255, 255));
        FondoPantalla.setMaximumSize(new java.awt.Dimension(800, 700));
        FondoPantalla.setMinimumSize(new java.awt.Dimension(800, 700));
        FondoPantalla.setRequestFocusEnabled(false);
        FondoPantalla.setVerifyInputWhenFocusTarget(false);
        FondoPantalla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FondoCuerpo.setBackground(new java.awt.Color(243, 243, 224));
        FondoCuerpo.setPreferredSize(new java.awt.Dimension(440, 710));

        EtiquetaTitulo1.setBackground(new java.awt.Color(240, 187, 120));
        EtiquetaTitulo1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        EtiquetaTitulo1.setForeground(new java.awt.Color(13, 27, 42));
        EtiquetaTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaTitulo1.setText("BIENVENIDO");
        EtiquetaTitulo1.setToolTipText("");

        EtiquetaTitulo.setBackground(new java.awt.Color(240, 187, 120));
        EtiquetaTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        EtiquetaTitulo.setForeground(new java.awt.Color(13, 27, 42));
        EtiquetaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaTitulo.setText("Plataforma Financiera UTS");
        EtiquetaTitulo.setToolTipText("");

        EtiquetaIngreseContraseña.setBackground(new java.awt.Color(60, 61, 55));
        EtiquetaIngreseContraseña.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EtiquetaIngreseContraseña.setForeground(new java.awt.Color(255, 255, 255));
        EtiquetaIngreseContraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaIngreseContraseña.setText("Ingresa tu usuario");
        EtiquetaIngreseContraseña.setAlignmentY(0.0F);
        EtiquetaIngreseContraseña.setOpaque(true);

        CampoIngresarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        CampoIngresarUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CampoIngresarUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CampoIngresarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoIngresarUsuarioActionPerformed(evt);
            }
        });

        EtiquetaIngreseContraseña1.setBackground(new java.awt.Color(60, 61, 55));
        EtiquetaIngreseContraseña1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EtiquetaIngreseContraseña1.setForeground(new java.awt.Color(255, 255, 255));
        EtiquetaIngreseContraseña1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaIngreseContraseña1.setText("Ingresa tu contraseña");
        EtiquetaIngreseContraseña1.setAlignmentY(0.0F);
        EtiquetaIngreseContraseña1.setOpaque(true);

        CampoContraseña.setBackground(new java.awt.Color(255, 255, 255));
        CampoContraseña.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CampoContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CampoContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoContraseñaActionPerformed(evt);
            }
        });

        botonIngresar1.setBackground(new java.awt.Color(65, 90, 119));
        botonIngresar1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonIngresar1.setForeground(new java.awt.Color(255, 255, 255));
        botonIngresar1.setText("Ingresar");
        botonIngresar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonIngresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresar1ActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout FondoCuerpoLayout = new javax.swing.GroupLayout(FondoCuerpo);
        FondoCuerpo.setLayout(FondoCuerpoLayout);
        FondoCuerpoLayout.setHorizontalGroup(
            FondoCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoCuerpoLayout.createSequentialGroup()
                .addComponent(EtiquetaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
            .addComponent(EtiquetaTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(FondoCuerpoLayout.createSequentialGroup()
                .addGroup(FondoCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoCuerpoLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(FondoCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EtiquetaIngreseContraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoIngresarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EtiquetaIngreseContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(FondoCuerpoLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(botonIngresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(FondoCuerpoLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(botonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FondoCuerpoLayout.setVerticalGroup(
            FondoCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoCuerpoLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(EtiquetaTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EtiquetaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(EtiquetaIngreseContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoIngresarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(EtiquetaIngreseContraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CampoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(botonIngresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        CampoIngresarUsuario.getAccessibleContext().setAccessibleName("\n");

        FondoPantalla.add(FondoCuerpo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 340, 700));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantallas/Pictures/Picture1.jpg"))); // NOI18N
        FondoPantalla.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 440, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoContraseñaActionPerformed

    }//GEN-LAST:event_CampoContraseñaActionPerformed

    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarActionPerformed
        PantallaRegistro pr = new PantallaRegistro();
        pr.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_botonIngresarActionPerformed

    private void CampoIngresarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoIngresarUsuarioActionPerformed

    }//GEN-LAST:event_CampoIngresarUsuarioActionPerformed

    private void botonIngresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresar1ActionPerformed

        String usuarioIngresado = CampoIngresarUsuario.getText();
        String contraseñaIngresada = new String(CampoContraseña.getPassword());

        boolean accesoConcedido = false;

        try (BufferedReader br = new BufferedReader(new FileReader("usuariosRegistrados.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length >= 2) {
                    String usuarioArchivo = partes[0].trim();
                    String contraseñaArchivo = partes[1].trim();

                    if (usuarioIngresado.equals(usuarioArchivo) && contraseñaIngresada.equals(contraseñaArchivo)) {
                        accesoConcedido = true;
                        break;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            return;
        }

        if (accesoConcedido) {
            PantallaMenuInicial pmi = new PantallaMenuInicial(usuarioIngresado);// se pasa usuarioIngresado como parametro 
            pmi.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
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
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
