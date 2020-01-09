package ventanas;

import clases.Photo;
import javax.swing.JFrame;
import java.sql.*;
import clases.Conexion;
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author erick
 */
public class Login extends javax.swing.JFrame {

    public static String user = "";
    String pass = "";
    String imgP;
    ImageIcon myPicture = null;

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        //impide que finalize el programa al cerrar esta interfaz
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuarioL = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        txtPasswordL = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtUsuarioR = new javax.swing.JTextField();
        btnCrear = new javax.swing.JButton();
        lblPerfil = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        rbtFemenino = new javax.swing.JRadioButton();
        rbtMasculino = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtPasswordC = new javax.swing.JPasswordField();
        txtPasswordR = new javax.swing.JPasswordField();
        lblCerrar = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(241, 241, 51));

        jPanel2.setBackground(new java.awt.Color(102, 168, 37));

        jLabel1.setText("Usuario");

        jLabel2.setText("Contraseña");

        btnLogin.setText("Iniciar session");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(227, 227, 46));
        jSeparator1.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel4.setText("Registrarse");

        jLabel5.setText("Nombres");

        jLabel6.setText("Apellidos");

        jLabel7.setText("DNI");

        jLabel8.setText("Nombre usuario");

        jLabel9.setText("Contraseña");

        jLabel10.setText("Confirmar contraseña");

        btnCrear.setText("Crear cuenta");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        lblPerfil.setText("            Subir foto perfil");
        lblPerfil.setOpaque(true);
        lblPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPerfilMouseClicked(evt);
            }
        });

        jLabel11.setText("Genero");

        rbtFemenino.setText("Femenino");

        rbtMasculino.setText("Masculino");

        jLabel12.setText("Telefono");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(13, 13, 13))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUsuarioR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtPasswordC)
                                .addComponent(txtNombres, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                .addComponent(txtApellidos, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDni, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTelefono)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPasswordR, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rbtFemenino)
                                .addGap(37, 37, 37)
                                .addComponent(rbtMasculino)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsuarioL, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPasswordL, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLogin))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuarioL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPasswordL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnLogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUsuarioR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPasswordR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPasswordC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(rbtFemenino)
                    .addComponent(rbtMasculino))
                .addGap(18, 18, 18)
                .addComponent(btnCrear)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        lblCerrar.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        lblCerrar.setText("X");
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
        });

        lblMinimizar.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        lblMinimizar.setText("-");
        lblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel3.setText("Login");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMinimizar)
                .addGap(18, 18, 18)
                .addComponent(lblCerrar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCerrar)
                        .addComponent(lblMinimizar))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        System.exit(0);
        this.dispose();
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void lblPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPerfilMouseClicked
        Photo img = new Photo();
        myPicture = img.browseImage(lblPerfil, imgP);
    }//GEN-LAST:event_lblPerfilMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        user = txtUsuarioL.getText().trim();
        pass = txtPasswordL.getText().trim();

        if (!user.equals("") || !pass.equals("")) {
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "SELECT Nombres, Cargo, Estado FROM Usuarios WHERE Username = '" + user + "'"
                        + "AND Pass = '" + pass + "'");

                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    if(rs.getString("Cargo").equals("Administrador")){
                        if(rs.getString("Estado").equals("Activo")){
                            new Administrador().setVisible(true);
                            this.dispose(); 
                        }else if(rs.getString("Estado").equals("Inactivo")){
                            JOptionPane.showMessageDialog(null, "Usuario desabilitado");
                        }
                        
                    }else if(rs.getString("Cargo").equals("Empleado")){
                        if(rs.getString("Estado").equals("Activo")){
                            new FuncionEmpleado().setVisible(true);
                            this.dispose();
                        }else if(rs.getString("Estado").equals("Inactivo")){
                            JOptionPane.showMessageDialog(null, "Usuario desabilitado");
                        }
                        
                    }
                    
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Datos de acceso incorrecto");
                    txtUsuarioL.setText("");
                    txtPasswordL.setText("");
                }
               

            } catch (HeadlessException | SQLException ex) {
                System.err.println("Error en el boton acceder " + ex);
                JOptionPane.showMessageDialog(null, "Error al iniciar sesion");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
        }
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        Photo img = new Photo();
        String imageName = img.saveImage(myPicture, "images");

        int validacion = 0;
        String nombre, apellidos, dni, telefono, usuario, passw, confirPass, sexo = "", foto;

        nombre = txtNombres.getText().trim();
        apellidos = txtApellidos.getText().trim();
        dni = txtDni.getText().trim();
        usuario = txtUsuarioR.getText().trim();
        passw = txtPasswordR.getText().trim();
        confirPass = txtPasswordC.getText().trim();
        telefono = txtTelefono.getText().trim();
        foto = imageName;

        if (nombre.equals("") && nombre.length() == 0) {
            txtNombres.setBackground(Color.red);
            txtNombres.setText("");
            validacion++;
        }
        if (apellidos.equals("") && apellidos.length() == 0) {
            txtApellidos.setBackground(Color.red);
            txtApellidos.setText("");
            validacion++;
        }
        if (dni.equals("") && dni.length() == 0) {
            txtDni.setBackground(Color.red);
            txtDni.setText("");
            validacion++;
        }
        if (telefono.equals("") && telefono.length() == 0) {
            txtTelefono.setBackground(Color.red);
            txtTelefono.setText("");
            validacion++;
        }
        if (usuario.equals("") && usuario.length() == 0) {
            txtUsuarioR.setBackground(Color.red);
            txtUsuarioR.setText("");
            validacion++;
        }
        if (passw.equals("") && passw.length() == 0) {
            txtPasswordR.setBackground(Color.red);
            txtPasswordR.setText("");
            validacion++;
        }
        if (confirPass.equals("") && confirPass.length() == 0) {
            txtPasswordC.setBackground(Color.red);
            txtPasswordC.setText("");
            validacion++;
        }
        if (!passw.equals(confirPass)) {
            JOptionPane.showMessageDialog(null, "Las contraseñas son incorrectas");
            txtPasswordR.setText("");
            txtPasswordC.setText("");
            validacion++;
        }
        if(!rbtFemenino.isSelected() && !rbtMasculino.isSelected()){
            JOptionPane.showMessageDialog(null, "Debes seleccionar tu Genero");
            validacion++;
        }
            if (rbtFemenino.isSelected()) {
            sexo = "Femenino";
        }
        if (rbtMasculino.isSelected()) {
            sexo = "Masculino";
        }
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("SELECT Username FROM "
                    + "Usuarios WHERE Username = '" + usuario + "'");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                txtUsuarioR.setBackground(Color.red);
                JOptionPane.showMessageDialog(null, "Nombre de usuario no disponible");
                cn.close();
            } else {
                cn.close();
                if (validacion == 0) {
                    
                    try {
                        Connection cn2 = Conexion.conectar();
                        PreparedStatement pst2 = cn2.prepareStatement("INSERT INTO Usuarios VALUES"
                                + " (null, ?, ?, ?, ?, ?, ?, ?, ?, default, default)");
                        pst2.setString(1, txtNombres.getText().toUpperCase().trim());
                        pst2.setString(2, txtApellidos.getText().toUpperCase().trim());
                        pst2.setString(3, txtDni.getText().trim());
                        pst2.setString(4, txtTelefono.getText().trim());
                        pst2.setString(5, txtUsuarioR.getText().trim());
                        pst2.setString(6, txtPasswordR.getText().trim());
                        pst2.setString(7, foto);
                        pst2.setString(8, sexo);
                        pst2.executeUpdate();
                        this.dispose();
                        new Login().setVisible(true);
                        
                        Limpiar();
                        txtNombres.setBackground(Color.GRAY);
                        txtApellidos.setBackground(Color.GRAY);
                        txtDni.setBackground(Color.GRAY);
                        txtTelefono.setBackground(Color.GRAY);
                        txtUsuarioR.setBackground(Color.GRAY);
                        txtPasswordR.setBackground(Color.GRAY);
                        txtPasswordC.setBackground(Color.GRAY);
                        JOptionPane.showMessageDialog(null, "Se registro exitosamente");
                        cn2.close();
                        
                    } catch (HeadlessException | SQLException ex) {
                        System.out.println("Error en registrar usuario " + ex);
                        JOptionPane.showMessageDialog(null, "Error al registrar, Contacte con el administrador");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
                }
            }

        } catch (HeadlessException | SQLException ex) {
            System.err.println("Error al valida nombre " + ex);
            JOptionPane.showMessageDialog(null, "Error al validar, Contacte al administrador");
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JRadioButton rbtFemenino;
    private javax.swing.JRadioButton rbtMasculino;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JPasswordField txtPasswordC;
    private javax.swing.JPasswordField txtPasswordL;
    private javax.swing.JPasswordField txtPasswordR;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuarioL;
    private javax.swing.JTextField txtUsuarioR;
    // End of variables declaration//GEN-END:variables

    public void Limpiar() {
        txtNombres.setText("");
        txtApellidos.setText("");
        txtDni.setText("");
        txtTelefono.setText("");
        txtPasswordC.setText("");
        txtPasswordR.setText("");
        txtUsuarioR.setText("");
        rbtFemenino.setSelected(false);
        rbtMasculino.setSelected(false);
    }
}
