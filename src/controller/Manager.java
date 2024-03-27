package controller;

import model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Manager implements Serializable {
    private List<Product> products;

    public Manager() {
        products = new ArrayList<>();
    }

    public static void readwrite(List<Product> products) {
        File file = new File("listproduct");
        try {
            OutputStream ost = new FileOutputStream(file);
            ObjectOutputStream outputStream = null;
            try {
                outputStream = new ObjectOutputStream(ost);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            outputStream.writeObject(products);
            ost.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
