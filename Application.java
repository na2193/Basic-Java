import java.util.*;
public class Application {
    static Scanner keyboard = new Scanner(System.in);
    static Calculations calc = new Calculations();

    public static void main(String [] args) {
        System.out.println("Welcome to the Calculation App!");
        int userChoice;
        do {
            System.out.println("Please choose the number associated from one of the following:");
            System.out.println("1. Calculate the Area of a Circle");
            System.out.println("2. Calculate the Area of a Rectangle");
            System.out.println("3. Calculate the Area of a Triangle");
            System.out.println("4. Calculate the interest on a Credit Card");
            System.out.println("5. Get all Even Numbers");
            System.out.println("6. Get all Odd Numbers");
            System.out.println("7. Check if Number is Prime");
            System.out.println("8. Get the Medium of Numbers");
            System.out.println("9. Calculate the Mean of Numbers");
            System.out.println("10. Calculate the Mode of Numbers");
            System.out.println("0. EXIT");
            userChoice = keyboard.nextInt();
            options(userChoice);
        } while(userChoice != 0);
    }

    public static void options(int userInput) {
        switch (userInput) {
            case 1:
                calculateAreaOfCircle();
                break;
            case 2:
                calculateAreaOfRectangle();
                break;
            case 3:
                calculateAreaOfTriangle();
                break;
            case 4:
                calculateInterestCreditCard();
                break;
            case 5:
                keyboard.nextLine();
                getAllEvenNumbers();
                break;
            case 6:
                keyboard.nextLine();
                getAllOddNumbers();
                break;
            case 7:
                checkIfNumIsPrime();
                break;
            case 8:
                keyboard.nextLine();
                getMedium();
                break;
            case 9:
                keyboard.nextLine();
                getMean();
                break;
            case 10:
                keyboard.nextLine();
                getMode();
                break;
            case 0:
                System.out.println("Good-bye!");
                System.exit(0);
                break;
            default:
                break;
        }
    }

    public static void calculateAreaOfCircle() {
        System.out.println("Enter the Radius of the Circle:");
        double radius = keyboard.nextDouble();

        String area = calc.areaOfCircle(radius);

        System.out.println("The area of a Circle with a Radius of -> " + radius + " is = " + area);
    }

    public static void calculateAreaOfRectangle() {
        System.out.println("Enter Length of Rectangle:");
        double length = keyboard.nextDouble();
        System.out.println("Enter Width of Rectangle:");
        double width = keyboard.nextDouble();

        String area = calc.areaOfRectangle(length, width);
        
        System.out.println("The area of a Rectangle with a lenght of -> " + length 
            + " and width of -> " + width + " is = " + area);
    }

    public static void calculateAreaOfTriangle() {
        System.out.println("Enter Base Width of Triangle:");
        double baseWdith = keyboard.nextDouble();
        System.out.println("Enter Height of Triangle:");
        double height = keyboard.nextDouble();

        String area = calc.areaOfTriangle(baseWdith, height);

        System.out.println("The area of a Triangle with a Base Width of -> " + baseWdith 
        + " and Height of -> " + height + " is = " + area);
    }

    public static void calculateInterestCreditCard() {
        System.out.println("Enter the total amount on Credit Card:");
        double amount = keyboard.nextDouble();
        System.out.println("Enter Credit Card Interest Rate:");
        double interestRate = keyboard.nextDouble();
        System.out.println("Enter number of years to see Total Amount:");
        int numOfYears = keyboard.nextInt();
        keyboard.next();

        String accuredInterest = calc.calculateAccuredInterestCreditCard(amount, interestRate);

        System.out.println("The Accured Interest of Credit Card with amount of -> $" + amount 
        + " and Interest Rate of -> " + interestRate + "% is = " + accuredInterest);

        String totalAmount = calc.getTotalCreditCardAmountWithInterest(amount, Double.parseDouble(accuredInterest), numOfYears);

        System.out.println("After ->" + numOfYears + " years, the total amount on the Credit Card with interest will be = $" + totalAmount);
    }

    public static void getAllEvenNumbers() {
        System.out.println("Enter any number followed by space to get Even Numbers, at the end press Enter (ie. 1 2 3)");
        String userNumInput = keyboard.nextLine();
        String[] numArr = userNumInput.split("\\s+");

        ArrayList<String> evenNumList = calc.getAllEvenNumbers(numArr);

        System.out.println("The Even Numbers in the list -> " + userNumInput + " are =");
        for(String temp : evenNumList) 
            System.out.print(temp + " ");

        System.out.println();
    }

    public static void getAllOddNumbers() {
        System.out.println("Enter any number followed by space to get Odd Numbers, at the end press Enter (ie. 1 2 3)");
        String userNumInput = keyboard.nextLine();
        String[] numArr = userNumInput.split("\\s+");

        ArrayList<String> oddNumList = calc.getAllOddNumbers(numArr);

        System.out.println("The Odd Numbers in the list -> " + userNumInput + " are =");
        for(String temp : oddNumList) 
            System.out.print(temp + " ");

        System.out.println();
    }

    public static void checkIfNumIsPrime() {
        System.out.println("Please enter a number to check if it is Prime");
        int userInputNum = keyboard.nextInt();

        if(!calc.isPrime(userInputNum))
            System.out.println("The number -> " + userInputNum + " is Prime");
        else 
            System.out.println("The number -> " + userInputNum + " is not Prime");
    }

    public static void getMedium() {
        System.out.println("Enter any number followed by space to get the Medium, at the end press Enter (ie. 1 2 3)");
        String userNumInput = keyboard.nextLine();
        String[] numArr = userNumInput.split("\\s+");
        
        double medium = calc.getMediumNumber(numArr);
        
        System.out.println("The Medium in the Number List -> " + userNumInput + " is = " + medium);
    }

    public static void getMean() {
        System.out.println("Enter any number followed by space to get the Medium, at the end press Enter (ie. 1 2 3)");
        String userNumInput = keyboard.nextLine();
        String[] numArr = userNumInput.split("\\s+");
        
        String mean = calc.getMean(numArr);
        
        System.out.println("The Mean in the Number List -> " + userNumInput + " is = " + mean);
    }

    public static void getMode() {
        System.out.println("Enter any number followed by space to get the Medium, at the end press Enter (ie. 1 2 3)");
        String userNumInput = keyboard.nextLine();
        String[] numArr = userNumInput.split("\\s+");
        
        String mode = calc.getMode(numArr);
        
        System.out.println("The Mode in the Number List -> " + userNumInput + " is = " + mode);
    }
}