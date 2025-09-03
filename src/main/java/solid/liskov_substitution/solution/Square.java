package solid.liskov_substitution.solution;

public record Square(int side) implements Shape {

    public Square {
        if (side < 0) throw new IllegalArgumentException();
    }

    public int area() {
        return side * side;
    }
}
