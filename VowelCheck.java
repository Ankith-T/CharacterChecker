import java.util.Scanner;
public class VowelCheck {
    public static void main(String[] args) throws Exception {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter a Letter:");
        char alphabetInput = inputScanner.next().charAt(0);

        if (alphabetInput == 'a'|| alphabetInput == 'e' || alphabetInput == 'i' || alphabetInput =='o' || alphabetInput == 'u' || alphabetInput == 'A'||alphabetInput == 'E'|| alphabetInput == 'I'|| alphabetInput == 'O'|| alphabetInput == 'U' ){
            System.out.println(alphabetInput +" is a vowel.");
        }
        else if( Character.isLetter(alphabetInput) ){
            System.out.println(alphabetInput+ " is a consonant");
        }
        else {
            System.out.println(alphabetInput + " is an invalid input");
        }
    }
}
