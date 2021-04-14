import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriterTool {
	
	public ExcelWriterTool() {
		
	}
	
	public void writeExcel(List<Person> listPerson, String excelFilePath, Workbook workbook) throws IOException {
	    Sheet sheet = workbook.createSheet();
	 
	    int rowCount = 0;
	 
	    for (Person aPerson : listPerson) {
	        Row row = sheet.createRow(++rowCount);
	        writePerson(aPerson, row);
	    }
	 
	    try (FileOutputStream outputStream = new FileOutputStream(excelFilePath)) {
	        workbook.write(outputStream);
	    }
	}
	
	private void writePerson(Person aPerson, Row row) {
		Cell cell = row.createCell(1);
	    cell.setCellValue(aPerson.getName());
	 
	    cell = row.createCell(2);
	    cell.setCellValue(aPerson.getNumberOfAttendance());	
	}
	
	public Workbook getWorkbook(String excelFilePath)
	        throws IOException {
	    Workbook workbook = null;
	 
	    if (excelFilePath.endsWith("xlsx")) {
	        workbook = new XSSFWorkbook();
	    } else if (excelFilePath.endsWith("xls")) {
	        workbook = new HSSFWorkbook();
	    } else {
	        throw new IllegalArgumentException("The specified file is not Excel file");
	    }
	 
	    return workbook;
	}

}
