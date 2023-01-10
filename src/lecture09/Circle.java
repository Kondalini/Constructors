package lecture09;

public class Circle extends Shape {
    @Override
    Double getArea(Double radius) {
        return Math.PI * (radius * radius);

    }

    @Override
    Double getPerimeter(Double radius) {
        return 2 * Math.PI * radius;
    }


    public class Square extends Shape {
        @Override
        Double getArea(Double side) {
            return side * side;
        }

        @Override
        Double getPerimeter(Double side) {
            return 4 * side;
        }
    }
}
