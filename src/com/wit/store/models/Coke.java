package com.wit.store.models;

import java.util.Locale;

public class Coke extends ProductForSale {
    private boolean isZero;
    public Coke(String type, double price, String description,boolean isZero) {
        super(type, price, description);
        this.isZero= isZero;
    }
    @Override
    public void showDetails() {
        String builderPFS = super.toString();
        StringBuilder builderCoke = new StringBuilder();
        builderCoke.append("****** Coke Details *******\n");
        builderCoke.append("isZero" + isZero +"\n");
        builderCoke.append("********************************\n");
        System.out.println(builderPFS + builderCoke.toString());
    }
}
