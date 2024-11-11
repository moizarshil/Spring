package question_11;
//11. Write a code to print employee name and display name related employee department information using "by/Type" autowiring mode of spring framework.

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("question_11/applicationContext.xml");
        Employee employee = (Employee) context.getBean("employee");
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Department Name: " + employee.getDepartment().getName());
    }
}