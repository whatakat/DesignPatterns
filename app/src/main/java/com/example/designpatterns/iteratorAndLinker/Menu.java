package com.example.designpatterns.iteratorAndLinker;

import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
