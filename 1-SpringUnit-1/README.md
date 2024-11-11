# Spring Framework Unit 1 - CMP508 University
This repository contains various examples demonstrating the use of Spring Framework for Dependency Injection. Each example corresponds to a specific question and showcases different aspects of Spring's IoC container.

## Owner: Abhiraj Chaudhuri (22000214)

## Questions and Outputs

| #  | Question                                                                                              | Output                                                                                                                                                                                                                                                                                                                                 | Links to Files                                                                                                                                                                                                                         |
|----|-------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 1  | Write a code to display "Rollno and StudentName" using Spring Framework.                              | `Rollno: 22000214`<br>`Student Name: Abhiraj`                                                                                                                                                                                                                                                                                          | [Student.java](src/main/java/question_1/Student.java)<br>[Main.java](src/main/java/question_1/Main.java)<br>[applicationContext.xml](src/main/resources/question_1/applicationContext.xml)                                              |
| 2  | Write a code to display "EmpName" using BeanFactory and ApplicationContext of Spring IoC Container.   | `Employee Name: Abhiraj Chaudhuri`                                                                                                                                                                                                                                                                                                     | [Employee.java](src/main/java/question_2/Employee.java)<br>[Main.java](src/main/java/question_2/Main.java)<br>[applicationContext.xml](src/main/resources/question_2/applicationContext.xml)                                            |
| 3  | Write a code to print employee Address details like city, state, country using constructor injection.  | `Employee: question_3.Employee@61009542`<br>`City: Vadodara`<br>`State: Gujarat`<br>`Country: India`                                                                                                                                                                                                                                  | [Employee.java](src/main/java/question_3/Employee.java)<br>[Address.java](src/main/java/question_3/Address.java)<br>[Main.java](src/main/java/question_3/Main.java)<br>[applicationContext.xml](src/main/resources/question_3/applicationContext.xml) |
| 4  | Write a code to print student id, name, and answer to questions using collection-based constructor injection. | `Student ID: 22000214`<br>`Student Name: Abhiraj`<br>`Question ID: 1`<br>`Question: What is Java?`<br>`Answers: [Programming Language, Platform, Both]`<br>`Question ID: 2`<br>`Question: What is Spring?`<br>`Answers: [Framework, Library, Both]` | [Student.java](src/main/java/question_4/Student.java)<br>[Main.java](src/main/java/question_4/Main.java)<br>[applicationContext.xml](src/main/resources/question_4/applicationContext.xml)                                              |
| 5  | Write a code to print question id, question, and answer using Map method of constructor injection.     | `Question ID: 1`<br>`Question: What is your name?`<br>`Answer: Abhiraj Chaudhuri`<br>`Question ID: 2`<br>`Question: What is your age?`<br>`Answer: 20 years`                                                                                                                                   | [Question.java](src/main/java/question_5/Question.java)<br>[QuestionMap.java](src/main/java/question_5/QuestionMap.java)<br>[Main.java](src/main/java/question_5/Main.java)<br>[applicationContext.xml](src/main/resources/question_5/applicationContext.xml) |
| 6  | Write a code to print employee id, name, and address using constructor injection with an inheriting bean class. | `Employee ID: 214`<br>`Employee Name: Abhie`<br>`City: Vadodara`<br>`State: GUJ`<br>`Country: INDIA`                                                                                                                                                                                                                                  | [Address.java](src/main/java/question_6/Address.java)<br>[Employee.java](src/main/java/question_6/Employee.java)<br>[Manager.java](src/main/java/question_6/Manager.java)<br>[Main.java](src/main/java/question_6/Main.java)<br>[applicationContext.xml](src/main/resources/question_6/applicationContext.xml) |
| 7  | Write a code to print employee address details using setter injection.                                | `City: Mumbai`<br>`State: Maharashtra`<br>`Country: India`                                                                                                                                                                                                                                                                            | [Address.java](src/main/java/question_7/Address.java)<br>[Employee.java](src/main/java/question_7/Employee.java)<br>[Main.java](src/main/java/question_7/Main.java)<br>[applicationContext.xml](src/main/resources/question_7/applicationContext.xml) |
| 8  | Write a code to print student id, name, and answer to questions using collection-based setter injection. | `Student ID: 22000214`<br>`Student Name: Abhiraj`<br>`Question ID: 1`<br>`Question: What is NLP?`<br>`Answers: [Natural Language Processing, Neural Language Processing, Both]`<br>`Question ID: 2`<br>`Question: What is AI?`<br>`Answers: [Artificial Intelligence, Machine Learning, Data Science]` | [Question.java](src/main/java/question_8/Question.java)<br>[Student.java](src/main/java/question_8/Student.java)<br>[Main.java](src/main/java/question_8/Main.java)<br>[applicationContext.xml](src/main/resources/question_8/applicationContext.xml) |
| 9  | Write a code to print question id, question, and answer using Map method of setter injection.          | `Question ID: 1`<br>`Question: What is NLP?`<br>`Answer: Natural Language Processing`<br>`Question ID: 2`<br>`Question: What is Word2Vec?`<br>`Answer: Word to Vector`                                                                                                                         | [Question.java](src/main/java/question_9/Question.java)<br>[QuestionMap.java](src/main/java/question_9/QuestionMap.java)<br>[Main.java](src/main/java/question_9/Main.java)<br>[applicationContext.xml](src/main/resources/question_9/applicationContext.xml) |
| 10 | Write a code to print employee name and display department info using "byName" autowiring mode.        | `Employee Name: Abhieeeee`<br>`Department Name: IT`                                                                                                                                                                                                                                                                                   | [Department.java](src/main/java/question_10/Department.java)<br>[Employee.java](src/main/java/question_10/Employee.java)<br>[Main.java](src/main/java/question_10/Main.java)<br>[applicationContext.xml](src/main/resources/question_10/applicationContext.xml) |
| 11 | Write a code to print employee name and display department info using "byType" autowiring mode.        | `Employee Name: Abhieeeeeeeeee`<br>`Department Name: IT`                                                                                                                                                                                                                                                                              | [Department.java](src/main/java/question_11/Department.java)<br>[Employee.java](src/main/java/question_11/Employee.java)<br>[Main.java](src/main/java/question_11/Main.java)<br>[applicationContext.xml](src/main/resources/question_11/applicationContext.xml) |
| 12 | Write a code to print employee name and display department info using "constructor" autowiring mode.   | `Employee Name: Abhie.constructor`<br>`Department Name: IT`                                                                                                                                                                                                                                                                           | [Department.java](src/main/java/question_12/Department.java)<br>[Employee.java](src/main/java/question_12/Employee.java)<br>[Main.java](src/main/java/question_12/Main.java)<br>[applicationContext.xml](src/main/resources/question_12/applicationContext.xml) |
| 13 | Write a code to print employee name and display department info using "autodetect" autowiring mode.    | `Employee Name: Abhie.autodetect`<br>`Department Name: IT`                                                                                                                                                                                                                                                                            | [Department.java](src/main/java/question_13/Department.java)<br>[Employee.java](src/main/java/question_13/Employee.java)<br>[Main.java](src/main/java/question_13/Main.java)<br>[applicationContext.xml](src/main/resources/question_13/applicationContext.xml) |
| 14 | Write a code to manage a library system with @Autowired for dependency injection and @Component for bean definition. | `All Books in the Library:`<br>`Title: Deep Learning in Practice, Author: Mehdi Ghayoumi`<br>`Title: Atomic Habits, Author: James Clear`<br>`Enter the title of the book to search: Deep Learning in Practice`<br>`Book found: Title: Deep Learning in Practice, Author: Mehdi Ghayoumi`          | [Book.java](src/main/java/question_14/Book.java)<br>[Library.java](src/main/java/question_14/Library.java)<br>[Main.java](src/main/java/question_14/Main.java)<br>[applicationContext.xml](src/main/resources/question_14/applicationContext.xml) |

