import java.util.Scanner;


public class Main {
    static final Scanner scan = new Scanner(System.in);


    public static void FourSymbolsWord(String text)
    {
        String[] words = text.split(" ");

        System.out.println("Words with 4 symbols:");
        for (String word : words)
        {
            if(word.length() == 4)
            {
                System.out.println(word);
            }
        }
    }

    public static int taskThree(String text)
    {
        String[] words = text.split(" ");

        int sum = 0;

        for (String word : words) {
            if(word.matches("[a-zA-Z]+"))
            {
                sum++;
            }
        }

        return sum;
    }
    public static void taskTwo()
    {
        System.out.println("\nВведите строку для Задания 2:");
        String str = scan.nextLine();
        String str1 = Translit.toCyrillic(str);
        System.out.println("Транслитерированная строка:");
        System.out.println(str1);
    }

    public static int taskFour(String text)
    {
        String[] words = text.split(" ");

        int sum = 0;

        for (String word : words)
        {
            if(word.matches("[0-9]+"))
            {
                sum ++;
            }
        }

        return sum;
    }

    static boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < (n/2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    static void taskFive() {
        System.out.println("Введите строку для Задания 5:");
        String str = scan.nextLine();
        String[] str1 = str.split(" ");
        int count = 0;
        System.out.println("Слова-палиндромы:");
        for (String s : str1) {
            if (!s.matches("[a-zA-Zа-яА-Я]+") && isPalindrome(s)) {
                System.out.print(s + " ");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Слов-палиндромов нет.");
        } else {
            System.out.println("Количество слов-палиндромов: " + count);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("-------------Task 1-------------");
        String text = "Fast best fifth cell up down one";
        System.out.println(text);
        FourSymbolsWord(text);

        System.out.println("-------------Task 2-------------");
        taskTwo();

        System.out.println("-------------Task 3-------------");

        System.out.println("Введите слова");
        String words = scan.nextLine();

        System.out.println("Количество слов с состоящих из латиницы: " + taskThree(words));

        System.out.println("-------------Task 4-------------");

        System.out.println("Введите слова");
        String string = scan.nextLine();

        System.out.println("Количество слов состоящих из цифр: " + taskFour(string));

        System.out.println("-------------Task 5-------------");

        taskFive();

    }
}
