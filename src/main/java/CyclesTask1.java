import java.util.Scanner;

public class CyclesTask1 {
    public static void main(String[] args) {
        int[] array = new int[3];
        int avg;

        Scanner scanner = new Scanner(System.in);
        array[0] = scanner.nextInt();
        array[1] = scanner.nextInt();
        array[2] = scanner.nextInt();

        avg = ((array[0] + array[1] + array[2])/array.length)/2;

        String answer = avg > 3 ? "Программа выполнена корректно" : "Программа выполнена некорректно";

        System.out.println(answer);
    }
}
