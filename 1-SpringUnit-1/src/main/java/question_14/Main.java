package question_14;
//Write a code to manage a library system where you can add books, list all books, and search for a book by its title using Spring framework with annotation-based configuration. Use @Autowired for dependency injection and @Component for bean definition.

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("question_14/applicationContext.xml");
        Library library = (Library) context.getBean("library");

        System.out.println("All Books in the Library:");
        for (Book book : library.listAllBooks()) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the title of the book to search: ");
        String searchTitle = scanner.nextLine();

        Book searchedBook = library.searchBookByTitle(searchTitle);
        if (searchedBook != null) {
            System.out.println("Book found: Title: " + searchedBook.getTitle() + ", Author: " + searchedBook.getAuthor());
        } else {
            System.out.println("Book with title '" + searchTitle + "' not found.");
        }
    }
}