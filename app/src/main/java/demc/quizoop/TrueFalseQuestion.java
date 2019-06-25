package demc.quizoop;

import java.util.Scanner;

public class TrueFalseQuestion extends Question
{
    private boolean mAnswer;

    public TrueFalseQuestion(String text, boolean answer)
    {
        super(text);
        mAnswer = answer;
    }

    public boolean getAnswer()
    {
        return mAnswer;
    }

    public void setAnswer(boolean answer)
    {
        mAnswer = answer;
    }

    @Override
    public void prompt()
    {
        super.prompt();
        System.out.print("Enter t or f: ");
    }

    @Override
    public boolean readInputAndCheckAnswer(Scanner input)
    {
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

        return checkAnswer(response);
    }

    @Override
    public boolean checkAnswer(boolean answer)
    {
        return mAnswer == answer;
    }

    @Override
    public boolean isTrueFalseQuestion()
    {
        return true;
    }
}
