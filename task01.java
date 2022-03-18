import java.util.Scanner;

public class task01 {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
          double a = 0;
          double b = 0;
          double c = 0;
          System.out.print("Введите первое число: ");
          if (console.hasNextDouble())
              a = console.nextDouble();
          else {
              System.out.println("Вы ввели не число");
              return;
          }
          System.out.print("Введите второе число: ");
          if (console.hasNextDouble())
              b = console.nextDouble();
          else {
              System.out.println("Вы ввели не число");
              return;
          }
          c=a+b;
           System.out.println("Сумма двух чисел: "+ c);
            }
        }


