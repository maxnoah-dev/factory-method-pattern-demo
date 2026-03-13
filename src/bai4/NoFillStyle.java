package bai4;

import java.awt.Color;
import java.awt.Graphics2D;

public class NoFillStyle implements FillStyle {
    @Override
    public void fill(Graphics2D g2d, java.awt.Shape awtShape, Color baseColor) {
        // Intentionally empty: outline only.
    }
}
