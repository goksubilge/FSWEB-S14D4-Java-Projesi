package com.wit.store.RPGgame;

public abstract class Monster{
    private String name;
    private int hitPoints;
    private double damage;
    public Monster(String name, int hitPoints, double damage) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.damage = damage;
    }
    public void setName(String name) {this.name = name;}
    public void setHitPoints(int hitPoints) {this.hitPoints = hitPoints;}
    public void setDamage(double damage) {this.damage = damage;}
    public String getName() {return name;}
    public int getHitPoints() {return hitPoints;}
    public double getDamage() {return damage;}
    public double attack(){
        return getDamage();
    }
}
