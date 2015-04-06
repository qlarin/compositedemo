import java.util.ArrayList;
import java.util.List;


public class Person {

	private String firstName;
	private String lastName;
	private String rank;
	private int age;
	private List<Person> listOfPersons;
	
	public Person(String firstName, String lastName, int age, String rank){
		this.firstName = firstName;
		this.lastName = lastName;
		this.rank = rank;
		this.age = age;
		listOfPersons = new ArrayList<Person>();
	}
	
	public void add(Person person){
		listOfPersons.add(person);
	}
	
	public void remove(Person person){
		listOfPersons.remove(person);
	}
	
	public List<Person> getListOfPersons(){
		return listOfPersons;
	}
	
	public String toString(){
		return ("Person[ " + firstName + " " + lastName + ", " + age + ", " + rank + " ]");
	}
}
