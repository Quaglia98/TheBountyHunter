/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thebountyhunter.Rooms;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.List;
import javax.swing.SwingWorker;
import static com.mycompany.thebountyhunter.Commands.*;

public class ScenaNotte extends javax.swing.JFrame {

    
    WindowListener l = new WindowListener() {
        @Override
        public void windowOpened(WindowEvent arg0) {

            SwingWorker<Void, String> worker = new SwingWorker<Void, String>() {

                @Override
                protected Void doInBackground() throws Exception {
                    this.publish(new String[]{"Sei nel sonno più profondo..."});
                    Thread.sleep(3000);
                    this.publish("");
                    ScenaNotte.this.next.setVisible(true);
                    return null;
                }

                @Override
                protected void process(List<String> res) {
                    res.forEach(thistext -> {
                        text.setText(thistext);
                    });
                }

            };

            worker.execute();

        }

        @Override
        public void windowClosing(WindowEvent arg0) {

        }

        @Override
        public void windowClosed(WindowEvent arg0) {
        }

        @Override
        public void windowIconified(WindowEvent arg0) {

        }

        @Override
        public void windowDeiconified(WindowEvent arg0) {
        }

        @Override
        public void windowActivated(WindowEvent arg0) {
        }

        @Override
        public void windowDeactivated(WindowEvent arg0) {
        }
    };

    public ScenaNotte() {
        initComponents();
        addWindowListener(l);
        this.next.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text = new javax.swing.JLabel();
        menu = new javax.swing.JButton();
        next = new javax.swing.JButton();
        Sfondo_notte = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TheBountyHunter");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text.setBackground(new java.awt.Color(0, 0, 0));
        text.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        text.setForeground(new java.awt.Color(255, 255, 255));
        text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text.setOpaque(true);
        getContentPane().add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 1280, 40));

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

        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/next.png"))); // NOI18N
        next.setBorderPainted(false);
        next.setContentAreaFilled(false);
        next.setFocusPainted(false);
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        getContentPane().add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 220, 190));

        Sfondo_notte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/notte.png"))); // NOI18N
        getContentPane().add(Sfondo_notte, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        goScene(this);
    }//GEN-LAST:event_nextActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        MenuUscita.salva.setVisible(false);
        openMenu();
    }//GEN-LAST:event_menuActionPerformed

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
            java.util.logging.Logger.getLogger(ScenaNotte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScenaNotte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScenaNotte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScenaNotte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScenaNotte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Sfondo_notte;
    private javax.swing.JButton menu;
    private javax.swing.JButton next;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
