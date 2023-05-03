import java.util.Scanner;

public class Main {
    /*Напишите метод, который в качестве параметра пинимает строку в которой записано двоичное число,
    в качестве результата возвращает десятичное представление числа.
Например: "101" -> 5
Естественно, в рамкх данной задачи нельзя использовать методы типа Integer.ParseInt и т.п.  */
    public static void main(String[] args) {
        System.out.println(binaryToDecimal("101"));

    }
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++) {
            char stringToChar = binary.charAt(i);                           //  преобразование символа строки в int
            Scanner scanner = new Scanner(String.valueOf(stringToChar));    // скармливаем сканеру  char
            int binarySimbol = scanner.nextInt();                          // возвращаем из сканера int

            decimal += binarySimbol * Math.pow(2, binary.length() - i - 1);  // формирование десятиричного из двоичного
        }
        return decimal;
    }
}