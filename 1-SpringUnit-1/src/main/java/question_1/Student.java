//10. Write a code to print employee name and display name related employee department information using "byName" autowiring mode of spring framework.
//11. Write a code to print employee name and display name related employee department information using "by/Type" autowiring mode of spring framework.
//12. Write a code to print employee name and display name related employee department information using "constructor" autowiring mode of spring framework.
//13. Write a code to print employee name and display name related employee department information using "autodetect" autowiring mode of spring framework.

package question_1;

public class Student {
    private int rollno;
    private String name;

    // Getters and Setters
    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

