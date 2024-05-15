import java.util.Scanner;

public class func2_FindingTheSquare {
    /*
    Функция начала
     */
    public static void start(){
        System.out.println("Вы выбрали поиск площади.");
        System.out.println("Теперь выберите площадь какой фигуры желаете найти:");
        System.out.println("(для обозначения плавующей точки используется запятая)");
        System.out.println("1 - квадрат");
        System.out.println("2 - круг");
        System.out.println("3 - прямоугольник");
        System.out.println("4 - прямоугольный треугольник");
        System.out.println("5 - ромб");
        System.out.println("6 - трапеция");
        Scanner scannerChooseFunck = new Scanner(System.in);
        int number = scannerChooseFunck.nextInt();
        switch(number){
            case(1):
                serchSquare();
                break;

            case(2):
                serchCircle();
                break;

            case(3):
                serchRectangle();
                break;

            case(4):
                serchRightAngledTriangle();
                break;
            case(5):
                serchRhomb();
                break;
            case(6):
                serchTrapezoid();
                break;

        }
    }
    /*
    Функция поиск площади квадрата
    */
    private static void serchSquare(){
        Scanner scannerChooseParameter = new Scanner(System.in);
        System.out.println("Выбран поиск площади квадрата. Для его поиска требуется ввести:");
        System.out.println("Введите размер стороны квадрата");
        double a = scannerChooseParameter.nextDouble();
        double S = a*a;
        System.out.println("Площадь квадрата равна:" + S);
    }
    /*
    Функция поиск площади круга
    */
    private static void serchCircle(){
        Scanner scannerChooseParameter = new Scanner(System.in);
        System.out.println("Выбран поиск площади круга. Для его поиска требуется ввести:");
        System.out.println("Введите размер радиуса круга");
        double r = scannerChooseParameter.nextDouble();
        double S = Math.PI * r * r;
        System.out.println("Площадь круга равна:" + S);
    }
    /*
    Функция поиск площади прямоугольника
    */
    private static void serchRectangle(){
        Scanner scannerChooseParameter = new Scanner(System.in);
        System.out.println("Выбран поиск площади прямоугольника. Для его поиска требуется ввести:");
        System.out.println("Введите размер стороны a и b через пробел");
        double a = scannerChooseParameter.nextDouble();
        double b = scannerChooseParameter.nextDouble();
        double S = a * b;
        System.out.println("Площадь прямоугольника равна:" + S);
    }
    /*
    Функция поиск площади треугольника с прямым углом
    */
    private static void serchRightAngledTriangle(){
        Scanner scannerChooseParameter = new Scanner(System.in);
        System.out.println("Выбран поиск площади прямоугольного треугольника. Для его поиска требуется ввести:");
        System.out.println("Введите размер стороны a и b через пробел");
        double a = scannerChooseParameter.nextDouble();
        double b = scannerChooseParameter.nextDouble();
        double S = (a * b)/2;
        System.out.println("Площадь прямоугольного треугольника равна:" + S);
    }
    /*
    Функция поиск площади ромба
    */
    private static void serchRhomb(){
        Scanner scannerChooseParameter = new Scanner(System.in);
        System.out.println("Выбран поиск площади ромба. Для его поиска требуется ввести:");
        System.out.println("Введите размер стороны a и угол в градусах (например 60) через пробел");
        double a = scannerChooseParameter.nextDouble();
        double corner = scannerChooseParameter.nextDouble();
        double S = a*(a * Math.sin(corner));
        System.out.println("Площадь ромба равна:" + S);
    }
    /*
    Функция поиск площади трапеции
    */
    private static void serchTrapezoid(){
        Scanner scannerChooseParameter = new Scanner(System.in);
        System.out.println("Выбран поиск площади трапеции. Для его поиска требуется ввести:");
        System.out.println("Введите размер оснований a и b, а также высоту трапециии h через пробел");
        double a = scannerChooseParameter.nextDouble();
        double b = scannerChooseParameter.nextDouble();
        double h = scannerChooseParameter.nextDouble();
        double S = (a+b)/2 * h;
        System.out.println("Площадь трапеции равна:" + S);
    }
}
