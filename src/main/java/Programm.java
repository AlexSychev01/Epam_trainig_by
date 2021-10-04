import java.util.Scanner;

public class Programm {
    public static void main(String[] args) {
        Numbers number = new Numbers();

        int minNum = number.min(2, 5, 6);
        int maxNum = number.max(2, 5, 6);
        System.out.println("Сумма наибольшего и наименьшего значений равна: " + minNum + maxNum);

    }

}
