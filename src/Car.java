import javax.swing.text.html.HTML;

import static javax.print.attribute.standard.MediaSizeName.A;



public class Car {


    private String name;
    private String color;
    private int releaseYear ;
    private int horsePower ;
    private boolean secondHandTick ;

    Car(String name, String color, int releaseYear, int horsePower, boolean secondHandTick) {
        this.name = name;
        this.color = color;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        this.secondHandTick = secondHandTick;
    }

    public static void main(String[] args) {
        Car car = new Car("Alfa", "Red", 1998, 140, false);
        Car car1 = new Car("BMW", "Red", -1, -1, false);
        System.out.println(car.name + " " + car.color + "  " + car.releaseYear + " " + car.horsePower + " " + car.secondHandTick);
    }

    Car(String name, String color, boolean secondHandTick) {
        this(name, color, -1, -1, false);

    }

    Car(String name, String color, int releaseYear, int horsePower) {
        this(name, color, releaseYear, horsePower, false);
    }


    Car() {
        this("N/A", "N/A", -1, -1);
    }
}












