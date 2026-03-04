import java.util.Random;
import java.util.Scanner;


public class Main {

    private static final String HONEST = "Четный";
    private static final String ODD = "Нечетный";
    private static final String MESSAGE_TEMPLATE = "%s элемент массива: [%d] = %d";


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] numbers = createRandomArray((byte) size);
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf((MESSAGE_TEMPLATE) + "%n", (numbers[i] % 2 == 0 ? HONEST : ODD), i, numbers[i]);
        }
        for (int i = 0, j = numbers.length - 1; i < j; i++, j--) {
            System.out.printf((MESSAGE_TEMPLATE) + "%n", "j = " + j, i, numbers[i]);
        }
        int sum = 0;
         for (int element : numbers) {
             sum += element;
         }
        System.out.println("Сумма элементов массива: " + sum);
    }

    public static int[] createRandomArray(byte size) {
        Random random = new Random();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(1000);
        }
        return numbers;
    }

}
