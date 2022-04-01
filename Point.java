public class Point {
    private double x, y;

    Point(double x1, double y1) {   //конструктор
        x = x1;
        y = y1;
    }

    //запрос координаты Х
    double getX() {
        return x;
    }

    //запрос координаты Y
    double getY() {
        return y;
    }

    //использование
    public static void main(String[] args) {
        //создаём точку
        Point M = new Point(1, 2);
        //спрашиваем у созданной точки - скажи нам, точка М свои координаты X и Y
        System.out.println("Текущие координаты точки М: x = " + M.getX() + ", у = " + M.getY());
        Point N = new Point(3, -4);
        //спрашиваем у созданной точки - скажи нам, точка М свои координаты X и Y
        System.out.println("Текущие координаты точки N: x = " + N.getX() + ", у = " + N.getY());

        //Point Z = new Point(M.getX() + N.getX(), M.getY() + N.getY());

        double sumX=M.getX()+N.getX();
        double sumY=M.getY()+N.getY();
        System.out.println("Текущие координаты точки Z: x = " + sumX + ", y= " + sumY);
    }
}


