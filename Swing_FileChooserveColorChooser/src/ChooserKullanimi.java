
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gyuce
 */
public class ChooserKullanimi extends javax.swing.JFrame {

    /**
     * Creates new form ChooserKullanimi
     */
    public ChooserKullanimi() {
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

        btn_dosyaac = new javax.swing.JButton();
        btn_renkdegistir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        yazi_alani = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_dosyaac.setText("Dosya Aç");
        btn_dosyaac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dosyaacActionPerformed(evt);
            }
        });

        btn_renkdegistir.setText("Renk Değiştir");
        btn_renkdegistir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_renkdegistirActionPerformed(evt);
            }
        });

        yazi_alani.setColumns(20);
        yazi_alani.setRows(5);
        jScrollPane1.setViewportView(yazi_alani);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_dosyaac)
                .addGap(39, 39, 39)
                .addComponent(btn_renkdegistir)
                .addGap(130, 130, 130))
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_dosyaac)
                    .addComponent(btn_renkdegistir))
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_dosyaacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dosyaacActionPerformed
        JFileChooser fc = new JFileChooser();
        
        int i = fc.showOpenDialog(this);
        
        if (i == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            
            String content = "";
            try(Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)))) {
                
                while (scanner.hasNextLine()) {                    
                    content += scanner.nextLine() + "\n";
                }
                yazi_alani.setText(content);
            }   catch (FileNotFoundException ex) {
                Logger.getLogger(ChooserKullanimi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_dosyaacActionPerformed

    private void btn_renkdegistirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_renkdegistirActionPerformed
        Color color = JColorChooser.showDialog(this, "Bir renk seçiniz", Color.RED);
        
        yazi_alani.setForeground(color);
    }//GEN-LAST:event_btn_renkdegistirActionPerformed

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
            java.util.logging.Logger.getLogger(ChooserKullanimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChooserKullanimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChooserKullanimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChooserKullanimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChooserKullanimi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_dosyaac;
    private javax.swing.JButton btn_renkdegistir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea yazi_alani;
    // End of variables declaration//GEN-END:variables
}