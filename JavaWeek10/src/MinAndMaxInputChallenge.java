import java.util.Scanner;

//-Read the numbers from the console entered by the user and print the minimum
//and maximum number the user has entered.
public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        method();
    }

    public static void method(){
        boolean firstNumber = true;
        int min = 0; int max = 0;
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Enter the number: ");
            boolean input = scanner.hasNextInt();
            if(input){
                int number = scanner.nextInt();
                if(firstNumber){
                    min = number;
                    max = number;
                    firstNumber = false;
                }
                if(number > max){
                    max = number;
                }
                if(number < min){
                    min = number;
                }
            }
                else{
                    System.out.println("Invalid Number!!!");
                    break;
                }
                scanner.nextLine();
            }
            System.out.println("Minimum number: " + min + "Maximum number: " + max);
        }
    }

