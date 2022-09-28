package PracticePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadTheDataFromExcelTest {

	public static void main(String[] args) throws Throwable 
	{
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Hospital Project.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet s = book.getSheet("Doctor Module");   //sheet
		Row r = s.getRow(1);             //row
		Cell c = r.getCell(3);           //cell
		String value = c.getStringCellValue();
		System.out.println(value);


	}

}
