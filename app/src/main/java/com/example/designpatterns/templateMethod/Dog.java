package com.example.designpatterns.templateMethod;

public class Dog implements Comparable {
    String name;
    int weight;
    public Dog(String name, int weight){
        this.name = name;
        this.weight = weight;
    }
    public String toString(){
        return name + " weight "+ weight;
    }

    @Override
    public int compareTo(Object object) {
        Dog otherDog = (Dog)object;
        if (this.weight<otherDog.weight){
            return -1;
        }else if (this.weight == otherDog.weight){
            return 0;
        }else {
            return 1;
        }
    }
}
