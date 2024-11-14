import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Задача 1");
        int[] a = new int[]{12, 95, 312, 7054};
        int i = 0;
        int sum = 0;

        for (; i < a.length; i++) {
            sum = sum + a[i];
        }

        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println();
        System.out.println("Задача 2");

        int max = 0;
        int min = a[1];

        for (; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
            if (min > a[i]) {
                min = a[i];
            }

        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. Максимальная сумма трат за неделю составила " + max + " рублей.");

        System.out.println();
        System.out.println("Задача 3");

        int[] b = new int[]{1561, 321, 5645, 8746, 1234};
        double sum1 = 0;
        for (int element : b) {
            sum1 = sum1 + element;
        }
        double wastes1 = sum1 / b.length;
        double wastes2 = 4 * wastes1;

        System.out.println("Средняя сумма трат за неделю составила " + wastes1 + " рублей, за месяц " + wastes2 + " рублей");

        System.out.println();
        System.out.println("Задача 4");

        char[] reverseFullName = new char[]{'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char e;
        for (i = 0; i < reverseFullName.length/2; i++) {
            e = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = e;
        }


        System.out.print(Arrays.toString(reverseFullName));


    }

}
