package com.company;

public class Main {

    public static void main(String[] args) {

            Cat[] cats = {
                    new Cat("Матроскин", 10),
                    new Cat("Шарик", 25)
            };

            Plate plate = new Plate(16);

            for (Cat cat : cats) {
                cat.eat(plate);
                cat.info();
            }

            plate.addFood(43);
            plate.info();
        }
}
