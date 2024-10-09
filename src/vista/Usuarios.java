
package vista;

import conexion.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Usuarios extends javax.swing.JPanel {  
    public Usuarios() {
        initComponents();    
        cargarUsuarios();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnicono = new RSMaterialComponent.RSButtonMaterialIconDos();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jpanelRound1 = new modelo.JpanelRound();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jcomboRol = new javax.swing.JComboBox<>();
        disable = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtContra = new javax.swing.JPasswordField();
        jpanelRound2 = new modelo.JpanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbUsuarios = new javax.swing.JTable();
        btnCancelar = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnEditar = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnEliminar = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnGuardar = new RSMaterialComponent.RSButtonMaterialIconDos();

        setBackground(new java.awt.Color(238, 238, 238));

        btnicono.setBackground(new java.awt.Color(14, 76, 117));
        btnicono.setBackgroundHover(new java.awt.Color(14, 76, 117));
        btnicono.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.GROUP);
        btnicono.setRound(25);
        btnicono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniconoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel1.setText("Registro De Usuarios");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(50, 130, 181));
        jLabel4.setText("Complete la Informacion de los Usuarios.");

        jpanelRound1.setBackground(new java.awt.Color(0, 102, 153));
        jpanelRound1.setRoundBottomLeft(25);
        jpanelRound1.setRoundBottomRight(25);
        jpanelRound1.setRoundTopLeft(25);
        jpanelRound1.setRoundTopRight(25);
        jpanelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("Nombre");
        jpanelRound1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 299, -1));
        jpanelRound1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 230, -1));

        jLabel5.setForeground(new java.awt.Color(204, 204, 255));
        jLabel5.setText("Email");
        jpanelRound1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 299, -1));

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jpanelRound1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 230, -1));

        jLabel6.setForeground(new java.awt.Color(204, 204, 255));
        jLabel6.setText("Contraseña");
        jpanelRound1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 210, -1));

        jLabel7.setForeground(new java.awt.Color(204, 204, 255));
        jLabel7.setText("Rol");
        jpanelRound1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 191, -1));

        jcomboRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "usuario", "administrador" }));
        jpanelRound1.add(jcomboRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 128, -1));

        disable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        disable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_invisible_20px_1.png"))); // NOI18N
        disable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        disable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disableMouseClicked(evt);
            }
        });
        jpanelRound1.add(disable, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 40, 40));

        show.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_eye_20px_1.png"))); // NOI18N
        show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        jpanelRound1.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 40, 40));

        jLabel2.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("REGISTRO");
        jpanelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));
        jpanelRound1.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 230, -1));

        jpanelRound2.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound2.setRoundBottomLeft(25);
        jpanelRound2.setRoundBottomRight(25);
        jpanelRound2.setRoundTopLeft(25);
        jpanelRound2.setRoundTopRight(25);

        tbUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Email", "Contraseña", "Rol"
            }
        ));
        tbUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbUsuarios);
        if (tbUsuarios.getColumnModel().getColumnCount() > 0) {
            tbUsuarios.getColumnModel().getColumn(0).setMinWidth(40);
            tbUsuarios.getColumnModel().getColumn(0).setPreferredWidth(40);
            tbUsuarios.getColumnModel().getColumn(0).setMaxWidth(40);
            tbUsuarios.getColumnModel().getColumn(2).setMinWidth(180);
            tbUsuarios.getColumnModel().getColumn(2).setPreferredWidth(180);
            tbUsuarios.getColumnModel().getColumn(2).setMaxWidth(180);
        }

        javax.swing.GroupLayout jpanelRound2Layout = new javax.swing.GroupLayout(jpanelRound2);
        jpanelRound2.setLayout(jpanelRound2Layout);
        jpanelRound2Layout.setHorizontalGroup(
            jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jpanelRound2Layout.setVerticalGroup(
            jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        btnCancelar.setBackground(java.awt.Color.red);
        btnCancelar.setText("Cancelar");
        btnCancelar.setBackgroundHover(new java.awt.Color(50, 130, 181));
        btnCancelar.setEnabled(false);
        btnCancelar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE_FOREVER);
        btnCancelar.setRound(25);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(14, 76, 117));
        btnEditar.setText("Editar");
        btnEditar.setBackgroundHover(new java.awt.Color(50, 130, 181));
        btnEditar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EDIT);
        btnEditar.setRound(25);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(14, 76, 117));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBackgroundHover(new java.awt.Color(50, 130, 181));
        btnEliminar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        btnEliminar.setRound(25);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(14, 76, 117));
        btnGuardar.setText("Guardar");
        btnGuardar.setBackgroundHover(new java.awt.Color(50, 130, 181));
        btnGuardar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        btnGuardar.setRound(25);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnicono, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jpanelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jpanelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addComponent(btnicono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpanelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanelRound2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btniconoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniconoActionPerformed

    }//GEN-LAST:event_btniconoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
     limpiarCampos();
     btnCancelar.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
       int selectedRow = tbUsuarios.getSelectedRow();
    if (selectedRow >= 0) {
        btnCancelar.setEnabled(true);
        txtNombre.setText(tbUsuarios.getValueAt(selectedRow, 1).toString());
        txtEmail.setText(tbUsuarios.getValueAt(selectedRow, 2).toString());
        txtContra.setText(tbUsuarios.getValueAt(selectedRow, 3).toString());
        jcomboRol.setSelectedItem(tbUsuarios.getValueAt(selectedRow, 4).toString());
        btnGuardar.setText("Actualizar");  // Cambiar el texto del botón a "Actualizar"
    } else {
        JOptionPane.showMessageDialog(null, "Selecciona un usuario para editar");
    }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
    int selectedRow = tbUsuarios.getSelectedRow();
    if (selectedRow >= 0) {
        int idUsuario = Integer.parseInt(tbUsuarios.getValueAt(selectedRow, 0).toString());
        Connection con = Database.getConnection();
        try {
            String query = "DELETE FROM Usuarios WHERE id_usuario = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, idUsuario);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario eliminado exitosamente");
            cargarUsuarios();  // Recargar la tabla
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el usuario: " + e.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(null, "Selecciona un usuario para eliminar");
    }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tbUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbUsuariosMouseClicked
        
    }//GEN-LAST:event_tbUsuariosMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    String nombre = txtNombre.getText();
    String email = txtEmail.getText();
    String contraseña = new String(txtContra.getPassword());
    String rol = jcomboRol.getSelectedItem().toString();
    if (nombre.isEmpty() || email.isEmpty() || contraseña.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, rellena todos los campos");
        return;
    }

    Connection con = Database.getConnection();
    if (btnGuardar.getText().equals("Guardar")) {
        // Lógica para guardar un nuevo usuario
        try {
            String query = "INSERT INTO Usuarios (nombre, email, password, rol) VALUES (?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, nombre);
            pst.setString(2, email);
            pst.setString(3, contraseña);
            pst.setString(4, rol);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario registrado exitosamente");
            cargarUsuarios(); 
            limpiarCampos(); 
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar el usuario: " + e.getMessage());
        }
    } else {
        // Lógica para actualizar un usuario existente
        try {
            int idUsuario = Integer.parseInt(tbUsuarios.getValueAt(tbUsuarios.getSelectedRow(), 0).toString());
            String query = "UPDATE Usuarios SET nombre = ?, email = ?, password = ?, rol = ? WHERE id_usuario = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, nombre);
            pst.setString(2, email);
            pst.setString(3, contraseña);
            pst.setString(4, rol);
            pst.setInt(5, idUsuario);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario actualizado exitosamente");
            cargarUsuarios();
            limpiarCampos();
            btnGuardar.setText("Guardar");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el usuario: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void disableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disableMouseClicked
        txtContra.setEchoChar((char)0);
        disable.setVisible(false);
        disable.setEnabled(false);
        show.setEnabled(true);
        show.setEnabled(true);
    }//GEN-LAST:event_disableMouseClicked

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        txtContra.setEchoChar((char)8226);
        disable.setVisible(true);
        disable.setEnabled(true);
        show.setEnabled(false);
        show.setEnabled(false);
    }//GEN-LAST:event_showMouseClicked

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed
    private void cargarUsuarios() {
    Connection con = Database.getConnection();
    DefaultTableModel model = (DefaultTableModel) tbUsuarios.getModel();
    model.setRowCount(0);  // Limpiar la tabla
    try {
        String query = "SELECT * FROM Usuarios";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("id_usuario"),
                rs.getString("nombre"),
                rs.getString("email"),
                rs.getString("password"),
                rs.getString("rol")
            });
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al cargar los usuarios: " + e.getMessage());
    }
    }
    private void limpiarCampos() {
    txtNombre.setText("");
    txtEmail.setText("");
    txtContra.setText("");
    jcomboRol.setSelectedIndex(0);
    btnGuardar.setText("Guardar");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconDos btnCancelar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnEditar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnEliminar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnGuardar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnicono;
    private javax.swing.JLabel disable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcomboRol;
    private modelo.JpanelRound jpanelRound1;
    private modelo.JpanelRound jpanelRound2;
    private javax.swing.JLabel show;
    private javax.swing.JTable tbUsuarios;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
