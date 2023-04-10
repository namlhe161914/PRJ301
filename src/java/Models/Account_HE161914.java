/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author lenam
 */
public class Account_HE161914 {

    private int id;
    private String username;
    private String pass;
    private String email;
    private int role;
    private int phone;
    private String address;
    private String avatar;

    public Account_HE161914() {
    }

    public Account_HE161914(int id, String username, String pass, String email, int role, int phone, String address, String avatar) {
        this.id = id;
        this.username = username;
        this.pass = pass;
        this.email = email;
        this.role = role;
        this.phone = phone;
        this.address = address;
        this.avatar = avatar;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPass() {
        return pass;
    }

    public String getEmail() {
        return email;
    }

    public int getRole() {
        return role;
    }

    public int getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

}
