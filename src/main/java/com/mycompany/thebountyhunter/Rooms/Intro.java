/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thebountyhunter.Rooms;


import static com.mycompany.thebountyhunter.Commands.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class Intro extends javax.swing.JFrame {

    public Intro() {
        initComponents();
        StyledDocument doc = text.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        doc.setParagraphAttributes(0, doc.getLength(), center, false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inizia = new javax.swing.JButton();
        text = new javax.swing.JTextPane();
        sfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TheBountyHunter");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inizia.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        inizia.setForeground(new java.awt.Color(255, 255, 255));
        inizia.setText("CLICCA PER CONTINUARE");
        inizia.setBorderPainted(false);
        inizia.setContentAreaFilled(false);
        inizia.setFocusPainted(false);
        inizia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniziaActionPerformed(evt);
            }
        });
        getContentPane().add(inizia, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 290, 70));

        text.setEditable(false);
        text.setBorder(null);
        text.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        text.setText("L’avventura è ambientata nel 1900 in Saint Denis, una città del Lemoyne (USA). Il protagonista è Arthur Morgan, un cacciatore di taglie famosissimo in tutto il Lemoyne, per aver fatto fuori centinaia di criminali che creavano scompiglio in zona. Al protagonista verrà affidata una missione lavorativa che non potrà rifiutare, in quanto la persona da uccidere è il killer di suo fratello, ovvero Angelo Bronte, un noto Boss italiano in Saint Denis, su cui pendono pesanti accuse di omicidi, contrabbando e traffici illegali. Arthur accompagnato dal suo destriero Notturna si dirigerà verso il quartier generale del boss, ma dovrà superare diversi ostacoli che lo metteranno in pericolo. ");
        text.setFocusable(false);
        text.setOpaque(false);
        getContentPane().add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 980, 140));

        sfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/intro.jpg"))); // NOI18N
        getContentPane().add(sfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniziaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniziaActionPerformed
       goScene(this);
        
    }//GEN-LAST:event_iniziaActionPerformed

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
            java.util.logging.Logger.getLogger(Intro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Intro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Intro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Intro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Intro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton inizia;
    public javax.swing.JLabel sfondo;
    private javax.swing.JTextPane text;
    // End of variables declaration//GEN-END:variables
}
