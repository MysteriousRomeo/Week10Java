import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check if its a palindrome or not: ");
        int number = scanner.nextInt();
        System.out.println(method(number));
    }

    public static int method(int number) {
        int lastDigit;
        int sum = 0;
        int reverseNumber = number;
        //1551
        while (number > 0) {
            lastDigit = number % 10; //received last digit (1)
            sum = (sum * 10) + lastDigit; //(1)
            number = number / 10;
        }
        if (reverseNumber == sum) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("not palindrome");
        }
        return 0;

    }
}
