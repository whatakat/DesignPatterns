package com.example.designpatterns.templateMethod;

import com.example.designpatterns.strategy.Duck;

import java.util.Arrays;

public class DogSortDrive {
    public static void main(String[] args) {
        Dog[] dogs = {
        new Dog("Daffy", 8),
        new Dog("Bim",2),
                new Dog("Rem",15),
                new Dog("Baron",9),
                new Dog("Dick", 18),
                new Dog("Bobik",4),
                new Dog("Halk",13)
        };
        System.out.println("Before sorting:");
        display(dogs);
        Arrays.sort(dogs);
        System.out.println("\nAfter sorting:");
        display(dogs);
    }
    public static void display(Dog[] dogs){
        for (Dog d : dogs){
            System.out.println(d);
        }
    }
}
