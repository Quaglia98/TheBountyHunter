/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thebountyhunter;

import javax.swing.JFrame;
import javax.swing.JLabel;



public class Menu {
    private JFrame menuform;
    private JLabel background;
    
    public Menu(){
    }
    
      public JLabel getBackground() {
        return background;
    }

    public void setBackground(JLabel background) {
        this.background = background;
    }
    
     public void setMenuForm(JFrame menuform) {
        this.menuform = menuform;
    }

    public JFrame getMenuForm() {
        return menuform;
    }
}
