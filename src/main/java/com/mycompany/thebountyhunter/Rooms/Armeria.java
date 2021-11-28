/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thebountyhunter.Rooms;

import com.mycompany.thebountyhunter.Accesso;
import static com.mycompany.thebountyhunter.Commands.*;
import static com.mycompany.thebountyhunter.Inventory.findObject;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import static java.lang.String.valueOf;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

public class Armeria extends javax.swing.JFrame {

    WindowListener l = new WindowListener() {
        @Override
        public void windowOpened(WindowEvent arg0) {

            SwingWorker<Void, String> worker = new SwingWorker<Void, String>() {

                @Override
                protected Void doInBackground() throws Exception {
                    this.publish(new String[]{"Ludvig: Qual buon vento Arthur, non ti vedo da un sacco di tempo"});
                    Thread.sleep(5000);
                    this.publish(new String[]{"Arthur: Ma sono passato ieri, stai perdendo colpi, sarà l’età!"});
                    Thread.sleep(5000);
                    this.publish(new String[]{"Ludvig: Poche chiacchiere, non uscire a mani vuote"});
                    Thread.sleep(5000);
                    this.publish("");
                    vendi.setVisible(true);
                    catalogo.setVisible(true);
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

    boolean venduta = false;

    public Armeria() {
        initComponents();
        luogo.setText("Gunsmith Saint Denis");
        catalogo.setVisible(false);
        vendi.setVisible(false);
        addWindowListener(l);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        satchel = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        armaiolo = new javax.swing.JButton();
        catalogo = new javax.swing.JButton();
        vendi = new javax.swing.JButton();
        uscita = new javax.swing.JButton();
        luogo = new javax.swing.JLabel();
        text = new javax.swing.JLabel();
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
        getContentPane().add(satchel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, -1, -1));

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

        armaiolo.setBorderPainted(false);
        armaiolo.setContentAreaFilled(false);
        armaiolo.setFocusPainted(false);
        getContentPane().add(armaiolo, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 230, 260, 340));

        catalogo.setBackground(new java.awt.Color(255, 255, 255));
        catalogo.setForeground(new java.awt.Color(255, 51, 51));
        catalogo.setText("Apri catalogo");
        catalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catalogoActionPerformed(evt);
            }
        });
        getContentPane().add(catalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 200, -1, 30));

        vendi.setBackground(new java.awt.Color(255, 255, 255));
        vendi.setForeground(new java.awt.Color(102, 102, 255));
        vendi.setText("Vendi Revolver");
        vendi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendiActionPerformed(evt);
            }
        });
        getContentPane().add(vendi, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 201, -1, 30));

        uscita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/uscita.png"))); // NOI18N
        uscita.setBorderPainted(false);
        uscita.setContentAreaFilled(false);
        uscita.setFocusPainted(false);
        uscita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uscitaActionPerformed(evt);
            }
        });
        getContentPane().add(uscita, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 630, 140, 30));

        luogo.setBackground(new java.awt.Color(0, 0, 0));
        luogo.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        luogo.setForeground(new java.awt.Color(255, 255, 255));
        luogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        luogo.setOpaque(true);
        getContentPane().add(luogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 230, 90));

        text.setBackground(new java.awt.Color(0, 0, 0));
        text.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        text.setForeground(new java.awt.Color(255, 255, 255));
        text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text.setOpaque(true);
        getContentPane().add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 1280, 40));

        sfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/armeria.jpg"))); // NOI18N
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

    private void uscitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uscitaActionPerformed
       goSouth(this);
    }//GEN-LAST:event_uscitaActionPerformed

    private void vendiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendiActionPerformed
        if (venduta == false) {
            int totale = 0;

            if (findObject(SceltaRevolver.cattleman) >= 0) {
                removeObject(SceltaRevolver.cattleman);
                int index = Accesso.p.list.indexOf(SceltaRevolver.cattleman.getId());
                Accesso.p.list.remove(index);
                totale = Accesso.p.getSoldi() + 100;
                Accesso.p.setSoldi(totale);
                MenuUscita.soldigiocatore.setText("Soldi: $" + valueOf(totale));
            } else if (findObject(SceltaRevolver.heavy) >= 0) {
                removeObject(SceltaRevolver.heavy);
                int index2 = Accesso.p.list.indexOf(SceltaRevolver.heavy.getId());
                Accesso.p.list.remove(index2);
                totale = Accesso.p.getSoldi() + 125;
                Accesso.p.setSoldi(totale);
                MenuUscita.soldigiocatore.setText("Soldi: $" + valueOf(totale));
            } else {
                removeObject(SceltaRevolver.magnum);
                int index3 = Accesso.p.list.indexOf(SceltaRevolver.magnum.getId());
                Accesso.p.list.remove(index3);
                totale = Accesso.p.getSoldi() + 150;
                Accesso.p.setSoldi(totale);
                MenuUscita.soldigiocatore.setText("Soldi: $" + valueOf(totale));
            }
 
            JOptionPane.showMessageDialog(this, "Hai venduto la tua revolver", "informazione", JOptionPane.INFORMATION_MESSAGE);
            
            venduta = true;
        }
        
        else{
            JOptionPane.showMessageDialog(this, "Non hai una revolver da vendere", "errore", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_vendiActionPerformed

    private void catalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catalogoActionPerformed
        openCatalogoA();
    }//GEN-LAST:event_catalogoActionPerformed

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
            java.util.logging.Logger.getLogger(Armeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Armeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Armeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Armeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Armeria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton armaiolo;
    private javax.swing.JButton catalogo;
    private javax.swing.JLabel luogo;
    private javax.swing.JButton menu;
    private javax.swing.JButton satchel;
    public javax.swing.JLabel sfondo;
    public javax.swing.JLabel text;
    private javax.swing.JButton uscita;
    private javax.swing.JButton vendi;
    // End of variables declaration//GEN-END:variables
}
