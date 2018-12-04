package view;

import common.LineUtils;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    ShapePanel shapePanel;

    public MainFrame() {
        super("Generatory aplikacji - 3");
        setLayout(null);
        setSize(550, 500);

        getContentPane().setBackground( new Color(60,63,65));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        addComponents();
    }

    void addComponents()
    {
        CoordinatesPanel coordinatesPanel = new CoordinatesPanel(this);
        shapePanel = new ShapePanel();

        add(coordinatesPanel);
        add(shapePanel);
    }


    public void drawShape(int x1, int y1,
                                 int x2, int y2,
                                 int x3, int y3,
                                 int x4, int y4)
    {
        shapePanel.updatePanel(LineUtils.setLineList(x1, y1,
                x2, y2,
                x3, y3,
                x4, y4));

        shapePanel.revalidate();
        repaint();
        revalidate();
        invalidate();
    }


}
