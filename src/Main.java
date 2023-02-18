import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача на функциональное программирование");
        System.out.println();

        WordOrder count = new WordOrder(scan());
        count.printInfo();
    }
    public static String scan() {
        System.out.print("Введите текст: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
//    Текст ввода: yourapp the quick brown fox jumps over the lazy dog
}