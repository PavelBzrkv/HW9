import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Написать программу, в которой пользователь вводит целое число.
        //Если число четное, то печатаем true, если не четное, печатаем false
        //В методе main НЕ ДОПУСТИМО написание какого либо кода, кроме вызова методов.
        //Методы и их логику продумайте сами

        whatNumber();
    }
private static void whatNumber() {
    System.out.println("Введите число:");
    int num = new Scanner(System.in).nextInt();
    System.out.println(num % 2 == 0);
    }
}

