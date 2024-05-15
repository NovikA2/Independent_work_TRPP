import java.util.Scanner;

import static java.lang.Math.sqrt;

public class func1_FindingTheSquareRoot {
    /*
    Функция начала
     */
    public static void start(){
        Scanner scannerChooseParameter = new Scanner(System.in);
        System.out.println("Вы выбрали поиск корня квадратного уровнения.");
        System.out.println("Введите значение коэфициентов:");
        System.out.println("(для обозначения плавующей точки используется запятая)");
        System.out.println("Параметр a при x^2");
        double a = scannerChooseParameter.nextDouble();
        System.out.println("Параметр b при x^1");
        double b = scannerChooseParameter.nextDouble();
        System.out.println("Параметр c при x^0");
        double c = scannerChooseParameter.nextDouble();
        System.out.println("Итоговый вид функции:");
        System.out.println(a + "*x^2 + " + b + "*x^1 + " + c);
        System.out.println("Ищем корень");
        if (a != 0) {
            serchRoots(a, b, c);
        } else{
            serchIntersection(b,c);
        }
    }
    /*
    Функция поиск корня при максимальной степени 1
     */
    private static void serchIntersection(double b,double c){
        if (b == 0){
            System.out.println("Корней нету");
            return;
        }
        double x = (c * (-1))/b;
        System.out.println("Корнь этого уровнения равен:");
        System.out.println("X = " + x);
    }
    /*
    Функция поиск корня при максимальной степени 2
     */
    private static void serchRoots(double a,double b,double c){
        double D = b*b - 4*a*c;
        if (D < 0){
            double Im = sqrt((D*(-1))/(4*a*a));
            double x = b*(-1)/(2*a);
            System.out.println("Корни этого уровнения равны:");
            System.out.println("X1 = " + x + " + i*" + Im);
            System.out.println("X2 = " + x + " - i*" + Im);
        } else {
            double x1 = (b*(-1) + sqrt(D))/(2*a);
            double x2 = (b*(-1) - sqrt(D))/(2*a);
            System.out.println("Корни этого уровнения равны:");
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        }
    }
}
