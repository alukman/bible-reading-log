import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	private File excelFile;

	public ExcelReader() throws IOException {
		
		excelFile = new File("BibleReading11pmLog.xlsx");
		
	}
	
	public List<String> loadInData() throws IOException {
		List<String> data = new ArrayList<String>();
		
		FileInputStream fis = new FileInputStream(this.excelFile);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		Iterator<Row> rowIt = sheet.iterator();
		
		while(rowIt.hasNext()) {
			Row row = rowIt.next();
			
			Iterator<Cell> cellIterator = row.cellIterator();
			
			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				data.add(cell.toString());
				cell = cellIterator.next();
				data.add(cell.toString());
			}
			
			//System.out.println();
		}

		workbook.close();
		fis.close();
		return data;
		
	}
	
}
