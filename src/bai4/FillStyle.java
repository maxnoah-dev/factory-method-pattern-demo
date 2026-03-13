package bai4;

import java.awt.Color;
import java.awt.Graphics2D;

public interface FillStyle {
    void fill(Graphics2D g2d, java.awt.Shape awtShape, Color baseColor);
}
