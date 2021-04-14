import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PeopleList {
	
	private Person person1;
	private Person person2;
	private Person person3;
	private Person person4;
	private Person person5;
	private Person person6;
	private Person person7;
	private Person person8;
	private Person person9;
	private Person person10;
	private Person person11;
	private Person person12;
	private Person person13;
	private Person person14;
	private Person person15;
	private Person person16;
	private Person person17;
	private Person person18;
	private Person person19;
	
    private List<Person> peopleList;

	public PeopleList()
	{
		person1 = new Person(1, "Andrew Lukman", 7);
		person2 = new Person(2, "Annabelle", 2);
		person3 = new Person(3, "Billy", 2);
		person4 = new Person(4, "Bryan", 1);
		person5 = new Person(5, "Bryce", 1);
		person6 = new Person(6, "Charlotte", 5);
		person7 = new Person(7, "Cherryl", 2);
		person8 = new Person(8, "Daniel Lauw", 1);
		person9 = new Person(9, "Gitta", 1);
		person10 = new Person(10, "Ivan", 4);
		person11 = new Person(11, "Juan", 5);
		person12 = new Person(12, "Kevin Soe", 1);
		person13 = new Person(13, "Nick", 7);
		person14 = new Person(14, "Noel", 4);
		person15 = new Person(15, "Richard", 7);
		person16 = new Person(16, "Rochelle", 3);
		person17 = new Person(17, "Sharon", 7);
		person18 = new Person(18, "Yuvella", 1);
		person19 = new Person(18, "Jennifer", 5);
		
		peopleList = Arrays.asList(person1, person2, person3, person4, person5, 
				person6, person7, person8, person9, person10, person11, person12, 
				person13, person14, person15, person16, person17, person18, person19);
	}
	
	public PeopleList(String[] names, int[] attendances) {
		peopleList = new ArrayList<Person>();
		
		for (int i = 0; i < names.length; i++)
		{
			Person person = new Person(i, names[i], attendances[i]);
			peopleList.add(person);
		}
	}
	
	public List<Person> getListPerson() {
		return this.peopleList;
	}
	
	public void incrAttendanceBasedOnButtonsClicked(boolean[] attendancesToday) {
		for (int i = 0; i < attendancesToday.length; i++) {
			if (attendancesToday[i])
				peopleList.get(i).addAttendance();		
		}
	}
}
