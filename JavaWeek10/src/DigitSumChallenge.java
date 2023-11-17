import java.util.Scanner;

//Write a method with the name sumDigitsthat has one int parameter called number.
public class DigitSumChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = scanner.nextInt();
        System.out.println(sumDigits(number));
    }

    public static int sumDigits(int number){
        if(number >= 10){
            int sum = 0;

            while (number > 0){
                sum = (sum + number) % 10;
                number = number/10;
            }
            return sum;
        }
        return -1;
    }
}
