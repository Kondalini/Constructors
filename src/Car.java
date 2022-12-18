import javax.swing.text.html.HTML;
import static javax.swing.text.html.HTML.Attribute.N;
public class Car {
    String name;
    String color;
    int releaseYear;
    int horsePower;
    boolean secondHandTick;


    public Car(String name, String color, int releaseYear, int horsePower, boolean secondHandTick) {
        this.name = name;
        this.color = color;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        this.secondHandTick = secondHandTick;
    }
    public static void  main(String[] args) {
Car car = new Car("Alfa", "Red", 1998, 140, true);
System.out.println( car.name + " " + car.color + " " + car.releaseYear  +" " + car.horsePower + " " + car.secondHandTick );
    }

    {




    }
}



