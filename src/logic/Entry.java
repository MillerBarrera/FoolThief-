/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

public class Entry {
    int key;
    Vehicles value;
    Entry next;
    public Entry(int key,Vehicles value){
        this.key = key;
        this.value = value;
        next = null;
    }
    public Entry(){
        next = null;
    }
    public int GetKey(){
        return key;
    }
    public Vehicles GetValue(){
        return value;
    }
}
