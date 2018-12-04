package common;

public class MathUtils {

    public static Double calculateObwod(int x1, int y1,
                                        int x2, int y2,
                                        int x3, int y3,
                                        int x4, int y4)
    {
        double side1 = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
        double side2 = Math.sqrt(Math.pow(x3-x2, 2)+Math.pow(y3-y2, 2));
        double side3 = Math.sqrt(Math.pow(x4-x3, 2)+Math.pow(y4-y3, 2));
        double side4 = Math.sqrt(Math.pow(x1-x4, 2)+Math.pow(y1-y4, 2));

       return side1 + side2 + side3+ side4;
    }

}
