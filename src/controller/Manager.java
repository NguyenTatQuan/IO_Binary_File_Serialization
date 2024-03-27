package controller;

import model.Product;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Manager implements Serializable {
    private List<Product> products;

    public Manager() {
        products = new ArrayList<>();
    }

    public static void readwrite(List<Product> products){
        File file = new File("li");

    }

}
