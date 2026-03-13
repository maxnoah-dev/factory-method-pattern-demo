package bai1;

public abstract class ShapeFactory {
    protected abstract Shape createShape(ShapeType type);

    public void drawShape(ShapeType type) {
        Shape shape = createShape(type);
        shape.draw();
    }
}
