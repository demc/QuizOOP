package demc.quizoop;

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
    public boolean isTrueFalseQuestion()
    {
        return true;
    }
}
