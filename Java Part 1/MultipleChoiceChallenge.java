import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        String question = "Which of the following is the name of a network topology?";
        String choiceOne = "flower";
        String choiceTwo = "star";
        String choiceThree = "ipv4";

        String correctAnswer = choiceTwo;

        System.out.println(question);

        System.out.println("Choose one of the following: "
                + choiceOne + ", " + choiceTwo + ", or " + choiceThree + ".");

        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        if (choiceTwo.equals(input.toLowerCase())) {
            System.out.println("Yes, that is the correct answer.");
        } else {
            System.out.println("Sorry, that is the incorrect answer. The correct answer is " + correctAnswer);
        }

    }

}

