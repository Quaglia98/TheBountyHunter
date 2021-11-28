/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thebountyhunter;

import java.io.Serializable;
import java.util.ArrayList;



public class Progresso implements Serializable {

    private String nome, password;
    private Progresso p;
    public int soldi;
    private int idroom;
    public ArrayList<Integer> list = new ArrayList<>();
    
    public Progresso() {
        p = this;
    }

    public Progresso getAccess() {
        return p;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRoom(int idroom) {
        this.idroom = idroom;
    }

    public int getRoom() {
        return idroom;
    }
    
    public void setList(ArrayList<Integer> list){
        this.list=list;
    }
    
     public ArrayList<Integer> getList(){
        return list;
    }
    
    public Progresso getDp() {
        return p;
    }

    public void setDp(Progresso p) {
        this.p = p;
    }

    public void setSoldi(int soldi) {
        this.soldi = soldi;
    }

    public int getSoldi() {
        return soldi;
    }
    
}
