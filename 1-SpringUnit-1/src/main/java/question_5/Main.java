package question_5;
//5. Write a code to print id ‚question and answer of question using Map method of constructor injection of spring Dependency injection.

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("question_5/applicationContext.xml");
        QuestionMap questionMap = (QuestionMap) context.getBean("questionMap");
        for (Question question : questionMap.getQuestions().values()) {
            System.out.println("Question ID: " + question.getId());
            System.out.println("Question: " + question.getQuestion());
            System.out.println("Answer: " + question.getAnswer());
        }
    }
}
