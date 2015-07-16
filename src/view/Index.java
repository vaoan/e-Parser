/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import utiility.AccionesVentana;
import utiility.JFolderChooser;

/**
 *
 * @author hangarita
 */
public class Index extends javax.swing.JFrame {

    /**
     * Creates new form Index
     */
    AccionesVentana nuevo;
    String strRoot = System.getProperty("user.dir");
    JFolderChooser chooser;
    java.util.ArrayList<String> fileList;

    public Index() {
        AccionesVentana.LooknFeel();
        initComponents();
        this.nuevo = new AccionesVentana(this, "e-Parser v2");
        PrintStream con = null;
        try {
            con = new PrintStream(new utiility.TextAreaOutputStream(this.txtConsole, 400), true, "UTF-8");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.setOut(con);
    }

    private void SearchingFolder() {
        try {
            this.txtFolderProyect.setText(this.chooser.getStrPath());
            this.btnRead.setEnabled(true);
        } catch (Exception ex) {
            this.btnRead.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        pnlFolder = new javax.swing.JPanel();
        btnSearch = new javax.swing.JButton();
        txtFolderProyect = new javax.swing.JTextField();
        btnRead = new javax.swing.JButton();
        tbbData = new javax.swing.JTabbedPane();
        pnlData = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtConsole = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        chkCopyAll = new javax.swing.JCheckBox();
        chkIgnireFather = new javax.swing.JCheckBox();
        lblMessage = new javax.swing.JLabel();
        btnFix = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlFolder.setBorder(javax.swing.BorderFactory.createTitledBorder("Object Folder"));

        btnSearch.setText("Buscar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtFolderProyect.setEditable(false);
        txtFolderProyect.setBackground(new java.awt.Color(255, 255, 255));
        txtFolderProyect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFolderProyectActionPerformed(evt);
            }
        });

        btnRead.setText("Leer");
        btnRead.setEnabled(false);
        btnRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFolderLayout = new javax.swing.GroupLayout(pnlFolder);
        pnlFolder.setLayout(pnlFolderLayout);
        pnlFolderLayout.setHorizontalGroup(
            pnlFolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFolderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFolderProyect)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRead)
                .addContainerGap())
        );
        pnlFolderLayout.setVerticalGroup(
            pnlFolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFolderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(txtFolderProyect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRead))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "ARCHIVOS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        pnlData.setViewportView(tblData);

        tbbData.addTab("Lista de archivos", pnlData);

        txtConsole.setBackground(new java.awt.Color(0, 51, 51));
        txtConsole.setColumns(20);
        txtConsole.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        txtConsole.setForeground(new java.awt.Color(0, 255, 51));
        txtConsole.setRows(5);
        jScrollPane1.setViewportView(txtConsole);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
        );

        tbbData.addTab("Consola", jPanel1);

        chkCopyAll.setSelected(true);
        chkCopyAll.setText("Copiar datos en la carpeta \"eFixer\"");
        chkCopyAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCopyAllActionPerformed(evt);
            }
        });

        chkIgnireFather.setSelected(true);
        chkIgnireFather.setText("Ignorar padre para crear relaciones de hijos (\"Esta compuesto por\")");
        chkIgnireFather.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkIgnireFatherActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkCopyAll)
                    .addComponent(chkIgnireFather))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkCopyAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkIgnireFather)
                .addContainerGap(175, Short.MAX_VALUE))
        );

        tbbData.addTab("Opciones", jPanel2);

        lblMessage.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(255, 0, 0));

        btnFix.setText("Iniciar");
        btnFix.setEnabled(false);
        btnFix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFixActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlFolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tbbData, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lblMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFix)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tbbData, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMessage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFix, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        this.chooser = new JFolderChooser();
        this.chooser.OpenChooser("");
        SearchingFolder();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtFolderProyectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFolderProyectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFolderProyectActionPerformed

    private void btnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadActionPerformed
        java.io.File file = new java.io.File(this.txtFolderProyect.getText());

        String DriveDesc = utiility.FilesUtility.PathRootDesc(file.getPath());
        System.out.println(DriveDesc);

        if (!DriveDesc.toLowerCase().contains("disco local")) {
            javax.swing.JOptionPane.showMessageDialog(null, "El proceso debe realizarse en un disco local");

            return;
        }

        this.fileList = this.chooser.getFileList(false);

        javax.swing.table.TableModel model = this.tblData.getModel();

        java.util.Iterator<String> ite = this.fileList.iterator();
        int cont = 0;

        while (ite.hasNext()) {
            String ele = (String) ite.next();
            model.setValueAt(ele, cont, 0);
            cont++;
        }

        this.pnlFolder.setEnabled(false);
        this.btnRead.setEnabled(false);
        this.btnSearch.setEnabled(false);

        this.btnFix.setEnabled(true);
    }//GEN-LAST:event_btnReadActionPerformed

    private void btnFixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFixActionPerformed
        this.btnFix.setEnabled(false);

        String strPath = this.txtFolderProyect.getText();

        if (!this.chkCopyAll.isSelected()) {
            String strMessaje = "¿Seguro que desea SOBREESCRIBIR los archivos originales?\n(Una vez iniciado el proceso los archivos orignales serán irrecuperables)";

            int showConfirmDialog = javax.swing.JOptionPane.showConfirmDialog(this.rootPane, strMessaje);

            switch (showConfirmDialog) {
                case 1:
                    this.chkCopyAll.setSelected(true);
                    break;
                case 0:
                    this.chkCopyAll.setSelected(false);
                    break;
                default:
                    this.btnFix.setEnabled(true);
                    return;
            }
        }

        this.lblMessage.setText("Trabajando...");

        Object[] objParams = {strPath, this.lblMessage,this.chkCopyAll.isSelected(), 
            chkIgnireFather.isSelected()};

        this.tbbData.setSelectedIndex(1);

        Thread main = new Thread(new bin.MetadataParser(objParams));
        main.start();
    }//GEN-LAST:event_btnFixActionPerformed

    private void chkCopyAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCopyAllActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkCopyAllActionPerformed

    private void chkIgnireFatherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkIgnireFatherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkIgnireFatherActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFix;
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnSearch;
    private javax.swing.JCheckBox chkCopyAll;
    private javax.swing.JCheckBox chkIgnireFather;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JScrollPane pnlData;
    private javax.swing.JPanel pnlFolder;
    private javax.swing.JTabbedPane tbbData;
    private javax.swing.JTable tblData;
    private javax.swing.JTextArea txtConsole;
    private javax.swing.JTextField txtFolderProyect;
    // End of variables declaration//GEN-END:variables
}
