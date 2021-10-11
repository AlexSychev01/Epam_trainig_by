// неиспользование пакетов для кода - грубая ошибка
import java.util.Scanner;

// мы обсуждали, что должно, а что не должно быть в репозитории


public class Numbers {// классы множественным числом не называются, запоминай такие вещи

    Scanner scanner = new Scanner(System.in);// делать из алгоритмической задачи попытку ООП задачи - неправильно, и мы тоже на занятии это обсуждали
    String enterTheNumber = "Введите число: ";// ну и если уже определил поля экземпляра класса - то где у них атрибуты доступа?

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
