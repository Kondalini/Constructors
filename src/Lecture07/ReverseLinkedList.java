package Lecture07;

import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars);
        for (int i = 0; i < cars.size() / 2; i++) {
            String temp = cars.get(i);
            cars.set(i, cars.get(cars.size() - i - 1));
            cars.set(cars.size() - i - 1, temp);
        }

        System.out.println(cars);
    }
}