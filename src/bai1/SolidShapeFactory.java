package bai1;

public class SolidShapeFactory extends ShapeFactory {
    @Override
    protected Shape createShape(ShapeType type) {
        switch (type) {
            case CIRCLE:
                return new SolidCircle();
            case SQUARE:
                return new SolidSquare();
            case RECTANGLE:
                return new SolidRectangle();
            default:
                throw new IllegalArgumentException("Unsupported shape type: " + type);
        }
    }
}
