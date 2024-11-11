package question_1;
//1. Write a code to display "Rollno and StudentName" using spring framework.
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("question_1/applicationContext.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
        System.out.println(student.getRollno());
        System.out.println(student.getName());
    }
}