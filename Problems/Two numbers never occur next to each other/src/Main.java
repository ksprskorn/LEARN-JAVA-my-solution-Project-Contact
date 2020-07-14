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

        boolean isSideBySide = false;

        for (int k = 0; k < size - 1; k++) {
            if (array[k] == n && array[k + 1] == m) {
                isSideBySide = true;
            }
            if (array[k] == m && array[k + 1] == n) {
                isSideBySide = true;
            }
        }

        System.out.print(!isSideBySide);

    }
}