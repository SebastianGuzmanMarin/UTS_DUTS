package Pantallas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PantallaMiPerfil extends javax.swing.JFrame {

    private String usuarioIngresado;

    public PantallaMiPerfil(String usuarioIngresado) {  //constructor recibe usuario de pantalla de ingreso como parametro
        initComponents();
        this.usuarioIngresado = usuarioIngresado;
        EtiquetaSaludoMiPefil.setText("¡Hola! " + usuarioIngresado);

        try (BufferedReader br = new BufferedReader(new FileReader("UsuariosDuts.txt"))) {
            String linea;
            boolean encontrado = false;

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 2) {
                    String nombre = partes[0].trim();
                    String dutStr = partes[1].trim();

                    // Comparar sin importar mayúsculas/minúsculas
                    if (nombre.equalsIgnoreCase(usuarioIngresado)) {
                        int dutTotal = Integer.parseInt(dutStr);
                        int años = dutTotal / 365;
                        int semestres = dutTotal / 182;
                        int meses = dutTotal / 30;
                        int semanas = dutTotal / 7;

                        ContadorDUTSaño.setText(String.valueOf(años));
                        ContadorDUTSsemestre.setText(String.valueOf(semestres));
                        ContadorDUTSmes.setText(String.valueOf(meses));
                        ContadorDUTSsemana.setText(String.valueOf(semanas));

                        encontrado = true;
                        break;
                    }
                }
            }

            if (!encontrado) {
                System.out.println("Usuario no encontrado en el archivo.");
            }

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    PantallaMiPerfil() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoPantalla = new javax.swing.JPanel();
        botonSalir = new javax.swing.JButton();
        FondoFotoPerfil1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BotonEnviarDUTS = new javax.swing.JButton();
        FondoFotoPerfil2 = new javax.swing.JPanel();
        EtiquetaDutsActuales = new javax.swing.JLabel();
        ContadorDUTSaño = new javax.swing.JLabel();
        EtiquetaDutsActuales1 = new javax.swing.JLabel();
        EtiquetaDutsActuales2 = new javax.swing.JLabel();
        EtiquetaDutsActuales3 = new javax.swing.JLabel();
        ContadorDUTSmes = new javax.swing.JLabel();
        ContadorDUTSsemana = new javax.swing.JLabel();
        ContadorDUTSsemestre = new javax.swing.JLabel();
        EtiquetaMenu1 = new javax.swing.JLabel();
        EtiquetaSaludoMiPefil = new javax.swing.JLabel();
        TextAreaInfo = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        TituloDetalles = new javax.swing.JTextField();
        TextAreaDetalles = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 700));

        FondoPantalla.setBackground(new java.awt.Color(245, 236, 213));
        FondoPantalla.setLayout(null);

        botonSalir.setBackground(new java.awt.Color(65, 90, 119));
        botonSalir.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(255, 255, 255));
        botonSalir.setText("Volver");
        botonSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        FondoPantalla.add(botonSalir);
        botonSalir.setBounds(20, 640, 168, 40);

        FondoFotoPerfil1.setBackground(new java.awt.Color(98, 111, 71));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantallas/persona icono.png"))); // NOI18N

        BotonEnviarDUTS.setBackground(new java.awt.Color(60, 61, 55));
        BotonEnviarDUTS.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BotonEnviarDUTS.setForeground(new java.awt.Color(255, 255, 255));
        BotonEnviarDUTS.setText("Cambiar Foto");
        BotonEnviarDUTS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonEnviarDUTS.setPreferredSize(new java.awt.Dimension(100, 100));
        BotonEnviarDUTS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEnviarDUTSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FondoFotoPerfil1Layout = new javax.swing.GroupLayout(FondoFotoPerfil1);
        FondoFotoPerfil1.setLayout(FondoFotoPerfil1Layout);
        FondoFotoPerfil1Layout.setHorizontalGroup(
            FondoFotoPerfil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoFotoPerfil1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(BotonEnviarDUTS, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoFotoPerfil1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(88, 88, 88))
        );
        FondoFotoPerfil1Layout.setVerticalGroup(
            FondoFotoPerfil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoFotoPerfil1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonEnviarDUTS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        FondoPantalla.add(FondoFotoPerfil1);
        FondoFotoPerfil1.setBounds(0, 0, 400, 350);

        FondoFotoPerfil2.setBackground(new java.awt.Color(98, 111, 71));

        EtiquetaDutsActuales.setBackground(new java.awt.Color(24, 28, 20));
        EtiquetaDutsActuales.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EtiquetaDutsActuales.setForeground(new java.awt.Color(255, 255, 255));
        EtiquetaDutsActuales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaDutsActuales.setText("DUTS / Semestre");
        EtiquetaDutsActuales.setAlignmentY(0.0F);
        EtiquetaDutsActuales.setOpaque(true);

        ContadorDUTSaño.setBackground(new java.awt.Color(243, 243, 224));
        ContadorDUTSaño.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ContadorDUTSaño.setForeground(new java.awt.Color(0, 0, 0));
        ContadorDUTSaño.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ContadorDUTSaño.setText("00");
        ContadorDUTSaño.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        ContadorDUTSaño.setOpaque(true);

        EtiquetaDutsActuales1.setBackground(new java.awt.Color(24, 28, 20));
        EtiquetaDutsActuales1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EtiquetaDutsActuales1.setForeground(new java.awt.Color(255, 255, 255));
        EtiquetaDutsActuales1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaDutsActuales1.setText("DUTS / Mes");
        EtiquetaDutsActuales1.setAlignmentY(0.0F);
        EtiquetaDutsActuales1.setOpaque(true);

        EtiquetaDutsActuales2.setBackground(new java.awt.Color(24, 28, 20));
        EtiquetaDutsActuales2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EtiquetaDutsActuales2.setForeground(new java.awt.Color(255, 255, 255));
        EtiquetaDutsActuales2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaDutsActuales2.setText("DUTS / Semana");
        EtiquetaDutsActuales2.setAlignmentY(0.0F);
        EtiquetaDutsActuales2.setOpaque(true);

        EtiquetaDutsActuales3.setBackground(new java.awt.Color(24, 28, 20));
        EtiquetaDutsActuales3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EtiquetaDutsActuales3.setForeground(new java.awt.Color(255, 255, 255));
        EtiquetaDutsActuales3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaDutsActuales3.setText("DUTS / Año");
        EtiquetaDutsActuales3.setAlignmentY(0.0F);
        EtiquetaDutsActuales3.setOpaque(true);

        ContadorDUTSmes.setBackground(new java.awt.Color(243, 243, 224));
        ContadorDUTSmes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ContadorDUTSmes.setForeground(new java.awt.Color(0, 0, 0));
        ContadorDUTSmes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ContadorDUTSmes.setText("00");
        ContadorDUTSmes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        ContadorDUTSmes.setOpaque(true);

        ContadorDUTSsemana.setBackground(new java.awt.Color(243, 243, 224));
        ContadorDUTSsemana.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ContadorDUTSsemana.setForeground(new java.awt.Color(0, 0, 0));
        ContadorDUTSsemana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ContadorDUTSsemana.setText("00");
        ContadorDUTSsemana.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        ContadorDUTSsemana.setOpaque(true);

        ContadorDUTSsemestre.setBackground(new java.awt.Color(243, 243, 224));
        ContadorDUTSsemestre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ContadorDUTSsemestre.setForeground(new java.awt.Color(0, 0, 0));
        ContadorDUTSsemestre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ContadorDUTSsemestre.setText("00");
        ContadorDUTSsemestre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        ContadorDUTSsemestre.setOpaque(true);

        EtiquetaMenu1.setBackground(new java.awt.Color(60, 61, 55));
        EtiquetaMenu1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        EtiquetaMenu1.setForeground(new java.awt.Color(255, 255, 255));
        EtiquetaMenu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaMenu1.setText("Informacion DUTS");
        EtiquetaMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        EtiquetaMenu1.setIconTextGap(20);
        EtiquetaMenu1.setMaximumSize(new java.awt.Dimension(300, 300));
        EtiquetaMenu1.setName(""); // NOI18N

        javax.swing.GroupLayout FondoFotoPerfil2Layout = new javax.swing.GroupLayout(FondoFotoPerfil2);
        FondoFotoPerfil2.setLayout(FondoFotoPerfil2Layout);
        FondoFotoPerfil2Layout.setHorizontalGroup(
            FondoFotoPerfil2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoFotoPerfil2Layout.createSequentialGroup()
                .addGroup(FondoFotoPerfil2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoFotoPerfil2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(FondoFotoPerfil2Layout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addComponent(EtiquetaDutsActuales, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoFotoPerfil2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(ContadorDUTSsemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(FondoFotoPerfil2Layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addComponent(EtiquetaDutsActuales1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FondoFotoPerfil2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(ContadorDUTSmes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(FondoFotoPerfil2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoFotoPerfil2Layout.createSequentialGroup()
                        .addComponent(EtiquetaDutsActuales3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addComponent(ContadorDUTSaño, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaDutsActuales2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ContadorDUTSsemana, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoFotoPerfil2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(EtiquetaMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        FondoFotoPerfil2Layout.setVerticalGroup(
            FondoFotoPerfil2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoFotoPerfil2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(EtiquetaMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(FondoFotoPerfil2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaDutsActuales, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaDutsActuales3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(FondoFotoPerfil2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ContadorDUTSsemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ContadorDUTSaño, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(FondoFotoPerfil2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaDutsActuales2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaDutsActuales1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FondoFotoPerfil2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ContadorDUTSsemana, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ContadorDUTSmes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        FondoPantalla.add(FondoFotoPerfil2);
        FondoFotoPerfil2.setBounds(400, 350, 400, 350);

        EtiquetaSaludoMiPefil.setBackground(new java.awt.Color(60, 61, 55));
        EtiquetaSaludoMiPefil.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        EtiquetaSaludoMiPefil.setForeground(new java.awt.Color(0, 0, 0));
        EtiquetaSaludoMiPefil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaSaludoMiPefil.setText("¡Hola! _______");
        EtiquetaSaludoMiPefil.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        EtiquetaSaludoMiPefil.setIconTextGap(20);
        EtiquetaSaludoMiPefil.setMaximumSize(new java.awt.Dimension(300, 300));
        EtiquetaSaludoMiPefil.setName(""); // NOI18N
        FondoPantalla.add(EtiquetaSaludoMiPefil);
        EtiquetaSaludoMiPefil.setBounds(430, 20, 350, 80);

        TextAreaInfo.setOpaque(true);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(245, 236, 213));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea1.setRows(5);
        jTextArea1.setText("BIenvenido a la plataforma financiera de la unidades \nTecnolgicas de Santander.\nEsto es un prueba de una aplicacion desarrollada \nen Java usando NeatBeans.\n\n\n\nJunio 2025\n");
        jTextArea1.setBorder(null);
        TextAreaInfo.setViewportView(jTextArea1);

        FondoPantalla.add(TextAreaInfo);
        TextAreaInfo.setBounds(410, 110, 380, 200);

        TituloDetalles.setBackground(new java.awt.Color(245, 236, 213));
        TituloDetalles.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TituloDetalles.setForeground(new java.awt.Color(0, 0, 0));
        TituloDetalles.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TituloDetalles.setText("Detalles");
        TituloDetalles.setOpaque(true);
        FondoPantalla.add(TituloDetalles);
        TituloDetalles.setBounds(90, 380, 210, 40);

        jTextArea2.setBackground(new java.awt.Color(245, 236, 213));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea2.setRows(5);
        jTextArea2.setText("Nombre:\nApellido:\nEmail:\nTelefono:\nPrograma Academico:");
        jTextArea2.setBorder(null);
        TextAreaDetalles.setViewportView(jTextArea2);

        FondoPantalla.add(TextAreaDetalles);
        TextAreaDetalles.setBounds(40, 430, 290, 190);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        PantallaMenuInicial pmi = new PantallaMenuInicial(usuarioIngresado);
        pmi.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void BotonEnviarDUTSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEnviarDUTSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonEnviarDUTSActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEnviarDUTS;
    private javax.swing.JLabel ContadorDUTSaño;
    private javax.swing.JLabel ContadorDUTSmes;
    private javax.swing.JLabel ContadorDUTSsemana;
    private javax.swing.JLabel ContadorDUTSsemestre;
    private javax.swing.JLabel EtiquetaDutsActuales;
    private javax.swing.JLabel EtiquetaDutsActuales1;
    private javax.swing.JLabel EtiquetaDutsActuales2;
    private javax.swing.JLabel EtiquetaDutsActuales3;
    private javax.swing.JLabel EtiquetaMenu1;
    private javax.swing.JLabel EtiquetaSaludoMiPefil;
    private javax.swing.JPanel FondoFotoPerfil1;
    private javax.swing.JPanel FondoFotoPerfil2;
    private javax.swing.JPanel FondoPantalla;
    private javax.swing.JScrollPane TextAreaDetalles;
    private javax.swing.JScrollPane TextAreaInfo;
    private javax.swing.JTextField TituloDetalles;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
