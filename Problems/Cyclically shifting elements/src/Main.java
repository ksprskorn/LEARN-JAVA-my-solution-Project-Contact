import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int[] newArray = new int[size];
        newArray[0] = array[size - 1];

        System.arraycopy(array, 0, newArray, 1, size - 1);
//        for (int j = 1; j < size; j++) {
//            newArray[j] = array[j - 1];
//        }
        for (int p = 0; p < size; p++) {
            System.out.print(newArray[p] + " ");
        }

    }
}