## Directory Structure

```
.
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── question_1
│   │   │   │   ├── Main.java
│   │   │   │   └── Student.java
│   │   │   ├── question_2
│   │   │   │   ├── Employee.java
│   │   │   │   └── Main.java
│   │   │   ├── question_3
│   │   │   │   ├── Address.java
│   │   │   │   ├── Employee.java
│   │   │   │   └── Main.java
│   │   │   ├── question_4
│   │   │   │   ├── Main.java
│   │   │   │   └── Student.java
│   │   │   ├── question_5
│   │   │   │   ├── Question.java
│   │   │   │   ├── QuestionMap.java
│   │   │   │   └── Main.java
│   │   │   ├── question_6
│   │   │   │   ├── Address.java
│   │   │   │   ├── Employee.java
│   │   │   │   ├── Manager.java
│   │   │   │   └── Main.java
│   │   │   ├── question_7
│   │   │   │   ├── Address.java
│   │   │   │   ├── Employee.java
│   │   │   │   └── Main.java
│   │   │   ├── question_8
│   │   │   │   ├── Question.java
│   │   │   │   ├── Student.java
│   │   │   │   └── Main.java
│   │   │   ├── question_9
│   │   │   │   ├── Question.java
│   │   │   │   ├── QuestionMap.java
│   │   │   │   └── Main.java
│   │   │   ├── question_10
│   │   │   │   ├── Department.java
│   │   │   │   ├── Employee.java
│   │   │   │   └── Main.java
│   │   │   ├── question_11
│   │   │   │   ├── Department.java
│   │   │   │   ├── Employee.java
│   │   │   │   └── Main.java
│   │   │   ├── question_12
│   │   │   │   ├── Department.java
│   │   │   │   ├── Employee.java
│   │   │   │   └── Main.java
│   │   │   ├── question_13
│   │   │   │   ├── Department.java
│   │   │   │   ├── Employee.java
│   │   │   │   └── Main.java
│   │   │   ├── question_14
│   │   │   │   ├── Book.java
│   │   │   │   ├── Library.java
│   │   │   │   └── Main.java
│   │   └── resources
│   │       ├── question_1
│   │       │   └── applicationContext.xml
│   │       ├── question_2
│   │       │   └── applicationContext.xml
│   │       ├── question_3
│   │       │   └── applicationContext.xml
│   │       ├── question_4
│   │       │   └── applicationContext.xml
│   │       ├── question_5
│   │       │   └── applicationContext.xml
│   │       ├── question_6
│   │       │   └── applicationContext.xml
│   │       ├── question_7
│   │       │   └── applicationContext.xml
│   │       ├── question_8
│   │       │   └── applicationContext.xml
│   │       ├── question_9
│   │       │   └── applicationContext.xml
│   │       ├── question_10
│   │       │   └── applicationContext.xml
│   │       ├── question_11
│   │       │   └── applicationContext.xml
│   │       ├── question_12
│   │       │   └── applicationContext.xml
│   │       ├── question_13
│   │       │   └── applicationContext.xml
│   │       └── question_14
│   │           └── applicationContext.xml
└── .gitignore
```
