import java.awt.Color;

public abstract class ColorStrategy {
    protected Color[] colors;

    public ColorStrategy() {
        colors = new Color[4];
    }

    public Color getColor(int idx) {
        return colors[idx];
    }
}
