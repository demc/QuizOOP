package demc.quizoop;

import java.util.Scanner;

class FillTheBlankQuestion extends Question
{
    private String[] mAnswers;

    public FillTheBlankQuestion(String text, String... answers)
    {
        super(text);
        mAnswers = answers;
    }

    @Override
    public void prompt()
    {
        super.prompt();
        System.out.print("Type your response: ");
    }

    @Override
    public boolean readInputAndCheckAnswer(Scanner input)
    {
        String response = input.nextLine();
        return checkAnswer(response);
    }

    @Override
    public boolean checkAnswer(String answer)
    {
        for (String ans : mAnswers)
        {
            if (ans.equalsIgnoreCase(answer))
            {
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean isFillTheBlankQuestion()
    {
        return true;
    }
}
