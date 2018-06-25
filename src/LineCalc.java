
public class LineCalc  {
    double lineLength(Line2D line) {
        double a = Math.sqrt(Math.pow(line.getY1() - line.getX1(), 2) - Math.pow(line.getY2() - line.getX2(), 2));
        return a;
    }
    }
