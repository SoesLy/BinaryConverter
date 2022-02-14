import java.util.Scanner;

public class BinaryConverter {

    public static void main(String[] args) {
        //Creating an object of a Scanner
        Scanner scan = new Scanner(System.in);

        //Printing out the programs function to the screen
        System.out.println("Convert a binary number to a decimal");

        //Asking the user to input a binary number
        System.out.println("Please input your binary number: ");
        //using the scanner to take in the users binary number
        String inputBinaryNumber = scan.nextLine();
        //Using the Integer.parseInt(String s, int radix) to convert the binary to a decimal
        //where we take the inputted binary number and the radix of 2
        System.out.println(inputBinaryNumber + " is: " + Integer.parseInt(inputBinaryNumber, 2) + " as a decimal 😁");
    }
}
