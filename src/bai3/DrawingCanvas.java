package bai3;

import java.awt.BasicStroke;
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

public class DrawingCanvas extends JPanel {
    private final List<DrawnShape> shapes = new ArrayList<>();
    private ShapeKind selectedKind = ShapeKind.RECTANGLE;
    private DrawingShapeFactory selectedFactory = new OutlineDrawingShapeFactory();

    private Point startPoint;
    private Point currentPoint;

    public DrawingCanvas() {
        setBackground(Color.WHITE);

        MouseAdapter adapter = new MouseAdapter() {
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
                DrawnShape shape = selectedFactory.createShape(selectedKind, startPoint, currentPoint);
                shapes.add(shape);
                startPoint = null;
                currentPoint = null;
                repaint();
            }
        };

        addMouseListener(adapter);
        addMouseMotionListener(adapter);
    }

    public void setSelectedKind(ShapeKind selectedKind) {
        this.selectedKind = selectedKind;
    }

    public void setSelectedFactory(DrawingShapeFactory selectedFactory) {
        this.selectedFactory = selectedFactory;
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
        g2d.setStroke(new BasicStroke(2f));

        g2d.setColor(new Color(20, 20, 20));
        for (DrawnShape shape : shapes) {
            shape.draw(g2d);
        }

        if (startPoint != null && currentPoint != null) {
            g2d.setColor(new Color(70, 130, 180, 150));
            DrawnShape preview = selectedFactory.createShape(selectedKind, startPoint, currentPoint);
            preview.draw(g2d);
        }

        g2d.dispose();
    }
}
