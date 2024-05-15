import java.util.Scanner;

public class func4_FindingTheValueOfTheMatrix {
    /*
    Функция начала
    */
    public static void start(){
        //Scanner scannerChooseParameter = new Scanner(System.in);
        System.out.println("Вы выбрали поиск модуля матрицы.");
        System.out.println("Теперь выберите размерность квадратной матрицы:");
        Scanner scannerChooseFunck = new Scanner(System.in);
        int a = scannerChooseFunck.nextInt();

        if (a < 1){
            System.out.println("Матрица не создана.");
            return;
        }
        double[][] matrix = createMatrix(a);
        System.out.println(calculateDeterminant(matrix));

    }
    /*
    Функция создания матрицы
     */
    private static double[][] createMatrix(int a){
        Scanner scanner = new Scanner(System.in);
        double[][] matrix = new double[a][a];

        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.println("Элемент матрицы под номером " + (i+1) + " " + (j+1) + " равен:");
                double q = scanner.nextDouble();
                matrix[i][j] = q;
            }
        }
        System.out.println("Итоговый вид матрицы:");
        System.out.println("------------------------");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------------------------");
        return matrix;
    }

    /*
    Функция подсчёта определителя матрицы
     */
    public static double calculateDeterminant(double[][] matrix) {
        int n = matrix.length;

        if (n == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }

        double det = 0;
        for (int i = 0; i < n; i++) {
            det += matrix[0][i] * Cofactor(matrix, 0, i);
        }

        return det;
    }

    /*
    Функция подсчёта комфактор, нужна как вспомогательная
     */
    public static double Cofactor(double[][] matrix, int row, int col) {
        int n = matrix.length;
        double[][] minorMatrix = new double[n - 1][n - 1];

        int minorRow = 0, minorCol = 0;
        for (int i = 0; i < n; i++) {
            if (i == row)
                continue;

            minorCol = 0;
            for (int j = 0; j < n; j++) {
                if (j == col)
                    continue;

                minorMatrix[minorRow][minorCol] = matrix[i][j];
                minorCol++;
            }
            minorRow++;
        }

        return Math.pow(-1, row + col) * calculateDeterminant(minorMatrix);
    }
}
