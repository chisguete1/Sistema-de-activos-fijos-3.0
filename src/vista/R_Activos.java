package vista;
import conexion.Database;
import controlador.ComboItem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

public class R_Activos extends javax.swing.JPanel {
static private int activoId = -1; 
    public R_Activos() {
        initComponents();
        cargarComboBox(); 
        cargarDatosEnTabla(); 
        txtCostoT.getDocument().addDocumentListener(new DocumentListener() {
    @Override
    public void insertUpdate(DocumentEvent e) {
        actualizarValorActual();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        actualizarValorActual();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        actualizarValorActual();
    }

    private void actualizarValorActual() {
        String costoText = txtCostoT.getText();
        try {
            double costo = Double.parseDouble(costoText);
            txtValorActual.setText(String.valueOf(costo));
        } catch (NumberFormatException ex) {
            txtValorActual.setText("");
        }
    }
    });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnicono = new RSMaterialComponent.RSButtonMaterialIconDos();
        jLabel4 = new javax.swing.JLabel();
        jpanelRound1 = new modelo.JpanelRound();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dateFecha = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtdescripcion = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        txtActivo = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCostoT = new javax.swing.JTextField();
        jpanelRound3 = new modelo.JpanelRound();
        jLabel20 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtVidaUtil = new javax.swing.JTextField();
        txtValorActual = new javax.swing.JTextField();
        btnGuardar = new RSMaterialComponent.RSButtonMaterialIconDos();
        jpanelRound4 = new modelo.JpanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRegistro = new javax.swing.JTable();
        jpanelRound5 = new modelo.JpanelRound();
        Carrera = new javax.swing.JComboBox<>();
        Estado = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnCancelar = new RSMaterialComponent.RSButtonMaterialIconDos();
        jpanelRound7 = new modelo.JpanelRound();
        Categoria = new javax.swing.JComboBox<>();
        Aula = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(238, 238, 238));
        setPreferredSize(new java.awt.Dimension(982, 740));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel1.setText("Registro De Activos");

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
        jLabel4.setText("Complete la Informacion de los Activos.");

        jpanelRound1.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound1.setRoundBottomLeft(25);
        jpanelRound1.setRoundBottomRight(25);
        jpanelRound1.setRoundTopLeft(25);
        jpanelRound1.setRoundTopRight(25);

        jLabel3.setText("Nombre del Activo");

        jLabel5.setText("Descripcion");

        jLabel6.setText("Codigo del Activo");

