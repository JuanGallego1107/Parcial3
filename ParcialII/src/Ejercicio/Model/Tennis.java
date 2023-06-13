package Ejercicio.Model;

import java.io.Serializable;

public class Tennis implements Serializable {
    private String id;
    private Integer accesedId;
    private  String tennisBrand;
    private String tennisModel;
    private String color;
    private int price;

    public Tennis(String id, String tennisBrand, String tennisModel, String color, int price) {
        this.id = id;
        this.tennisBrand = tennisBrand;
        this.tennisModel = tennisModel;
        this.color = color;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public Integer getAccesedId() {
        return accesedId;
    }

    public String getTennisBrand() {
        return tennisBrand;
    }

    public String getTennisModel() {
        return tennisModel;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public void setAccesedId(Integer accesedId) {
        this.accesedId = accesedId;
    }

    public String toString() {
        return "Id: "+id+
                "\nTennis Brand: "+tennisBrand+
                "\nTennis Model: "+tennisModel+
                "\nColor:  "+color+
                "\nPrice: "+price+"."+
                "\n===================================";
    }
}
