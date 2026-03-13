package bai4;

public class DefaultRenderStyleFactory extends RenderStyleFactory {
    @Override
    public RenderStyle createStyle(StylePreset preset) {
        switch (preset) {
            case OUTLINE_SOLID:
                return new RenderStyle(new SolidStrokeStyle(2.5f), new NoFillStyle());
            case OUTLINE_DASHED:
                return new RenderStyle(new DashedStrokeStyle(2.5f), new NoFillStyle());
            case FILLED_SOLID:
                return new RenderStyle(new SolidStrokeStyle(2.5f), new SolidFillStyle(120));
            case FILLED_DASHED:
                return new RenderStyle(new DashedStrokeStyle(2.5f), new SolidFillStyle(120));
            default:
                throw new IllegalArgumentException("Unsupported style preset: " + preset);
        }
    }
}
