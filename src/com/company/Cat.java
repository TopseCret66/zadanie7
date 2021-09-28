package com.company;

public class Cat {

    private final String name;

    private final int appetite;
    
    private boolean hungry;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }

    void info() {
        if (this.hungry) {
            System.out.println(this.name + ": " + "ненасытен");
        } else {
            System.out.println(this.name + ": " + "сыт");
        }
    }

    void eat(Plate plate) {
        if (this.hungry && plate.decreaseFood(this.appetite))
            this.hungry = false;
    }
}
