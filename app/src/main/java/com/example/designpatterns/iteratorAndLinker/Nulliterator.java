package com.example.designpatterns.iteratorAndLinker;
import java.util.Iterator;

public class Nulliterator implements Iterator<MenuComponent> {
    public MenuComponent next(){
        return null;
    }
    public boolean hasNext(){
        return false;
    }
    public void remove(){
        throw new UnsupportedOperationException();
    }
    public Nulliterator(){}

}
