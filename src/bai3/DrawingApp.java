package bai3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class DrawingApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(DrawingApp::createAndShowUi);
    }

    private static void createAndShowUi() {
        JFrame frame = new JFrame("Bai 3 - Drawing App (Factory Method)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 600);
        frame.setLocationRelativeTo(null);

        DrawingCanvas canvas = new DrawingCanvas();

        JPanel controls = new JPanel(new FlowLayout(FlowLayout.LEFT));

        JComboBox<ShapeKind> shapeCombo = new JComboBox<>(ShapeKind.values());
        shapeCombo.setSelectedItem(ShapeKind.RECTANGLE);
        shapeCombo.addActionListener(e -> canvas.setSelectedKind((ShapeKind) shapeCombo.getSelectedItem()));

        String[] styleOptions = {"Outline", "Solid"};
        JComboBox<String> styleCombo = new JComboBox<>(styleOptions);
        styleCombo.addActionListener(e -> {
            String style = (String) styleCombo.getSelectedItem();
            if ("Solid".equals(style)) {
                canvas.setSelectedFactory(new SolidDrawingShapeFactory());
            } else {
                canvas.setSelectedFactory(new OutlineDrawingShapeFactory());
            }
        });

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(e -> canvas.clearCanvas());

        controls.add(new JLabel("Shape:"));
        controls.add(shapeCombo);
        controls.add(new JLabel("Style:"));
        controls.add(styleCombo);
        controls.add(clearButton);

        frame.add(controls, BorderLayout.NORTH);
        frame.add(canvas, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
