import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Person {
	private int personNumber;
	private String name;
	private int numOfAttendance;
	
	public Person() {
		this.name = "First Last";
		this.numOfAttendance = 0;
	}
	
	public Person(int thePersonNumber, String nameOfPerson, int numberAttendance){
		this.personNumber = thePersonNumber;
		this.name = nameOfPerson;
		this.numOfAttendance = numberAttendance;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPersonNumber() {
		return this.personNumber;
	}
	
	public int getNumberOfAttendance() {
		return this.numOfAttendance;
	}

	public String toString() {
		return this.name + ", " + this.numOfAttendance;
	}

	public void addAttendance() {
		this.numOfAttendance++;
		
	}

}
