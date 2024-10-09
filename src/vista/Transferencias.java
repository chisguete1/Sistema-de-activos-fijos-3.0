package vista;
import conexion.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Transferencias extends javax.swing.JPanel {
    Connection conn;
    DefaultTableModel modelo;
    public Transferencias() {
        initComponents(); 
        conn = Database.getConnection();
        cargarCarrerasDestino();
        cargarAulasDestino();
        cargarTransferencias();
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
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        dateFecha = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        AulaD = new javax.swing.JComboBox<>();
        CarreraD = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMotivo = new javax.swing.JTextArea();
        idActivo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        NombreA = new javax.swing.JTextField();
        btnBuscar = new RSMaterialComponent.RSButtonMaterialIconDos();
        txtCarreraO = new javax.swing.JTextField();
        txtAulaO = new javax.swing.JTextField();
        jpanelRound4 = new modelo.JpanelRound();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbTransferencias = new javax.swing.JTable();
        btnGuardar = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnCancelar = new RSMaterialComponent.RSButtonMaterialIconDos();

        setBackground(new java.awt.Color(238, 238, 238));
        setPreferredSize(new java.awt.Dimension(982, 740));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel1.setText("Transferencias de Activos Fijos");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(50, 130, 181));
        jLabel4.setText("Complete la Informacion de las Transferencias.");

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

        jLabel6.setText("Carrera de Origen");

        jLabel7.setText("Aula de Origen");

        jLabel8.setText("Carrrera de Destino");

        jLabel10.setText("Aula de Destino");

        jLabel2.setText("Fecha de transferencia");

        jLabel5.setText("Motivo");

        txtMotivo.setColumns(20);
        txtMotivo.setRows(5);
        jScrollPane1.setViewportView(txtMotivo);

        jLabel9.setText("Nombre");

        NombreA.setEditable(false);

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

        txtCarreraO.setEditable(false);

        txtAulaO.setEditable(false);

        javax.swing.GroupLayout jpanelRound1Layout = new javax.swing.GroupLayout(jpanelRound1);
        jpanelRound1.setLayout(jpanelRound1Layout);
        jpanelRound1Layout.setHorizontalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRound1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpanelRound1Layout.createSequentialGroup()
                        .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanelRound1Layout.createSequentialGroup()
                                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6))
                                .addGap(26, 202, Short.MAX_VALUE)))
                        .addGap(17, 17, 17))
                    .addGroup(jpanelRound1Layout.createSequentialGroup()
                        .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanelRound1Layout.createSequentialGroup()
                                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CarreraD, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(AulaD, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpanelRound1Layout.createSequentialGroup()
                                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCarreraO, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idActivo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NombreA, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7)
                                    .addComponent(dateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                    .addGroup(jpanelRound1Layout.createSequentialGroup()
                                        .addComponent(txtAulaO)
                                        .addGap(5, 5, 5)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jpanelRound1Layout.setVerticalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRound1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idActivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRound1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dateFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(NombreA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCarreraO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAulaO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CarreraD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AulaD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpanelRound4.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound4.setRoundBottomLeft(25);
        jpanelRound4.setRoundBottomRight(25);
        jpanelRound4.setRoundTopLeft(25);
        jpanelRound4.setRoundTopRight(25);

        tbTransferencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Transferencia", "ID Activo", "Nombre", "Fecha", "Carrera O", "Aula O", "Carrera D", "Aula D", "Motivo"
            }
        ));
        tbTransferencias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTransferenciasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbTransferencias);
        if (tbTransferencias.getColumnModel().getColumnCount() > 0) {
            tbTransferencias.getColumnModel().getColumn(0).setMinWidth(50);
            tbTransferencias.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbTransferencias.getColumnModel().getColumn(0).setMaxWidth(50);
            tbTransferencias.getColumnModel().getColumn(1).setMinWidth(50);
            tbTransferencias.getColumnModel().getColumn(1).setPreferredWidth(50);
            tbTransferencias.getColumnModel().getColumn(1).setMaxWidth(50);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jpanelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpanelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnicono, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))))
                .addContainerGap(64, Short.MAX_VALUE))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jpanelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(260, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btniconoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniconoActionPerformed

    }//GEN-LAST:event_btniconoActionPerformed

    private void tbTransferenciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTransferenciasMouseClicked

    }//GEN-LAST:event_tbTransferenciasMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String idActivoTexto = idActivo.getText().trim();
        Date fechaTransferencia = dateFecha.getDate();
        String motivo = txtMotivo.getText().trim();
        String carreraDestino = CarreraD.getSelectedItem().toString();
        String aulaDestino = AulaD.getSelectedItem().toString();

        if (!idActivoTexto.isEmpty() && fechaTransferencia != null && !motivo.isEmpty()) {
            if (btnGuardar.getText().equals("Guardar")) {
                try {
                    String insertQuery = "INSERT INTO Transferencias (id_activo, fecha_transferencia, id_carrera_origen, id_aula_origen, id_carrera_destino, id_aula_destino, motivo) VALUES (?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement stmtInsert = conn.prepareStatement(insertQuery);
                    stmtInsert.setString(1, idActivoTexto);
                    stmtInsert.setDate(2, new java.sql.Date(fechaTransferencia.getTime()));
                    stmtInsert.setInt(3, obtenerIdCarrera(txtCarreraO.getText()));
                    stmtInsert.setInt(4, obtenerIdAula(txtAulaO.getText()));
                    stmtInsert.setInt(5, obtenerIdCarrera(carreraDestino));
                    stmtInsert.setInt(6, obtenerIdAula(aulaDestino));
                    stmtInsert.setString(7, motivo);

                    stmtInsert.executeUpdate();
                    stmtInsert.close();

                    // Actualizar la tabla Activos con la nueva carrera y aula
                    String updateQuery = "UPDATE Activos SET id_carrera = ?, id_aula = ? WHERE id_activo = ?";
                    PreparedStatement stmtUpdate = conn.prepareStatement(updateQuery);
                    stmtUpdate.setInt(1, obtenerIdCarrera(carreraDestino)); // Nueva carrera
                    stmtUpdate.setInt(2, obtenerIdAula(aulaDestino)); // Nueva aula
                    stmtUpdate.setInt(3, Integer.parseInt(idActivoTexto));

                    stmtUpdate.executeUpdate();
                    stmtUpdate.close();

                    JOptionPane.showMessageDialog(null, "Transferencia guardada con éxito");
                    cargarTransferencias();
                    limpiarCampos();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error al guardar transferencia: " + e.getMessage());
                }
            } else {
                // Actualizar transferencia existente
            int filaSeleccionada = tbTransferencias.getSelectedRow(); // Obtener la fila seleccionada en la tabla
            if (filaSeleccionada != -1) { // Verificar que se ha seleccionado una fila
        try {
            // Obtener el ID de la transferencia seleccionada
            int idTransferencia = (int) tbTransferencias.getValueAt(filaSeleccionada, 0);
          
            // Actualizar la transferencia en la tabla Transferencias
            String updateQuery = "UPDATE Transferencias SET id_activo = ?, fecha_transferencia = ?, id_carrera_origen = ?, id_aula_origen = ?, id_carrera_destino = ?, id_aula_destino = ?, motivo = ? WHERE id_transferencia = ?";
            PreparedStatement stmtUpdate = conn.prepareStatement(updateQuery);
            stmtUpdate.setString(1, idActivoTexto);
            stmtUpdate.setDate(2, new java.sql.Date(fechaTransferencia.getTime()));
            stmtUpdate.setInt(3, obtenerIdCarrera(txtCarreraO.getText()));
            stmtUpdate.setInt(4, obtenerIdAula(txtAulaO.getText()));
            stmtUpdate.setInt(5, obtenerIdCarrera(carreraDestino));
            stmtUpdate.setInt(6, obtenerIdAula(aulaDestino));
            stmtUpdate.setString(7, motivo);
            stmtUpdate.setInt(8, idTransferencia);

            stmtUpdate.executeUpdate();
            stmtUpdate.close();

            // Actualizar también la tabla Activos con la nueva carrera y aula
            String updateActivoQuery = "UPDATE Activos SET id_carrera = ?, id_aula = ? WHERE id_activo = ?";
            PreparedStatement stmtUpdateActivo = conn.prepareStatement(updateActivoQuery);
            stmtUpdateActivo.setInt(1, obtenerIdCarrera(carreraDestino));
            stmtUpdateActivo.setInt(2, obtenerIdAula(aulaDestino));
            stmtUpdateActivo.setInt(3, Integer.parseInt(idActivoTexto));

            stmtUpdateActivo.executeUpdate();
            stmtUpdateActivo.close();

            JOptionPane.showMessageDialog(null, "Transferencia actualizada con éxito");
            cargarTransferencias(); 
            limpiarCampos(); 
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar transferencia: " + e.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(null, "Seleccione una transferencia para actualizar.");
    }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
        }
    }

    // Método para cargar carreras en el JComboBox de destino
    private void cargarCarrerasDestino() {
        try {
            String query = "SELECT nombre_carrera FROM Carreras";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            CarreraD.removeAllItems();
            while (rs.next()) {
                CarreraD.addItem(rs.getString("nombre_carrera"));
            }
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar carreras: " + e.getMessage());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
    String idActivoTexto = idActivo.getText().trim();
    if (!idActivoTexto.isEmpty()) {
        try {
            int idActivoInt = Integer.parseInt(idActivoTexto);
            String query = "SELECT nombre_activo, id_carrera, id_aula FROM Activos WHERE id_activo = ?";
            try (Connection conn = Database.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setInt(1, idActivoInt);

                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        NombreA.setText(rs.getString("nombre_activo"));
                        txtCarreraO.setText(obtenerNombreCarrera(rs.getInt("id_carrera")));
                        txtAulaO.setText(obtenerNombreAula(rs.getInt("id_aula")));
                        idActivo.setEditable(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "Activo no encontrado.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al buscar activo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El ID debe ser un número entero válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {

        JOptionPane.showMessageDialog(null, "Ingrese un ID de activo válido.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnBuscarActionPerformed

     private void cargarAulasDestino() {
        try {
            String query = "SELECT nombre_aula FROM Aulas";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            AulaD.removeAllItems();
            while (rs.next()) {
                AulaD.addItem(rs.getString("nombre_aula"));
            }
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar aulas: " + e.getMessage());
        }
    }

    // Método para obtener el nombre de la carrera basado en su ID
    private String obtenerNombreCarrera(int idCarrera) throws SQLException {
        String query = "SELECT nombre_carrera FROM Carreras WHERE id_carrera = ?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, idCarrera);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            return rs.getString("nombre_carrera");
        }
        return "";
    }

    // Método para obtener el nombre del aula basado en su ID
    private String obtenerNombreAula(int idAula) throws SQLException {
        String query = "SELECT nombre_aula FROM Aulas WHERE id_aula = ?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, idAula);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            return rs.getString("nombre_aula");
        }
        return "";
    }

    // Método para obtener el ID de la carrera basado en su nombre
    private int obtenerIdCarrera(String nombreCarrera) throws SQLException {
        String query = "SELECT id_carrera FROM Carreras WHERE nombre_carrera = ?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, nombreCarrera);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            return rs.getInt("id_carrera");
        }
        return 0;
    }

    // Método para obtener el ID del aula basado en su nombre
    private int obtenerIdAula(String nombreAula) throws SQLException {
        String query = "SELECT id_aula FROM Aulas WHERE nombre_aula = ?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, nombreAula);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            return rs.getInt("id_aula");
        }
        return 0;
    }

    private void cargarTransferencias() {
    modelo = (DefaultTableModel) tbTransferencias.getModel();
    modelo.setRowCount(0); // Limpiar la tabla
    try {
        String query = "SELECT t.id_transferencia, t.id_activo, a.nombre_activo, t.fecha_transferencia, "
                     + "c_origen.nombre_carrera AS carrera_origen, a_origen.nombre_aula AS aula_origen, "
                     + "c_destino.nombre_carrera AS carrera_destino, a_destino.nombre_aula AS aula_destino, "
                     + "t.motivo "
                     + "FROM Transferencias t "
                     + "JOIN Activos a ON t.id_activo = a.id_activo "
                     + "JOIN Carreras c_origen ON t.id_carrera_origen = c_origen.id_carrera "
                     + "JOIN Aulas a_origen ON t.id_aula_origen = a_origen.id_aula "
                     + "JOIN Carreras c_destino ON t.id_carrera_destino = c_destino.id_carrera "
                     + "JOIN Aulas a_destino ON t.id_aula_destino = a_destino.id_aula";
                     
        PreparedStatement stmt = conn.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Object[] fila = {
                rs.getInt("id_transferencia"),
                rs.getInt("id_activo"),
                rs.getString("nombre_activo"), 
                rs.getDate("fecha_transferencia"),
                rs.getString("carrera_origen"),
                rs.getString("aula_origen"),
                rs.getString("carrera_destino"),
                rs.getString("aula_destino"),
                rs.getString("motivo")
            };
            modelo.addRow(fila);
        }

        stmt.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al cargar transferencias: " + e.getMessage());
    }
    }
    private void limpiarCampos() {
        idActivo.setText("");
        NombreA.setText("");
        txtCarreraO.setText("");
        txtAulaO.setText("");
        dateFecha.setDate(null);
        txtMotivo.setText("");
        CarreraD.setSelectedIndex(0);
        AulaD.setSelectedIndex(0);
        btnGuardar.setText("Guardar");
        idActivo.setEditable(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AulaD;
    private javax.swing.JComboBox<String> CarreraD;
    private javax.swing.JTextField NombreA;
    private RSMaterialComponent.RSButtonMaterialIconDos btnBuscar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnCancelar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnGuardar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnicono;
    private com.toedter.calendar.JDateChooser dateFecha;
    private javax.swing.JTextField idActivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTable tbTransferencias;
    private javax.swing.JTextField txtAulaO;
    private javax.swing.JTextField txtCarreraO;
    private javax.swing.JTextArea txtMotivo;
    // End of variables declaration//GEN-END:variables
}
