package controller;

import model.Product;
import storage.ReadWriteFile;

import java.util.List;


public class Manager {
    private static List<Product> productsList = ReadWriteFile.readFile();

    public static void addNewProduct(Product product) {
        productsList.add(product);
        ReadWriteFile.writeFile(productsList);
    }
}
