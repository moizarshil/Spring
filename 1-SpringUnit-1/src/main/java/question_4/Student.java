package question_4;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private List<Question> questions;

    public Student(int id, String name, List<Question> questions) {
        this.id = id;
        this.name = name;
        this.questions = questions;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Question> getQuestions() {
        return questions;
    }
}