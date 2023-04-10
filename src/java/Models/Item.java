  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Southern Alula
 */
public class Item {
    private Book_HE161914 book;
    private int quantity;
    private float total;

    public Item() {
    }

    public Item(Book_HE161914 book, int quantity, float total) {
        this.book = book;
        this.quantity = quantity;
        this.total = total;
    }

    public Book_HE161914 getBook() {
        return book;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getTotal() {
        return total;
    }

    public void setBook(Book_HE161914 book) {
        this.book = book;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    

    
    
    
}
