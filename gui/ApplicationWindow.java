import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.Component;
import java.awt.event.ActionEvent;

public class ApplicationWindow implements ActionListener {
    private JFrame topCon;
    private ColorStrategy colorsStrategy = new DefaultColorsStrategy();

    public ApplicationWindow(int w, int h) {
        topCon = new JFrame("Composite in Action");
        topCon.setSize(w, h);
        topCon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
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

    }

    private void setColorForGridCanvases() {
        // TODO Auto-generated method stub
        Component[] components = topCon.getContentPane().getComponents();
        for (Component c : components) {
            if (c instanceof MainCanvas) {
                MainCanvas mainCanvas = (MainCanvas) c;
                Component[] GridCanvas = mainCanvas.getComponents();
                for (Component gc : GridCanvas) {
                    if (gc instanceof GridCanvas) {
                        GridCanvas gridCanvas = (GridCanvas) gc;
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