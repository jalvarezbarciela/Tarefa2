/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa2;

/**
 *
 * @author jalvarezbarciela
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        etiqueta1 = new javax.swing.JLabel();
        etiquetaUsuario = new javax.swing.JLabel();
        textoUsuario = new javax.swing.JTextField();
        etiquetaNombre = new javax.swing.JLabel();
        textoNombre = new javax.swing.JTextField();
        etiquetaID = new javax.swing.JLabel();
        textoID = new javax.swing.JTextField();
        etiquetaGrupo = new javax.swing.JLabel();
        cajaGrupo = new javax.swing.JComboBox<>();
        etiquetaDireccion = new javax.swing.JLabel();
        textoDireccion = new javax.swing.JTextField();
        campoContraseña = new javax.swing.JPasswordField();
        etiquetaContraseña = new javax.swing.JLabel();
        etiquetaConfirmar = new javax.swing.JLabel();
        campoConfirmar = new javax.swing.JPasswordField();
        etiquetaLoginShell = new javax.swing.JLabel();
        cajaLoginShell = new javax.swing.JComboBox<>();
        botonCancelar = new javax.swing.JButton();
        botonOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(51, 51, 51));

        etiqueta1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        etiqueta1.setForeground(new java.awt.Color(255, 255, 255));
        etiqueta1.setText("Create a new user");

        etiquetaUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        etiquetaUsuario.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaUsuario.setText("User Name:");

        textoUsuario.setBackground(new java.awt.Color(204, 204, 204));
        textoUsuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textoUsuario.setForeground(new java.awt.Color(0, 0, 0));
        textoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoUsuarioActionPerformed(evt);
            }
        });

        etiquetaNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        etiquetaNombre.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaNombre.setText("Full Name:");

        textoNombre.setBackground(new java.awt.Color(204, 204, 204));
        textoNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textoNombre.setForeground(new java.awt.Color(0, 0, 0));
        textoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNombreActionPerformed(evt);
            }
        });

        etiquetaID.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        etiquetaID.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaID.setText("User ID:");

        textoID.setBackground(new java.awt.Color(204, 204, 204));
        textoID.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textoID.setForeground(new java.awt.Color(0, 0, 0));
        textoID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoIDActionPerformed(evt);
            }
        });

        etiquetaGrupo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        etiquetaGrupo.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaGrupo.setText("Group:");

        cajaGrupo.setBackground(new java.awt.Color(204, 204, 204));
        cajaGrupo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cajaGrupo.setForeground(new java.awt.Color(0, 0, 0));
        cajaGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Staff", "Otro" }));
        cajaGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaGrupoActionPerformed(evt);
            }
        });

        etiquetaDireccion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        etiquetaDireccion.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaDireccion.setText("Home Directory:");

        textoDireccion.setBackground(new java.awt.Color(204, 204, 204));
        textoDireccion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textoDireccion.setForeground(new java.awt.Color(0, 0, 0));
        textoDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoDireccionActionPerformed(evt);
            }
        });

        campoContraseña.setBackground(new java.awt.Color(204, 204, 204));
        campoContraseña.setForeground(new java.awt.Color(0, 0, 0));
        campoContraseña.setText("jPasswordField1");
        campoContraseña.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        campoContraseña.setMinimumSize(new java.awt.Dimension(4, 23));
        campoContraseña.setSelectedTextColor(new java.awt.Color(51, 51, 255));
        campoContraseña.setSelectionColor(new java.awt.Color(204, 204, 204));
        campoContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoContraseñaActionPerformed(evt);
            }
        });

        etiquetaContraseña.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        etiquetaContraseña.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaContraseña.setText("Password:");

        etiquetaConfirmar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        etiquetaConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaConfirmar.setText("Confirm:");

        campoConfirmar.setBackground(new java.awt.Color(204, 204, 204));
        campoConfirmar.setForeground(new java.awt.Color(0, 0, 0));
        campoConfirmar.setText("jPasswordField1");
        campoConfirmar.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        campoConfirmar.setMinimumSize(new java.awt.Dimension(4, 23));
        campoConfirmar.setSelectedTextColor(new java.awt.Color(51, 51, 255));
        campoConfirmar.setSelectionColor(new java.awt.Color(204, 204, 204));
        campoConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoConfirmarActionPerformed(evt);
            }
        });

        etiquetaLoginShell.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        etiquetaLoginShell.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaLoginShell.setText("Login Shell:");

        cajaLoginShell.setBackground(new java.awt.Color(204, 204, 204));
        cajaLoginShell.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cajaLoginShell.setForeground(new java.awt.Color(0, 0, 0));
        cajaLoginShell.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "/bin/ksh", " " }));
        cajaLoginShell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaLoginShellActionPerformed(evt);
            }
        });

        botonCancelar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botonCancelar.setText("Cancel");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        botonOK.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botonOK.setText("OK");
        botonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(etiquetaConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(campoConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(campoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                        .addComponent(etiquetaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                        .addComponent(etiquetaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(101, 101, 101)
                                        .addComponent(textoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(etiquetaID, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(etiquetaGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(textoID)
                                            .addComponent(cajaGrupo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(textoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(etiquetaDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(etiqueta1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etiquetaContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(etiquetaLoginShell)
                                        .addGap(111, 111, 111)
                                        .addComponent(cajaLoginShell, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(botonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiqueta1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textoUsuario)
                    .addComponent(etiquetaUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(textoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaID, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(textoID, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cajaGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(etiquetaGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(textoDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaLoginShell, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(cajaLoginShell, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(124, 124, 124)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoUsuarioActionPerformed

    private void textoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNombreActionPerformed

    private void textoIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoIDActionPerformed

    private void cajaGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaGrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaGrupoActionPerformed

    private void textoDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoDireccionActionPerformed

    private void campoContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoContraseñaActionPerformed

    private void campoConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoConfirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoConfirmarActionPerformed

    private void cajaLoginShellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaLoginShellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaLoginShellActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed

  textoID.setText(" ");
  textoNombre.setText(" ");
  textoUsuario.setText(" ");
  campoConfirmar.setText(" ");
  campoContraseña.setText(" ");
  
  
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOKActionPerformed
    dispose();
    }//GEN-LAST:event_botonOKActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonOK;
    private javax.swing.JComboBox<String> cajaGrupo;
    private javax.swing.JComboBox<String> cajaLoginShell;
    private javax.swing.JPasswordField campoConfirmar;
    private javax.swing.JPasswordField campoContraseña;
    private javax.swing.JLabel etiqueta1;
    private javax.swing.JLabel etiquetaConfirmar;
    private javax.swing.JLabel etiquetaContraseña;
    private javax.swing.JLabel etiquetaDireccion;
    private javax.swing.JLabel etiquetaGrupo;
    private javax.swing.JLabel etiquetaID;
    private javax.swing.JLabel etiquetaLoginShell;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaUsuario;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField textoDireccion;
    private javax.swing.JTextField textoID;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JTextField textoUsuario;
    // End of variables declaration//GEN-END:variables
}
