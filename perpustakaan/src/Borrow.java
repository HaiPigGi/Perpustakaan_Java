 import java.sql.*;
import java.awt.Frame;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class Borrow extends javax.swing.JDialog {
   //private String jdbcURL = "jdbc:oracle:thin:@//172.23.9.185:1521/orcl";//service
    private Connection con = null;
    private PreparedStatement pst=null;

    isiPerpus dtPeminjam;
    DefaultTableModel tModel;
    TableColumnModel cModel;
   
      public Borrow(java.awt.Frame parent, boolean modal,isiPerpus dtPeminjam) {
        super(parent, modal);
        initComponents();
        this.dtPeminjam = dtPeminjam;
        Dosenku.setSelected(true);
       tampilData();
    }




    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        Dosenku = new javax.swing.JRadioButton();
        MahasiswaKu = new javax.swing.JRadioButton();
        Masyarakat = new javax.swing.JRadioButton();
        iniNama = new javax.swing.JLabel();
        textNomor = new javax.swing.JTextField();
        iniID = new javax.swing.JLabel();
        textID = new javax.swing.JTextField();
        iniNomor = new javax.swing.JLabel();
        textNama = new javax.swing.JTextField();
        iniAlamat = new javax.swing.JLabel();
        textAlamat = new javax.swing.JTextField();
        IniJumPinjam = new javax.swing.JLabel();
        textJumPinjam = new javax.swing.JTextField();
        Tambah = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        Keluar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        BorrowT = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        buttonGroup1.add(Dosenku);
        Dosenku.setText("Dosen");
        Dosenku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DosenkuActionPerformed(evt);
            }
        });

        buttonGroup1.add(MahasiswaKu);
        MahasiswaKu.setText("Mahasiswa");
        MahasiswaKu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MahasiswaKuActionPerformed(evt);
            }
        });

        buttonGroup1.add(Masyarakat);
        Masyarakat.setText("Umum");
        Masyarakat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasyarakatActionPerformed(evt);
            }
        });

        iniNama.setText("Nama  ");

        textNomor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textNomorFocusLost(evt);
            }
        });
        textNomor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomorActionPerformed(evt);
            }
        });

        iniID.setText("ID");

        textID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textIDFocusLost(evt);
            }
        });
        textID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIDActionPerformed(evt);
            }
        });

        iniNomor.setText("Nomor");

        textNama.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textNamaFocusLost(evt);
            }
        });

        iniAlamat.setText("Alamat");

        IniJumPinjam.setText("Jumlah Pinjam");

        textJumPinjam.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textJumPinjamFocusLost(evt);
            }
        });

        Tambah.setText("Tambah");
        Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahActionPerformed(evt);
            }
        });

        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        Keluar.setText("Keluar");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 165, Short.MAX_VALUE)
        );

        BorrowT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "title 5"
            }
        ));
        BorrowT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BorrowTMouseClicked(evt);
            }
        });
        BorrowT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BorrowTKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(BorrowT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(Dosenku)
                        .addGap(423, 423, 423)
                        .addComponent(MahasiswaKu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Masyarakat)
                        .addGap(106, 106, 106))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(iniAlamat)
                                    .addComponent(iniNama)
                                    .addComponent(iniNomor)
                                    .addComponent(iniID))
                                .addGap(51, 51, 51))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(IniJumPinjam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNomor)
                            .addComponent(textID)
                            .addComponent(textAlamat)
                            .addComponent(textNama)
                            .addComponent(textJumPinjam))))
                .addGap(64, 64, 64))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1268, 1268, 1268))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(341, 341, 341)
                        .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dosenku)
                    .addComponent(Masyarakat)
                    .addComponent(MahasiswaKu))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iniID)
                    .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iniNomor)
                    .addComponent(textNomor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iniNama, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iniAlamat))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IniJumPinjam)
                    .addComponent(textJumPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Reset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Keluar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DosenkuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DosenkuActionPerformed
         iniNomor.setText("NIP");
         tampilData();
 
    }//GEN-LAST:event_DosenkuActionPerformed

    private void textNomorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomorActionPerformed

    }//GEN-LAST:event_textNomorActionPerformed

    private void MahasiswaKuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MahasiswaKuActionPerformed
        // TODO add your handling code here:
        iniNomor.setText("NIM");
        tampilData();
    }//GEN-LAST:event_MahasiswaKuActionPerformed

    private void MasyarakatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasyarakatActionPerformed
        // TODO add your handling code here:
        iniNomor.setText("NIK");
        tampilData();
    }//GEN-LAST:event_MasyarakatActionPerformed

    private void textIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIDActionPerformed

    private void TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahActionPerformed
        // TODO add your handling code here:
         String vId = textID.getText();
        String vNo = textNomor.getText();
        String vNama = textNama.getText();
        String vAlamat = textAlamat.getText();
        String vJum = textJumPinjam.getText();
        Peminjam dataPeminjam = null;
        if (Dosenku.isSelected()) {
             try {
                 dataPeminjam = new Dosen(vId, vNama, vAlamat, Integer.parseInt(vJum), vNo);
                 String insert="INSERT INTO DOSEN (ID_DOSEN,NPP,NAMA_DSN,ALAMAT_DSN,JUMLAH_PINJAM__DSN) VALUES (?,?,?,?,?)";
                 con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xepdb1","hr","hr");
                     
                 pst=con.prepareStatement(insert);
                 
                 pst.setString(1, vId);
                 pst.setString(2, vNo);
                 pst.setString(3, vNama);
                 pst.setString(4, vAlamat);
                 pst.setString(5, vJum);
                 
                 pst.executeUpdate();
                 JOptionPane.showMessageDialog(null,"Success");
                clrInput();
             } catch (Exception ex) {
                 Logger.getLogger(Borrow.class.getName()).log(Level.SEVERE,"Data Tidak Masuk di Database", ex);
             }
        }
        if (MahasiswaKu.isSelected()) {
            try {
                 dataPeminjam = new Mahasiswa(vId, vNama, vAlamat, Integer.parseInt(vJum), vNo);
                 String insert="INSERT INTO MAHASISWA (ID_MAHASISWA,NIM,NAMA_MHS,ALAMAT_MHS,JUMLAH_PINJAM_MHS) VALUES (?,?,?,?,?)";
                 con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xepdb1","hr","hr");
                     
                 pst=con.prepareStatement(insert);
                 
                 pst.setString(1, vId);
                 pst.setString(2, vNo);
                 pst.setString(3, vNama);
                 pst.setString(4, vAlamat);
                 pst.setString(5, vJum);
                 
                 pst.executeUpdate();
                 JOptionPane.showMessageDialog(null,"Success");
                clrInput();
             } catch (Exception ex) {
                 Logger.getLogger(Borrow.class.getName()).log(Level.SEVERE,"Data Tidak Masuk di Database", ex);
             }
        }
        if (Masyarakat.isSelected()) {
            try {
            dataPeminjam = new Umum(vId, vNama, vAlamat, Integer.parseInt(vJum), vNo);
              String insert="INSERT INTO UMUM (ID_U,NIK,NAMA_U,ALAMAT_U,JUMLAH_PINJAM_U) VALUES (?,?,?,?,?)";
                 con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xepdb1","hr","hr");
                     
                 pst=con.prepareStatement(insert);
                 
                 pst.setString(1, vId);
                 pst.setString(2, vNo);
                 pst.setString(3, vNama);
                 pst.setString(4, vAlamat);
                 pst.setString(5, vJum);
                 
                 pst.executeUpdate();
                 JOptionPane.showMessageDialog(null,"Success");
                clrInput();
             } catch (Exception ex) {
                 Logger.getLogger(Borrow.class.getName()).log(Level.SEVERE,"Data Tidak Masuk di Database", ex);
             }
        }
        dtPeminjam.isiDataPeminjam(dataPeminjam);
        tampilData();
        clrInput();
        
    }//GEN-LAST:event_TambahActionPerformed

    private void textNamaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textNamaFocusLost
        // TODO add your handling code here:
           if (textNama.getText().isEmpty()) {
            return;
        }
           {
        String cek = textNama.getText();
        if (cek.matches(".*\\d.*")) {
            try {
                textNama.setText("");
                throw new Exception("Nama harus berupa alfabet \n \n Contoh: D1233 bukan 1234D");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
           }
    }//GEN-LAST:event_textNamaFocusLost

    private void textIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textIDFocusLost
        // TODO add your handling code here:
          if (textID.getText().isEmpty()) {
            return;
        }
          
        String cek = textID.getText();
        if (!cek.matches("^[M|D|U][\\d+].*")) {
            try {
                textID.setText("");
                throw new Exception("ID harus diawali dengan huruf \n M {untuk Mahasiswa) \n dan kemudian diikuti dengan angka \n \n Contoh : M3334 bukan 3334M");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
            }
        
          }
    }//GEN-LAST:event_textIDFocusLost

    private void textNomorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textNomorFocusLost
        // TODO add your handling code here:
          if (textNomor.getText().isEmpty()) {
            return;} 
          
             String cek = textNomor.getText();
        if ( Dosenku.isSelected() && cek.length()!=16 || !cek.matches("[0-9]+"))  {
            try {
                textNomor.setText("");
                throw new Exception(" \n harus minimal 16 digit angka\n Contoh : 123456789101112");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
                
        if (MahasiswaKu.isSelected() && cek.length()!=9 || !cek.matches("[0-9]+")) {
            try {
                 textNomor.setText("");
                throw new Exception("harus minimal 9 digit angka\n Contoh : 123456789");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
            
        }
        }
           
        if (Masyarakat.isSelected() && cek.length()!=18 || !cek.matches("[0-9]+")) {
            try {
                 textNomor.setText("");
                throw new Exception("harus minimal 18 digit angka\n Contoh : 1234567891011121");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
            
        }
               }
        
               
    
    }//GEN-LAST:event_textNomorFocusLost

    private void textJumPinjamFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textJumPinjamFocusLost
        // TODO add your handling code here:
         if (textJumPinjam.getText().isEmpty()) {
            return;
        }
         {
        String cek = textJumPinjam.getText();
        if (Dosenku.isSelected()) {
            if (Integer.parseInt(cek) > 6)
            try {
                throw new Exception("Jumlah Pinjam Tidak boleh lebih dari 7");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
     
        String cek2 = textJumPinjam.getText();
        if (MahasiswaKu.isSelected()) {
            if (Integer.parseInt(cek2) > 7) {
            try {
                throw new Exception("Jumlah Pinjam Tidak boleh lebih dari 5");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            }
        }
        
        String cek3 = textJumPinjam.getText();
        if (Masyarakat.isSelected()) {
            if (Integer.parseInt(cek3) > 3) {
            try {
                throw new Exception("Jumlah pinjam Tidak Boleh Lebih dari 3");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            }
        }
         }
        
    }//GEN-LAST:event_textJumPinjamFocusLost

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        // TODO add your handling code here:
        dispose();
        
    }//GEN-LAST:event_KeluarActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        clrInput();
        
    }//GEN-LAST:event_ResetActionPerformed

    private void BorrowTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BorrowTKeyPressed
        // TODO add your handling code here:
          
         int selectedRow = BorrowT.getSelectedRow();
        textID.setText(tModel.getValueAt(selectedRow, 0).toString());
        textNomor.setText(tModel.getValueAt(selectedRow, 1).toString());
        textNama.setText(tModel.getValueAt(selectedRow, 2).toString());
        textAlamat.setText(tModel.getValueAt(selectedRow, 3).toString());
        textJumPinjam.setText(tModel.getValueAt(selectedRow, 4).toString());
    }//GEN-LAST:event_BorrowTKeyPressed

    private void BorrowTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrowTMouseClicked
        // TODO add your handling code here:
          int selectedRow = BorrowT.getSelectedRow();
        textID.setText(tModel.getValueAt(selectedRow, 0).toString());
        textNomor.setText(tModel.getValueAt(selectedRow, 1).toString());
        textNama.setText(tModel.getValueAt(selectedRow, 2).toString());
        textAlamat.setText(tModel.getValueAt(selectedRow, 3).toString());
        textJumPinjam.setText(tModel.getValueAt(selectedRow, 4).toString());
    }//GEN-LAST:event_BorrowTMouseClicked

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
            java.util.logging.Logger.getLogger(Borrow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Borrow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Borrow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Borrow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }
       public void tampilData() {
        String[] kolom = {"Id Peminjam", "Identitas", "Nama", "Alamat", "Maksimal Pinjam"};
        String[] arrData = null;
        String noID = "0";
        String nomor = "";
        Object[][] objData = new Object[dtPeminjam.peminjamList.size()][5]; // 4 merupakan jumlah kolom
        int i = 0;
        for (Peminjam n : dtPeminjam.peminjamList) {
            if (n instanceof Dosen) {
                noID = ((Dosen) n).getNip();
            }
            if (n instanceof Mahasiswa) {
                noID = ((Mahasiswa) n).getNim();
            }
            if (n instanceof Umum) {
                noID = ((Umum) n).getNik();
            }
            arrData = new String[]{n.getId(), noID, n.getNama(), n.getAlamat(), String.valueOf(n.getPinjam())};
            objData[i] = arrData;
            i++;
        }
        tModel = new DefaultTableModel(objData, kolom) {
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        };
        BorrowT.setModel(tModel);
        cModel = BorrowT.getColumnModel();
        cModel.getColumn(0).setPreferredWidth(30);
        cModel.getColumn(1).setPreferredWidth(50);
        cModel.getColumn(2).setPreferredWidth(150);
        cModel.getColumn(3).setPreferredWidth(300);
        cModel.getColumn(4).setPreferredWidth(30);
    }


  private void clrInput() {
        textID.setText("");
        textNomor.setText("");
        textNama.setText("");
        textAlamat.setText("");
        textJumPinjam.setText("");
        textID.requestFocus();
        Dosenku.setSelected(true);
    }

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BorrowT;
    private javax.swing.JRadioButton Dosenku;
    private javax.swing.JLabel IniJumPinjam;
    private javax.swing.JButton Keluar;
    private javax.swing.JRadioButton MahasiswaKu;
    private javax.swing.JRadioButton Masyarakat;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Tambah;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel iniAlamat;
    private javax.swing.JLabel iniID;
    private javax.swing.JLabel iniNama;
    private javax.swing.JLabel iniNomor;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField textAlamat;
    private javax.swing.JTextField textID;
    private javax.swing.JTextField textJumPinjam;
    private javax.swing.JTextField textNama;
    private javax.swing.JTextField textNomor;
    // End of variables declaration//GEN-END:variables
}