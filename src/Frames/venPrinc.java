package Frames;

import javax.swing.JOptionPane;

public class venPrinc extends javax.swing.JFrame {

    static String nombreA;

    public venPrinc() {
        initComponents();
        setLocationRelativeTo(null);
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txttitulo = new javax.swing.JLabel();
        txtusuario = new javax.swing.JLabel();
        txtcontraseña = new javax.swing.JLabel();
        idUser = new javax.swing.JTextField();
        passwordUser = new javax.swing.JPasswordField();
        btnListo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        txttitulo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 80)); // NOI18N
        txttitulo.setForeground(new java.awt.Color(255, 255, 255));
        txttitulo.setText("Pizzopolis");
        jPanel1.add(txttitulo);
        txttitulo.setBounds(20, 20, 380, 110);

        txtusuario.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtusuario.setForeground(new java.awt.Color(255, 255, 255));
        txtusuario.setText("Usuario");
        jPanel1.add(txtusuario);
        txtusuario.setBounds(40, 320, 70, 20);

        txtcontraseña.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtcontraseña.setForeground(new java.awt.Color(255, 255, 255));
        txtcontraseña.setText("Contraseña");
        jPanel1.add(txtcontraseña);
        txtcontraseña.setBounds(40, 350, 100, 23);

        idUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        idUser.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        idUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idUserActionPerformed(evt);
            }
        });
        jPanel1.add(idUser);
        idUser.setBounds(180, 320, 140, 23);

        passwordUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordUserKeyPressed(evt);
            }
        });
        jPanel1.add(passwordUser);
        passwordUser.setBounds(180, 350, 140, 20);

        btnListo.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        btnListo.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnListo.setForeground(new java.awt.Color(255, 255, 255));
        btnListo.setText("Listo");
        btnListo.setAutoscrolls(true);
        btnListo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnListo.setContentAreaFilled(false);
        btnListo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListo.setFocusPainted(false);
        btnListo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListoActionPerformed(evt);
            }
        });
        jPanel1.add(btnListo);
        btnListo.setBounds(140, 380, 80, 21);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/index.jpg"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 410, 430);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListoActionPerformed
        String nom = idUser.getText();
        String pass = passwordUser.getText();

        if ((nom.equals("UTH")) && (pass.equals("uth"))) {
            nombreA = "Administrador";
            Opciones op = new Opciones();
            op.setVisible(true);
            op.setLocationRelativeTo(null);
            this.dispose();

            op.verCocina.setEnabled(true);
        } else if ((nom.equals("Isis")) && (pass.equals("isis"))) {
            nombreA = "Isis";
            Opciones op = new Opciones();
            op.setVisible(true);
            op.setLocationRelativeTo(null);
            this.dispose();
        } else if ((nom.equals("Gustavo")) && (pass.equals("gl"))) {
            nombreA = "Gustavo";
            Opciones op = new Opciones();
            op.setVisible(true);
            op.setLocationRelativeTo(null);
            this.dispose();
            op.verCocina.setEnabled(false);
        } else if ((nom.equals("Belsabeth")) && (pass.equals("bs"))) {
            nombreA = "Belsabeth";
            Opciones op = new Opciones();
            op.setVisible(true);
            op.setLocationRelativeTo(null);
            this.dispose();
            op.verCocina.setEnabled(false);
        } else if ((nom.equals("Cupcake")) && (pass.equals("bb"))) {
                nombreA = "Cupcake";
                Opciones op = new Opciones();
                op.setVisible(true);
                op.setLocationRelativeTo(null);
                this.dispose();
                op.verCocina.setEnabled(false);
          
        } else {
                JOptionPane.showMessageDialog(null, "Datos incorrectos, verifique nuevamente.");
                JOptionPane.showMessageDialog(null, "si no tiene usuario, como predeterminado use:");
                JOptionPane.showMessageDialog(null, "UTH como usuario ------- uth como contraseña. Recuerde uso de mayuscula");
            }
    }//GEN-LAST:event_btnListoActionPerformed

    private void idUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idUserActionPerformed

    private void passwordUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordUserKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordUserKeyPressed

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
            java.util.logging.Logger.getLogger(venPrinc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(venPrinc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(venPrinc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(venPrinc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new venPrinc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListo;
    public javax.swing.JTextField idUser;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPasswordField passwordUser;
    private javax.swing.JLabel txtcontraseña;
    private javax.swing.JLabel txttitulo;
    private javax.swing.JLabel txtusuario;
    // End of variables declaration//GEN-END:variables
}
