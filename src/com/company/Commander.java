package com.company;

public class Commander extends Person {
    private Soldier sub[] = new Soldier [3];
    public Commander(String name, boolean fightAble, String chef){
        this.name = name;
        this.fightAble = fightAble;
        this.chef = chef;
    }
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
