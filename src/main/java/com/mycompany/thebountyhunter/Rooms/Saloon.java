/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thebountyhunter.Rooms;

import com.mycompany.thebountyhunter.Accesso;
import static com.mycompany.thebountyhunter.Commands.*;
import com.mycompany.thebountyhunter.ProjectObject;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.SwingWorker;
import javax.swing.Timer;

public class Saloon extends javax.swing.JFrame {

    WindowListener l = new WindowListener() {
        @Override
        public void windowOpened(WindowEvent arg0) {

            SwingWorker<Void, String> worker = new SwingWorker<Void, String>() {

                @Override
                protected Void doInBackground() throws Exception {
                    this.publish(new String[]{"Sconosciuto: Cosa ci fa qui il cacciatore di taglie più temuto di tutto il Lemoyne?"});
                    Thread.sleep(5000);
                    this.publish(new String[]{"Arthur: Parli con me?"});
                    Thread.sleep(5000);
                    this.publish(new String[]{"Sconosciuto: Ti ho riconosciuto dalla vistosa cicatrice sul tuo viso…Ho un lavoro per te…"});
                    Thread.sleep(5000);
                    this.publish(new String[]{"Arthur: Non sono interessato al momento…"});
                    Thread.sleep(5000);
                    this.publish(new String[]{"Sconosciuto: Dai un’occhiata, sono sicuro che cambierai idea…Per ulteriori dettagli ho lasciato in posta un messaggio per te…"});
                    Thread.sleep(5000);
                    this.publish("");
                    Saloon.this.message.setVisible(true);
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

    public static ProjectObject  messaggio;
   
    
    public Saloon() {
        initComponents();
        this.message.setVisible(false);
        this.avanzamento.setVisible(false);
        luogo.setText("Saloon Saint Denis");
        messaggio = new ProjectObject(3, "messaggio", "/images/messaggio.png", message, this);
        addWindowListener(l);
      
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
        message = new javax.swing.JButton();
        avanzamento = new javax.swing.JButton();
        text = new javax.swing.JLabel();
        luogo = new javax.swing.JLabel();
        sfondo = new javax.swing.JLabel();
        luogo1 = new javax.swing.JLabel();

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
        getContentPane().add(satchel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 500, -1, -1));

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

        message.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/messaggio.png"))); // NOI18N
        message.setBorderPainted(false);
        message.setContentAreaFilled(false);
        message.setFocusPainted(false);
        message.setName(""); // NOI18N
        message.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageActionPerformed(evt);
            }
        });
        getContentPane().add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 580, 100, 70));

        avanzamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/avanzamento.png"))); // NOI18N
        avanzamento.setBorder(null);
        avanzamento.setBorderPainted(false);
        avanzamento.setContentAreaFilled(false);
        avanzamento.setFocusPainted(false);
        avanzamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avanzamentoActionPerformed(evt);
            }
        });
        getContentPane().add(avanzamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 200, 70, 90));

        text.setBackground(new java.awt.Color(0, 0, 0));
        text.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        text.setForeground(new java.awt.Color(255, 255, 255));
        text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text.setOpaque(true);
        getContentPane().add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 1280, 40));

        luogo.setBackground(new java.awt.Color(0, 0, 0));
        luogo.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        luogo.setForeground(new java.awt.Color(255, 255, 255));
        luogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        luogo.setOpaque(true);
        getContentPane().add(luogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 260, 90));

        sfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Room0.jpg"))); // NOI18N
        getContentPane().add(sfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        luogo1.setBackground(new java.awt.Color(0, 0, 0));
        luogo1.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        luogo1.setForeground(new java.awt.Color(255, 255, 255));
        luogo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        luogo1.setOpaque(true);
        getContentPane().add(luogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 260, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void messageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageActionPerformed
       
          
        PickObject(messaggio);
        Accesso.p.list.add(messaggio.getId());
        text.setText("Un messaggio misterioso...lo leggerò durante il tragitto per tornare a casa");
        Timer timer = new Timer(5000, event -> {
            text.setText("");
        });
        timer.setRepeats(false);
        timer.start();
        this.avanzamento.setVisible(true);
        
        
    }//GEN-LAST:event_messageActionPerformed

    private void satchelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satchelActionPerformed
        openInventory();
    }//GEN-LAST:event_satchelActionPerformed

    private void avanzamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avanzamentoActionPerformed
       goSouth(this);
    }//GEN-LAST:event_avanzamentoActionPerformed

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
            java.util.logging.Logger.getLogger(Saloon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Saloon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Saloon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Saloon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Saloon().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avanzamento;
    private javax.swing.JLabel luogo;
    private javax.swing.JLabel luogo1;
    private javax.swing.JButton menu;
    private javax.swing.JButton message;
    private javax.swing.JButton satchel;
    public javax.swing.JLabel sfondo;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
