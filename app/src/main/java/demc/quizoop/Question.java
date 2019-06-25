package demc.quizoop;

import java.util.Scanner;

public class Question
{
    private String mQuestionText;

    public Question(String questionText)
    {
        mQuestionText = questionText;
    }

    public String getText()
    {
        return mQuestionText;
    }

    public void setText(String text)
    {
        mQuestionText = text;
    }

    public boolean readInputAndCheckAnswer(Scanner input)
    {
        return false;
    }

    public void prompt()
    {
        System.out.println(mQuestionText);
    }

    public boolean checkAnswer(boolean answer)
    {
        return false;
    }

    public boolean checkAnswer(String answer)
    {
        return false;
    }

    public boolean checkAnswer(int answer)
    {
        return false;
    }

    public boolean isTrueFalseQuestion()
    {
        return true;
    }

    public boolean isFillTheBlankQuestion()
    {
        return false;
    }

    public boolean isMultipleChoiceQuestion() {
        return false;
    }
}
