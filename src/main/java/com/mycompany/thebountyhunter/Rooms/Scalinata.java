/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thebountyhunter.Rooms;
import static com.mycompany.thebountyhunter.Commands.*;

public class Scalinata extends javax.swing.JFrame {

    public Scalinata() {
        initComponents();
        luogo.setText("Casa di Bronte: scalinata");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        satchel = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        avanzamento = new javax.swing.JButton();
        salone = new javax.swing.JButton();
        luogo = new javax.swing.JLabel();
        sfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TheBountyHunter");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        satchel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Satchel.png"))); // NOI18N
        satchel.setBorder(null);
        satchel.setBorderPainted(false);
        satchel.setContentAreaFilled(false);
        satchel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        satchel.setFocusPainted(false);
        satchel.setMaximumSize(new java.awt.Dimension(150, 109));
        satchel.setMinimumSize(new java.awt.Dimension(150, 109));
        satchel.setPreferredSize(new java.awt.Dimension(150, 109));
        satchel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satchelActionPerformed(evt);
            }
        });
        getContentPane().add(satchel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 560, -1, -1));

        menu.setBackground(new java.awt.Color(255, 51, 0));
        menu.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        menu.setText("MENU DI GIOCO");
        menu.setBorderPainted(false);
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 10, 160, 50));

        avanzamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/avanzamento.png"))); // NOI18N
        avanzamento.setContentAreaFilled(false);
        avanzamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avanzamentoActionPerformed(evt);
            }
        });
        getContentPane().add(avanzamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 620, 90, 80));

        salone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/next.png"))); // NOI18N
        salone.setBorderPainted(false);
        salone.setContentAreaFilled(false);
        salone.setFocusPainted(false);
        salone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saloneActionPerformed(evt);
            }
        });
        getContentPane().add(salone, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 210, 200, -1));

        luogo.setBackground(new java.awt.Color(0, 0, 0));
        luogo.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        luogo.setForeground(new java.awt.Color(255, 255, 255));
        luogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        luogo.setOpaque(true);
        getContentPane().add(luogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 230, 90));

        sfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/scalinata.png"))); // NOI18N
        getContentPane().add(sfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void satchelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satchelActionPerformed
        openInventory();
    }//GEN-LAST:event_satchelActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        MenuUscita.salva.setVisible(false);
        openMenu();
    }//GEN-LAST:event_menuActionPerformed

    private void avanzamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avanzamentoActionPerformed
        goScene(this);
    }//GEN-LAST:event_avanzamentoActionPerformed

    private void saloneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saloneActionPerformed
        goEast(this);
    }//GEN-LAST:event_saloneActionPerformed

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
            java.util.logging.Logger.getLogger(Scalinata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Scalinata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Scalinata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Scalinata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Scalinata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avanzamento;
    private javax.swing.JLabel luogo;
    private javax.swing.JButton menu;
    private javax.swing.JButton salone;
    private javax.swing.JButton satchel;
    public javax.swing.JLabel sfondo;
    // End of variables declaration//GEN-END:variables
}
