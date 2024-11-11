package question_10;
//10. Write a code to print employee name and display name related employee department information using "byName" autowiring mode of spring framework.

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("question_10/applicationContext.xml");
        Employee employee = (Employee) context.getBean("employee");
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Department Name: " + employee.getDepartment().getName());
    }
}
