
package vista;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.itextpdf.text.BaseColor;
import conexion.Database;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import javax.swing.JOptionPane;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Re_Estado_Activo extends javax.swing.JFrame {
    public Re_Estado_Activo() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(0,0,0,0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelRound1 = new modelo.JpanelRound();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnCerrar = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnBuscar = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnREPORTE1 = new RSMaterialComponent.RSButtonMaterialIconDos();
        jLabel2 = new javax.swing.JLabel();
        estado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jpanelRound1.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound1.setRoundBottomLeft(25);
        jpanelRound1.setRoundBottomRight(25);
        jpanelRound1.setRoundTopLeft(25);
        jpanelRound1.setRoundTopRight(52);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Reportes de Estado de Activos");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Codigo", "Fecha adquisicion", "Estado", "Categoria", "Aula", "Carrera"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setMinWidth(30);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(30);
            tabla.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        btnCerrar.setBackground(new java.awt.Color(244, 33, 70));
        btnCerrar.setText("Cerrar");
        btnCerrar.setBackgroundHover(new java.awt.Color(255, 130, 130));
        btnCerrar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLOSE);
        btnCerrar.setRound(25);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(14, 76, 117));
        btnBuscar.setText("Buscar");
        btnBuscar.setBackgroundHover(new java.awt.Color(50, 130, 181));
        btnBuscar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        btnBuscar.setRound(25);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnREPORTE1.setBackground(new java.awt.Color(213, 137, 137));
        btnREPORTE1.setText("PDF");
        btnREPORTE1.setBackgroundHover(new java.awt.Color(14, 76, 117));
        btnREPORTE1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.INSERT_DRIVE_FILE);
        btnREPORTE1.setRound(25);
        btnREPORTE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnREPORTE1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Estado");

        estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "operativo", "en_mantenimiento", "dado_de_baja" }));

        javax.swing.GroupLayout jpanelRound1Layout = new javax.swing.GroupLayout(jpanelRound1);
        jpanelRound1.setLayout(jpanelRound1Layout);
        jpanelRound1Layout.setHorizontalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRound1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(jpanelRound1Layout.createSequentialGroup()
                        .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpanelRound1Layout.createSequentialGroup()
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnREPORTE1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpanelRound1Layout.createSequentialGroup()
                                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14))))
        );
        jpanelRound1Layout.setVerticalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnREPORTE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpanelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
    String estadoSeleccionado = estado.getSelectedItem().toString(); // Obtener el estado seleccionado del JComboBox
    cargarActivosPorEstado(estadoSeleccionado);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked

    }//GEN-LAST:event_tablaMouseClicked

    private void btnREPORTE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnREPORTE1ActionPerformed
    String rutaBase = "Reportes/Reportes_por_estado/reporte_activos_estado";
    String rutaArchivo = generarNombreUnico(rutaBase, ".pdf");

    // Crear documento PDF con márgenes ajustados
    Document documento = new Document(PageSize.A4, 20, 20, 20, 20);

    try {
        PdfWriter.getInstance(documento, new FileOutputStream(rutaArchivo));
        documento.open(); // Abrir el documento

        // Título del reporte con fecha actual
        Font tituloFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16);
        String fechaActual = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        documento.add(new Paragraph("Reporte de Activos por Estado", tituloFont));
        documento.add(new Paragraph("Fecha: " + fechaActual, tituloFont));
        documento.add(new Paragraph(" ")); // Espacio en blanco

        // Crear la tabla PDF
        PdfPTable pdfTable = new PdfPTable(tabla.getColumnCount());
        pdfTable.setWidthPercentage(100); // La tabla ocupa el 100% del ancho de la página
        float[] columnWidths = new float[] {0.8f, 2f, 2f, 2f, 2f, 2f, 2f, 2f}; // Ajustar proporciones de las columnas
        pdfTable.setWidths(columnWidths);

        // Fuente para el contenido de la tabla
        Font contenidoFont = FontFactory.getFont(FontFactory.HELVETICA, 10); // Tamaño de letra reducido a 10

        // Añadir encabezados de la tabla
        for (int i = 0; i < tabla.getColumnCount(); i++) {
            PdfPCell headerCell = new PdfPCell(new Phrase(tabla.getColumnName(i), contenidoFont));
            headerCell.setBackgroundColor(BaseColor.LIGHT_GRAY); // Color de fondo para el encabezado
            pdfTable.addCell(headerCell);
        }

        // Añadir las filas de la JTable al PDF
        for (int filas = 0; filas < tabla.getRowCount(); filas++) {
            for (int columnas = 0; columnas < tabla.getColumnCount(); columnas++) {
                PdfPCell cell = new PdfPCell(new Phrase(tabla.getValueAt(filas, columnas).toString(), contenidoFont));
                pdfTable.addCell(cell);
            }
        }

        // Añadir la tabla PDF al documento
        documento.add(pdfTable);

        // Mostrar mensaje de éxito
        JOptionPane.showMessageDialog(null, "Reporte generado con éxito en " + rutaArchivo);

    } catch (DocumentException | FileNotFoundException e) {
        JOptionPane.showMessageDialog(null, "Error al generar el reporte: " + e.getMessage());
    } finally {
        documento.close(); // Cerrar el documento
    }
    }//GEN-LAST:event_btnREPORTE1ActionPerformed
    private void cargarActivosPorEstado(String estado) {
    DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
    modelo.setRowCount(0); // Limpiar la tabla

    // Actualizar la consulta con el nombre correcto de la columna "codigo_activo"
    String query = "SELECT a.id_activo, a.nombre_activo, a.codigo_activo, a.fecha_adquisicion, a.estado, c.nombre_categoria, au.nombre_aula, ca.nombre_carrera " +
                   "FROM Activos a " +
                   "JOIN Categorias c ON a.id_categoria = c.id_categoria " +
                   "JOIN Aulas au ON a.id_aula = au.id_aula " +
                   "JOIN Carreras ca ON a.id_carrera = ca.id_carrera " +
                   "WHERE a.estado = ?";

    try (Connection conn = Database.getConnection(); 
         PreparedStatement stmt = conn.prepareStatement(query)) {
        
        stmt.setString(1, estado); // Pasar el estado seleccionado como parámetro

        ResultSet rs = stmt.executeQuery();

        // Verificar si el ResultSet está vacío
        if (!rs.isBeforeFirst()) { // Si no hay registros en el ResultSet
            JOptionPane.showMessageDialog(this, "No se encontraron activos con el estado seleccionado.");
            return; // Salir del método si no hay resultados
        }

        // Si se encontraron registros, llenar la tabla
        while (rs.next()) {
            Object[] fila = {
                rs.getInt("id_activo"),
                rs.getString("nombre_activo"),
                rs.getString("codigo_activo"),
                rs.getDate("fecha_adquisicion"),
                rs.getString("estado"),
                rs.getString("nombre_categoria"),
                rs.getString("nombre_aula"),
                rs.getString("nombre_carrera")
            };
            modelo.addRow(fila); // Añadir la fila a la tabla
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al cargar activos: " + e.getMessage());
    }
}

public String generarNombreUnico(String basePath, String extension) {
    int contador = 1;
    String nuevoArchivo = basePath + extension;
    
    // Mientras exista el archivo, incrementa el contador
    while (new File(nuevoArchivo).exists()) {
        nuevoArchivo = basePath + "(" + contador + ")" + extension;
        contador++;
    }
    
    return nuevoArchivo;
}
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Re_Estado_Activo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Re_Estado_Activo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Re_Estado_Activo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Re_Estado_Activo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Re_Estado_Activo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconDos btnBuscar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnCerrar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnREPORTE1;
    private javax.swing.JComboBox<String> estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private modelo.JpanelRound jpanelRound1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
