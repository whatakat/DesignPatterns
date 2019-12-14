package com.example.designpatterns.factory;

public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza(){
        name = "NY Style Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Clam Sauce";
        toppings.add("Cheese");
    }
}
