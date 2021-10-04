import java.util.Scanner;

public class Numbers {

    Scanner scanner = new Scanner(System.in);
    String enterTheNumber = "Введите число: ";

    public int min(int num1, int num2, int num3) {
        int min = Math.min(num1, num2);
        min = Math.min(min, num3);
        return min;

    }

    public int max(int num1, int num2, int num3) {
        int max = Math.max(num1, num2);
        max = Math.max(max, num3);
        return max;
    }
    public int sum(int max, int min){
        int sum = max+min;
        return sum;
    }


}
