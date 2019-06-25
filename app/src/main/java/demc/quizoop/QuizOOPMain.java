package demc.quizoop;

import java.util.Scanner;

public class QuizOOPMain
{
    public static void main(String[] args)
    {
        Question[] questions = new Question[1];
        questions[0] = new TrueFalseQuestion("You can see Russia from my house", false);
        questions[1] = new FillTheBlankQuestion("The capital of Texas is ___.", "Austin");

        int index = 0;
        int score = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to my geo quiz! Good luck!");

        while (index < questions.length)
        {
            System.out.println(questions[index].getText());
            boolean boolResponse;
            String strResponse;
            boolean correctResponse = false;

            if (questions[index].isTrueFalseQuestion())
            {
                System.out.print("Enter t or f: ");
                char in = input.nextLine().charAt(0);
                boolean response;

                if (in == 't')
                {
                    response = true;
                }
                else
                {
                    response = false;
                }
                correctResponse = questions[index].checkAnswer(response);
            }
            else
            {
                System.out.print("Type your response: ");
                String response = input.nextLine();
            }

            if (correctResponse)
            {
                System.out.println("Correct! :)");
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
