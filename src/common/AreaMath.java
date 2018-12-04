package common;

import static java.lang.Math.abs;

public class AreaMath {

    //wzór na pole czworokąta
    public static Double calculateArea(int x1, int y1,
                                       int x2, int y2,
                                       int x3, int y3,
                                       int x4, int y4)
    {
        double area = ((x2-x4)*y1)+((x3-x1)*y2)+((x4-x2)*y3)+((x1-x3)*y4);


        return abs(area/2);
    }


}
