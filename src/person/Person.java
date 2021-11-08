package person;

public class Person {
	String	_firstName;
	String	_lastName;
	int		_age;

	{
		_firstName = null;
		_lastName = null;
		_age = 0;
	}

	public Person(){
		System.out.println("Person ctor start");
	}

	public Person(String firstName, String lastName, int age){
		System.out.println("Person ctor start");
		_age = age;
		_lastName = lastName;
		_firstName = firstName;
	}

	public static boolean checkValidAge(Person person){
		System.out.println("checkValidAge method start");
		if (person.getAge() < 0 || person.getAge() > 150)
			return (false);
		return (true);
	}

	public static void	getPersonInfo(Person person){
		System.out.println("getPersonInfo method start");
		System.out.println("First name: " + person.getFirstName() +
							"\nLast name: " + person.getLastName() +
							"\nAge: " + person.getAge());
	}

	// Overload toString() method
	public String	toString(){
		System.out.println("toString method start");
		return ("First name: " + _firstName +
				"\nLast name: " + _lastName +
				"\nAge: " + _age);
	}

	public void		setFirstName(String newFirstName){
		_firstName = newFirstName;
	}

	public String	getFirstName(){
		return (_firstName);
	}

	public void		setLastName(String newLastName){
		_lastName = newLastName;
	}

	public String	getLastName(){
		return (_lastName);
	}

	public void 	setAge(int newAge){
		_age = newAge;
	}

	public int		getAge(){
		return (_age);
	}
}
