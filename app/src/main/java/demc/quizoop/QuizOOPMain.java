package demc.quizoop;

import java.util.Scanner;

public class QuizOOPMain
{
    public static void main(String[] args)
    {
        Question[] questions = new Question[4];
        questions[0] = new TrueFalseQuestion("You can see Russia from my house", false);
        questions[1] = new FillTheBlankQuestion("The capital of Texas is ___.", "Austin");
        questions[2] = new FillTheBlankQuestion("A StarWars character is ___.", "Han Solo", "Chewbacca");
        questions[3] = new MCQuestion("Aniken is from which planet?", 1, "Alderaan", "Tatooine", "Coruscant", "Hoth");

        int index = 0;
        int score = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to my geo quiz! Good luck!");

        while (index < questions.length)
        {
//            System.out.println(questions[index].getText());
//            boolean correctResponse = false;
//
//            if (questions[index].isTrueFalseQuestion())
//            {
//                System.out.print("Enter t or f: ");
//            }
//            else if (questions[index].isTrueFalseQuestion())
//            {
//                System.out.print("Type your response: ");
//            }
//            else if (questions[index].isMultipleChoiceQuestion())
//            {
//                System.out.println("Select the best option:");
//                for (String option : questions[index].getOptions())
//            }

            questions[index].prompt();

            boolean correctResponse = questions[index].readInputAndCheckAnswer(input);

            if (correctResponse)
            {
                System.out.println("Correct! :)");
                score++;
            }
            else
            {
                System.out.println("Incorrect! ;)");
            }

            System.out.println();
            index++;
        }

        System.out.println("You score is " + score + "!");
    }
}
