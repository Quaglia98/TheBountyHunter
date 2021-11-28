/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thebountyhunter.Rooms;

import com.mycompany.thebountyhunter.Accesso;
import static com.mycompany.thebountyhunter.Commands.*;
import com.mycompany.thebountyhunter.Game;
import static com.mycompany.thebountyhunter.Inventory.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import static java.lang.String.valueOf;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

public class Sentiero extends javax.swing.JFrame {

    WindowListener l = new WindowListener() {
        @Override
        public void windowOpened(WindowEvent arg0) {

            SwingWorker<Void, String> worker = new SwingWorker<Void, String>() {

                @Override
                protected Void doInBackground() throws Exception {
                    this.publish(new String[]{"E' da un pò che siete in viaggio"});
                    Thread.sleep(5000);
                    this.publish(new String[]{"Tu e Notturna siete affamati"});
                    Thread.sleep(5000);
                    this.publish(new String[]{"Spero che ci sia del cibo nella bisaccia..."});
                    Thread.sleep(5000);

                    if (findObject(CatalogoMarket.mangime) >= 0) {
                        removeObject(CatalogoMarket.mangime);
                        int index = Accesso.p.list.indexOf(CatalogoMarket.mangime.getId());
                        Accesso.p.list.remove(index);
                        this.publish("Fortunatamente hai mangime per Notturna");
                        Thread.sleep(5000);
                        this.publish("");
                        if (findObject(CasaArthur.cibo_dispensa) >= 0) {
                            this.publish("E hai del cibo per te");
                            Thread.sleep(5000);
                            this.publish("");
                            removeObject(CasaArthur.cibo_dispensa);
                            int index2 = Accesso.p.list.indexOf(CasaArthur.cibo_dispensa.getId());
                            Accesso.p.list.remove(index2);
                        } else if (findObject(CatalogoMarket.carne) >= 0) {
                            this.publish("E hai del cibo per te");
                            Thread.sleep(5000);
                            this.publish("");
                            removeObject(CatalogoMarket.carne);
                        } else if (findObject(CatalogoMarket.pesce) >= 0) {
                            this.publish("E hai del cibo per te");
                            Thread.sleep(5000);
                            this.publish("");
                            removeObject(CatalogoMarket.pesce);
                        } else {
                            this.publish("Ma purtroppo non hai cibo per te");
                            Thread.sleep(5000);
                            this.publish("");
                            JOptionPane.showMessageDialog(thisroom, "Sei morto, non avevi cibo per Arthur", "Morte giocatore", JOptionPane.ERROR_MESSAGE);
                            dispose();

                        }
                    } else {
                        this.publish("Non c'è mangime per Notturna");
                        Thread.sleep(5000);
                        this.publish("");
                        JOptionPane.showMessageDialog(thisroom, "Sei morto, non avevi cibo per Notturna", "Morte giocatore", JOptionPane.ERROR_MESSAGE);
                        dispose();

                    }

                    avanzamento.setVisible(true);
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

    JFrame thisroom;

    public Sentiero() {
        initComponents();
        avanzamento.setVisible(false);
        luogo.setText("Sentiero Caliga Hall");
        thisroom = this;
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

        menu = new javax.swing.JButton();
        satchel = new javax.swing.JButton();
        avanzamento = new javax.swing.JButton();
        text = new javax.swing.JLabel();
        luogo = new javax.swing.JLabel();
        sfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TheBountyHunter");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(satchel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 550, -1, -1));

        avanzamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/avanzamento.png"))); // NOI18N
        avanzamento.setContentAreaFilled(false);
        avanzamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avanzamentoActionPerformed(evt);
            }
        });
        getContentPane().add(avanzamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 90, 80));

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
        getContentPane().add(luogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 230, 90));

        sfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sentiero.png"))); // NOI18N
        getContentPane().add(sfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        MenuUscita.salva.setVisible(false);
        openMenu();
    }//GEN-LAST:event_menuActionPerformed

    private void avanzamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avanzamentoActionPerformed
        int newid = Game.scenaguardie.getId();
        Accesso.p.setRoom(newid);
        MenuUscita.idroom.setText("Room: " + valueOf(newid));
        goWest(this);
    }//GEN-LAST:event_avanzamentoActionPerformed

    private void satchelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satchelActionPerformed

        openInventory();
    }//GEN-LAST:event_satchelActionPerformed

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
            java.util.logging.Logger.getLogger(Sentiero.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sentiero.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sentiero.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sentiero.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sentiero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avanzamento;
    private javax.swing.JLabel luogo;
    private javax.swing.JButton menu;
    private javax.swing.JButton satchel;
    public javax.swing.JLabel sfondo;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
