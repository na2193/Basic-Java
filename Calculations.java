import java.text.DecimalFormat;
import java.util.ArrayList;

public class Calculations {
    private DecimalFormat df = new DecimalFormat("0.00");

    public String areaOfCircle(double radius) {
        double area = 3.14 * radius * radius;
        return df.format(area);
    }

    public String areaOfRectangle(double length, double width) {
        return df.format(length * width);
    }

    public String areaOfTriangle(double baseWidth, double height) {
        double area = (baseWidth * height) / 2;
        return df.format(area);
    }

    public String calculateAccuredInterestCreditCard(double amount, double interestRate) {
        double interestRateDecimal = interestRate / 100;
        return df.format(amount * interestRateDecimal);
    }

    public String getTotalCreditCardAmountWithInterest(double interest, double accuredInterest, int numOfYears) {
        double totalAmount = interest + accuredInterest;
        return df.format(totalAmount * numOfYears);
    }

    public ArrayList<String> getAllEvenNumbers(String[] numArr) {
        ArrayList<String> evenNumList = new ArrayList();

        for(String temp : numArr) {
            if(Integer.parseInt(temp) % 2 == 0) 
                evenNumList.add(temp);
        }
        return evenNumList;
    }

    public ArrayList<String> getAllOddNumbers(String[] numArr) {
        ArrayList<String> oddNumList = new ArrayList();

        for(String temp : numArr) {
            if(Integer.parseInt(temp) % 2 != 0) 
                oddNumList.add(temp);
        }
        return oddNumList;
    }

    public boolean isPrime(int num) {
        boolean prime = false;
        for(int i = 2; i <= (num / 2); i++) {
            if(num % i == 0) {
                prime = true;
                break;
            }
        }
        return prime;
    }

    public double getMediumNumber(String[] numArr) {
        if(numArr.length % 2 != 0) {
            return Double.parseDouble(numArr[numArr.length / 2]);
        }
        else {
            double num1 = Double.parseDouble(numArr[(numArr.length / 2) - 1]);
            double num2 = Double.parseDouble(numArr[(numArr.length / 2)]);
            return (num1 + num2) / 2;
        }
    }

    public String getMean(String[] numArr) {
        double totalNum = 0;
        for(int i = 0; i < numArr.length; i++) {
            totalNum += Double.parseDouble(numArr[i]);
        }

        return df.format((totalNum / numArr.length));
    }

    public String getMode(String[] numArr) {
        int maxCount = 0;
        String maxValue = "";

        for(int i = 0; i < numArr.length; ++i) {
            int count = 0;
            for(int j = 0; j < numArr.length; ++j) {
                if(Integer.parseInt(numArr[j]) == Integer.parseInt(numArr[i])) {
                    ++count;
                }
                if(count > maxCount) {
                    maxCount = count;
                    maxValue = numArr[i];
                }
            }
        }
        return maxValue;
    }
}