package com.company;

public class Plate {

    private int food;

    Plate(int food) {
        this.food = food;
    }

    boolean decreaseFood(int n) {
        if (n > this.food) {
            return false;
        }
        this.food = this.food - n;
        return true;
    }

    void addFood(int food) {
        this.food = this.food + food;
    }

    void info() {
        System.out.println("plate: " + this.food);
    }
}
