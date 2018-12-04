package common;

import java.util.ArrayList;
import java.util.List;

public class LineUtils {

    public static final int X0=40, Y0=300;

    public static List<Line> setLineList(int x1, int y1,
                                   int x2, int y2,
                                   int x3, int y3,
                                   int x4, int y4)
    {
        x1 = x1+X0; x2 = x2+X0; x3 = x3+X0; x4 = x4+X0;

        y1 = Math.abs(y1-Y0);
        y2 = Math.abs(y2-Y0);
        y3 = Math.abs(y3-Y0);
        y4 = Math.abs(y4-Y0);


        Line line1 = new Line(x1, y1, x2, y2);
        Line line2 = new Line(x2, y2, x3, y3);
        Line line3 = new Line(x3, y3, x4, y4);
        Line line4 = new Line(x4, y4, x1, y1);

        List<Line> lineList = new ArrayList();
        lineList.add(line1);
        lineList.add(line2);
        lineList.add(line3);
        lineList.add(line4);

        return lineList;
    }


}
