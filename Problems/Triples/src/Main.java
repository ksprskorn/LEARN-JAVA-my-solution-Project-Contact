import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int count = 0;

        for (int k = 0; k < size - 2; k++) {
            if (array[k + 1] == array[k] + 1 && array[k + 2] == array[k] + 2) {
                count++;
            }
        }
        System.out.print(count);
    }
}