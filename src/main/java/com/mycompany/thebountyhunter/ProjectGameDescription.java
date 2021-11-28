/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thebountyhunter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ProjectGameDescription {

    public static final List<Room> rooms = new ArrayList<>();

    private static final Inventory inventory = new Inventory();

    private static final Menu menu = new Menu();

    private static final Catalogo catalogom = new Catalogo();

    private static final Catalogo catalogoa = new Catalogo();

    private Room currentRoom;

    public static List<Room> getRooms() {
        return rooms;
    }

    public static Inventory getInventory() {
        return inventory;
    }

    public static Menu getMenu() {
        return menu;
    }

    public static Catalogo getCatalogoM() {
        return catalogom;
    }

    public static Catalogo getCatalogoA() {
        return catalogoa;
    }

    public static void getSavedRoom(List<Room> roster, Predicate<Room> tester) {
        roster.stream().filter(p -> (tester.test(p))).forEachOrdered(p -> {
            p.getThisRoom().setVisible(true);
        });
    }

}
