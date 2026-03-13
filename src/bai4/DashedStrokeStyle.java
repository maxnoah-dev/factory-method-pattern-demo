package bai4;

import java.awt.BasicStroke;
import java.awt.Graphics2D;

public class DashedStrokeStyle implements StrokeStyle {
    private final float width;

    public DashedStrokeStyle(float width) {
        this.width = width;
    }

    @Override
    public void applyStroke(Graphics2D g2d) {
        g2d.setStroke(new BasicStroke(width, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10f, new float[] {10f, 6f}, 0f));
    }
}
