/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author lenam
 */
public class OrderDetail_HE161914 {
    private int id;
    private int oid;
    private int bid;
    private int quantity;
    private float price;
    private float total;

    public OrderDetail_HE161914() {
    }

    public OrderDetail_HE161914(int id, int oid, int bid, int quantity, float price, float total) {
        this.id = id;
        this.oid = oid;
        this.bid = bid;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public int getOid() {
        return oid;
    }

    public int getBid() {
        return bid;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getPrice() {
        return price;
    }

    public float getTotal() {
        return total;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    
}
