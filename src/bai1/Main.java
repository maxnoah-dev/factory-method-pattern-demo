package bai1;

public class Main {
    public static void main(String[] args) {
        ShapeFactory outlineFactory = new OutlineShapeFactory();
        ShapeFactory solidFactory = new SolidShapeFactory();

        outlineFactory.drawShape(ShapeType.CIRCLE);
        outlineFactory.drawShape(ShapeType.SQUARE);
        outlineFactory.drawShape(ShapeType.RECTANGLE);

        solidFactory.drawShape(ShapeType.CIRCLE);
        solidFactory.drawShape(ShapeType.SQUARE);
        solidFactory.drawShape(ShapeType.RECTANGLE);
    }
}
