public class Main {
    public static <string> void main(String[] args)
    {
        int intOperandA = 17;
        int intOperandB = 12;
        int intSum;
        int intProduct;
        int intDifference;
        int intQuotient;
        int intModulo;
        double doubleOperandA = 3.50;
        double doubleOperandB = 4.75;
        double doubleSum;
        double doubleProduct;
        double doubleDifference;
        double doubleQuotient;

        intSum = intOperandA + intOperandB;
        System.out.println("The sum using ints of "  + intOperandA + " and " + intOperandB +  " is " +
                intSum);

        intProduct = intOperandA * intOperandB;
        System.out.println("The product using ints of " + intOperandA + " and " + intOperandB + " is " + intProduct);

        intDifference = intOperandA - intOperandB;
        System.out.println("The difference using ints of " + intOperandA + " and " + intOperandB + " is " + intDifference);

        intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient using ints of " + intOperandA + " and " + intOperandB + " is " + intQuotient);

        intModulo = intOperandA % intOperandB;
        System.out.println("The modulo using ints of " + intOperandA + " and " + intOperandB + " is " + intModulo);

        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum using doubles of "  + doubleOperandA + " and " + doubleOperandB +  " is " +
                doubleSum);

        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);

        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);

        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);

        double myLunchCost = 12.50;
        int kidsInMyFamily = 2;
        String raining = "no";
        double gasPrice = 3.50;
        int favoriteNumber = 13;
        double myShoeSize = 8.5;
        String myBirthMonth = "February";
        String myName = "Dalton Towe";


        System.out.println("My lunch cost " + myLunchCost);
        System.out.println("There are " + kidsInMyFamily + " kids in my family");
        System.out.println("Is it raining? " + raining);
        System.out.println("Gas per gallon is " + gasPrice);
        System.out.println("My favorite number is " + favoriteNumber);
        System.out.println("My shoe size is " + myShoeSize);
        System.out.println("My birth month is " + myBirthMonth);
        System.out.println("My name is " + myName);
    }
}