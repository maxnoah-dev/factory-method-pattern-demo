package bai4;

import java.awt.Color;
import java.awt.Graphics2D;

public class SolidFillStyle implements FillStyle {
    private final int alpha;

    public SolidFillStyle(int alpha) {
        this.alpha = alpha;
    }

    @Override
    public void fill(Graphics2D g2d, java.awt.Shape awtShape, Color baseColor) {
        Color old = g2d.getColor();
        g2d.setColor(new Color(baseColor.getRed(), baseColor.getGreen(), baseColor.getBlue(), alpha));
        g2d.fill(awtShape);
        g2d.setColor(old);
    }
}
