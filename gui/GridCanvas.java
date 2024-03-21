import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

// JPanel คือ class ที่ใช้ในการสร้าง object ที่เป็น container ที่ใช้ในการวาด object ต่างๆ
// import มาเพื่อให้ class ของเราสามารถสร้าง object ของ JPanel ได้
public class GridCanvas extends JPanel {
    private final int id;
    private Color[] colors = new Color[4];
    // ดึง interface ที่ชื่อว่า ColorStrategy มาใช้
    private ColorStrategy colorStrategy;

    public GridCanvas(int id, int w, int h) {
        // setPreferredSize คือ method ที่ใช้ในการกำหนดขนาดของ object นั้นๆ
        setPreferredSize(new Dimension(w, h));
        // กำหนด id ของ object นั้นๆ
        // โดยเราจะใช้ id นี้ในการกำหนดว่า object นี้จะอยู่ใน quarter ไหนของหน้าต่าง
        this.id = id;
    }

    public GridCanvas(int id) {
        this(id, 600, 600);
    }

    public void setColor(ColorStrategy colorStrategy) {
        this.colorStrategy = colorStrategy;
        for (int i = 0; i < 4; i++) {
            colors[i] = colorStrategy.getColor(i);
        }
    }

    public void paintComponent(Graphics g) {
        // super คือ keyword ที่ใช้ในการเรียก method ของ class แม่
        // โดยในที่นี้เราจะเรียก method paintComponent ของ class แม่ ซึ่งเป็น method ที่ใช้ในการวาด object ต่างๆ
        // โดยเราจะเรียก method นี้เพื่อให้ object นี้วาด object ต่างๆ ที่อยู่ใน method paintComponent ของ class แม่
        super.paintComponent(g);

        g.setColor(Color.RED);
        g.setFont(new Font("Courier", Font.BOLD, 20));

        switch ((id)) {
            case 1:
                g.drawString("Q1", 25, 25);
                g.setColor(Color.BLACK);
                g.drawArc(100, 100, 400, 400, 90, 90);
                g.setColor(colors[0]);
                g.fillArc(100, 100, 400, 400, 90, 90);
                g.setColor(Color.BLACK);
                g.drawLine(300, 0, 300, 300);
                g.drawLine(0, 300, 300, 300);
                break;
            case 2:
                g.drawString("Q2", 250, 25);
                g.setColor(Color.BLACK);
                g.drawArc(-200, 100, 400, 400, 0, 90);
                g.setColor(colors[1]);
                g.fillArc(-200, 100, 400, 400, 0, 90);
                g.setColor(Color.BLACK);
                g.drawLine(300, 0, 300, 300);
                g.drawLine(0, 300, 300, 300);
                break;
            case 3:
                g.drawString("Q3", 25, 25);
                g.setColor(Color.BLACK);
                g.drawArc(100, -200, 400, 400, 180, 90);
                g.setColor(colors[2]);
                g.fillArc(100, -200, 400, 400, 180, 90);
                g.setColor(Color.BLACK);
                g.drawLine(300, 0, 300, 300);
                g.drawLine(0, 300, 300, 300);
                break;
            case 4:
                g.drawString("Q4", 250, 25);
                g.setColor(Color.BLACK);
                g.drawArc(-200, -200, 400, 400, 270, 90);
                g.setColor(colors[3]);
                g.fillArc(-200, -200, 400, 400, 270, 90);
                g.setColor(Color.BLACK);
                g.drawLine(300, 0, 300, 300);
                g.drawLine(0, 300, 300, 300);
                break;
            default:
                System.exit(0);
        }
    }
}