import java.util.Scanner;

/**
 * hello
 */
public class hello {

    public static void main(String[] args) {
        // create scanner for getting values
        Scanner s1 = new Scanner(System.in);
        
        System.out.print("Enter name :");

        
        String name = s1.next();

        // call person information class
        PersonInfo person = new PersonInfo();

        // assign value to method in Person info class
        person.name(name);
    }
}

/**
 * Person Info
 */
class PersonInfo {

    // create method for name
    public void name(String name) {
        System.out.println("Hello " + name);
    }
}