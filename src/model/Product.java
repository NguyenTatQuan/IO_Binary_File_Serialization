package model;

import java.io.Serializable;

public class Product implements Serializable {
    private double code;
    private String name;
    private double price;
    private double quantyti;
    private String description;

    public Product() {
    }

    public Product(double code, String name, double price, double quantyti, String description) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.quantyti = quantyti;
        this.description = description;
    }

    public double getCode() {
        return code;
    }

    public void setCode(double code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantyti() {
        return quantyti;
    }

    public void setQuantyti(double quantyti) {
        this.quantyti = quantyti;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Mã sản phẩm=" + code +
                ", Tên sản phẩm='" + name + '\'' +
                ", Giá sản phẩm=" + price +
                ", Số lượng=" + quantyti +
                ", Miêu tả sản phẩm='" + description + '\'' +
                '}';
    }
}

