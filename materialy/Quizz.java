// Quiz.java
import java.util.*;

public class Quiz {
    private List<Question> questions = new ArrayList<>();
    private int score = 0;

    public void addQuestion(Question q) { questions.add(q); }
    public void start() {
        Scanner sc = new Scanner(System.in);
        for (Question q : questions) {
            System.out.println(q.getText());
            String[] opts = q.getOptions();
            for (int i = 0; i < opts.length; i++) {
                System.out.println((i + 1) + ". " + opts[i]);
            }
            int ans = sc.nextInt() - 1;
            if (q.checkAnswer(ans)) score++;
        }
        System.out.println("Twój wynik: " + score + "/" + questions.size());
    }
}