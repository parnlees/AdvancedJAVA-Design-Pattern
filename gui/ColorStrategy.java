import java.awt.Color;
// abstract class คือ class ที่ไม่สามารถสร้าง object ขึ้นมาได้
// โดยเราจะสร้าง class ที่ extend abstract class นี้ขึ้นมา และจะต้อง override method getColor ที่จะเป็นการกำหนดสีของ object ต่างๆ
// โดยเราจะสร้าง class ที่ extend abstract class นี้ขึ้นมา 2 class คือ DefaultColorsStrategy และ RandomColorsStrategy
public abstract class ColorStrategy {
    // protected คือ keyword ที่ใช้ในการกำหนดว่า attribute นี้จะสามารถเข้าถึงได้จาก class ที่ inherit มาเท่านั้น
    protected Color[] colors;

    public ColorStrategy() {
        colors = new Color[4];
    }

    public Color getColor(int idx) {
        return colors[idx];
    }
}
