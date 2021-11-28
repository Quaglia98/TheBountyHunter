/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thebountyhunter;

import java.util.List;
import javax.swing.JFrame;


public class Commands {

    private static Room currentRoom = new Room();
    
    private static ProjectObject object = new ProjectObject();

    public static void goNorth(JFrame currentFrame) {
        currentRoom = findCurrentRoom(currentFrame);
        currentRoom.getNorth().getThisRoom().setVisible(true);
        currentRoom.getThisRoom().dispose();
    }

    public static void goSouth(JFrame currentFrame) {
        currentRoom = findCurrentRoom(currentFrame);
        currentRoom.getSouth().getThisRoom().setVisible(true);
        currentRoom.getThisRoom().dispose();
    }

    public static void goEast(JFrame currentFrame) {
        currentRoom = findCurrentRoom(currentFrame);
        currentRoom.getEast().getThisRoom().setVisible(true);
        currentRoom.getThisRoom().dispose();
    }

    public static void goWest(JFrame currentFrame) {
        currentRoom = findCurrentRoom(currentFrame);
        currentRoom.getWest().getThisRoom().setVisible(true);
        currentRoom.getThisRoom().dispose();
    }

    public static void goScene(JFrame currentFrame) {
        currentRoom = findCurrentRoom(currentFrame);
        currentRoom.getScene().getThisRoom().setVisible(true);
        currentRoom.getThisRoom().dispose();
    }
    
 
    public static void goRoom(JFrame currentFrame) {
        currentRoom = findCurrentRoom(currentFrame);
        currentRoom.getRoom().getThisRoom().setVisible(true);
        currentRoom.getThisRoom().dispose();
    }
    
    public static Room findCurrentRoom(JFrame currentFrame) {
        List<Room> rooms = ProjectGameDescription.getRooms();
        Room thisRoom = new Room();
        for (int i = 0; i < rooms.size(); i++) {
            if (((Room) rooms.get(i)).equals(currentFrame)) {
                thisRoom = rooms.get(i);
                break;
            }
        }
        return thisRoom;
    }
    

    public static void openInventory() {
        ProjectGameDescription.getInventory().refreshInventory();
        ProjectGameDescription.getInventory().getInventoryform().setVisible(true);
    }
    
     public static void openMenu() {
       ProjectGameDescription.getMenu().getMenuForm().setVisible(true);
    }
     
    public static void openCatalogoM() {
       ProjectGameDescription.getCatalogoM().getCatalogoForm().setVisible(true);
    }
     
    public static void openCatalogoA() {
       ProjectGameDescription.getCatalogoA().getCatalogoForm().setVisible(true);
    }
     
    public static void PickObject(ProjectObject obj) {
         ProjectGameDescription.getInventory().add(obj);
      
    }

    public static void removeObject(ProjectObject obj) {
        ProjectGameDescription.getInventory().remove(obj);
    }
    
    
}
