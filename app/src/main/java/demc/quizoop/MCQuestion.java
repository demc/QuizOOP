package demc.quizoop;

import java.util.Scanner;

public class MCQuestion extends Question
{
    private String[] mOptions;
    private int mAnswerIndex;

    public MCQuestion(String questionText, int answerIndex, String... options)
    {
        super(questionText);
        mAnswerIndex = answerIndex;
        mOptions = options;
    }

    @Override
    public void prompt()
    {
        System.out.println("Select the best option:");
        for (int i = 0; i < mOptions.length; i++)
        {
            System.out.println(i + ") " + mOptions[i]);
        }
    }

    @Override
    public boolean readInputAndCheckAnswer(Scanner input)
    {
        int response = input.nextInt();
        return checkAnswer(response);
    }

    @Override
    public boolean checkAnswer(int answer)
    {
        return mAnswerIndex == answer;
    }

    @Override
    public boolean isMultipleChoiceQuestion()
    {
        return true;
    }
}
