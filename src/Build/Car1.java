package Build;

public class Car1 {
    String name;
    String color;
    int releaseYear = 1;
    int horsePower = 1;
    boolean secondHandTick = false;

    public Car1(String name, String color, boolean secondHandTick) {
        this.name = name;
        this.color = color;
        this.secondHandTick = secondHandTick;
    }
        public static void main (String[]args){
            Car1 car1 = new Car1("Alfa", "Red", false);
            System.out.println(car1.name + " " + car1.color + "  " + car1.secondHandTick);
        }
    }
