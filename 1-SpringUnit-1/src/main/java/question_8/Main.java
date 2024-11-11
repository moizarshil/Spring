package question_8;
//8. Write a code to print student id name answer by asking question using collection of setter injection of spring Dependency Injection.

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("question_8/applicationContext.xml");
        Student student = (Student) context.getBean("student");
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
        for (Question question : student.getQuestions()) {
            System.out.println("Question ID: " + question.getId());
            System.out.println("Question: " + question.getQuestion());
            System.out.println("Answers: " + question.getAnswers());
        }
    }
}