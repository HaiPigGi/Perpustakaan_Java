

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ROG
 */
public class Mperpus extends javax.swing.JFrame {

    public isiPerpus isi;

    /**
     * Creates new form Mperpus
     */
    public Mperpus() {
        initComponents();
        isi = new isiPerpus();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNIN: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        Kolek = new javax.swing.JMenuItem();
        Pinjam = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        Pinjamn = new javax.swing.JMenuItem();
        Balikin = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        HELP = new javax.swing.JMenuItem();

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

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\usd.png")); // NOI18N

        jMenu4.setText("File");
        jMenu4.add(jSeparator1);

        Kolek.setText("Koleksi");
        Kolek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KolekActionPerformed(evt);
            }
        });
        jMenu4.add(Kolek);

        Pinjam.setText("Peminjam");
        Pinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PinjamActionPerformed(evt);
            }
        });
        jMenu4.add(Pinjam);

        jMenuBar2.add(jMenu4);

        jMenu5.setText("Transaksi");

        Pinjamn.setText("Pinjam");
        Pinjamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PinjamnActionPerformed(evt);
            }
        });
        jMenu5.add(Pinjamn);

        Balikin.setText("Kembali");
        Balikin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BalikinActionPerformed(evt);
            }
        });
        jMenu5.add(Balikin);

        jMenuBar2.add(jMenu5);

        jMenu6.setText("Tampil");

        jMenu1.setText("Koleksi");

        jMenuItem6.setText("Buku");
        jMenu1.add(jMenuItem6);

        jMenuItem7.setText("Majalah");
        jMenu1.add(jMenuItem7);

        jMenuItem8.setText("Disk");
        jMenu1.add(jMenuItem8);

        jMenu6.add(jMenu1);

        jMenuBar2.add(jMenu6);

        jMenu2.setText("Help");

        HELP.setText("Tentang Program");
        HELP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HELPActionPerformed(evt);
            }
        });
        jMenu2.add(HELP);

        jMenuBar2.add(jMenu2);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PinjamActionPerformed
        Borrow pinjm = new Borrow(this, true, isi);
        pinjm.setVisible(true);
    }//GEN-LAST:event_PinjamActionPerformed

    private void KolekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KolekActionPerformed
        Mkoleksi colek = new Mkoleksi(this, true, isi);
        colek.setVisible(true);
    }//GEN-LAST:event_KolekActionPerformed

    private void PinjamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PinjamnActionPerformed
        // TODO add your handling code here:
        Mtransaksi dialogTransaksi = new Mtransaksi(this,true, isi);
        dialogTransaksi.setVisible(true);
    }//GEN-LAST:event_PinjamnActionPerformed

    private void BalikinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BalikinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BalikinActionPerformed

    private void HELPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HELPActionPerformed
        // TODO add your handling code here:
        Mhelp dialogHelp = new Mhelp(this, true, isi);
        dialogHelp.setVisible(true);
    }//GEN-LAST:event_HELPActionPerformed

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
            java.util.logging.Logger.getLogger(Mperpus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mperpus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mperpus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mperpus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mperpus().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Balikin;
    private javax.swing.JMenuItem HELP;
    private javax.swing.JMenuItem Kolek;
    private javax.swing.JMenuItem Pinjam;
    private javax.swing.JMenuItem Pinjamn;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
