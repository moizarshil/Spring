package question_2;
//2. Write a code to display "EmpName" using by BeanFactory and ApplicationContext of spring IOC Container.

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Using ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("question_2/applicationContext.xml");
        Employee employee = (Employee) context.getBean("employee");
        System.out.println("Employee Name: " + employee.getEmpName());
    }
}