/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PenampilGambar;

import java.awt.CardLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class AppPenampilGambar extends javax.swing.JFrame {

    /**
     * Creates new form AppPenampilGambar
     */
    public AppPenampilGambar() {
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

        imgPanel = new javax.swing.JPanel();
        lblImg1 = new javax.swing.JLabel();
        lblImg2 = new javax.swing.JLabel();
        lblImg3 = new javax.swing.JLabel();
        btnPanel = new javax.swing.JPanel();
        btnImg1 = new javax.swing.JButton();
        btnImg2 = new javax.swing.JButton();
        btnImg3 = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        imgPanel.setLayout(new java.awt.CardLayout());

        lblImg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/img1.jpg"))); // NOI18N
        imgPanel.add(lblImg1, "0");
        lblImg1.getAccessibleContext().setAccessibleName("0");
        lblImg1.getAccessibleContext().setAccessibleDescription("null");

        lblImg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/img2.jpg"))); // NOI18N
        imgPanel.add(lblImg2, "1");
        lblImg2.getAccessibleContext().setAccessibleName("1");
        lblImg2.getAccessibleContext().setAccessibleDescription("null");

        lblImg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/img3.jpg"))); // NOI18N
        imgPanel.add(lblImg3, "2");
        lblImg3.getAccessibleContext().setAccessibleName("2");
        lblImg3.getAccessibleContext().setAccessibleDescription("null");

        getContentPane().add(imgPanel, java.awt.BorderLayout.PAGE_START);

        btnImg1.setText("Image 1");
        btnImg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImg1ActionPerformed(evt);
            }
        });
        btnPanel.add(btnImg1);

        btnImg2.setText("Image 2");
        btnImg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImg2ActionPerformed(evt);
            }
        });
        btnPanel.add(btnImg2);

        btnImg3.setText("Image 3");
        btnImg3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImg3ActionPerformed(evt);
            }
        });
        btnPanel.add(btnImg3);

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        btnPanel.add(btnExit);

        getContentPane().add(btnPanel, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImg1ActionPerformed
        // TODO add your handling code here:
        CardLayout cl =(CardLayout)(imgPanel.getLayout());
        cl.show(imgPanel, "0");
    }//GEN-LAST:event_btnImg1ActionPerformed

    private void btnImg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImg2ActionPerformed
        // TODO add your handling code here:
        CardLayout cl =(CardLayout)(imgPanel.getLayout());
        cl.show(imgPanel, "1");
    }//GEN-LAST:event_btnImg2ActionPerformed

    private void btnImg3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImg3ActionPerformed
        // TODO add your handling code here:
        CardLayout cl =(CardLayout)(imgPanel.getLayout());
        cl.show(imgPanel, "2");
    }//GEN-LAST:event_btnImg3ActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(AppPenampilGambar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppPenampilGambar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppPenampilGambar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppPenampilGambar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppPenampilGambar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnImg1;
    private javax.swing.JButton btnImg2;
    private javax.swing.JButton btnImg3;
    private javax.swing.JPanel btnPanel;
    private javax.swing.JPanel imgPanel;
    private javax.swing.JLabel lblImg1;
    private javax.swing.JLabel lblImg2;
    private javax.swing.JLabel lblImg3;
    // End of variables declaration//GEN-END:variables
}
