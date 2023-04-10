/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author lenam
 */
public class Order_HE161914 {
   private int oid;
   private int aid;
   private String date;
   private float total;

    public Order_HE161914() {
    }

    public Order_HE161914(int oid, int aid, String date, float total) {
        this.oid = oid;
        this.aid = aid;
        this.date = date;
        this.total = total;
    }

    public int getOid() {
        return oid;
    }

    public int getAid() {
        return aid;
    }

    public String getDate() {
        return date;
    }

    public float getTotal() {
        return total;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTotal(float total) {
        this.total = total;
    }
   
   
}
