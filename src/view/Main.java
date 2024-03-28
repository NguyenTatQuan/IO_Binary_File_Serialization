package view;

import controller.Manager;
import model.Product;
import storage.ReadWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Product> list = ReadWriteFile.readFile();

    public static void main(String[] args) {
        System.out.println(list);
        Product newP = createNewProduct();
        createNewProduct().addNewProduct(newP);

    }

    public static Product createNewProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm");
        double code = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("nhập giá sản phẩm");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập số lượng");
        double quantyti = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập miêu tả");
        String description = scanner.nextLine();
        return new Product(code, name ,price,quantyti,description);
    }
}

