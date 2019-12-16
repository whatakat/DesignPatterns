package com.example.designpatterns.factory;

public class ChicagoStylePizza extends Pizza {
    public ChicagoStylePizza(){
//        name = "Chicago Style Deep Dish Cheese Pizza";
//        dough = "Extra Thick Crust Dough";
//        sauce = "Plum Tomato Sauce";
//        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    void prepare() {

    }

    void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
