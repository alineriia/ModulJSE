package com.company;
/**
 * 1. Створити класи (мінімум по 2 поля і одному методу), які дозволять описати наступні сутності:
 * ЛЮДИНА, СОЛДАТ, КОМАНДИР, ГЕНЕРАЛ знаючи, що генерал, солдат і командир - це люди, при цьому від
 * командира залежать 3 солдат, а від генерала 2 командира. Людина повинна імліментувати інтерфейс
 * ЗДАТНИЙ_ДО_БОЙОВИХ_ДІЙ, який буде мати два методи: ВОЮВАТИ і ДОПОВІДАТИ. Дані методи повинні викидати
 * власне виключення, що перевірється. Створити штаб (в main методі один спільний масив) з 6 солдат, 2
 * командирів і генерала. Кожна особа повинна доповісти, у кого перебуває в підпорядкуванні і про можливість
 * воювати.
 */
public class Main {

    public static void main(String[] args) {
        General g = new General("General", false, "");
        Commander c1 = new Commander("Commander D",true,g.name);
        Commander c2 = new Commander("Commander L",true,g.name);
        Soldier s1 = new Soldier("Soldier B",true,c1.name);
        Soldier s2 = new Soldier("Soldier S",true,c1.name);
        Soldier s3 = new Soldier("Soldier K",true,c1.name);
        Soldier s4 = new Soldier("Soldier L",true,c2.name);
        Soldier s5 = new Soldier("Soldier H",true,c2.name);
        Soldier s6 = new Soldier("Soldier L",true,c2.name);

        Person[] array = new Person []{ s1,s2,s3,s4,s5,s6,c1,c2,g};
        for(Person persons : array){
            persons.fight();
            persons.report();
        }
    }
}
