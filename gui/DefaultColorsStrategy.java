import java.awt.Color;
// extend คือ keyword ที่ใช้ในการสร้าง class ที่จะ inherit คุณสมบัติต่างๆ จาก class อื่น
public class DefaultColorsStrategy extends ColorStrategy {
    public DefaultColorsStrategy() {
        colors[0] = Color.PINK;
        colors[1] = Color.CYAN;
        colors[2] = Color.GREEN;
        colors[3] = Color.YELLOW;
    }
}
