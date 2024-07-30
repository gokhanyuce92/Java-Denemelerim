
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gyuce
 */
public class StokUygulamasi extends javax.swing.JFrame {

    /**
     * Creates new form StokUygulamasi
     */
    public StokUygulamasi() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_urun = new javax.swing.JTextField();
        cb_kategori = new javax.swing.JComboBox<>();
        txt_fiyat = new javax.swing.JTextField();
        lbl_mesaj = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        urun_tablosu = new javax.swing.JTable();
        btn_ekle = new javax.swing.JButton();
        btn_guncelle = new javax.swing.JButton();
        btn_sil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ürün İsmi : ");

        jLabel2.setText("Kategori : ");

        jLabel3.setText("Fiyat : ");

        cb_kategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kültür Sanat", "Yemek", "Elektronik" }));

        lbl_mesaj.setForeground(new java.awt.Color(255, 0, 51));

        urun_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ürün İsmi", "Kategori", "Fiyat"
            }
        ));
        urun_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                urun_tablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(urun_tablosu);

        btn_ekle.setText("Ürün Ekle");
        btn_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ekleActionPerformed(evt);
            }
        });

        btn_guncelle.setText("Ürün Güncelle");
        btn_guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guncelleActionPerformed(evt);
            }
        });

        btn_sil.setText("Ürün Sil");
        btn_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_silActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_urun)
                                    .addComponent(cb_kategori, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_fiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(74, 74, 74))
                            .addComponent(lbl_mesaj, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_ekle)
                            .addComponent(btn_guncelle)
                            .addComponent(btn_sil)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_urun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ekle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cb_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_guncelle))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_fiyat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_sil))
                .addGap(18, 18, 18)
                .addComponent(lbl_mesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ekleActionPerformed
        lbl_mesaj.setText("");
        DefaultTableModel model = (DefaultTableModel)urun_tablosu.getModel();
        
        if(txt_urun.getText().trim().equals("")) {
            lbl_mesaj.setText("Ürün ismi boş bırakılamaz");
        }
        else {
            Object[] eklenecek = {txt_urun.getText(), cb_kategori.getSelectedItem().toString(), txt_fiyat.getText()};
            
            model.addRow(eklenecek);
        }
    }//GEN-LAST:event_btn_ekleActionPerformed

    private void btn_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guncelleActionPerformed
        lbl_mesaj.setText("");
        
        DefaultTableModel model = (DefaultTableModel)urun_tablosu.getModel();
        
        int secili_row = urun_tablosu.getSelectedRow();
        
        if (secili_row == -1) {
            if (urun_tablosu.getRowCount() == 0) {
                lbl_mesaj.setText("Ürün tablosu şuanda boş");
            }
            else {
                lbl_mesaj.setText("Lütfen güncellenecek bir ürün seçiniz");
            }
        }
        else {
            model.setValueAt(txt_urun.getText(),  secili_row, 0);
            model.setValueAt(cb_kategori.getSelectedItem().toString(),  secili_row, 1);
            model.setValueAt(txt_fiyat.getText(),  secili_row, 2);
            
            lbl_mesaj.setText("Ürün başarıyla güncellendi");
        }
        
    }//GEN-LAST:event_btn_guncelleActionPerformed

    private void urun_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_urun_tablosuMouseClicked
        lbl_mesaj.setText("");
        
        DefaultTableModel model = (DefaultTableModel)urun_tablosu.getModel();
        
        int secili_row = urun_tablosu.getSelectedRow();
        
        txt_urun.setText(model.getValueAt(secili_row, 0).toString());
        cb_kategori.setSelectedItem(model.getValueAt(secili_row, 1).toString());
        txt_fiyat.setText(model.getValueAt(secili_row, 2).toString());
        
    }//GEN-LAST:event_urun_tablosuMouseClicked

    private void btn_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_silActionPerformed
        lbl_mesaj.setText("");
        DefaultTableModel model = (DefaultTableModel)urun_tablosu.getModel();
        
        int secili_row = urun_tablosu.getSelectedRow();
        
        if (secili_row == -1) {
            if (urun_tablosu.getRowCount() == 0) {
                lbl_mesaj.setText("Ürün tablosu şuanda boş");
            }
            else {
                lbl_mesaj.setText("Lütfen silinecek bir ürün seçiniz");
            }
        }
        else {    
            model.removeRow(secili_row);
            
            lbl_mesaj.setText("Ürün başarıyla silinmiştir");
        }
    }//GEN-LAST:event_btn_silActionPerformed

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
            java.util.logging.Logger.getLogger(StokUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StokUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StokUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StokUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StokUygulamasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ekle;
    private javax.swing.JButton btn_guncelle;
    private javax.swing.JButton btn_sil;
    private javax.swing.JComboBox<String> cb_kategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_mesaj;
    private javax.swing.JTextField txt_fiyat;
    private javax.swing.JTextField txt_urun;
    private javax.swing.JTable urun_tablosu;
    // End of variables declaration//GEN-END:variables
}
