package com.example.designpatterns.iteratorAndLinker;

import java.util.ArrayList;

public class PancakeHouseIterator implements Iterator {
    ArrayList<MenuItem> items;
    int position = 0;

    public PancakeHouseIterator(ArrayList<MenuItem> items){
        this.items = items;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items.get(position);
        position = position+1;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        if (items.get(position)==null){
            return false;
        }else {
            return true;
        }
    }
}
