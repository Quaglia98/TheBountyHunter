/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thebountyhunter;

import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Room {

    private final int id;

    private JFrame thisRoom;

    private String background;

    private String name;
    
   
    private JLabel label;
   
    private Room north;

    private Room south;

    private Room east;

    private Room west;
    
    private Room scene;
    
    private Room room;
    
    public Room() {
        this.id = -1;
    }

    public Room(int id, JFrame thisRoom) {
        this.id = id;
        this.thisRoom = thisRoom;
    }

    public Room(int id, JFrame thisRoom, String name) {
        this.id = id;
        this.thisRoom = thisRoom;
        this.name = name;
    }

    public Room(int id, JFrame thisRoom, String background, String name, JLabel label) {
        this.id = id;
        this.thisRoom = thisRoom;
        this.background = background;
        this.name = name;
        this.label = label;
        setWindow(background,label);
    }
    
    public int getId() {
        return this.id;
    }

    public JFrame getThisRoom() {
        return this.thisRoom;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JLabel getLabel() {
        return this.label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public Room getNorth() {
        return this.north;
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public Room getSouth() {
        return this.south;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public Room getEast() {
        return this.east;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public Room getWest() {
        return this.west;
    }

    public void setWest(Room west) {
        this.west = west;
    }
    
    
    public Room getRoom() {
        return room;
    }
    
    public void setRoom(Room room) {
        this.room = room;
    }
    
     public Room getScene() {
        return scene;
    }
     
    public void setScene(Room scene) {
        this.scene = scene;
    }
  
    public boolean equals(JFrame thisRoom) {
        return this.thisRoom == thisRoom;
    }
   
   
    public final void setWindow(String backg, JLabel label) {
        Dimension window = new Dimension(1280, 720);
        thisRoom.setSize(window);
        thisRoom.setResizable(false);
        ImageIcon icon = new ImageIcon(backg);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(window.width, window.height, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        label.setIcon(scaledIcon);
        thisRoom.pack();
        thisRoom.setLocationRelativeTo(null);

    }
    
}
