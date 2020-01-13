package ventanas;

import org.jfree.chart.ChartPanel;
import clases.Reporte;
import javax.swing.JOptionPane;
import clases.ConvertirFecha;
/**
 *
 * @author erick
 */
public class ReporteGrafico extends javax.swing.JFrame {

    
    public ReporteGrafico() {
        initComponents();
        this.setLocationRelativeTo(null);    
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbxReporte = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbxReporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------Seleccione tu consulta----------", "Clientes", "Recargas" }));
        cbxReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(cbxReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1083, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(507, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxReporteActionPerformed
        ConvertirFecha cf = new ConvertirFecha();
        int codigo = cbxReporte.getSelectedIndex();
        switch(codigo){
            case 1: Reporte rp = new Reporte();
                    rp.Report();
                    ChartPanel cp = new ChartPanel(rp.getGraf());
                    add(cp);
                    cp.setBounds(15, 40,1280, 500);                 
            break;
            case 2: JOptionPane.showMessageDialog(null, "seleccione un");
            JOptionPane.showMessageDialog(null, cf.Fecha("2020-02-10 00:00:00", "yyyy"));
            break;
            default: 
                break;
        }
    }//GEN-LAST:event_cbxReporteActionPerformed

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
    // End of variables declaration//GEN-END:variables
}
