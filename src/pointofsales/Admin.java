package pointofsales;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Admin extends javax.swing.JFrame {

    Profile p;
    static DefaultTableModel m, h;

    public Admin() {
        initComponents();
        
        settingTable();        
        viewData("");
        viewDataProduk("");
    }

    public Admin(Profile P) {
        initComponents();

        this.p = P;
        labelUser.setText(p.getUsername() + "(" + p.getRole() + ")");
        settingTable();  
        
        viewData("");
        viewDataProduk("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TombolRefreshProduk1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        labelUser = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        TombolTambah1 = new javax.swing.JButton();
        TombolEdit1 = new javax.swing.JButton();
        TombolHapus2 = new javax.swing.JButton();
        txtKey = new javax.swing.JTextField();
        TombolRefreshUser = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbluser = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        TombolTambah2 = new javax.swing.JButton();
        TombolEdit2 = new javax.swing.JButton();
        TombolHapus3 = new javax.swing.JButton();
        txtKey3 = new javax.swing.JTextField();
        TombolRefreshProduk = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblDataProduk = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        TombolTambah3 = new javax.swing.JButton();
        TombolEdit3 = new javax.swing.JButton();
        TombolHapus4 = new javax.swing.JButton();
        txtKey4 = new javax.swing.JTextField();
        TombolRefreshProduk2 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbluser3 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        TombolRefreshProduk1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TombolRefreshProduk1.setText("Refresh");
        TombolRefreshProduk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolRefreshProduk1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelUser.setBorder(null);
        labelUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelUserActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextField2.setText("Welcome!");
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 314, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(11, Short.MAX_VALUE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(labelUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel10.setLayout(new java.awt.BorderLayout());

        TombolTambah1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TombolTambah1.setText("Tambah");
        TombolTambah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolTambah1ActionPerformed(evt);
            }
        });

        TombolEdit1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TombolEdit1.setText("Edit");
        TombolEdit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolEdit1ActionPerformed(evt);
            }
        });

        TombolHapus2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TombolHapus2.setText("Hapus");
        TombolHapus2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolHapus2ActionPerformed(evt);
            }
        });

        txtKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKeyActionPerformed(evt);
            }
        });

        TombolRefreshUser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TombolRefreshUser.setText("Refresh");
        TombolRefreshUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolRefreshUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(TombolTambah1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TombolEdit1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TombolHapus2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TombolRefreshUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(txtKey, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TombolTambah1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TombolEdit1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TombolHapus2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKey, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TombolRefreshUser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel10.add(jPanel11, java.awt.BorderLayout.PAGE_START);

        tbluser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Username", "Password", "Email", "Alamat", "Role"
            }
        ));
        jScrollPane4.setViewportView(tbluser);

        jPanel10.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Data User", jPanel10);

        jPanel12.setLayout(new java.awt.BorderLayout());

        TombolTambah2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TombolTambah2.setText("Tambah");
        TombolTambah2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolTambah2ActionPerformed(evt);
            }
        });

        TombolEdit2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TombolEdit2.setText("Edit");
        TombolEdit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolEdit2ActionPerformed(evt);
            }
        });

        TombolHapus3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TombolHapus3.setText("Hapus");
        TombolHapus3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolHapus3ActionPerformed(evt);
            }
        });

        txtKey3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKey3ActionPerformed(evt);
            }
        });

        TombolRefreshProduk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TombolRefreshProduk.setText("Refresh");
        TombolRefreshProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolRefreshProdukActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(TombolTambah2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TombolEdit2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TombolHapus3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TombolRefreshProduk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(txtKey3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TombolTambah2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TombolEdit2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TombolHapus3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKey3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TombolRefreshProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel12.add(jPanel13, java.awt.BorderLayout.PAGE_START);

        jScrollPane6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane6MouseClicked(evt);
            }
        });

        tblDataProduk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Kode Produk", "Nama Produk", "Gambar", "Kategori", "Suplier", "Harga Jual", "Harga Beli", "Stok"
            }
        ));
        jScrollPane6.setViewportView(tblDataProduk);

        jPanel12.add(jScrollPane6, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Data Produk", jPanel12);

        jPanel14.setLayout(new java.awt.BorderLayout());

        TombolTambah3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TombolTambah3.setText("Tambah");
        TombolTambah3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolTambah3ActionPerformed(evt);
            }
        });

        TombolEdit3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TombolEdit3.setText("Edit");
        TombolEdit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolEdit3ActionPerformed(evt);
            }
        });

        TombolHapus4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TombolHapus4.setText("Hapus");
        TombolHapus4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolHapus4ActionPerformed(evt);
            }
        });

        txtKey4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKey4ActionPerformed(evt);
            }
        });

        TombolRefreshProduk2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TombolRefreshProduk2.setText("Refresh");
        TombolRefreshProduk2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolRefreshProduk2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(TombolTambah3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TombolEdit3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TombolHapus4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TombolRefreshProduk2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(txtKey4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TombolTambah3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TombolEdit3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TombolHapus4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKey4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TombolRefreshProduk2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel14.add(jPanel15, java.awt.BorderLayout.PAGE_START);

        tbluser3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Username", "Password", "Email", "Alamat", "Role"
            }
        ));
        jScrollPane7.setViewportView(tbluser3);

        jPanel14.add(jScrollPane7, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Data User", jPanel14);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchUser() {
    String searchText = txtKey.getText().trim();
    String whereClause = "";

    if (!searchText.isEmpty()) {
        whereClause = "WHERE username LIKE '%" + searchText + "%' OR email LIKE '%" + searchText + "%'";
    }

    viewData(whereClause);
    }
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void labelUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelUserActionPerformed

    private void TombolTambah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolTambah1ActionPerformed
        // TODO add your handling code here:
        TambahUser T = new TambahUser(this, true);
        T.setVisible(true); 
    }//GEN-LAST:event_TombolTambah1ActionPerformed

    private void TombolEdit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolEdit1ActionPerformed
        // TODO add your handling code here:
        int n = tbluser.getSelectedRow();
        if(n != -1){
            int id = Integer.parseInt(tbluser.getValueAt(n, 0).toString());
            String username = tbluser.getValueAt(n, 1).toString();
            String password = tbluser.getValueAt(n, 2).toString();
            String email = tbluser.getValueAt(n, 3).toString();
            String alamat = tbluser.getValueAt(n, 4).toString();
            String role = tbluser.getValueAt(n, 5).toString();
            EditUser U = new EditUser(this, true);
            U.setIdUser(id); 
            U.setUsername(username);
            U.setPassword(password); 
            U.setEmail(email);
            U.setAlamat(alamat);
            U.setRole(role); 
            U.setVisible(true); 
            
        } else {
            JOptionPane.showMessageDialog(this, "Anda belum memilih data");
        }
    }//GEN-LAST:event_TombolEdit1ActionPerformed

    private void TombolHapus2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolHapus2ActionPerformed
        // TODO add your handling code here:
        int n = tbluser.getSelectedRow();
        if(n != -1){
            int id = Integer.parseInt(tbluser.getValueAt(n, 0).toString());
            String username = tbluser.getValueAt(n, 1).toString();
            int opsi = JOptionPane.showConfirmDialog(this, 
                    "Apakah Anda yakin ingin menghapus data "+ username +"?", 
                    "Hapus Data", 
                    JOptionPane.YES_NO_OPTION);
            if(opsi == 0){
                    String Q = "DELETE FROM users "
                            + "WHERE id="+id;
                    try {
                        Connection K = Koneksi.Go();
                        Statement S = K.createStatement();
                        S.executeUpdate(Q);
                        viewData(""); 
                        JOptionPane.showMessageDialog(this, "Data "+username+" telah terhapus");
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
                }
            }
            
        }else {
            JOptionPane.showMessageDialog(this, "Anda belum memilih data");
        }
    }//GEN-LAST:event_TombolHapus2ActionPerformed

    private void txtKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKeyActionPerformed
        // TODO add your handling code here:
        String key = txtKey.getText();
        String where = "WHERE "
        + "username LIKE '%" + key + "%' OR "
        + "password LIKE '%" + key + "%' OR "
        + "email LIKE '%" + key + "%' OR "
        + "alamat LIKE '%" + key + "%' OR "
        + "role LIKE '%" + key + "%'";
        viewData(where);
    }//GEN-LAST:event_txtKeyActionPerformed

    private void TombolTambah2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolTambah2ActionPerformed
        // TODO add your handling code here:
        TambahProduk T = new TambahProduk(this, true);
        T.setVisible(true); 
    }//GEN-LAST:event_TombolTambah2ActionPerformed

    private void TombolEdit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolEdit2ActionPerformed
        // TODO add your handling code here:
        int n = tblDataProduk.getSelectedRow();
        if(n != -1){
            int id = Integer.parseInt(tblDataProduk.getValueAt(n, 0).toString());
            String kode = tblDataProduk.getValueAt(n, 1).toString();
            String nama = tblDataProduk.getValueAt(n, 2).toString();
            String gambar = tblDataProduk.getValueAt(n, 3).toString();
            String kategori = tblDataProduk.getValueAt(n, 4).toString();
            String suplier = tblDataProduk.getValueAt(n, 5).toString();
            int hargaJual = Integer.parseInt(tblDataProduk.getValueAt(n, 6).toString());
            int hargaBeli = Integer.parseInt(tblDataProduk.getValueAt(n, 7).toString());
            int stok = Integer.parseInt(tblDataProduk.getValueAt(n, 8).toString());
            EditProduk U = new EditProduk(this, true);
            U.setIdProduk(id); 
            U.setKode(kode);
            U.setNama(nama);
            U.setGambar(gambar);
            U.setKategori(kategori); 
            U.setSuplier(suplier); 
            U.setHargaJual(hargaJual);
            U.setHargaBeli(hargaBeli);
            U.setStok(stok); 
            U.setVisible(true); 
        }else {
            JOptionPane.showMessageDialog(this, "Anda belum memilih data");
        }
    }//GEN-LAST:event_TombolEdit2ActionPerformed

    private void TombolHapus3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolHapus3ActionPerformed
        // TODO add your handling code here:
        int n = tblDataProduk.getSelectedRow();
        if(n != -1){
            int id = Integer.parseInt(tblDataProduk.getValueAt(n, 0).toString());
            String kode = tblDataProduk.getValueAt(n, 1).toString();
            
            int opsi = JOptionPane.showConfirmDialog(this, 
                    "Apakah Anda yakin ingin menghapus data "+ kode +"?", 
                    "Hapus Data", 
                    JOptionPane.YES_NO_OPTION);
            if(opsi == 0){
                    String Q = "DELETE FROM produk "
                            + "WHERE id="+id;
                    try {
                        Connection K = Koneksi.Go();
                        Statement S = K.createStatement();
                        S.executeUpdate(Q);
                        viewDataProduk(""); 
                        JOptionPane.showMessageDialog(this, "Data "+kode+" telah terhapus");
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
                }
            }
        }else {
            JOptionPane.showMessageDialog(this, "Anda belum memilih data");
        }
    }//GEN-LAST:event_TombolHapus3ActionPerformed

    private void txtKey3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKey3ActionPerformed
        // TODO add your handling code here:
        String key = txtKey3.getText();
        String where = "WHERE "
        + "kode LIKE '%" + key + "%' OR "
        + "nama LIKE '%" + key + "%' OR "
        + "kategori LIKE '%" + key + "%' OR "
        + "suplier LIKE '%" + key + "%'";
        viewDataProduk(where);
    }//GEN-LAST:event_txtKey3ActionPerformed

    private void TombolTambah3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolTambah3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TombolTambah3ActionPerformed

    private void TombolEdit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolEdit3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TombolEdit3ActionPerformed

    private void TombolHapus4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolHapus4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TombolHapus4ActionPerformed

    private void txtKey4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKey4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKey4ActionPerformed

    private void jScrollPane6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane6MouseClicked

    private void TombolRefreshUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolRefreshUserActionPerformed
        // TODO add your handling code here:
        viewData("");
    }//GEN-LAST:event_TombolRefreshUserActionPerformed

    private void TombolRefreshProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolRefreshProdukActionPerformed
        // TODO add your handling code here:
        viewDataProduk("");
    }//GEN-LAST:event_TombolRefreshProdukActionPerformed

    private void TombolRefreshProduk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolRefreshProduk1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TombolRefreshProduk1ActionPerformed

    private void TombolRefreshProduk2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolRefreshProduk2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TombolRefreshProduk2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        
        Login loginForm = new Login();
        loginForm.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }
    
    public static void viewData(String where) {
        try {
            for (int i = m.getRowCount()-1; i >=0; i--) {
                m.removeRow(i);
            }
            Connection K = Koneksi.Go();
            Statement S = K.createStatement();
            String Q = "SELECT * FROM users " + where;
            ResultSet R = S.executeQuery(Q);
            int no = 1;
            while (R.next()) {
                int id = R.getInt("id");
                String username = R.getString("username");
                String password = R.getString("password");
                String email = R.getString("email");
                String alamat = R.getString("alamat");
                String role = R.getString("role");
                Object[] D = {id, username, password, email, alamat, role};
                m.addRow(D);
                no++;
            }
        Functions.saveLog("Sukses menampilkan data user"); 
        } catch (SQLException e) {
            //error handling
            Functions.saveLog("Gagal menampilkan data user. "+e.getMessage());
        }
    }
    
    public static void viewDataProduk(String where) {
        try {
            for (int i = h.getRowCount()-1; i >=0; i--){
                h.removeRow(i);
            }
            Connection K = Koneksi.Go();
            Statement S = K.createStatement();
            String Q = "SELECT * FROM produk " + where;
            ResultSet R = S.executeQuery(Q);
            int no = 1;
            while (R.next()){
                int id = R.getInt("id");
                String kode = R.getString("kode");
                String nama = R.getString("nama");
                String gambar = R.getString("gambar");
                String kategori = R.getString("kategori");
                String suplier = R.getString("suplier");
                int harga_jual = R.getInt("harga_jual");
                int harga_beli = R.getInt("harga_beli");
                int stok = R.getInt("stok");
                Object[] A = {id, kode, nama, gambar, kategori, suplier, harga_jual, harga_beli, stok};
                h.addRow(A);
                
                no++;
            }
        Functions.saveLog("Sukses menampilkan data produk"); 
        } catch (SQLException e) {
            //error handling
            Functions.saveLog("Gagal menampilkan data produk. "+e.getMessage());
        }
    }
    
    
    private void settingTable() {
        m = (DefaultTableModel) tbluser.getModel();        
        tbluser.getColumnModel().getColumn(0).setMinWidth(50);
        tbluser.getColumnModel().getColumn(0).setMaxWidth(70);

        tbluser.getColumnModel().getColumn(1).setMinWidth(100);
        tbluser.getColumnModel().getColumn(1).setMaxWidth(200);

        tbluser.getColumnModel().getColumn(2).setMinWidth(350);
        tbluser.getColumnModel().getColumn(2).setMaxWidth(500);
    
        h = (DefaultTableModel) tblDataProduk.getModel();
        tblDataProduk.getColumnModel().getColumn(0).setMinWidth(50);
        tblDataProduk.getColumnModel().getColumn(0).setMaxWidth(400);

        tblDataProduk.getColumnModel().getColumn(1).setMinWidth(100);
        tblDataProduk.getColumnModel().getColumn(1).setMaxWidth(200);

        tblDataProduk.getColumnModel().getColumn(2).setMinWidth(150);
        tblDataProduk.getColumnModel().getColumn(2).setMaxWidth(200);
        
        tblDataProduk.getColumnModel().getColumn(3).setMinWidth(250);
        tblDataProduk.getColumnModel().getColumn(3).setMaxWidth(350);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton TombolEdit1;
    private javax.swing.JButton TombolEdit2;
    private javax.swing.JButton TombolEdit3;
    private javax.swing.JButton TombolHapus2;
    private javax.swing.JButton TombolHapus3;
    private javax.swing.JButton TombolHapus4;
    private javax.swing.JButton TombolRefreshProduk;
    private javax.swing.JButton TombolRefreshProduk1;
    private javax.swing.JButton TombolRefreshProduk2;
    private javax.swing.JButton TombolRefreshUser;
    private javax.swing.JButton TombolTambah1;
    private javax.swing.JButton TombolTambah2;
    private javax.swing.JButton TombolTambah3;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField labelUser;
    private javax.swing.JTable tblDataProduk;
    private javax.swing.JTable tbluser;
    private javax.swing.JTable tbluser3;
    private javax.swing.JTextField txtKey;
    private javax.swing.JTextField txtKey3;
    private javax.swing.JTextField txtKey4;
    // End of variables declaration//GEN-END:variables
}