/*
    First project in java
 */

// This is package name
package programm;

// Include other package
import person.Person;

public class Main {
	public static void main(String[] args) {
		System.out.println("main method start\n");

		// Create new Person
		Person Bob = new Person();

		// Use public methods
		boolean check = person.Person.checkValidAge(Bob);
		System.out.println("Check valid age for Bob = " + check);
		person.Person.getPersonInfo(Bob);

		// Use Bob methods
		Bob.setAge(30);
		Bob.setFirstName("Bob");
		Bob.setLastName("Allone");

		// Check changed data
		person.Person.getPersonInfo(Bob);

		// Get Bob info from toString
		System.out.println(Bob);
	}
}
