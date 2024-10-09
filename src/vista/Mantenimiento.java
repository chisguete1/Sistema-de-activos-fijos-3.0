package vista;
import conexion.Database;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Mantenimiento extends javax.swing.JPanel {
    public Mantenimiento() {
        initComponents();   
        cargarTablaMantenimientos();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnicono = new RSMaterialComponent.RSButtonMaterialIconDos();
        jpanelRound1 = new modelo.JpanelRound();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dateFecha = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        TipoM = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtRealizado_por = new javax.swing.JTextField();
        idActivo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNombreA = new javax.swing.JTextField();
        btnBuscar = new RSMaterialComponent.RSButtonMaterialIconDos();
        jpanelRound4 = new modelo.JpanelRound();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbMantenimientos = new javax.swing.JTable();
        btnGuardar = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnEditar = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnEliminar = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnCancelar = new RSMaterialComponent.RSButtonMaterialIconDos();

        setBackground(new java.awt.Color(238, 238, 238));
        setPreferredSize(new java.awt.Dimension(982, 740));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel1.setText("Mantenimiento de Activos");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(50, 130, 181));
        jLabel4.setText("Complete la Informacion de Mantenimiento.");

        btnicono.setBackground(new java.awt.Color(14, 76, 117));
        btnicono.setBackgroundHover(new java.awt.Color(14, 76, 117));
        btnicono.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.LOCATION_CITY);
        btnicono.setRound(25);
        btnicono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniconoActionPerformed(evt);
            }
        });

        jpanelRound1.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound1.setRoundBottomLeft(25);
        jpanelRound1.setRoundBottomRight(25);
        jpanelRound1.setRoundTopLeft(25);
        jpanelRound1.setRoundTopRight(25);

        jLabel3.setText("ID del Activo");

        jLabel6.setText("Tipo de Mantenimiento");

        jLabel7.setText("Descripcion");

        jLabel2.setText("Fecha de Mantenimiento");

        TipoM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "preventivo", "correctivo" }));

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        jLabel5.setText("Costo ");

        jLabel8.setText("Realizado por:");

        jLabel9.setText("Nombre del Activo");

        txtNombreA.setEditable(false);

        btnBuscar.setBackground(new java.awt.Color(213, 137, 137));
        btnBuscar.setText("Buscar");
        btnBuscar.setBackgroundHover(new java.awt.Color(14, 76, 117));
        btnBuscar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        btnBuscar.setRound(25);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelRound1Layout = new javax.swing.GroupLayout(jpanelRound1);
        jpanelRound1.setLayout(jpanelRound1Layout);
        jpanelRound1Layout.setHorizontalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpanelRound1Layout.createSequentialGroup()
                        .addComponent(txtNombreA, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jpanelRound1Layout.createSequentialGroup()
                            .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(idActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtRealizado_por, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpanelRound1Layout.createSequentialGroup()
                            .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TipoM, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jpanelRound1Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2))))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jpanelRound1Layout.setVerticalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRound1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idActivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRound1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TipoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRealizado_por, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpanelRound4.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound4.setRoundBottomLeft(25);
        jpanelRound4.setRoundBottomRight(25);
        jpanelRound4.setRoundTopLeft(25);
        jpanelRound4.setRoundTopRight(25);

        tbMantenimientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID M.", "ID A.", "Nombre del Activo", "Fecha de Mantenimiento", "Tipo de Mantenimiento", "Costo", "Descripcion", "Realizado por"
            }
        ));
        tbMantenimientos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMantenimientosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbMantenimientos);
        if (tbMantenimientos.getColumnModel().getColumnCount() > 0) {
            tbMantenimientos.getColumnModel().getColumn(0).setMinWidth(50);
            tbMantenimientos.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbMantenimientos.getColumnModel().getColumn(0).setMaxWidth(50);
            tbMantenimientos.getColumnModel().getColumn(1).setMinWidth(50);
            tbMantenimientos.getColumnModel().getColumn(1).setPreferredWidth(50);
            tbMantenimientos.getColumnModel().getColumn(1).setMaxWidth(50);
        }

        javax.swing.GroupLayout jpanelRound4Layout = new javax.swing.GroupLayout(jpanelRound4);
        jpanelRound4.setLayout(jpanelRound4Layout);
        jpanelRound4Layout.setHorizontalGroup(
            jpanelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRound4Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jpanelRound4Layout.setVerticalGroup(
            jpanelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRound4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
        );

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

        btnCancelar.setBackground(java.awt.Color.red);
        btnCancelar.setText("Cancelar");
        btnCancelar.setBackgroundHover(new java.awt.Color(14, 76, 117));
        btnCancelar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE_SWEEP);
        btnCancelar.setRound(25);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jpanelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(113, 113, 113)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jpanelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnicono, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addComponent(btnicono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpanelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpanelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(237, 237, 237))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btniconoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniconoActionPerformed

    }//GEN-LAST:event_btniconoActionPerformed

    private void tbMantenimientosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMantenimientosMouseClicked

    }//GEN-LAST:event_tbMantenimientosMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    String accion = btnGuardar.getText();
    
    if (!validarCampos()) {
        return; // Si la validación falla, salir del método
    }
    
    if (accion.equals("Guardar")) {
        try (Connection conn = Database.getConnection()) {
            String sql = "INSERT INTO Mantenimiento (id_activo, fecha_mantenimiento, tipo_mantenimiento, descripcion, costo, realizado_por) VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setInt(1, Integer.parseInt(idActivo.getText().trim()));
                pstmt.setDate(2, new java.sql.Date(dateFecha.getDate().getTime()));
                pstmt.setString(3, TipoM.getSelectedItem().toString());
                pstmt.setString(4, txtDescripcion.getText().trim());
                pstmt.setBigDecimal(5, new BigDecimal(txtCosto.getText().trim()));
                pstmt.setString(6, txtRealizado_por.getText().trim());

                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Mantenimiento guardado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                limpiarCampos();
                cargarTablaMantenimientos();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar el mantenimiento: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else if (accion.equals("Actualizar")) {
        int idMantenimiento = Integer.parseInt(tbMantenimientos.getValueAt(tbMantenimientos.getSelectedRow(), 0).toString());
        try (Connection conn = Database.getConnection()) {
            String sql = "UPDATE Mantenimiento SET id_activo = ?, fecha_mantenimiento = ?, tipo_mantenimiento = ?, descripcion = ?, costo = ?, realizado_por = ? WHERE id_mantenimiento = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setInt(1, Integer.parseInt(idActivo.getText().trim()));
                pstmt.setDate(2, new java.sql.Date(dateFecha.getDate().getTime())); 
                pstmt.setString(3, TipoM.getSelectedItem().toString());
                pstmt.setString(4, txtDescripcion.getText().trim());
                pstmt.setBigDecimal(5, new BigDecimal(txtCosto.getText().trim()));
                pstmt.setString(6, txtRealizado_por.getText().trim());
                pstmt.setInt(7, idMantenimiento);

                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Mantenimiento actualizado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                cargarTablaMantenimientos();
                limpiarCampos();
                idActivo.setEditable(true);
                btnGuardar.setText("Guardar");
                btnBuscar.setEnabled(true);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al actualizar mantenimiento", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
     int selectedRow = tbMantenimientos.getSelectedRow();

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Seleccione un registro para editar.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    btnBuscar.setEnabled(false);
    idActivo.setText(tbMantenimientos.getValueAt(selectedRow, 1).toString());
    txtNombreA.setText(tbMantenimientos.getValueAt(selectedRow, 2).toString());
    dateFecha.setDate((Date) tbMantenimientos.getValueAt(selectedRow, 3));
    TipoM.setSelectedItem(tbMantenimientos.getValueAt(selectedRow, 4).toString());
    txtCosto.setText(tbMantenimientos.getValueAt(selectedRow, 5).toString());
    txtDescripcion.setText(tbMantenimientos.getValueAt(selectedRow, 6).toString());
    txtRealizado_por.setText(tbMantenimientos.getValueAt(selectedRow, 7).toString());
    btnGuardar.setText("Actualizar"); 
    idActivo.setEditable(false);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int selectedRow = tbMantenimientos.getSelectedRow();

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Seleccione un registro para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int idMantenimiento = (int) tbMantenimientos.getValueAt(selectedRow, 0);

    int confirm = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea eliminar este registro?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        try (Connection conn = Database.getConnection()) {
            String sql = "DELETE FROM Mantenimiento WHERE id_mantenimiento = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setInt(1, idMantenimiento);
                pstmt.executeUpdate();

                JOptionPane.showMessageDialog(this, "Mantenimiento eliminado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                cargarTablaMantenimientos();
                limpiarCampos();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al eliminar el mantenimiento: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
    limpiarCampos();
    btnBuscar.setEnabled(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
         String id = idActivo.getText().trim();

    if (id.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Ingrese el ID del activo.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try (Connection conn = Database.getConnection()) {
        String sql = "SELECT nombre_activo FROM Activos WHERE id_activo = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, Integer.parseInt(id));
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                txtNombreA.setText(rs.getString("nombre_activo"));
                idActivo.setEditable(false);
            } else {
                JOptionPane.showMessageDialog(this, "Activo no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al buscar el activo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El ID debe ser numérico.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnBuscarActionPerformed
    private void cargarTablaMantenimientos() {
    DefaultTableModel model = (DefaultTableModel) tbMantenimientos.getModel();
    model.setRowCount(0); // Limpiar tabla

    try (Connection conn = Database.getConnection()) {
        String sql = "SELECT m.id_mantenimiento, a.id_activo, a.nombre_activo, m.fecha_mantenimiento, m.tipo_mantenimiento, m.costo, m.descripcion, m.realizado_por " +
                     "FROM Mantenimiento m JOIN Activos a ON m.id_activo = a.id_activo";
        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("id_mantenimiento"),
                    rs.getInt("id_activo"),
                    rs.getString("nombre_activo"),
                    rs.getDate("fecha_mantenimiento"),
                    rs.getString("tipo_mantenimiento"),
                    rs.getBigDecimal("costo"),
                    rs.getString("descripcion"),
                    rs.getString("realizado_por")
                });
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al cargar los mantenimientos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }
    private void limpiarCampos() {
    idActivo.setText("");
    txtNombreA.setText("");
    dateFecha.setDate(null);
    TipoM.setSelectedIndex(0);
    txtCosto.setText("");
    txtDescripcion.setText("");
    txtRealizado_por.setText("");
    btnGuardar.setText("Guardar");
    idActivo.setEditable(true);
    }
    private boolean validarCampos() {
    String id = idActivo.getText().trim();
    String nombre = txtNombreA.getText().trim();
    Date fecha = dateFecha.getDate();
    String costo = txtCosto.getText().trim();
    String realizadoPor = txtRealizado_por.getText().trim();

    if (id.isEmpty() || nombre.isEmpty() || fecha == null || costo.isEmpty() || realizadoPor.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Todos los campos deben estar completos.", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    try {
        Integer.parseInt(id); 
        new BigDecimal(costo); 
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El ID del activo y el costo deben ser numéricos.", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> TipoM;
    private RSMaterialComponent.RSButtonMaterialIconDos btnBuscar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnCancelar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnEditar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnEliminar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnGuardar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnicono;
    private com.toedter.calendar.JDateChooser dateFecha;
    private javax.swing.JTextField idActivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private modelo.JpanelRound jpanelRound1;
    private modelo.JpanelRound jpanelRound4;
    private javax.swing.JTable tbMantenimientos;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtNombreA;
    private javax.swing.JTextField txtRealizado_por;
    // End of variables declaration//GEN-END:variables
}
