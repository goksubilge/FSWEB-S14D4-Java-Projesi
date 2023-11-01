package com.wit.store.models;

public abstract class ProductForSale {
    private String type;
    private double price;
    private String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public String getType() {return type;}

    public void setType(String type) {this.type = type;}

    public double getPrice() {return price;}

    public void setPrice(double price) {this.price = price;}

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    public double getSalesPrice(int quantity){
        return quantity  * price;
        // return quantity  * getPrice();
    }

    public abstract void showDetails();

    @Override
    public String toString() {
        StringBuilder builderPFS = new StringBuilder();
        builderPFS.append("****** ProductForSale *******\n");
        builderPFS.append("****** Product Details: " + getClass().getSimpleName() + " *******\n");
        builderPFS.append("type= " + type + "\n");
        builderPFS.append("price= " + price + "\n");
        builderPFS.append("description= " + description + "\n");
        builderPFS.append("Class type= " + getClass().getSimpleName() + "\n");
        return builderPFS.toString();
    }
}
