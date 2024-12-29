/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package snacktrack;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anom
 */
public class rekomendasi extends javax.swing.JFrame {

    private DefaultTableModel tableModel;

    /**
     * Creates new form rekomendasi
     */
    public rekomendasi() {
        initComponents();
        tableModel = (DefaultTableModel) tblRekomendasi.getModel();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRekomendasi = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnSarapan = new javax.swing.JButton();
        btnSiang = new javax.swing.JButton();
        btnMalam = new javax.swing.JButton();
        btnCemilan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        tblRekomendasi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "Takaran Saji", "Kalori per Sajian"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRekomendasi);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Daftar Rekomendasi Makanan Sehat");

        btnSarapan.setBackground(new java.awt.Color(0, 102, 51));
        btnSarapan.setText("Sarapan");
        btnSarapan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSarapanActionPerformed(evt);
            }
        });

        btnSiang.setBackground(new java.awt.Color(0, 102, 51));
        btnSiang.setText("Makan Siang");
        btnSiang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiangActionPerformed(evt);
            }
        });

        btnMalam.setBackground(new java.awt.Color(0, 102, 51));
        btnMalam.setText("Makan Malam");
        btnMalam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMalamActionPerformed(evt);
            }
        });

        btnCemilan.setBackground(new java.awt.Color(0, 102, 51));
        btnCemilan.setText("Cemilan");
        btnCemilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCemilanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSarapan)
                        .addGap(18, 18, 18)
                        .addComponent(btnSiang)
                        .addGap(18, 18, 18)
                        .addComponent(btnMalam)
                        .addGap(18, 18, 18)
                        .addComponent(btnCemilan)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSarapan)
                    .addComponent(btnSiang)
                    .addComponent(btnMalam)
                    .addComponent(btnCemilan))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnSarapanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSarapanActionPerformed
        // TODO add your handling code here:
        Object[][] sarapanData = {
        {"Oatmeal", "1/2 cangkir matang", 150},
        {"Telur rebus", "1 butir", 70},
        {"Roti gandum utuh", "1 lembar", 80},
        {"Susu almond", "1 cangkir", 35},
        {"Pisang", "1 buah ukuran sedang", 105}
    };
    updateTableData(sarapanData);
    }//GEN-LAST:event_btnSarapanActionPerformed

    private void btnSiangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiangActionPerformed
        // TODO add your handling code here:
        Object[][] siangData = {
            {"Nasi merah", "1/2 cangkir matang", 110},
            {"Dada ayam panggang", "100 g", 165},
            {"Tahu panggang", "100 g", 140},
            {"Sayur bayam", "1 cangkir", 40},
            {"Apel", "1 buah ukuran sedang", 95}
        };
        updateTableData(siangData);
    }//GEN-LAST:event_btnSiangActionPerformed

    private void btnMalamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMalamActionPerformed
        // TODO add your handling code here:
        Object[][] malamData = {
            {"Ikan salmon panggang", "100 g", 200},
            {"Kentang rebus", "1 buah sedang", 130},
            {"Broccoli kukus", "1/2 cangkir", 25},
            {"Tempe goreng", "100 g", 250},
            {"Jeruk", "1 buah ukuran sedang", 60}
        };
        updateTableData(malamData);
    }//GEN-LAST:event_btnMalamActionPerformed

    private void btnCemilanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCemilanActionPerformed
        // TODO add your handling code here:
        Object[][] cemilanData = {
            {"Kacang almond", "1/4 cangkir", 200},
            {"Yogurt rendah lemak", "1 cangkir", 150},
            {"Granola bar", "1 buah", 120},
            {"Kacang mete", "1/4 cangkir", 190},
            {"Buah anggur", "1 cangkir", 62}
        };
        updateTableData(cemilanData);
    }//GEN-LAST:event_btnCemilanActionPerformed
    
//    public void loadData(DefaultTableModel tableModel) {
//        tableModel.setRowCount(0); // Clear existing data
//        for (Object[] row : data) {
//            tableModel.addRow(row); // Add new data
//        }
//    }
    private void updateTableData(Object[][] data) {
        tableModel.setRowCount(0); // Kosongkan tabel
        for (Object[] row : data) {
            tableModel.addRow(row); // Tambahkan data baru
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rekomendasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCemilan;
    private javax.swing.JButton btnMalam;
    private javax.swing.JButton btnSarapan;
    private javax.swing.JButton btnSiang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRekomendasi;
    // End of variables declaration//GEN-END:variables
}
