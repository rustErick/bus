package ventanas;

import org.jfree.chart.ChartPanel;
import clases.Reporte;
import javax.swing.JOptionPane;
import clases.ConvertirFecha;
import javax.swing.WindowConstants;

/**
 *
 * @author erick
 */
public class ReporteGrafico extends javax.swing.JFrame {

    public ReporteGrafico() {
        initComponents();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbxReporte = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbxReporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------Seleccione tu consulta----------", "Clientes", "Recargas" }));
        cbxReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxReporteMouseClicked(evt);
            }
        });
        cbxReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 713, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 383, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(cbxReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1083, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxReporteActionPerformed
        try {
            
        
        int codigo = cbxReporte.getSelectedIndex();
        
        switch (codigo) {
            
            case 1: 
                JOptionPane.showMessageDialog(null, "Te mostrare los reportes de los clientes");
                Reporte rp = new Reporte();
                    rp.Cliente();
                    ChartPanel cp = new ChartPanel(rp.getGraf());
                    add(cp);
                    cp.setBounds(15, 40, 1280, 500);  
                    
                break;
                
            case 2: 
                
                JOptionPane.showMessageDialog(null, "Te mostrare los reportes de las recargas");
                Reporte rp2 = new Reporte();
                    rp2.Recarga();
                    ChartPanel cp2 = new ChartPanel(rp2.getGraf());
                    add(cp2);
                    cp2.setBounds(15, 40, 1280, 500);
                break;
                
            default: 
                break;
        }
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_cbxReporteActionPerformed

    private void cbxReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxReporteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxReporteMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReporteGrafico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxReporte;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
