package ventanas;

import clases.Conexion;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author erick
 */
public class ListaRecargas extends javax.swing.JFrame {

    public static int dniUp;
    DefaultTableModel model = new DefaultTableModel();

    public ListaRecargas() {
        initComponents();
        dniUp = GestionarCliente.dni;
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        try {
            Connection cn = Conexion.conectar();
            CallableStatement cst = cn.prepareCall("{call spClienteDetalle()}");
            ResultSet rs = cst.executeQuery();

            tblRecargas = new JTable(model);
            jScrollPane1.setViewportView(tblRecargas);

            model.addColumn("Nombres");
            model.addColumn("Apellidos");
            model.addColumn("DNI");
            model.addColumn("Tipo de Cliente");
            model.addColumn("Fecha de recarga");
            model.addColumn("Monto de recarga");
            model.addColumn("tipo de pago");

            while (rs.next()) {
                Object[] dato = new Object[7];
                for (int i = 0; i < 7; i++) {
                    dato[i] = rs.getObject(i + 1);
                }
                model.addRow(dato);

            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla " + e);
            JOptionPane.showMessageDialog(null, "Contacte con el administrador");
        }

        tblRecargas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = tblRecargas.rowAtPoint(e.getPoint());
                int columna = 2;
                if (fila > -1) {
                    dniUp = (int) model.getValueAt(fila, columna);
                    dispose();
                    new ModificarRecarga().setVisible(true);

                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecargas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Lista de recargas realizadas");

        tblRecargas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblRecargas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 887, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaRecargas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRecargas;
    // End of variables declaration//GEN-END:variables
}
