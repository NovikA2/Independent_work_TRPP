import java.util.Scanner;

public class func3_FindingTheGraphing {
    /*
    Функция начала
     */
    public static void start(){
        //Scanner scannerChooseParameter = new Scanner(System.in);
        System.out.println("Вы выбрали поиск площади под графиком.");
        System.out.println("Теперь выберите какая максимальная степень будет у функции:");
        Scanner scannerChooseFunck = new Scanner(System.in);
        int stepenMax = scannerChooseFunck.nextInt();
        if (stepenMax < 0){
            System.out.println("Функция не ввидена, завершение выполнение функции.");
            return;
        }
        // Задание функции
        System.out.println("Теперь после того, как вы выбрали максимальную степень уровнения, введите их коэфициенты:");
        double[] coefficients = new double[stepenMax+1];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < (stepenMax+1); i++){
            System.out.println("Введите коэфициент у x со степенью " + i);
            coefficients[i] = scanner.nextDouble();
        }
        // Вывод получившейся функциии
        System.out.print("Итоговый вид уровнения:\ny = ");
        for (int i = 0; i < stepenMax; i++){
            if (coefficients[i] != 0){
                System.out.print(coefficients[i] + "*x^" + i + " + ");
            }
        }
        System.out.print(coefficients[stepenMax] + "*x^" + stepenMax);
        // Опредление приделов интегрирования
        System.out.println("Введите придел, в котором надо найти площадь графика a и b");
        System.out.println("Важно понимать, что поиск использует ОЧМ,так что площадь находится с пограшностью");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        serchSquare(a, b, coefficients);
    }

    /*
    Функция подсчёта интегрирования заданной функции. Используется ОЧМ, есть погрешность.
     */
    private static void serchSquare(double a, double b, double[] coefficients){
        double kol_parts = ((b - a))/0.5;
        System.out.println("kol_parts = " + kol_parts);
        double S = 0;
        int kol = 0;
        if (kol_parts == (int)kol_parts){
            kol = (int)kol_parts - 1;
        }
        else{
            kol = (int)kol_parts;
        }
        for (int i = 0; i < kol; i++){
            S = S + ((serchFunctionValue((a+ 0.5*i), coefficients) + serchFunctionValue((a+ 0.5*(i+1)), coefficients))/2 * 0.5);
        }
        S = S + ((serchFunctionValue((a+ 0.5*kol), coefficients) + serchFunctionValue((b), coefficients))/2 * (b - 0.5*kol));
        System.out.println("Итоговая площадь под графиком для данной функции в заданых приделах равна: " + S);
    }

    /*
    Функция подсчёта значения функции в точке
     */
    private static double serchFunctionValue(double a, double[] coefficients){
        double f = 0;
        for (int i = 0; i < (coefficients.length); i++){
            f = f + coefficients[i] * Math.pow(a, i);
        }
        return f;
    }
}
