//Write a Java program that takes the user to provide a single character from the
//alphabet. Print Vowel of Consonant, depending on the user input.
import java.util.Scanner;

public class ConsonentAndVowel {
    public static void main(String[] args) {
        method();
    }

    public static void method(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Alphabet: ");

        if(scanner.hasNextInt()){
            System.out.println("khotu input che");
        }
        //scanner.nextLine();
        String input = scanner.next();

        if(input.length() > 1){
            System.out.println("khotu input che");
        }
        else if(input.equals("a") || input.equals("A")|| input.equals("e") || input.equals("E") || input.equals("i") || input.equals("I")||
                input.equals("o") || input.equals("O") || input.equals("u") || input.equals("U")){
            System.out.println("Vowel che");
        }else System.out.println("consonent che");



    }
}
