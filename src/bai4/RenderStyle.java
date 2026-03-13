package bai4;

public class RenderStyle {
    private final StrokeStyle strokeStyle;
    private final FillStyle fillStyle;

    public RenderStyle(StrokeStyle strokeStyle, FillStyle fillStyle) {
        this.strokeStyle = strokeStyle;
        this.fillStyle = fillStyle;
    }

    public StrokeStyle getStrokeStyle() {
        return strokeStyle;
    }

    public FillStyle getFillStyle() {
        return fillStyle;
    }
}
