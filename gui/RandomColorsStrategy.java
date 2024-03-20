import java.awt.Color;
import java.util.Random;

public class RandomColorsStrategy extends ColorStrategy {
    private final Color[] COLORS = { Color.RED, Color.BLUE, Color.ORANGE, Color.MAGENTA, Color.GREEN, Color.YELLOW,
            Color.PINK, Color.CYAN };

    private Random rand;

    public RandomColorsStrategy() {
        rand = new Random();
        colors[0] = COLORS[rand.nextInt(colors.length)];
        colors[1] = COLORS[rand.nextInt(colors.length)];
        colors[2] = COLORS[rand.nextInt(colors.length)];
        colors[3] = COLORS[rand.nextInt(colors.length)];
    }
}
