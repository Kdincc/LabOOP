
import java.util.Scanner;
public class Main {
    // метод, который принимает на вход строку и возвращает true, если строка заканчивается на «ed» и false в противном случае
    public static boolean TaskOne(String str)
    {
        String temp = "";
        for(int i = (str.length() - 2); i < str.length(); i++)
        {
            temp += str.charAt(i);
        }
        if(temp.equals("ed"))
        {
            return true;
        }
        else {
            return false;
        }

    }

    // метод, который принимает на вход строку и возвращает сумму цифр, которые были найдены в этой строке (если цифр нет – возвращается 0);
    public static int TaskTwo(String str)
    {
        int sum = 0;
        char ch;
        for(int i = 0; i < str.length(); i++)
        {
            ch = str.charAt(i);
            if(Character.isDigit(ch))
            {
                sum+=Character.getNumericValue(ch);
            }
        }
        return sum;
    }

    /* метод, который принимает на вход строку и возвращает длину наиболее длинного «блока» символов в этой строке
    («блок» - множество одинаковых идущих подряд символов, например, в строке «aaBCS» - самый длинный блок «аа» длиной 2 символа) */
    public static int TaskThree(String str)
    {
        char ch = str.charAt(0);
        int max = 0;
        int len = 1;

        for(int i = 1; i < str.length(); i++)
        {
            if(str.charAt(i) == ch)
            {
                len++;
            }
            else {
                ch = str.charAt(i);
                len = 1;
            }

            if (len > max)
            {
                max = len;
            }

        }
        return max;
    }

    /* метод, который принимает на вход строку и выводит в консоль найденные слова в этой строке
    (слова отделяются пробелами, кроме случаев когда слово стоит в начале или в конце)*/
    public static void TaskFourth(String str)
    {
        String word = "";


        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) != ' ' && i != str.length() - 1)
            {
                word += str.charAt(i);
            }
            else {
                if (str.length() == i + 1){
                    word += str.charAt(i);
                }
                System.out.println(word);
                word = "";
            }
        }

    }

    //метод, который принимает на вход две строки (А и Б) и возвращает строку, которая состоит поочередно из  i-ых символов каждой из строк
    public static String TaskFifth(String firstStr, String secondStr)
    {
        String result = "";
        int len = Math.max(firstStr.length(), secondStr.length());

        for (int i = 0; i < len; i++)
        {
            if (i >= firstStr.length())
            {
                result += secondStr.charAt(i);
            } else if (i >= secondStr.length()) {
                result += firstStr.charAt(i);


            }else {
                result += firstStr.charAt(i);
                result += secondStr.charAt(i);
            }

        }
        return result;


    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = "Input str";

        System.out.println("------------Task 1------------");
        System.out.println(input);
        String str = scan.next();
        System.out.println("line ends with ed?");
        System.out.println(TaskOne(str));


        System.out.println("------------Task 2------------");
        System.out.println(input);
        String numbers = scan.next();
        System.out.println("Sum of numbers in line");
        System.out.println(TaskTwo(numbers));


        System.out.println("------------Task 3------------");
        System.out.println(input);
        String block = scan.next();
        System.out.println("The longest block in line");
        System.out.println(TaskThree(block));


        System.out.println("------------Task 4------------");
        System.out.println(input);
        String words = scan.next();
        System.out.println("Words in line");
        TaskFourth(words);


        System.out.println("------------Task 5------------");
        System.out.println(input + "1");
        String firstStr = scan.next();
        System.out.println(input + "2");
        String secondStr = scan.next();
        System.out.println("Сoncatenated rows");
        System.out.println(TaskFifth(firstStr, secondStr));


    }
}