package vista;
import conexion.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Depreciacion extends javax.swing.JPanel {
    public Depreciacion() {
        initComponents();
        cargarDatosTabla();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnicono = new RSMaterialComponent.RSButtonMaterialIconDos();
        jLabel4 = new javax.swing.JLabel();
        jpanelRound1 = new modelo.JpanelRound();
        jLabel5 = new javax.swing.JLabel();
        txtVidaUtil = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtValorDepreciado = new javax.swing.JTextField();
        btnGuardar = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnEditar = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnEliminar = new RSMaterialComponent.RSButtonMaterialIconDos();
        jpanelRound4 = new modelo.JpanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDepreciaciones = new javax.swing.JTable();
        btnCancelar = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnBuscar = new RSMaterialComponent.RSButtonMaterialIconDos();
        jpanelRound2 = new modelo.JpanelRound();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtValorOriginal = new javax.swing.JTextField();
        dateFecha = new com.toedter.calendar.JDateChooser();
        txtID = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCodigoA = new javax.swing.JTextField();
        NombreA = new javax.swing.JTextField();
        btnCalcular = new RSMaterialComponent.RSButtonMaterialIconDos();
        jpanelRound3 = new modelo.JpanelRound();
        jLabel3 = new javax.swing.JLabel();
        txtValorActual = new javax.swing.JTextField();

        setBackground(new java.awt.Color(238, 238, 238));
        setPreferredSize(new java.awt.Dimension(982, 740));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel1.setText("Depreciacion de Activos");

        btnicono.setBackground(new java.awt.Color(14, 76, 117));
        btnicono.setBackgroundHover(new java.awt.Color(14, 76, 117));
        btnicono.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.KEYBOARD_ARROW_DOWN);
        btnicono.setRound(25);
        btnicono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniconoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(50, 130, 181));
        jLabel4.setText("Complete la Informacion de Depreciacion");

        jpanelRound1.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound1.setRoundBottomLeft(25);
        jpanelRound1.setRoundBottomRight(25);
        jpanelRound1.setRoundTopLeft(25);
        jpanelRound1.setRoundTopRight(25);

        jLabel5.setText("Vida Util");

        txtVidaUtil.setEditable(false);
        txtVidaUtil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVidaUtilActionPerformed(evt);
            }
        });

        jLabel13.setText("Valor Depreciado");

        txtValorDepreciado.setEditable(false);
        txtValorDepreciado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorDepreciadoActionPerformed(evt);
            }
        });
        txtValorDepreciado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtValorDepreciadoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jpanelRound1Layout = new javax.swing.GroupLayout(jpanelRound1);
        jpanelRound1.setLayout(jpanelRound1Layout);
        jpanelRound1Layout.setHorizontalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtValorDepreciado, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel5)
                    .addComponent(txtVidaUtil))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jpanelRound1Layout.setVerticalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVidaUtil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValorDepreciado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
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

        jpanelRound4.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound4.setRoundBottomLeft(25);
        jpanelRound4.setRoundBottomRight(25);
        jpanelRound4.setRoundTopLeft(25);
        jpanelRound4.setRoundTopRight(25);

        tbDepreciaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Depreciacion", "ID del Activo", "Codigo del activo", "Fecha", "Valor Original", "Vida Util", "Valor Depreciado", "Valor Actual"
            }
        ));
        tbDepreciaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDepreciacionesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tbDepreciacionesMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tbDepreciaciones);
        if (tbDepreciaciones.getColumnModel().getColumnCount() > 0) {
            tbDepreciaciones.getColumnModel().getColumn(0).setMinWidth(50);
            tbDepreciaciones.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbDepreciaciones.getColumnModel().getColumn(0).setMaxWidth(50);
            tbDepreciaciones.getColumnModel().getColumn(1).setMinWidth(50);
            tbDepreciaciones.getColumnModel().getColumn(1).setPreferredWidth(50);
            tbDepreciaciones.getColumnModel().getColumn(1).setMaxWidth(50);
        }

        javax.swing.GroupLayout jpanelRound4Layout = new javax.swing.GroupLayout(jpanelRound4);
        jpanelRound4.setLayout(jpanelRound4Layout);
        jpanelRound4Layout.setHorizontalGroup(
            jpanelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jpanelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRound4Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(196, 196, 196)))
        );
        jpanelRound4Layout.setVerticalGroup(
            jpanelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 213, Short.MAX_VALUE)
            .addGroup(jpanelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRound4Layout.createSequentialGroup()
                    .addContainerGap(18, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        btnCancelar.setBackground(java.awt.Color.red);
        btnCancelar.setText("Cancelar");
        btnCancelar.setBackgroundHover(new java.awt.Color(50, 130, 181));
        btnCancelar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE_FOREVER);
        btnCancelar.setRound(25);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(145, 213, 137));
        btnBuscar.setBackgroundHover(new java.awt.Color(240, 195, 117));
        btnBuscar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        btnBuscar.setRound(25);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jpanelRound2.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound2.setRoundBottomLeft(25);
        jpanelRound2.setRoundBottomRight(25);
        jpanelRound2.setRoundTopLeft(25);
        jpanelRound2.setRoundTopRight(25);

        jLabel7.setText("ID del Activo");

        jLabel8.setText("Fecha de Calculo");

        jLabel9.setText("Valor Original");

        txtValorOriginal.setEditable(false);
        txtValorOriginal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorOriginalActionPerformed(evt);
            }
        });
        txtValorOriginal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtValorOriginalKeyReleased(evt);
            }
        });

        jLabel12.setText("Codigo del activo");

        jLabel10.setText("Nombre del activo");

        txtCodigoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoAActionPerformed(evt);
            }
        });

        NombreA.setEditable(false);

        javax.swing.GroupLayout jpanelRound2Layout = new javax.swing.GroupLayout(jpanelRound2);
        jpanelRound2.setLayout(jpanelRound2Layout);
        jpanelRound2Layout.setHorizontalGroup(
            jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtID)
                    .addComponent(NombreA)
                    .addGroup(jpanelRound2Layout.createSequentialGroup()
                        .addGroup(jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigoA, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtValorOriginal))
                .addContainerGap())
        );
        jpanelRound2Layout.setVerticalGroup(
            jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NombreA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValorOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        btnCalcular.setBackground(new java.awt.Color(145, 213, 137));
        btnCalcular.setText("Calcular");
        btnCalcular.setBackgroundHover(new java.awt.Color(240, 195, 117));
        btnCalcular.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.REFRESH);
        btnCalcular.setRound(25);
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jpanelRound3.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound3.setRoundBottomLeft(25);
        jpanelRound3.setRoundBottomRight(25);
        jpanelRound3.setRoundTopLeft(25);
        jpanelRound3.setRoundTopRight(25);

        jLabel3.setText("Valor Actual");

        txtValorActual.setEditable(false);
        txtValorActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelRound3Layout = new javax.swing.GroupLayout(jpanelRound3);
        jpanelRound3.setLayout(jpanelRound3Layout);
        jpanelRound3Layout.setHorizontalGroup(
            jpanelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtValorActual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addGroup(jpanelRound3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpanelRound3Layout.setVerticalGroup(
            jpanelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValorActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnicono, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jpanelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jpanelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(jpanelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 104, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(jpanelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(694, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(101, 101, 101)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(746, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addComponent(btnicono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpanelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpanelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jpanelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(233, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(87, 87, 87)
                    .addComponent(jpanelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(367, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(396, Short.MAX_VALUE)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(294, 294, 294)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btniconoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniconoActionPerformed
       
    }//GEN-LAST:event_btniconoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    String idActivo = txtID.getText().trim();
    String codigoActivo = txtCodigoA.getText().trim();
    String valorOriginal = txtValorOriginal.getText().trim();
    String valorDepreciado = txtValorDepreciado.getText().trim();
    String valorActual = txtValorActual.getText().trim();
    Date fechaDepreciacion = dateFecha.getDate();

    if (idActivo.isEmpty() || codigoActivo.isEmpty() || valorOriginal.isEmpty() || valorDepreciado.isEmpty() || valorActual.isEmpty() || fechaDepreciacion == null) {
        JOptionPane.showMessageDialog(this, "Por favor, completa todos los campos.");
        return;
    }

    try (Connection con = Database.getConnection()) {
        if (btnGuardar.getText().equals("Guardar")) {
            String sql = "INSERT INTO Depreciacion (id_activo, codigo_activo, fecha_calculo, valor_original, valor_depreciado, valor_actual) " +
                         "VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(idActivo));
            ps.setString(2, codigoActivo);
            ps.setDate(3, new java.sql.Date(fechaDepreciacion.getTime()));
            ps.setDouble(4, Double.parseDouble(valorOriginal));
            ps.setDouble(5, Double.parseDouble(valorDepreciado));
            ps.setDouble(6, Double.parseDouble(valorActual));

            int resultado = ps.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(this, "Depreciación registrada correctamente.");
                limpiarCampos();
                txtCodigoA.setEditable(true);
                txtID.setEditable(true);
                cargarDatosTabla(); 
            } else {
                JOptionPane.showMessageDialog(this, "Error al registrar la depreciación.");
            }

        } else if (btnGuardar.getText().equals("Actualizar")) {
            int filaSeleccionada = tbDepreciaciones.getSelectedRow();
            if (filaSeleccionada != -1) {
                String idDepreciacion = tbDepreciaciones.getValueAt(filaSeleccionada, 0).toString();

                String sql = "UPDATE Depreciacion SET id_activo = ?, codigo_activo = ?, fecha_calculo = ?, valor_original = ?, valor_depreciado = ?, valor_actual = ? " +
                             "WHERE id_depreciacion = ?";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, Integer.parseInt(idActivo)); 
                ps.setString(2, codigoActivo);
                ps.setDate(3, new java.sql.Date(fechaDepreciacion.getTime()));
                ps.setDouble(4, Double.parseDouble(valorOriginal));
                ps.setDouble(5, Double.parseDouble(valorDepreciado));
                ps.setDouble(6, Double.parseDouble(valorActual));
                ps.setInt(7, Integer.parseInt(idDepreciacion));

                int resultado = ps.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(this, "Depreciación actualizada correctamente.");
                    cargarDatosTabla();
                    txtCodigoA.setEditable(true);
                    txtID.setEditable(true);
                    limpiarCampos();
                } else {
                    JOptionPane.showMessageDialog(this, "Error al actualizar la depreciación.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Debes seleccionar una fila para actualizar.");
            }
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error en la operación de la base de datos.");
    }
    limpiarCampos();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
    int selectedRow = tbDepreciaciones.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Selecciona un registro para editar.");
        return;
    }
    btnBuscar.setEnabled(false);
    String idActivo = tbDepreciaciones.getValueAt(selectedRow, 1).toString();
    txtID.setText(idActivo);
    txtCodigoA.setText(tbDepreciaciones.getValueAt(selectedRow, 2).toString());
    dateFecha.setDate((Date) tbDepreciaciones.getValueAt(selectedRow, 3));  // Convertir String a Date
    txtValorOriginal.setText(tbDepreciaciones.getValueAt(selectedRow, 4).toString());
    txtVidaUtil.setText(tbDepreciaciones.getValueAt(selectedRow, 5).toString());
    txtValorDepreciado.setText(tbDepreciaciones.getValueAt(selectedRow, 6).toString());
    txtValorActual.setText(tbDepreciaciones.getValueAt(selectedRow, 7).toString());
    txtCodigoA.setEditable(false);
    txtID.setEditable(false);
    // Consulta adicional para obtener el nombre del activo
    try (Connection con = Database.getConnection()) {
        String sql = "SELECT nombre_activo FROM Activos WHERE id_activo = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, idActivo);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            NombreA.setText(rs.getString("nombre_activo"));
        } else {
            JOptionPane.showMessageDialog(this, "Nombre del activo no encontrado.");
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al obtener el nombre del activo.");
    }

    btnGuardar.setText("Actualizar");
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int selectedRow = tbDepreciaciones.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Selecciona un registro para eliminar.");
        return;
    }

    String idDepreciacion = tbDepreciaciones.getValueAt(selectedRow, 0).toString();

    int confirm = JOptionPane.showConfirmDialog(this, "¿Estás seguro de eliminar esta depreciación?", "Confirmación", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        try (Connection con = Database.getConnection()) {
            String sql = "DELETE FROM Depreciacion WHERE id_depreciacion = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, idDepreciacion);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Depreciación eliminada.");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al eliminar la depreciación.");
        }
    }
    cargarDatosTabla();
    limpiarCampos();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarCampos();
       
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tbDepreciacionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDepreciacionesMouseEntered
    
    }//GEN-LAST:event_tbDepreciacionesMouseEntered

    private void tbDepreciacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDepreciacionesMouseClicked
 
    }//GEN-LAST:event_tbDepreciacionesMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
    String id = txtID.getText().trim();
    String codigo = txtCodigoA.getText().trim();

    if (id.isEmpty() && codigo.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Debes ingresar el ID o Código del activo.");
        return;
    }

    try (Connection con = Database.getConnection()) {
        String sql = "SELECT id_activo, nombre_activo, codigo_activo, valor_actual, vida_util FROM Activos WHERE id_activo = ? OR codigo_activo = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, id);
        ps.setString(2, codigo);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            NombreA.setText(rs.getString("nombre_activo"));
            txtID.setText(rs.getString("id_activo")); 
            txtCodigoA.setText(rs.getString("codigo_activo")); 
            txtValorOriginal.setText(rs.getString("valor_actual"));
            txtVidaUtil.setText(rs.getString("vida_util"));
            txtID.setEditable(false);
            txtCodigoA.setEditable(false);

        } else {
            JOptionPane.showMessageDialog(this, "Activo no encontrado.");
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al buscar el activo.");
    }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtValorOriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorOriginalActionPerformed
   
    }//GEN-LAST:event_txtValorOriginalActionPerformed

    private void txtValorOriginalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorOriginalKeyReleased
     
    }//GEN-LAST:event_txtValorOriginalKeyReleased

    private void txtCodigoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoAActionPerformed
    
    }//GEN-LAST:event_txtCodigoAActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
       try {
    // Obtener el ID del activo y la fecha de depreciación desde los campos
    String idActivo = txtID.getText().trim();
    Date fechaDepreciacion = dateFecha.getDate(); 
    
    if (idActivo.isEmpty() || fechaDepreciacion == null) {
        JOptionPane.showMessageDialog(this, "Debes ingresar el ID del activo y la fecha de depreciación.");
        return;
    }
    java.sql.Date sqlFecha = new java.sql.Date(fechaDepreciacion.getTime());

    try (Connection con = Database.getConnection()) {
        String sqlActivo = "SELECT valor_actual, vida_util FROM Activos WHERE id_activo = ?";
        PreparedStatement psActivo = con.prepareStatement(sqlActivo);
        psActivo.setInt(1, Integer.parseInt(idActivo));
        ResultSet rsActivo = psActivo.executeQuery();

        if (rsActivo.next()) {
            double valorOriginal = rsActivo.getDouble("valor_actual");
            int vidaUtil = rsActivo.getInt("vida_util");

            // Consultar la depreciación total acumulada
            String sqlDepreciacion = "SELECT SUM(valor_depreciado) AS total_depreciado FROM Depreciacion WHERE id_activo = ?";
            PreparedStatement psDepreciacion = con.prepareStatement(sqlDepreciacion);
            psDepreciacion.setInt(1, Integer.parseInt(idActivo));
            ResultSet rsDepreciacion = psDepreciacion.executeQuery();

            double valorDepreciadoTotal = 0;
            if (rsDepreciacion.next()) {
                valorDepreciadoTotal = rsDepreciacion.getDouble("total_depreciado");
            }

            // Calcular la depreciación del nuevo registro
            double valorDepreciadoNuevo = valorOriginal / vidaUtil; // Depreciación anual
            double valorActual = valorOriginal - valorDepreciadoTotal - valorDepreciadoNuevo;

            // Mostrar los resultados
            txtValorDepreciado.setText(String.valueOf(valorDepreciadoNuevo));
            txtValorActual.setText(String.valueOf(valorActual));
        } else {
            JOptionPane.showMessageDialog(this, "Activo no encontrado.");
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al calcular la depreciación.");
    }
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this, "Error en los datos numéricos. Verifica el ID del activo.");
}
    }//GEN-LAST:event_btnCalcularActionPerformed
    
    private void txtValorDepreciadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorDepreciadoActionPerformed
    
    }//GEN-LAST:event_txtValorDepreciadoActionPerformed

    private void txtValorDepreciadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorDepreciadoKeyReleased
   
    }//GEN-LAST:event_txtValorDepreciadoKeyReleased

    private void txtValorActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActualActionPerformed
    
    }//GEN-LAST:event_txtValorActualActionPerformed

    private void txtVidaUtilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVidaUtilActionPerformed
    
    }//GEN-LAST:event_txtVidaUtilActionPerformed
    private void limpiarCampos() {
    btnBuscar.setEnabled(true);
    NombreA.setText("");
    txtID.setText("");
    txtCodigoA.setText("");
    dateFecha.setDate(null);
    txtValorOriginal.setText("");
    txtVidaUtil.setText("");
    txtValorDepreciado.setText("");
    txtValorActual.setText("");
    txtCodigoA.setEditable(true);
    txtID.setEditable(true);
    btnGuardar.setText("Guardar");
    }
    private void cargarDatosTabla() {
    DefaultTableModel modelo = (DefaultTableModel) tbDepreciaciones.getModel();
    modelo.setRowCount(0);  // Limpiar la tabla antes de cargar los datos

    try (Connection con = Database.getConnection()) {
        String sql = "SELECT d.id_depreciacion, d.id_activo, d.codigo_activo, d.fecha_calculo, d.valor_original, d.valor_depreciado, d.valor_actual, a.vida_util " +
                     "FROM Depreciacion d " +
                     "JOIN Activos a ON d.id_activo = a.id_activo";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Object[] fila = new Object[8];
            fila[0] = rs.getInt("id_depreciacion");
            fila[1] = rs.getInt("id_activo");
            fila[2] = rs.getString("codigo_activo");
            fila[3] = rs.getDate("fecha_calculo");
            fila[4] = rs.getDouble("valor_original");
            fila[5] = rs.getDouble("vida_util");
            fila[6] = rs.getDouble("valor_depreciado");
            fila[7] = rs.getInt("valor_actual");

            modelo.addRow(fila);
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al cargar los datos de la depreciación.");
    }
}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NombreA;
    private RSMaterialComponent.RSButtonMaterialIconDos btnBuscar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnCalcular;
    private RSMaterialComponent.RSButtonMaterialIconDos btnCancelar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnEditar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnEliminar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnGuardar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnicono;
    private com.toedter.calendar.JDateChooser dateFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private modelo.JpanelRound jpanelRound1;
    private modelo.JpanelRound jpanelRound2;
    private modelo.JpanelRound jpanelRound3;
    private modelo.JpanelRound jpanelRound4;
    private javax.swing.JTable tbDepreciaciones;
    private javax.swing.JTextField txtCodigoA;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtValorActual;
    private javax.swing.JTextField txtValorDepreciado;
    private javax.swing.JTextField txtValorOriginal;
    private javax.swing.JTextField txtVidaUtil;
    // End of variables declaration//GEN-END:variables
}
