/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thebountyhunter;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ProjectObject extends JButton {

    private int id;

    private String objectName;

    private String imagePath;

    private JButton object;

    private JFrame thisRoom;
    
    private int enable = 1;

    private int reusable = 0;


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public int isEnable() {
        return this.enable;
    }

    public void setEnable(int enable) {
        this.enable = enable;
    }

    public int isReusable() {
        return this.reusable;
    }

    public void setReusable(int reusable) {
        this.reusable = reusable;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getObjectName() {
        return this.objectName;
    }

    public String getImagePath() {
        return this.imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public void setObject(JButton object) {
        this.object = object;
    }

    public JButton getObject() {
        return this.object;
    }

    public JFrame getThisRoom() {
        return this.thisRoom;
    }

    public ProjectObject() {
    }

    public ProjectObject(int id, String objectName) {
        this.id = id;
        this.objectName = objectName;
    }
    
    public ProjectObject(int id, String objectName, String imagePath, JButton object, JFrame thisRoom) {
        this.id = id;
        this.objectName = objectName;
        this.imagePath = imagePath;
        this.object = object;
        this.thisRoom = thisRoom;
        object.addActionListener(this.actionListener);
        SetObjectImage();
    }

    public ProjectObject(int id, String objectName, String imagePath, JButton object, JFrame thisRoom, int reusable) {
        this.id = id;
        this.objectName = objectName;
        this.imagePath = imagePath;
        this.object = object;
        this.thisRoom = thisRoom;
        this.reusable = reusable;
        object.addActionListener(this.actionListener);
        SetObjectImage();
    }

    public ProjectObject(int id, String objectName, String imagePath, JButton object, JFrame thisRoom, int enable, int reusable) {
        this.id = id;
        this.objectName = objectName;
        this.imagePath = imagePath;
        this.object = object;
        this.thisRoom = thisRoom;
        this.enable = enable;
        this.reusable = reusable;
        object.addActionListener(this.actionListener);
        SetObjectImage();
    }

      
    public ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            if (isReusable() == 0) {
                object.setVisible(false);
            }
        }
    };

    public void SetObjectImage() {
        ImageIcon icon = new ImageIcon();
        icon = (ImageIcon) object.getIcon();
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(object.getWidth(), object.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        object.setIcon(scaledIcon);
        this.object.setToolTipText(objectName);
        this.object.setContentAreaFilled(false);
        this.object.setFocusPainted(false);
    }
    
    
    public boolean equals(ProjectObject obj) {
        return (this.id == obj.getId());
    }
}
