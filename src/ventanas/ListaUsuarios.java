package ventanas;
import java.sql.*;
import clases.Conexion;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author erick
 */
public class ListaUsuarios extends javax.swing.JFrame {

    public static String userUpdate = "";
    //configurar la tabla 
    DefaultTableModel model = new DefaultTableModel();
    
    public ListaUsuarios() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("SELECT idUsuarios, Nombres, "
                    + "Apellidos, DNI, Telefono, Sexo, Username, Estado FROM Usuarios");
                    
            ResultSet rs = pst.executeQuery();
            tblUsuarios = new JTable(model);
            jScrollPane1.setViewportView(tblUsuarios);
            
            model.addColumn("Nro Usuario");
            model.addColumn("Nombres");
            model.addColumn("Apellidos");
            model.addColumn("DNI");
            model.addColumn("Telefono");
            model.addColumn("Sexo");
            model.addColumn("Username");
            model.addColumn("Estado");
            
            while(rs.next()){
                Object[] dato = new Object[8];
                for(int i=0; i<8; i++){
                    dato[i] = rs.getObject(i + 1);
                }
                model.addRow(dato);
            }
            cn.close();
            
        } catch (SQLException e) {
            System.out.println("Error al llenar tabla "+e);
            JOptionPane.showMessageDialog(null, "contacte con el administrador");
        }
        
        tblUsuarios.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                int fila = tblUsuarios.rowAtPoint(e.getPoint());
                int columna = 6;
                if(fila > -1){
                    userUpdate = (String)model.getValueAt(fila, columna);
                    dispose();
                    new ModificarUsuario().setVisible(true);
                    
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("lista de usuarios");

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblUsuarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUsuarios;
    // End of variables declaration//GEN-END:variables
}
