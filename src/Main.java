import common.Line;
import common.LineUtils;
import view.ShapePanel;
import view.CoordinatesPanel;
import view.MainFrame;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        MainFrame mainFrame = new MainFrame();

        mainFrame.repaint();
        mainFrame.revalidate();
        mainFrame.invalidate();

    }
}
