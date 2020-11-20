package com.company;

public class Person implements AbleToFight{
    protected String name;
    protected boolean fightAble;
    protected String chef;

    public String getName() {
        return name;
    }

    @Override
    public void fight() {
        if(fightAble){
            System.out.println(name+" is able to fight");
        }
        else {
            System.out.println(name+" is unable to fight");
        }
    }

    @Override
    public void report() {
        if(!chef.isEmpty()){
            System.out.println(name+" is depend on "+chef);
        }
        else{
            System.out.println(name+" is not depend on someone");
        }

    }
}
