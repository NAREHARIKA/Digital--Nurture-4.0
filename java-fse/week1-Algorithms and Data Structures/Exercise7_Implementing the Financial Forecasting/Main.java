import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                int[] months = {1, 2, 3, 4, 5};
        double[] revenue = {1000, 1200, 1500, 1700, 2000};

        double[] model = Forecaster.trainLinearRegression(months, revenue);
        double a = model[0]; // intercept
        double b = model[1]; // slope

        System.out.printf("Trained Linear Model: Revenue = %.2f + %.2f * Month\n", a, b);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter future month number to forecast (e.g., 6): ");
        int futureMonth = scanner.nextInt();

        double predictedRevenue = Forecaster.forecast(a, b, futureMonth);
        System.out.printf("Predicted Revenue for Month %d: ₹%.2f\n", futureMonth, predictedRevenue);
    }
}
