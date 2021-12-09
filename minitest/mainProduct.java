package minitest;

import java.util.Arrays;
import java.util.Scanner;

public class mainProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập vào số lượng sản phẩm:  ");
        int num = scanner.nextInt();

        product [] products = new product[3];
        product p1 = new product("a", "Milk", 10.0,"drink","USD");
        product p2 = new product("b", "Coca", 20.0,"drink","USD");
        product p3 = new product("c", "Tea", 30.0,"drink","USD");

        products[0] = p1;
        products[1] = p2;
        products[2] = p3;
        for (product element: products
             ) {
            System.out.println(element);

        }
        System.out.println(Arrays.toString(products));
    }
    public static product creatProduct (Scanner scanner) {
        System.out.println("Nhập item: ");
        String item = scanner.nextLine();
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Nhập giá: ");
        double price = scanner.nextDouble();
        System.out.println("Nhập loại: ");
        String type = scanner.nextLine();
        System.out.println("Nhập loại tiền: ");
        String currency = scanner.nextLine();
        return new product(item,name, price, type, currency);
    }
    }


