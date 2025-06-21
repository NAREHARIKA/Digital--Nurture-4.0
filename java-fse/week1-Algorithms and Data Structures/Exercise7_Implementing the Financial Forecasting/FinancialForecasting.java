
import java.util.*;

public class FinancialForecasting {

   
    public static double predictNext(double[] months, double[] revenues) {
        int n = months.length;
        double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0;

        for (int i = 0; i < n; i++) {
            sumX += months[i];
            sumY += revenues[i];
            sumXY += months[i] * revenues[i];
            sumX2 += months[i] * months[i];
        }

        
        double slope = (n * sumXY - sumX * sumY) / (n * sumX2 - sumX * sumX);
        double intercept = (sumY - slope * sumX) / n;

       
        double nextMonth = months[n - 1] + 1;
        return slope * nextMonth + intercept;
    }

    public static void main(String[] args) {
        
        double[] months = {1, 2, 3, 4, 5}; 
        double[] revenues = {10000, 12000, 15000, 17000, 20000};

        double predictedRevenue = predictNext(months, revenues);

        System.out.printf("Predicted revenue for next month: ₹%.2f\n", predictedRevenue);
    }
}
