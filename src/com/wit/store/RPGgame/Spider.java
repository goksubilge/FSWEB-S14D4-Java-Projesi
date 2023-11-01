package com.wit.store.RPGgame;

public class Spider extends Monster implements Poisonable{
    public Spider(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }
    @Override
    public double attack() {
        return super.attack() + poison();
    }
    @Override
    public double poison() {
        return getDamage()*0.3;
    }
}
