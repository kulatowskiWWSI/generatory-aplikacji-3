package view;

import common.Line;
import common.LineUtils;
import swing.JCommon;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class ShapePanel extends JPanel {

    private List<Line> lineList;

    public ShapePanel()
    {
        setLocation(200, 0);
        setSize(340, 500);
        setLayout(null);

        addComponents();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawLine(LineUtils.X0, 10, LineUtils.X0, 300);
        g.drawLine(LineUtils.X0-1, 10, LineUtils.X0-1, 300);
        g.drawLine(LineUtils.X0, 300, LineUtils.X0+280, 300);
        g.drawLine(LineUtils.X0, 301, LineUtils.X0+280, 301);

        for(int i=0; i<29; i++)
        {
            g.drawLine(LineUtils.X0, 10+(i*10), LineUtils.X0+280, 10+(i*10));
            g.drawLine(LineUtils.X0+(i*10), 10, LineUtils.X0+(i*10), 300);
        }

        try {
            g.setColor(Color.red);

            for (Line line : lineList) {
                g.drawLine(line.x1, line.y1, line.x2, line.y2);
            }
        }catch (Exception e){}


        g.setColor(Color.white);
    }

    public void updatePanel(List<Line> lineList)
    {
        this.lineList = lineList;
        repaint();
        revalidate();
        invalidate();
    }

    public void addComponents()
    {
        add(JCommon.addLabel("0,0", 20, 300, 20, 20));
        add(JCommon.addLabel("10", 20, 280, 20, 20));
        add(JCommon.addLabel("10", 45, 300, 20, 20));

        add(JCommon.addLabel("100", 15, 190, 25, 20));
        add(JCommon.addLabel("100", 125, 300, 25, 20));

    }

}
