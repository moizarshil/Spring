package question_4;

import java.util.List;

public class Question {
    private int id;
    private String question;
    private List<String> answers;

    public Question(int id, String question, List<String> answers) {
        this.id = id;
        this.question = question;
        this.answers = answers;
    }

    public int getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getAnswers() {
        return answers;
    }
}