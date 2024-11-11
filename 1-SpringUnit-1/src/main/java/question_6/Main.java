package question_6;
//6. Write a code to print employee id name and address using by constructor injection apply on inheriting bean class of spring Dependency injection

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("question_6/applicationContext.xml");
        Manager manager = (Manager) context.getBean("manager");
        System.out.println("Employee ID: " + manager.getId());
        System.out.println("Employee Name: " + manager.getName());
        Address address = manager.getAddress();
        System.out.println("City: " + address.getCity());
        System.out.println("State: " + address.getState());
        System.out.println("Country: " + address.getCountry());
    }
}