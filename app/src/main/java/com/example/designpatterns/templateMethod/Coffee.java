package com.example.designpatterns.templateMethod;

public class Coffee {
    void prepareRecipe(){
        boilWater();
        brefCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();

    }
    public void boilWater(){
        System.out.println("Boiling water");
    }
    public void brefCoffeeGrinds(){
        System.out.println("Dripping Coffee through filter");
    }
    public void pourInCup(){
        System.out.println("Pouring into cup");
    }
    public void addSugarAndMilk(){
        System.out.println("Adding Sugar and Milk");
    }
}
