import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        boolean isSorted = true;

        for (int k = 0; k < size - 1; k++) {
            if (array[k] > array[k + 1]) {
                isSorted = false;
            }
        }
        System.out.print(isSorted);
    }
}