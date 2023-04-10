/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.List;

/**
 *
 * @author lenam
 */
public class Book_HE161914 {

    private int bid;
    private Category_HE161914 category;
    private String bname;
    private String author;
    private String image;
    private Publisher_HE161914 publisher;
    private int quantity;
    private String describe;
    private float price;

    public Book_HE161914() {
    }

    public Book_HE161914(int bid, Category_HE161914 category, String bname, String author, String image, Publisher_HE161914 publisher, int quantity, String describe, float price) {
        this.bid = bid;
        this.category = category;
        this.bname = bname;
        this.author = author;
        this.image = image;
        this.publisher = publisher;
        this.quantity = quantity;
        this.describe = describe;
        this.price = price;
    }

    public int getBid() {
        return bid;
    }

    public Category_HE161914 getCategory() {
        return category;
    }

    public String getBname() {
        return bname;
    }

    public String getAuthor() {
        return author;
    }

    public String getImage() {
        return image;
    }

    public Publisher_HE161914 getPublisher() {
        return publisher;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDescribe() {
        return describe;
    }

    public float getPrice() {
        return price;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public void setCategory(Category_HE161914 category) {
        this.category = category;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setPublisher(Publisher_HE161914 publisher) {
        this.publisher = publisher;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public List<Publisher_HE161914> getAllPublisher() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
