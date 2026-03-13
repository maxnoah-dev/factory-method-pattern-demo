package bai4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

public class AdvancedDrawingCanvas extends JPanel {
    private final List<DrawnShape> shapes = new ArrayList<>();
    private final ShapeFactory shapeFactory = new BasicShapeFactory();
    private final RenderStyleFactory styleFactory = new DefaultRenderStyleFactory();

    private ShapeKind selectedShape = ShapeKind.RECTANGLE;
    private StylePreset selectedPreset = StylePreset.OUTLINE_SOLID;
    private Color selectedColor = new Color(33, 33, 33);

    private Point startPoint;
    private Point currentPoint;

    public AdvancedDrawingCanvas() {
        setBackground(Color.WHITE);

        MouseAdapter mouseAdapter = new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                startPoint = e.getPoint();
                currentPoint = e.getPoint();
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                currentPoint = e.getPoint();
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (startPoint == null) {
                    return;
                }
                currentPoint = e.getPoint();
                RenderStyle style = styleFactory.createStyle(selectedPreset);
                DrawnShape shape = shapeFactory.createShape(selectedShape, startPoint, currentPoint, selectedColor, style);
                shapes.add(shape);
                startPoint = null;
                currentPoint = null;
                repaint();
            }
        };

        addMouseListener(mouseAdapter);
        addMouseMotionListener(mouseAdapter);
    }

    public void setSelectedShape(ShapeKind selectedShape) {
        this.selectedShape = selectedShape;
    }

    public void setSelectedPreset(StylePreset selectedPreset) {
        this.selectedPreset = selectedPreset;
    }

    public void setSelectedColor(Color selectedColor) {
        this.selectedColor = selectedColor;
    }

    public void clearCanvas() {
        shapes.clear();
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        for (DrawnShape shape : shapes) {
            shape.draw(g2d);
        }

        if (startPoint != null && currentPoint != null) {
            RenderStyle previewStyle = styleFactory.createStyle(selectedPreset);
            Color previewColor = new Color(70, 130, 180, 200);
            DrawnShape previewShape = shapeFactory.createShape(selectedShape, startPoint, currentPoint, previewColor, previewStyle);
            previewShape.draw(g2d);
        }

        g2d.dispose();
    }
}
