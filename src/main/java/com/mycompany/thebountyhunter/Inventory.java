/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thebountyhunter;

import static com.mycompany.thebountyhunter.ProjectGameDescription.getInventory;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Inventory {

    List<ProjectObject> inventoryList = new ArrayList<>();
    List<JButton> buttonList = new ArrayList<>();
    JFrame inventoryform;
    JLabel background;

    public Inventory() {
    }

    public int Size() {
        return inventoryList.size();
    }

    public void setInventoryform(JFrame inventoryform) {
        this.inventoryform = inventoryform;
    }

    public JFrame getInventoryform() {
        return inventoryform;
    }

    public List<ProjectObject> getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(List<ProjectObject> inventory) {
       inventoryList = inventory;
    }

    public JLabel getBackground() {
        return  background;
    }

    public void setBackground(JLabel background) {
        this.background = background;
    }

    public List<JButton> getButtonList() {
        return buttonList;
    }

    public void setButtonList(List<JButton> buttonList) {
       this.buttonList = buttonList;
    }

    public void add(ProjectObject obj) {
        inventoryList.add(obj);
    }

    public void remove(ProjectObject obj) {
        inventoryList.remove(findObject(obj));
    }

    public void refreshInventory() {
        clearInventory(); // pulisce l'inventario prima del reinserimento degli oggetti per evitare duplicati o ritrovarsi con
        // oggetti già usati ancora nell'inventario
        double rows = Math.ceil((double) Size() / (double)7);
        if (rows > 1) {                             //Caso con più righe(Ogni riga è composta da 7 caselle)
            for (int i = 0; i < rows - 1; i++) {    //Riempimento prime righe "complete"
                for (int j = 0; j < 7; j++) {
                    SetButton(j, i);                // Invio colonna e riga corrente per inserire l'oggetto nella casella giusta 
                }
            }
            for (int i = 0; i < Size() - ((rows - 1) * 7); i++) {  //Riempimento ultima riga rimasta
                SetButton(i, (int) (rows - 1));
            }
        } else {
            for (int i = 0; i < Size(); i++) {                     //Caso con una sola riga
                SetButton(i, 0);
            }
        }
        getInventoryform().repaint();
    }

    public void clearInventory() {
        for (int i = 0; i < getButtonList().size(); i++) {
            getInventoryform().getContentPane().remove(getButtonList().get(i));
        }
    }

    public static int findObject(ProjectObject obj) {
        List<ProjectObject> inventory = getInventory().getInventoryList();
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    public void SetButton(int column, int row) {
        JButton jb = new JButton();
        ProjectObject obj = new ProjectObject();
        obj = getInventoryList().get(column + (7 * row));
        jb.setBounds(20 + 65 * column, 20 + 65 * row, 30, 30); //Inserimento nella casella corretta dell'inventario
        SetImageButton(obj, jb);
        jb.setToolTipText(obj.getObjectName());
        getInventoryform().add(jb, (row * 7) + column);
        jb.setVisible(true);
        getButtonList().add(jb);
    }

    public void SetImageButton(ProjectObject o, JButton jb) {
        ImageIcon image = new ImageIcon();
        image = (ImageIcon) o.getObject().getIcon();
        Image img = image.getImage();
        Image newimg = img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
        image = new ImageIcon(newimg);
        jb.setIcon(image);
        jb.setBorderPainted(false);
        jb.setContentAreaFilled(false);
        jb.setFocusPainted(false);
    }
}