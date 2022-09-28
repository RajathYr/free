package PracticePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteTheDataIntoExcelTest 
{

	public static void main(String[] args) throws Throwable 
	{
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\HMS excel to write.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Row r = sh.createRow(0);
		Cell ce = r.createCell(0);
		ce.setCellValue("bangalore");

		FileOutputStream fo=new FileOutputStream(".\\src\\test\\resources\\HMS excel to write.xlsx");
		wb.write(fo);
		wb.close();

	}

}
