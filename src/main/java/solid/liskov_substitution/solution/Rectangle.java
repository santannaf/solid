package solid.liskov_substitution.solution;

public record Rectangle(int width, int height) implements Shape {
    public Rectangle {
        if (width < 0 || height < 0) throw new IllegalArgumentException();
    }

    @Override
    public int area() {
        return width * height;
    }
}
