package bai_12_java_collection_frameword.bai_tap.luyen_tap_su_dung_array_list_va_linked_list_trong_java_collection_framework;

import java.io.Serializable;

public class Product implements Comparable<Product>, Serializable {
    private int id;
    private String nameProduct;
    private double price;

    public Product() {
    }

    public Product(int id, String nameProduct, double price) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product product) {
        return this.getNameProduct().compareTo(product.getNameProduct());
    }
}
