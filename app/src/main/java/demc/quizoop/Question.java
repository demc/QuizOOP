package demc.quizoop;

public class Question
{
    private String mQuestionText;
    private String mTextAnswer;
    private boolean mFillTheBlankQuestion;


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

    public boolean checkAnswer(boolean answer)
    {
        return false;
    }

    public boolean checkAnswer(String answer)
    {
        return mTextAnswer.equalsIgnoreCase(answer);
    }

    public boolean isTrueFalseQuestion()
    {
        return true;
    }

    public boolean isFillTheBlankQuestion()
    {
        return mFillTheBlankQuestion;
    }
}
