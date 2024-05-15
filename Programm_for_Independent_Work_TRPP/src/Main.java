//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;


/*
Следующая функция нужна, для поиска корней уровнения.
В том числе и с мнимой еденицей.
Стостоит из трёх функций
1 - стартовая, или интерфейс
2 - поиск корня в линейном уровнении
3 - поиск корня к квадратном уровнении
 */


public class Main {

    public static void functions(){
        System.out.println("Теперь выберите, что вы желаете найти:");
        System.out.println("1 - функция поиска корня квадратного уровнения");
        System.out.println("2 - функция поиска площади фигуры");
        System.out.println("3 - функция поиска площади под графиков, с учётом\n расположения под или над осью x");
        System.out.println("4 - функция поиска модуля (или собственного значения) квадратной матрицы");
        System.out.println("5 - выход и завершение работы");
        System.out.println("Для выбора функции, введите её номер: \n(При некоректном вводе,произведите повторный ввод)");

        Scanner scannerChooseFunck = new Scanner(System.in);
        int number = scannerChooseFunck.nextInt();
        while(number != 5){
            switch(number){
                case(1):
                    func1_FindingTheSquareRoot.start();
                    System.out.println("Функция поиска корня отработала.");
                    break;

                case(2):
                    func2_FindingTheSquare.start();
                    System.out.println("Функция поиска площади фигуры отработала.");
                    break;

                case(3):
                    func3_FindingTheGraphing.start();
                    System.out.println("Функция поиска площади графика отработала.");
                    break;

                case(4):
                    func4_FindingTheValueOfTheMatrix.start();
                    System.out.println("Функция поиска модуля (или опеределителя) матрицы.");
                    break;

            }
            System.out.println("Для выбора функции, введите её номер: \n(При некоректном вводе,произведите повторный ввод)");
            number = scannerChooseFunck.nextInt();
        }
        System.out.println("Выввели 5, программа завершает свою работу");
    }

    public static void main(String[] args) {
        System.out.println("Приветствую вас, в программе созданной для самостоятельной работы по ТРПП");

        System.out.println("Программа созданная для решения ряда математических задачь");

        functions();


        System.out.println("Сапасибо, что испробовали нашу программу!");

    }
}


// System.out.println("");