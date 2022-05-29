/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package management;

/**
 *
 * @author Giang
 */
public class Category {

    private String id;
    private String name;
    private int price;
    private String producer;
    private String dvt;
    private float number;

    public Category() {

    }

    public Category(String id, String name, int price, String producer, String dvt, float number) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.producer = producer;
        this.dvt = dvt;
        this.number = number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getDvt() {
        return dvt;
    }

    public void setDvt(String dvt) {
        this.dvt = dvt;
    }

    public float getNumber() {
        return number;
    }

    public void setNumber(float number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "id=" + id + ", name=" + name + ", price=" + price
                + ", producer=" + producer + ", dvt=" + dvt + ", number=" + number;
    }

}
