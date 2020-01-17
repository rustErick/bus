package ventanas;

import javax.swing.WindowConstants;

/**
 *
 * @author erick
 */
public class FuncionEmpleado extends javax.swing.JFrame {

    
    public FuncionEmpleado() {
        initComponents();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblRegistrarCliente = new javax.swing.JLabel();
        lblRegistrarRecargar = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        lblListaRecargas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Registro de clientes y Recarga");

        lblRegistrarCliente.setBackground(new java.awt.Color(223, 237, 225));
        lblRegistrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuarios.png"))); // NOI18N
        lblRegistrarCliente.setOpaque(true);
        lblRegistrarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrarClienteMouseClicked(evt);
            }
        });

        lblRegistrarRecargar.setBackground(new java.awt.Color(206, 41, 41));
        lblRegistrarRecargar.setText("Registrar Recarga");
        lblRegistrarRecargar.setOpaque(true);
        lblRegistrarRecargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrarRecargarMouseClicked(evt);
            }
        });

        btnLogin.setText("Iniciar seccion con otra cuenta");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblListaRecargas.setBackground(new java.awt.Color(91, 231, 104));
        lblListaRecargas.setText("Registro de Recargas");
        lblListaRecargas.setOpaque(true);
        lblListaRecargas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblListaRecargasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(341, Short.MAX_VALUE)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lblRegistrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(lblRegistrarRecargar, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(lblListaRecargas, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRegistrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRegistrarRecargar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(lblListaRecargas, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btnLogin)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblRegistrarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarClienteMouseClicked
        new GestionarCliente().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblRegistrarClienteMouseClicked

    private void lblRegistrarRecargarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarRecargarMouseClicked
        new GestionarRecarga().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_lblRegistrarRecargarMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void lblListaRecargasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblListaRecargasMouseClicked
        new ListaRecargas().setVisible(true);
    }//GEN-LAST:event_lblListaRecargasMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncionEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblListaRecargas;
    private javax.swing.JLabel lblRegistrarCliente;
    private javax.swing.JLabel lblRegistrarRecargar;
    // End of variables declaration//GEN-END:variables
}
