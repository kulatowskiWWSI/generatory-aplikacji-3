package view;

import common.AreaMath;
import common.MathUtils;
import swing.JCommon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


public class CoordinatesPanel extends JPanel {

    private JButton calculateButton;
    private List<JTextArea>  coordinateXTextList = new ArrayList<>();
    private List<JTextArea>  coordinateYTextList = new ArrayList<>();
    private JTextArea shapeAreaText;
    private JTextArea shapeCircuitText;

    private MainFrame mainFrame;

    public CoordinatesPanel(MainFrame mainFrame)
    {
        setLocation(0, 0);
        setSize(200, 500);

        setLayout(null);

        this.mainFrame = mainFrame;

        addComponents();
    }

    public void addComponents()
    {
        int xCoordinateX = 10; int xCoordinateY= 100;
        int coordinateY = 50;

        calculateButton = JCommon.addButton("oblicz", 10, 380, 100, 30);

        coordinateXTextList.add(JCommon.addTextArea(xCoordinateX, coordinateY, 60, 30));
        coordinateXTextList.add(JCommon.addTextArea(xCoordinateX, coordinateY+40, 60, 30));
        coordinateXTextList.add(JCommon.addTextArea(xCoordinateX, coordinateY+80, 60, 30));
        coordinateXTextList.add(JCommon.addTextArea(xCoordinateX, coordinateY+120, 60, 30));
        coordinateXTextList.forEach(this::add);


        coordinateYTextList.add(JCommon.addTextArea(xCoordinateY, coordinateY, 60, 30));
        coordinateYTextList.add(JCommon.addTextArea(xCoordinateY, coordinateY+40, 60, 30));
        coordinateYTextList.add(JCommon.addTextArea(xCoordinateY, coordinateY+80, 60, 30));
        coordinateYTextList.add(JCommon.addTextArea(xCoordinateY, coordinateY+120, 60, 30));
        coordinateYTextList.forEach(this::add);

        add(JCommon.addLabel("X", 35, 30, 30, 20));
        add(JCommon.addLabel("Y", 125, 30, 30, 20));

        add(JCommon.addLabel("powierzchnia figury", xCoordinateX, coordinateY+210, 200, 20));
        shapeAreaText = JCommon.addTextArea(10, coordinateY+230, 100, 20);

        add(shapeAreaText);

        add(JCommon.addLabel("obwód figury", xCoordinateX, coordinateY+260, 200, 20));
        shapeCircuitText = JCommon.addTextArea(10, coordinateY+280, 100, 20);

        add(shapeCircuitText);


        add(calculateButton);

        calculateButton.addActionListener(e -> {

            int x1, x2, x3, x4, y1, y2, y3, y4;

            x1 = Integer.parseInt(coordinateXTextList.get(0).getText());
            x2 = Integer.parseInt(coordinateXTextList.get(1).getText());
            x3 = Integer.parseInt(coordinateXTextList.get(2).getText());
            x4 = Integer.parseInt(coordinateXTextList.get(3).getText());

            y1 = Integer.parseInt(coordinateYTextList.get(0).getText());
            y2 = Integer.parseInt(coordinateYTextList.get(1).getText());
            y3 = Integer.parseInt(coordinateYTextList.get(2).getText());
            y4 = Integer.parseInt(coordinateYTextList.get(3).getText());

            mainFrame.drawShape(
                    x1, y1,
                    x2, y2,
                    x3, y3,
                    x4, y4);

            shapeAreaText.setText(AreaMath.calculateArea(
                    x1, y1,
                    x2, y2,
                    x3, y3,
                    x4, y4).toString());

            shapeCircuitText.setText(MathUtils.calculateObwod(
                    x1, y1,
                    x2, y2,
                    x3, y3,
                    x4, y4).toString());
            }
        );

        repaint();
        invalidate();
        revalidate();
    }

}
