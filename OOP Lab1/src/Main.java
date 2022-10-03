import java.util.Scanner;
import java.util.Arrays;

public class Main {

    /* Метод, который принимает на вход массив целых чисел и возвращает true,
    если в массиве каждый элемент больше или равен предыдущему.
    В противном случае, он возвращает false.*/

    static boolean FirstTask(int[]array){
        boolean result = true;
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] < array[i - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }

    /* Реализация игры FizzBuzz. Вместо чисел,
      кратных трем, программа должна выводить слово «Fizz»,
      а вместо чисел, кратных пяти — слово «Buzz». Если число
      кратно и 3, и 5, то программа должна выводить слово «FizzBuzz».*/

    static void FizzBuzz(){
        for (int i = 1; i <= 100; i++)
        {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.print("FizzBuzz ");
            } else if (i % 5 == 0) {
                    System.out.print("Buzz ");
                    System.out.println();
            } else if (i % 3 == 0) {
                    System.out.print("Fizz ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.print("\n\n");
    }

    private static boolean TaskThree(int[] array) {
        int firstSum = 0;
        int secondSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i < array.length / 2) {
                firstSum += array[i];
            } else {
                secondSum += array[i];
            }
        }
        if (firstSum == secondSum) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Объявляем объект класса Scan для считывания значений с клавиатуры
        int[] massive = new int[8]; //Объявляем массив на 8 целых чисел

        System.out.println("Input 8 elements: ");

        for (int i = 0; i < massive.length; i++) //Заполняем массив значениями с клавиатуры
        {
            massive[i] = scan.nextInt();
        }

        System.out.println("Your array: " + Arrays.toString(massive)); //С помощью метода toString выводим массив
        System.out.println("Is each element greater than or equal to the previous one?");
        System.out.println("Result: " + FirstTask(massive) + "\n\n"); //Вызов и вывод метода FirstTask


        System.out.println("FizzBuzz game");
        FizzBuzz(); //Игра FizzBuzz
    }
}