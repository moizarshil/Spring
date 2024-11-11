package question_5;

import java.util.Map;

public class QuestionMap {
    private Map<Integer, Question> questions;

    public QuestionMap(Map<Integer, Question> questions) {
        this.questions = questions;
    }

    public Map<Integer, Question> getQuestions() {
        return questions;
    }
}