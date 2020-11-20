package com.company;

public class Soldier extends Person {
    public Soldier(String name, boolean fightAble, String chef){
        this.name = name;
        this.fightAble = fightAble;
        this.chef = chef;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void fight() {
        super.fight();
    }

    @Override
    public void report() {
        super.report();
    }
}
