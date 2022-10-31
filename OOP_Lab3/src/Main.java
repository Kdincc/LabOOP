import java.util.Scanner;

public class Main {
    /* В одномерном массиве, состоящем из n вещественных элементов, вычисляет с
    умму элементов массива с нечетными номерами*/
    public static int SumOfOddIndex(int[] array) {
        int sum = 0;
        for (int i = 1; i < array.length; i += 2) {
            sum += array[i];
        }

        return sum;
    }
    /* В одномерном массиве, состоящем из n вещественных элементов, вычисляет
       сумму элементов массива, расположенных между первым и последним отрицательными элементами*/
    public static int SumBetweenNegativeElements(int[] array) {
        int sum = 0;
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                minIndex = i;
                break;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                if (i > maxIndex) {
                    maxIndex = i;
                }
            }
        }

        for (int i = minIndex + 1; i < maxIndex; i++) {
            sum += array[i];
        }

        return sum;
    }
    //Вычисляет произведение элементов в тех строках, которые не содержат отрицательных элементов
    public static int ProductWithoutNegative(int[][] matrix) {
        int product = 1;
        boolean isNegative;

        for (int i = 0; i < matrix.length; i++) {
            isNegative = false;

            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    isNegative = true;
                    break;
                }
            }
            if (!isNegative) {
                for (int l = 0; l < matrix[i].length; l++) {
                    product *= matrix[i][l];
                }
            }
        }
        return product;
    }
    //Вычислет максимум среди сумм элементов диагоналей, параллельных главной диагонали матрицы.
    public static void SumOfDiagonales(int[][] matrix) {
        int[] sum = new int[matrix.length * 2 - 1];
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix.length; j++)
                sum[matrix.length - 1 - i + j] += matrix[i][j];
        System.out.println("\nСуммы элементов диагоналей, параллельных главной:");
        for (int i : sum)
            System.out.print(i + "\t");
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array;
        array = new int[8];

        System.out.println("-----------------Task 1-----------------");
        System.out.println("Input elements");
        for (int i = 0; i < 8; i++) {
            array[i] = scan.nextInt();
        }

        System.out.println("Sum of elements with odd indexes");
        System.out.println(SumOfOddIndex(array));

        System.out.println("Sum of elements between first and last negative elements");
        System.out.println(SumBetweenNegativeElements(array));


        System.out.println("-----------------Task 2-----------------");
        int[][] matrix;
        matrix = new int[4][4];
        System.out.println("Input elements");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        System.out.println("Product of lines without negative elements");
        System.out.println(ProductWithoutNegative(matrix));

        SumOfDiagonales(matrix);

    }
}