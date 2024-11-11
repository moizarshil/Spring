package question_3;
//3. Write a code to print employee Address detail like city state country by applying constructor injection from dependency injection of spring framework.

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("question_3/applicationContext.xml");
        Employee employee = (Employee) context.getBean("employee");
        Address address = employee.getAddress();
        System.out.println("Employee: " + employee);
        System.out.println("City: " + address.getCity());
        System.out.println("State: " + address.getState());
        System.out.println("Country: " + address.getCountry());
    }
}