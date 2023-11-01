package com.wit.store.models;

public class Bread extends ProductForSale{
    private String flourColor;
    private String shape;


    public Bread(String type, double price, String description, String flourColor, String shape) {
        super(type, price, description);
        this.flourColor = flourColor;
        this.shape = shape;
    }

    @Override
    public void showDetails() {
        String builderPFS = super.toString();
        StringBuilder builderBread = new StringBuilder();
        builderBread.append("****** Bread Details *******\n");
        builderBread.append("flourColor= " + flourColor + "\n");
        builderBread.append("shape= " + shape + "\n");
        builderBread.append("********************************\n");
        System.out.println(builderPFS + builderBread);
    }
}
