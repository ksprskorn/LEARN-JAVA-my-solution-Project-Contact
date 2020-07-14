import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        double[] yearlyIncomes = new double[size];
        double[] individualTaxes = new double[size];
        for (int i = 0; i < size; i++) {
            yearlyIncomes[i] = scanner.nextDouble();
        }
        for (int j = 0; j < size; j++) {
            individualTaxes[j] = scanner.nextDouble();
        }


        int numberOfTheCompany = 0;
        double taxAmount = 0;

        for (int k = 0; k < size; k++) {
            if (yearlyIncomes[k] / (double) 100 * individualTaxes[k] > taxAmount) {
                numberOfTheCompany = k + 1;
            }
            taxAmount = yearlyIncomes[k] / (double) 100 *  individualTaxes[k];
        }
        System.out.print(numberOfTheCompany);
    }
}