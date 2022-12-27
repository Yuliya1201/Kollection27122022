package com.javacource.Product;


public class Recept {
    private String nameProduct;
    private ProductList productList;
    private int totalCost;

    public  Recept(String nameProduct, int totalCost, String productList) {
        setNameProduct(nameProduct);
        setProductList(productList);
        setTotalCost(totalCost);
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public ProductList getProductList() {
        return productList;
    }

    public void setProductList(String receptList) {
        this.productList = productList;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recept recept = (Recept) o;
        return nameProduct.equals(recept.nameProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameProduct);
    }
}
