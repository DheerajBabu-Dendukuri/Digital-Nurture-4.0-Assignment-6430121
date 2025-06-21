

// Taking Future Value = Present Value * ( 1 + rate ) ^ (no of years) as the formula to predict the future value
class FinancialForecast{
    // Recursive forecasting method to predict the future value
    // Time Complexity: O(n) --> n represents no of years
    // // Space Complexity: O(n) --> due to recursive call stack
    static double recursivePredict(double presentValue, double rate, int years){
        if(years == 0) return presentValue;
        return (1.0 + rate) * recursivePredict(presentValue,rate,years-1);
    }
    
    // Iterative forecasting method to predict the future value
    // Time Complexity: O(n) --> n represents no of years
    // Space Complexity: O(1) --> No extra space is used
    static double iterativePredict(double presentValue, double rate, int years){
        double futureValue = presentValue;
        for(int i=0; i< years; ++i){
            futureValue = futureValue * (1 + rate);
        }
        return futureValue;
    }

}


public class FinancialForecasting {
    public static void main(String[] args) {
        double presentValue = 10.0245;
        double rate = 0.02;
        int years = 10;

        System.out.println("\n\nPresent Value : " + presentValue + ", Rate : " + rate + ", No.of Years : " + years + "\n");
        double rPredictedValue = FinancialForecast.recursivePredict(presentValue, rate, years);
        double iPredictedValue = FinancialForecast.iterativePredict(presentValue, rate, years);
        System.out.printf("Predicted Future Value using recursion is : %.4f\n", rPredictedValue);
        System.out.printf("Predicted Future Value using iteration is : %.4f\n\n", iPredictedValue);
    }
}