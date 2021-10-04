import java.util.Scanner;

public class Programm {
    public static void main(String[] args) {
        Numbers number = new Numbers();
        Scanner scanner = new Scanner(System.in);
        int minNum = number.min(2,5,6);
        int maxNum = number.max(2,5,6);
        System.out.println("Сумма наибольшего и наименьшего значений равна: " + minNum + maxNum);

    }

}
//    public static int readInt(String msg) {
//        System.out.println(msg);
//    }
//
//    public static int readInt(String msg, String err) {
//        System.out.println(msg);
//    }
//
//    public static boolean isValid(int number) {
//
//    }
//
//    public static boolean task1(int numerator) {
//
//    }
//
//    public static void print(boolean result) {
//

