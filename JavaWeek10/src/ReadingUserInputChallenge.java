import java.util.Scanner;

//1. Read 10 numbers from the console entered by the user and print the sum of those
//numbers.
public class ReadingUserInputChallenge {

    public static void main(String[] args) {
        method();
    }
    public static void method(){
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int sum = 0;

        while(counter <=10){
            System.out.println("Enter number #" + counter);
            boolean input = scanner.hasNextInt();
            if(input = true){
                int num = scanner.nextInt();
                sum = sum + num;
                counter++;
            }else {
                System.out.println("Invalid Number!"); // It's not showing this message. I dont know whyyyy???
            }
        }
        System.out.println("Sum = " + sum);
    }
}