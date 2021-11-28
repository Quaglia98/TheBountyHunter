/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thebountyhunter;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Catalogo {

    private JFrame catalogoform;
    private JLabel background;

    public Catalogo() {
    }

    public JLabel getBackground() {
        return background;
    }

    public void setBackground(JLabel background) {
        this.background = background;
    }

    public void setCatalogoForm(JFrame catalogoform) {
        this.catalogoform = catalogoform;
    }

    public JFrame getCatalogoForm() {
        return catalogoform;
    }
}
