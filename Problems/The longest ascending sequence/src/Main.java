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
        int maxCount = 1;
        for (int k = 0; k < size - 1; k++) {
            if (array[k] <= array[k + 1]) {
                if (count == 0) {
                    count++;
                }
                count++;
            } else {
                count = 0;
            }
            if (count > maxCount) {
                maxCount = count;
            }
        }
        System.out.print(maxCount);
    }
}