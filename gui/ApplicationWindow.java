import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.Component;
import java.awt.event.ActionEvent;

// ActionListener คือ interface ที่ใช้ในการรับ event จาก user ที่เกิดขึ้นกับ component ต่างๆ
public class ApplicationWindow implements ActionListener {
    // JFrame คือ class ที่ใช้ในการสร้างหน้าต่างของโปรแกรม
    // topCon คือ object ที่เป็นหน้าต่างของโปรแกรม
    // โดยเราจะสร้าง object ของ JFrame ขึ้นมาเพื่อให้เป็นหน้าต่างของโปรแกรม
    private JFrame topCon;
    // ColorStrategy คือ interface ที่ใช้ในการกำหนดสีของ object ต่างๆ
    // โดยเราจะให้ class ของเรา implement interface นี้ และจะต้อง override method getColor ที่จะเป็นการกำหนดสีของ object ต่างๆ
    // ทำไมถึงเป็น interface นะ? เพราะว่าเราจะสร้าง class อื่นๆ ที่จะ implement interface นี้ และจะกำหนดสีของ object ต่างๆ ได้ตามที่เราต้องการ
    // โดยเราจะสร้าง class ที่ implement interface นี้ ขึ้นมา 2 class คือ DefaultColorsStrategy และ RandomColorsStrategy
    private ColorStrategy colorsStrategy = new DefaultColorsStrategy();

    public ApplicationWindow(int w, int h) {
        // "Composite in Action" คือ title ของหน้าต่าง
        topCon = new JFrame("Composite in Action");
        topCon.setSize(w, h);
        // EXIT_ON_CLOSE คือ ค่าที่ใช้ในการกำหนดว่าเมื่อ user ปิดหน้าต่างของโปรแกรมแล้ว โปรแกรมจะทำอะไรต่อ
        // โดยในที่นี้เราจะให้โปรแกรมจบการทำงานเมื่อ user ปิดหน้าต่างของโปรแกรม
        topCon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // topcon.setJMenuBar(menubar) คือการกำหนดว่าหน้าต่างของโปรแกรมนี้จะมี menu bar หรือไม่
        // โดยในที่นี้เราจะกำหนดว่าหน้าต่างของโปรแกรมนี้จะมี menu bar
        // โดยเราจะสร้าง menu bar ขึ้นมา 1 อัน คือ colorMenu ซึ่งจะมี 2 อันย่อย คือ defaultColors และ randomColors
        JMenuBar menubar = new JMenuBar();
        topCon.setJMenuBar(menubar);

        JMenu colorMenu = new JMenu("Color Options");
        menubar.add(colorMenu);

        JMenuItem defaultColors = new JMenuItem("Default Colors");
        defaultColors.addActionListener(this);
        JMenuItem randomColors = new JMenuItem("Random Colors");
        randomColors.addActionListener(this);

        colorMenu.add(defaultColors);
        colorMenu.add(randomColors);

        topCon.add(new MainCanvas(w, h));
        setColorForGridCanvases();
        topCon.pack();
        topCon.setVisible(true);
    }

    // โดยจะมี method ที่เรียกว่า actionPerformed ที่จะถูกเรียกเมื่อ eventนั้นๆเกิดขึ้น
    // โดยจะรับ parameter เป็น ActionEvent ซึ่งจะเป็นข้อมูลเกี่ยวกับ eventที่เกิดขึ้น
    // โดยเราจะใช้ interface นี้เพื่อให้ class ของเราสามารถรับ event จาก user ได้
    // โดยเราจะให้ class ของเรา implement interface นี้ และจะต้อง override method actionPerformed ที่จะเป็นการรับ event ที่เกิดขึ้น
    public void actionPerformed(ActionEvent e) {
        // โดยเราจะให้ method นี้เป็นการรับ event ที่เกิดขึ้นเมื่อ user กดที่ menu item ที่เราสร้างขึ้นมา
        // getActionCommand() คือ method ที่ใช้ในการรับชื่อของ menu item ที่ user กด
        String command = e.getActionCommand();
        // topCon.setVisible(false) คือ method ที่ใช้ในการซ่อนหน้าต่างของโปรแกรม
        // โดยเราจะให้ method นี้เป็นการซ่อนหน้าต่างของโปรแกรมเมื่อ user กดที่ menu item ที่เราสร้างขึ้นมา
        topCon.setVisible(false);
        // Handle the "Color strategy"
        if (command.equals("Default Colors")) {
            // ..
            colorsStrategy = new DefaultColorsStrategy();
        } else if (command.equals("Random Colors")) {
            // ..
            colorsStrategy = new RandomColorsStrategy();
        }

        setColorForGridCanvases();
        topCon.setVisible(true);
        // ดึงหน้าต่างของโปรแกรมขึ้นมา
    }

    // โดยเราจะสร้าง method ที่ชื่อ setColorForGridCanvases ขึ้นมา
    // โดย method นี้จะเป็น method ที่ใช้ในการกำหนดสีของ object ต่างๆ ในหน้าต่างของโปรแกรม
    private void setColorForGridCanvases() {
        // getContentPane() คือ method ที่ใช้ในการดึง container ที่อยู่ในหน้าต่างของโปรแกรมขึ้นมา
        // getComponents() คือ method ที่ใช้ในการดึง component ทั้งหมดที่อยู่ในหน้าต่างของโปรแกรมขึ้นมา
        Component[] components = topCon.getContentPane().getComponents();
        // โดยเราจะวนลูปเพื่อหา MainCanvas ที่อยู่ในหน้าต่างของโปรแกรม
        // โดย MainCanvas คือ class ที่เราสร้างขึ้นมาเพื่อให้เป็นหน้าต่างของโปรแกรม
        for (Component c : components) {
            if (c instanceof MainCanvas) {
                // ใช้ instanceof เพื่อเช็คว่า c นั้นเป็น object ของ class ที่เราต้องการหรือไม่
                // โดยในที่นี้เราจะเช็คว่า c นั้นเป็น object ของ class MainCanvas หรือไม่
                // ถ้าเป็นเราจะทำการ cast c นั้นให้เป็น object ของ class MainCanvas
                // โดยเราจะให้ c นั้นเป็น object ของ class MainCanvas เพื่อให้เราสามารถเรียก method ของ class MainCanvas ได้
                MainCanvas mainCanvas = (MainCanvas) c;
                Component[] GridCanvas = mainCanvas.getComponents();
                for (Component gc : GridCanvas) {
                    if (gc instanceof GridCanvas) {
                        // ถ้าเป็นเราจะทำการ cast gc นั้นให้เป็น object ของ class GridCanvas
                        // โดยเราจะให้ gc นั้นเป็น object ของ class GridCanvas เพื่อให้เราสามารถเรียก method ของ class GridCanvas ได้
                        GridCanvas gridCanvas = (GridCanvas) gc;
                        // setColor คือ method ที่ใช้ในการกำหนดสีของ object ต่างๆ
                        // colorsStrategy คือ object ที่เราสร้างขึ้นมาเพื่อให้เป็น interface ที่เราสร้างขึ้นมา
                        gridCanvas.setColor(colorsStrategy);
                    }
                }
            }
        }
    }

    public ApplicationWindow() {
        this(600, 600);
    }
}