package bai4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class AdvancedDrawingApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(AdvancedDrawingApp::createAndShowUi);
    }

    private static void createAndShowUi() {
        JFrame frame = new JFrame("Bai 4 - Drawing App (Factory Method + Bridge)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 650);
        frame.setLocationRelativeTo(null);

        AdvancedDrawingCanvas canvas = new AdvancedDrawingCanvas();

        JPanel controls = new JPanel(new FlowLayout(FlowLayout.LEFT));

        JComboBox<ShapeKind> shapeCombo = new JComboBox<>(ShapeKind.values());
        shapeCombo.addActionListener(e -> canvas.setSelectedShape((ShapeKind) shapeCombo.getSelectedItem()));

        JComboBox<StylePreset> styleCombo = new JComboBox<>(StylePreset.values());
        styleCombo.addActionListener(e -> canvas.setSelectedPreset((StylePreset) styleCombo.getSelectedItem()));

        JButton colorButton = new JButton("Color");
        colorButton.addActionListener(e -> {
            Color chosen = JColorChooser.showDialog(frame, "Choose Color", new Color(33, 33, 33));
            if (chosen != null) {
                canvas.setSelectedColor(chosen);
            }
        });

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(e -> canvas.clearCanvas());

        controls.add(new JLabel("Shape:"));
        controls.add(shapeCombo);
        controls.add(new JLabel("Style:"));
        controls.add(styleCombo);
        controls.add(colorButton);
        controls.add(clearButton);

        frame.add(controls, BorderLayout.NORTH);
        frame.add(canvas, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