        txtdescripcion.setColumns(20);
        txtdescripcion.setRows(5);
        jScrollPane2.setViewportView(txtdescripcion);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(238, 173, 61));
        jLabel19.setText("Rellene los Campos");

        txtActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActivoActionPerformed(evt);
            }
        });

        jLabel11.setText("Fecha de Adquisicion");

        jLabel10.setText("Costo");

        txtCostoT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostoTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelRound1Layout = new javax.swing.GroupLayout(jpanelRound1);
        jpanelRound1.setLayout(jpanelRound1Layout);
        jpanelRound1Layout.setHorizontalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRound1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(52, 52, 52))
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtActivo)
                    .addComponent(txtCodigo)
                    .addGroup(jpanelRound1Layout.createSequentialGroup()
                        .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtCostoT))
                .addContainerGap())
        );
        jpanelRound1Layout.setVerticalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtActivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCostoT)
                .addGap(81, 81, 81))
        );

        jpanelRound3.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound3.setRoundBottomLeft(25);
        jpanelRound3.setRoundBottomRight(25);
        jpanelRound3.setRoundTopLeft(25);
        jpanelRound3.setRoundTopRight(25);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(238, 173, 61));
        jLabel20.setText("Rellene los Campos");

        jLabel9.setText("Valor Original");

        jLabel7.setText("Vida Util");

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
                .addGroup(jpanelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorActual)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtVidaUtil))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanelRound3Layout.setVerticalGroup(
            jpanelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValorActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVidaUtil, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
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

        jpanelRound4.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound4.setRoundBottomLeft(25);
        jpanelRound4.setRoundBottomRight(25);
        jpanelRound4.setRoundTopLeft(25);
        jpanelRound4.setRoundTopRight(25);

        tablaRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Descripcion", "Codigo", "fecha", "Costo Total", "Valor Actual", "Vida Util", "Categoria", "Aula", "Carrera", "Estado"
            }
        ));
        tablaRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaRegistroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tablaRegistroMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tablaRegistro);
        if (tablaRegistro.getColumnModel().getColumnCount() > 0) {
            tablaRegistro.getColumnModel().getColumn(0).setMinWidth(30);
            tablaRegistro.getColumnModel().getColumn(0).setPreferredWidth(30);
            tablaRegistro.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        javax.swing.GroupLayout jpanelRound4Layout = new javax.swing.GroupLayout(jpanelRound4);
        jpanelRound4.setLayout(jpanelRound4Layout);
        jpanelRound4Layout.setHorizontalGroup(
            jpanelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jpanelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRound4Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(97, 97, 97)))
        );
        jpanelRound4Layout.setVerticalGroup(
            jpanelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 227, Short.MAX_VALUE)
            .addGroup(jpanelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRound4Layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jpanelRound5.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound5.setRoundBottomLeft(25);
        jpanelRound5.setRoundBottomRight(25);
        jpanelRound5.setRoundTopLeft(25);
        jpanelRound5.setRoundTopRight(25);

        Estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "operativo", "en_mantenimiento", "dado_de_baja" }));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(238, 173, 61));
        jLabel22.setText("Rellene los Campos");

        jLabel15.setText("Carrera");

        jLabel16.setText("Estado");

        javax.swing.GroupLayout jpanelRound5Layout = new javax.swing.GroupLayout(jpanelRound5);
        jpanelRound5.setLayout(jpanelRound5Layout);
        jpanelRound5Layout.setHorizontalGroup(
            jpanelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addGroup(jpanelRound5Layout.createSequentialGroup()
                        .addGroup(jpanelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Carrera, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Estado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpanelRound5Layout.setVerticalGroup(
            jpanelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addGap(5, 5, 5)
                .addComponent(Carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jpanelRound7.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound7.setRoundBottomLeft(25);
        jpanelRound7.setRoundBottomRight(25);
        jpanelRound7.setRoundTopLeft(25);
        jpanelRound7.setRoundTopRight(25);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(238, 173, 61));
        jLabel23.setText("Rellene los Campos");

        jLabel12.setText("Categoria");

        jLabel13.setText("Aula");

        javax.swing.GroupLayout jpanelRound7Layout = new javax.swing.GroupLayout(jpanelRound7);
        jpanelRound7.setLayout(jpanelRound7Layout);
        jpanelRound7Layout.setHorizontalGroup(
            jpanelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addGroup(jpanelRound7Layout.createSequentialGroup()
                        .addGroup(jpanelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(Aula, 0, 130, Short.MAX_VALUE)
                            .addComponent(Categoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpanelRound7Layout.setVerticalGroup(
            jpanelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(8, 8, 8)
                .addComponent(Aula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpanelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jpanelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpanelRound7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpanelRound5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpanelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(41, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnicono, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpanelRound5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jpanelRound7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jpanelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpanelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpanelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(208, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void btniconoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniconoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btniconoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (validarCampos()) {
        String nombreActivo = txtActivo.getText();
        String descripcion = txtdescripcion.getText();
        String codigoActivo = txtCodigo.getText();
        Date fechaAdquisicion = dateFecha.getDate();
        double costoTotal = Double.parseDouble(txtCostoT.getText());
        double valorActual = Double.parseDouble(txtValorActual.getText());
        int vidaUtil = Integer.parseInt(txtVidaUtil.getText());
        ComboItem categoriaSeleccionada = (ComboItem) Categoria.getSelectedItem();
        ComboItem aulaSeleccionada = (ComboItem) Aula.getSelectedItem();
        ComboItem carreraSeleccionada = (ComboItem) Carrera.getSelectedItem();
        String estado = Estado.getSelectedItem().toString();
        // Insertar o actualizar el activo en la base de datos
        try (Connection conn = Database.getConnection()) {
            String sql;
            sql = "INSERT INTO Activos (nombre_activo, descripcion, codigo_activo, fecha_adquisicion, costo_total, valor_actual, vida_util, id_categoria, id_aula, id_carrera, estado) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, nombreActivo);
                pstmt.setString(2, descripcion);
                pstmt.setString(3, codigoActivo);
                pstmt.setDate(4, new java.sql.Date(fechaAdquisicion.getTime()));
                pstmt.setDouble(5, costoTotal);
                pstmt.setDouble(6, valorActual);
                pstmt.setInt(7, vidaUtil);
                pstmt.setInt(8, categoriaSeleccionada.getId());
                pstmt.setInt(9, aulaSeleccionada.getId());
                pstmt.setInt(10, carreraSeleccionada.getId());
                pstmt.setString(11, estado);
                
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Operación realizada con éxito.");
                limpiarCampos();
                cargarDatosEnTabla();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al guardar el activo: " + e.getMessage());
                System.out.println("error"+e);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión a la base de datos: " + e.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos correctamente.");
    }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActivoActionPerformed

    private void txtValorActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActualActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarCampos();
        btnCancelar.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tablaRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaRegistroMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaRegistroMouseEntered

    private void tablaRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaRegistroMouseClicked

    }//GEN-LAST:event_tablaRegistroMouseClicked

    private void txtCostoTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostoTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostoTActionPerformed
    private boolean validarCampos() {
    boolean valido = true;
    if (txtActivo.getText().trim().isEmpty()) valido = false;
    if (txtCodigo.getText().trim().isEmpty()) valido = false;
    if (dateFecha.getDate() == null) valido = false;
    if (txtValorActual.getText().trim().isEmpty() || !txtValorActual.getText().trim().matches("\\d+(\\.\\d{1,2})?")) valido = false;
    if (txtVidaUtil.getText().trim().isEmpty() || !txtVidaUtil.getText().trim().matches("\\d+")) valido = false;
    return valido;
    }
    private void seleccionarComboItem(JComboBox<ComboItem> comboBox, int id) {
    for (int i = 0; i < comboBox.getItemCount(); i++) {
        if (comboBox.getItemAt(i).getId() == id) {
            comboBox.setSelectedIndex(i);
            return;
        }
    }
    }

    private void cargarDatosEnTabla() {
    DefaultTableModel model = (DefaultTableModel) tablaRegistro.getModel();
    model.setRowCount(0);
    try (Connection conn = Database.getConnection()) {
        String sql = "SELECT * FROM Activos";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                model.addRow(new Object[] {
                    rs.getInt("id_activo"),
                    rs.getString("nombre_activo"),
                    rs.getString("descripcion"),
                    rs.getString("codigo_activo"),
                    rs.getDate("fecha_adquisicion"),
                    rs.getDouble("costo_total"),
                    rs.getDouble("valor_actual"),
                    rs.getInt("vida_util"),
                    rs.getString("id_categoria"), 
                    rs.getString("id_aula"), 
                    rs.getString("id_carrera"),
                    rs.getString("estado")
                });
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar datos en la tabla:" + e.getMessage());
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error de conexión a la base de datos: " + e.getMessage());
    }
    }
    private void limpiarCampos() {
    txtActivo.setText("");
    txtdescripcion.setText("");
    txtCodigo.setText("");
    dateFecha.setDate(null);
    txtCostoT.setText("");
    txtValorActual.setText("");
    txtVidaUtil.setText("");
    Categoria.setSelectedIndex(0); // Ajustar según el índice predeterminado
    Aula.setSelectedIndex(0); // Ajustar según el índice predeterminado
    Carrera.setSelectedIndex(0); // Ajustar según el índice predeterminado
    Estado.setSelectedIndex(0); // Ajustar según el índice predeterminado
} 
private void cargarComboBox() {
    cargarComboBoxCategoria();
    cargarComboBoxAula();
    cargarComboBoxCarrera();
}
private void cargarComboBoxCategoria() {
    try (Connection conn = Database.getConnection()) {
        String sql = "SELECT * FROM Categorias";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Categoria.addItem(new ComboItem(rs.getInt("id_categoria"), rs.getString("nombre_categoria")));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar categorías: " + e.getMessage());
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error de conexión a la base de datos: " + e.getMessage());
    }
}

private void cargarComboBoxAula() {
    try (Connection conn = Database.getConnection()) {
        String sql = "SELECT * FROM Aulas";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Aula.addItem(new ComboItem(rs.getInt("id_aula"), rs.getString("nombre_aula")));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar aulas: " + e.getMessage());
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error de conexión a la base de datos: " + e.getMessage());
    }
}

private void cargarComboBoxCarrera() {
    try (Connection conn = Database.getConnection()) {
        String sql = "SELECT * FROM Carreras";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Carrera.addItem(new ComboItem(rs.getInt("id_carrera"), rs.getString("nombre_carrera")));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar carreras: " + e.getMessage());
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error de conexión a la base de datos: " + e.getMessage());
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<ComboItem> Aula;
    private javax.swing.JComboBox<ComboItem> Carrera;
    private javax.swing.JComboBox<ComboItem> Categoria;
    private javax.swing.JComboBox<String> Estado;
    private RSMaterialComponent.RSButtonMaterialIconDos btnCancelar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnGuardar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnicono;
    private com.toedter.calendar.JDateChooser dateFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private modelo.JpanelRound jpanelRound1;
    private modelo.JpanelRound jpanelRound3;
    private modelo.JpanelRound jpanelRound4;
    private modelo.JpanelRound jpanelRound5;
    private modelo.JpanelRound jpanelRound7;
    private javax.swing.JTable tablaRegistro;
    private javax.swing.JTextField txtActivo;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCostoT;
    private javax.swing.JTextField txtValorActual;
    public static javax.swing.JTextField txtVidaUtil;
    private javax.swing.JTextArea txtdescripcion;
    // End of variables declaration//GEN-END:variables
}
