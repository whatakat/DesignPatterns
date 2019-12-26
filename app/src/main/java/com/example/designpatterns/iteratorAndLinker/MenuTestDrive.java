package com.example.designpatterns.iteratorAndLinker;

public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();
        //Waitress waitress = new Waitress(pancakeHouseMenu,dinerMenu,cafeMenu);
        //waitress.printMenu();
        System.out.println("End menu");

    }
}
