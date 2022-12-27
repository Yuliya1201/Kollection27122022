package com.javacource.Product;


import java.util.Objects;

public class Product {
    private String name;
    private int count;
    private int price;

    public Product(String name,int count,int price) {
        setName(name);
        setCount(count);
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        if (count <=0 ) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        this.count = count;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}