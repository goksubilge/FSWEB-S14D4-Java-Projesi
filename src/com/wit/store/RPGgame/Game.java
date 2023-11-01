package com.wit.store.RPGgame;

public class Game {
    public static void main(String[] args) {
        Monster troll = new Troll("X.1",1000,40);
        Monster werewolf = new Werewolf("Y.2",500,90);
        Monster spider = new Spider("Z.3",200,50);
        System.out.println("Troll " + troll.getName() + " " + troll.attack());
        System.out.println("Werewolf " + werewolf.getName() + " " + werewolf.attack());
        System.out.println("Spider " + spider.getName() + " " + spider.attack());
    }
}