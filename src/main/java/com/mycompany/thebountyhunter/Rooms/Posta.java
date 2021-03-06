/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thebountyhunter.Rooms;

import com.mycompany.thebountyhunter.Accesso;
import static com.mycompany.thebountyhunter.Commands.*;
import static com.mycompany.thebountyhunter.Inventory.findObject;
import com.mycompany.thebountyhunter.ProjectObject;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.List;
import javax.swing.SwingWorker;
import javax.swing.Timer;

public class Posta extends javax.swing.JFrame {

    WindowListener l = new WindowListener() {
        @Override
        public void windowOpened(WindowEvent arg0) {

            SwingWorker<Void, String> worker = new SwingWorker<Void, String>() {

                @Override
                protected Void doInBackground() throws Exception {
                    this.publish(new String[]{"Craig: PSSS Arthur avvicinati, parliamo a bassa voce"});
                    Thread.sleep(5000);
                    this.publish(new String[]{"Arthur: Non dovrebbe sentirci nessuno"});
                    Thread.sleep(5000);
                    this.publish(new String[]{"Craig: So che devi ritirare una lettera, ho la chiave della casella"});
                    Thread.sleep(5000);
                    this.publish(new String[]{"Arthur: E se ci fosse una bomba? Come posso fidarmi"});
                    Thread.sleep(5000);
                    this.publish(new String[]{"Craig: Fidati, è una missione importante per te"});
                    Thread.sleep(5000);
                    this.publish(new String[]{"Arthur: Allora muoviamoci!"});
                    Thread.sleep(5000);
                    this.publish(new String[]{"Craig: Ecco la chiave, ho dimenticato però il numero di casella"});
                    chiave.setVisible(true);
                    Thread.sleep(5000);
                    this.publish(new String[]{"Arthur: Dannazione hai la memoria di un pesce rosso"});
                    Thread.sleep(5000);
                    this.publish("");
                    fail1.setVisible(true);
                    fail2.setVisible(true);
                    fail3.setVisible(true);
                    fail4.setVisible(true);
                    fail5.setVisible(true);
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

    public static ProjectObject chiaveposta, messaggioposta;
    int tentativi = 0;
    boolean casellachiusa = true;
    boolean lettura = false;

    public Posta() {
        initComponents();
        luogo.setText("Post Office Saint Denis");
        chiave.setVisible(false);
        fail1.setVisible(false);
        fail2.setVisible(false);
        fail3.setVisible(false);
        fail4.setVisible(false);
        fail5.setVisible(false);
        messaggio.setVisible(false);
        chiaveposta = new ProjectObject(11, "chiave casella postale", "/images/keymail.png", chiave, this);
        messaggioposta = new ProjectObject(12, "messaggio della posta", "/images/messaggio2.png", messaggio, this);
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
        messaggio = new javax.swing.JButton();
        chiave = new javax.swing.JButton();
        fail1 = new javax.swing.JButton();
        fail2 = new javax.swing.JButton();
        fail3 = new javax.swing.JButton();
        fail4 = new javax.swing.JButton();
        fail5 = new javax.swing.JButton();
        casellagiusta = new javax.swing.JButton();
        satchel = new javax.swing.JButton();
        south = new javax.swing.JButton();
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

        messaggio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/messaggio2.png"))); // NOI18N
        messaggio.setBorderPainted(false);
        messaggio.setContentAreaFilled(false);
        messaggio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messaggioActionPerformed(evt);
            }
        });
        getContentPane().add(messaggio, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 560, 60, 50));

        chiave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/keymail.png"))); // NOI18N
        chiave.setBorderPainted(false);
        chiave.setContentAreaFilled(false);
        chiave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chiaveActionPerformed(evt);
            }
        });
        getContentPane().add(chiave, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 560, 70, 50));

        fail1.setBorderPainted(false);
        fail1.setContentAreaFilled(false);
        fail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fail1ActionPerformed(evt);
            }
        });
        getContentPane().add(fail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 330, 40, 80));

        fail2.setBorderPainted(false);
        fail2.setContentAreaFilled(false);
        fail2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fail2ActionPerformed(evt);
            }
        });
        getContentPane().add(fail2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 430, 340));

        fail3.setBorderPainted(false);
        fail3.setContentAreaFilled(false);
        fail3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fail3ActionPerformed(evt);
            }
        });
        getContentPane().add(fail3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 250, 100, 70));

        fail4.setBorderPainted(false);
        fail4.setContentAreaFilled(false);
        fail4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fail4ActionPerformed(evt);
            }
        });
        getContentPane().add(fail4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 250, 340, 340));

        fail5.setBorderPainted(false);
        fail5.setContentAreaFilled(false);
        fail5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fail5ActionPerformed(evt);
            }
        });
        getContentPane().add(fail5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 410, 110, 180));

        casellagiusta.setBorderPainted(false);
        casellagiusta.setContentAreaFilled(false);
        casellagiusta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casellagiustaActionPerformed(evt);
            }
        });
        getContentPane().add(casellagiusta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 330, 40, 80));

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
        getContentPane().add(satchel, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, -1, -1));

        south.setBorderPainted(false);
        south.setContentAreaFilled(false);
        south.setFocusPainted(false);
        south.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                southActionPerformed(evt);
            }
        });
        getContentPane().add(south, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 620, 120, 50));

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

        sfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mail.jpg"))); // NOI18N
        getContentPane().add(sfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chiaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chiaveActionPerformed
        PickObject(chiaveposta);
    }//GEN-LAST:event_chiaveActionPerformed

    private void satchelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satchelActionPerformed
        openInventory();
    }//GEN-LAST:event_satchelActionPerformed

    private void fail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fail1ActionPerformed

        if (findObject(chiaveposta) >= 0) {

            if (tentativi == 1) {
                text.setText("Hai avuto degli indizi durante il tragitto");
                Timer timer2 = new Timer(3000, event -> {
                    text.setText("");
                });
                timer2.setRepeats(false);
                timer2.start();
            } else if (tentativi == 20) {
                text.setText("E' un numero dispari");
                Timer timer2 = new Timer(3000, event -> {
                    text.setText("");
                });
                timer2.setRepeats(false);
                timer2.start();
            }
        } else {
            text.setText("Hai bisogno della chiave");
            Timer timer2 = new Timer(3000, event -> {
                text.setText("");
            });
            timer2.setRepeats(false);
            timer2.start();
        }
    }//GEN-LAST:event_fail1ActionPerformed

    private void fail2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fail2ActionPerformed

        if (findObject(chiaveposta) >= 0) {

            tentativi += 1;

            if (tentativi == 1) {
                text.setText("Hai avuto degli indizi durante il tragitto");
                Timer timer2 = new Timer(3000, event -> {
                    text.setText("");
                });
                timer2.setRepeats(false);
                timer2.start();
            } else if (tentativi == 20) {
                text.setText("E' un numero dispari");
                Timer timer2 = new Timer(3000, event -> {
                    text.setText("");
                });
                timer2.setRepeats(false);
                timer2.start();
            }
        } else {
            text.setText("Hai bisogno della chiave");
            Timer timer2 = new Timer(3000, event -> {
                text.setText("");
            });
            timer2.setRepeats(false);
            timer2.start();
        }

    }//GEN-LAST:event_fail2ActionPerformed

    private void fail3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fail3ActionPerformed

        if (findObject(chiaveposta) >= 0) {

            if (tentativi == 1) {
                text.setText("Hai avuto degli indizi durante il tragitto");
                Timer timer2 = new Timer(3000, event -> {
                    text.setText("");
                });
                timer2.setRepeats(false);
                timer2.start();
            } else if (tentativi == 20) {
                text.setText("E' un numero dispari");
                Timer timer2 = new Timer(3000, event -> {
                    text.setText("");
                });
                timer2.setRepeats(false);
                timer2.start();
            }
        } else {
            text.setText("Hai bisogno della chiave");
            Timer timer2 = new Timer(3000, event -> {
                text.setText("");
            });
            timer2.setRepeats(false);
            timer2.start();
        }

    }//GEN-LAST:event_fail3ActionPerformed

    private void fail4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fail4ActionPerformed

        if (findObject(chiaveposta) >= 0) {

            tentativi += 1;

            if (tentativi == 1) {
                text.setText("Hai avuto degli indizi durante il tragitto");
                Timer timer2 = new Timer(3000, event -> {
                    text.setText("");
                });
                timer2.setRepeats(false);
                timer2.start();
            } else if (tentativi == 20) {
                text.setText("E' un numero dispari");
                Timer timer2 = new Timer(3000, event -> {
                    text.setText("");
                });
                timer2.setRepeats(false);
                timer2.start();
            }
        } else {
            text.setText("Hai bisogno della chiave");
            Timer timer2 = new Timer(3000, event -> {
                text.setText("");
            });
            timer2.setRepeats(false);
            timer2.start();
        }

    }//GEN-LAST:event_fail4ActionPerformed

    private void fail5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fail5ActionPerformed

        if (findObject(chiaveposta) >= 0) {

            tentativi += 1;

            if (tentativi == 1) {
                text.setText("Hai avuto degli indizi durante il tragitto");
                Timer timer2 = new Timer(3000, event -> {
                    text.setText("");
                });
                timer2.setRepeats(false);
                timer2.start();
            } else if (tentativi == 20) {
                text.setText("E' un numero dispari");
                Timer timer2 = new Timer(3000, event -> {
                    text.setText("");
                });
                timer2.setRepeats(false);
                timer2.start();
            }
        } else {
            text.setText("Hai bisogno della chiave");
            Timer timer2 = new Timer(3000, event -> {
                text.setText("");
            });
            timer2.setRepeats(false);
            timer2.start();
        }

    }//GEN-LAST:event_fail5ActionPerformed

    private void casellagiustaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casellagiustaActionPerformed

        if (casellachiusa == true) {
            removeObject(chiaveposta);
            fail1.setVisible(false);
            fail2.setVisible(false);
            fail3.setVisible(false);
            fail4.setVisible(false);
            fail5.setVisible(false);
            messaggio.setVisible(true);
            text.setText("Craig: Ce l'hai fatta, chi l'avrebbe mai detto");
            Timer timer = new Timer(3000, event -> {
                text.setText("");
            });
            timer.setRepeats(false);
            timer.start();

            casellachiusa = false;
        }

    }//GEN-LAST:event_casellagiustaActionPerformed

    private void messaggioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messaggioActionPerformed
        PickObject(messaggioposta);
        Accesso.p.list.add(messaggioposta.getId());
        text.setText("Craig: Buona fortuna Arthur!");
        Timer timer = new Timer(3000, event -> {
            text.setText("");
        });
        timer.setRepeats(false);
        timer.start();

    }//GEN-LAST:event_messaggioActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        MenuUscita.salva.setVisible(false);
        openMenu();
    }//GEN-LAST:event_menuActionPerformed

    private void southActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_southActionPerformed

        if (lettura == false && findObject(messaggioposta) >= 0) {
            lettura = true;
            goScene(this);
        } else {
            Incrocio.bandito = true;
            goSouth(this);
        }
    }//GEN-LAST:event_southActionPerformed

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
            java.util.logging.Logger.getLogger(Posta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Posta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Posta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Posta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Posta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton casellagiusta;
    private javax.swing.JButton chiave;
    private javax.swing.JButton fail1;
    private javax.swing.JButton fail2;
    private javax.swing.JButton fail3;
    private javax.swing.JButton fail4;
    private javax.swing.JButton fail5;
    private javax.swing.JLabel luogo;
    private javax.swing.JButton menu;
    private javax.swing.JButton messaggio;
    private javax.swing.JButton satchel;
    public javax.swing.JLabel sfondo;
    private javax.swing.JButton south;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
