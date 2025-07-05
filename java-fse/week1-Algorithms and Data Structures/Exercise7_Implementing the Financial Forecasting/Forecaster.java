public class Forecaster {

        public static double[] trainLinearRegression(int[] x, double[] y) {
        int n = x.length;
        double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0;

        for (int i = 0; i < n; i++) {
            sumX += x[i];
            sumY += y[i];
            sumXY += x[i] * y[i];
            sumX2 += x[i] * x[i];
        }

        double b = (n * sumXY - sumX * sumY) / (n * sumX2 - sumX * sumX); // slope
        double a = (sumY - b * sumX) / n; // intercept

        return new double[]{a, b};
    }

    public static double forecast(double a, double b, int x) {
        return a + b * x;
    }
}
