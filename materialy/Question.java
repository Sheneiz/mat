// Question.java
public class Question {
    private String text;
    private String[] options;
    private int correctIndex;

    public Question(String text, String[] options, int correctIndex) {
        this.text = text;
        this.options = options;
        this.correctIndex = correctIndex;
    }

    public boolean checkAnswer(int answer) { return answer == correctIndex; }
    public String getText() { return text; }
    public String[] getOptions() { return options; }
}