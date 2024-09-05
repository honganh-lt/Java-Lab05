package Lesson05;

import java.util.Scanner;

public class Lab05_01 {
    private String prodId;
    private String prodName;
    private String manufacturer;
    private float producerPrice;

    public void nhap() {
        String prodId, prodName, manufacturer;
        float producerPrice;

        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ma san pham:");
        prodId = input.nextLine();
        System.out.println("Nhap tên san pham:");
        prodName = input.nextLine();
        System.out.println("Nhap nha san xuat:");
        manufacturer = input.nextLine();
        System.out.println("Giá san pham:");
        producerPrice = input.nextFloat();
    }

    public void display() {
        System.out.println("\n Ma san pham:" + prodId);
        System.out.println("\n Ten san pham:" + prodName);
        System.out.println("\n Nha san xuat:" + manufacturer);
        System.out.printf("\n Gia san pham: %.1f", producerPrice);
    }

    public void clalculateSalePrice(float producerPrice) {
        double price = producerPrice + 0.05 * producerPrice;
        System.out.printf("\n Giá ban: %.1f", price);
    }

    public static void main(String[] args) {
        Lab05_01 money = new Lab05_01();
        money.nhap();

        //Lab05_01 money = new Lab05_01("h2", "hoa", "anh", 3);
        money.display();
        money.clalculateSalePrice(13);
    }
}


