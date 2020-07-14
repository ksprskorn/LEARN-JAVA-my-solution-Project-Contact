import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean ordered = false;
        int i = 0;
        while (true) {
            if (array[i] == n && array[i + 1] == m) {
                ordered = true;
                break;
            }
            if (array[i] == m && array[i + 1] == n) {
                ordered = true;
                break;
            }

            i++;
            if (size - 1 <= i) {
                break;
            }
        }
        System.out.print(ordered);

    }
}