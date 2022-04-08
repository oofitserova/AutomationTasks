public class Point1 {
    private double x, y;

    Point1(double x1, double y1) {   //конструктор
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

   private static double addAll(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;}

    //использование
    public static void main(String[] args) {
        //создаём точку
        Point1 M = new Point1(6, 6);
        //спрашиваем у созданной точки - скажи нам, точка М свои координаты X и Y
        System.out.println("Текущие координаты точки М: x = " + M.getX() + ", у = " + M.getY());
        Point1 N = new Point1(3, -5);
        //спрашиваем у созданной точки - скажи нам, точка М свои координаты X и Y
        System.out.println("Текущие координаты точки N: x = " + N.getX() + ", у = " + N.getY());

        System.out.println("Координата X точки Z: x = " + addAll(M.getX(),N.getX()));
        System.out.println("Координата Y точки Z: Y = " + addAll(M.getY(), N.getY()));
       }
    }