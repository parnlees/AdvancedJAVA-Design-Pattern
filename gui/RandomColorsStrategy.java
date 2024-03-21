import java.awt.Color;
import java.util.Random;

public class RandomColorsStrategy extends ColorStrategy {
    // private final คือ keyword ที่ใช้ในการกำหนดว่า attribute นี้จะเป็น final และจะไม่สามารถเปลี่ยนแปลงค่าได้
    private final Color[] COLORS = { Color.RED, Color.BLUE, Color.ORANGE, Color.MAGENTA, Color.GREEN, Color.YELLOW,
            Color.PINK, Color.CYAN };

    // Random คือ class ที่ใช้ในการสร้าง object ที่สามารถสร้างเลขสุ่มได้
    private Random rand;

    public RandomColorsStrategy() {
        rand = new Random();
        // rand.nextInt(colors.length) คือ method ที่ใช้ในการสร้างเลขสุ่มที่มีค่าตั้งแต่ 0 ถึง colors.length - 1
        colors[0] = COLORS[rand.nextInt(colors.length)];
        colors[1] = COLORS[rand.nextInt(colors.length)];
        colors[2] = COLORS[rand.nextInt(colors.length)];
        colors[3] = COLORS[rand.nextInt(colors.length)];
    }
}
