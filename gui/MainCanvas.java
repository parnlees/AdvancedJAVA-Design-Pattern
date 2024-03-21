import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Graphics;

// คลาสที่ใช้ในการสร้าง object ที่เป็น container ที่ใช้ในการวาด object ต่างๆ
// โดยเราจะสร้าง object ของคลาสนี้ขึ้นมา 1 ตัวเท่านั้น
// คือ object ที่เป็นหน้าต่างที่ใช้ในการวาด object ต่างๆ
public class MainCanvas extends JPanel {
    public MainCanvas(int w, int h) {
        setPreferredSize(new Dimension(w, h));
        setLayout(new GridLayout(2, 2));

        add(new GridCanvas(1));
        add(new GridCanvas(2));
        add(new GridCanvas(3));
        add(new GridCanvas(4));
    }

    public MainCanvas() {
        this(600, 600);
    }

    // public void paintComponent(Graphics g) {
    // super.paintComponent(g);
    // g.drawLine(300, 0, 300, 600);
    // g.drawLine(0, 300, 600, 300);
    // g.drawOval(100, 100, 400, 400);
    // }
}