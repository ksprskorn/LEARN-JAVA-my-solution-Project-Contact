import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 3;
        int[] boxOne = new int[size];
        int[] boxTwo = new int[size];
        for (int iOne = 0; iOne < size; iOne++) {
            boxOne[iOne] = scanner.nextInt();
        }
        for (int iTwo = 0; iTwo < size; iTwo++) {
            boxTwo[iTwo] = scanner.nextInt();
        }
        Arrays.sort(boxOne);
        Arrays.sort(boxTwo);
        int status = 0; // 0 - Incomparable; 1 - equal; 2 - One small ; 3 - Two small
        if (Arrays.equals(boxOne, boxTwo)) {
            status = 1;
        } else {
            if (boxOne[0] <= boxTwo[0] && boxOne[1] <= boxTwo[1] && boxOne[2] <= boxTwo[2]) {
                status = 2;
            } else if (boxOne[0] >= boxTwo[0] && boxOne[1] >= boxTwo[1] && boxOne[2] >= boxTwo[2]) {
                status = 3;
            } else {
                status = 0;
            }
        }
        switch (status) {
            case 1:
                System.out.print("Box 1 = Box 2");
                break;
            case 2:
                System.out.print("Box 1 < Box 2");
                break;
            case 3:
                System.out.print("Box 1 > Box 2");
                break;
            default:
                System.out.print("Incomparable");
                break;
        }
    }
}