package com.wit.store.models;

public class Cholcolate extends ProductForSale{
    private String shape ;

    private boolean isHaveKakaoPowder;

    public Cholcolate(String type, double price, String description, String shape, boolean isHaveKakaoPowder) {
        super(type, price, description);
        this.shape = shape;
        this.isHaveKakaoPowder = isHaveKakaoPowder;
    }

    @Override
    public void showDetails() {
        String builderPFS = super.toString();
        StringBuilder builderChocolate = new StringBuilder();
        builderChocolate.append("isZero= " + isHaveKakaoPowder +"\n");
        builderChocolate.append("****** Product with Chocolate *******\n");
        System.out.println(builderPFS + builderChocolate.toString());

    }
}
