package PracticePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcelTest 
{
	public static void main(String[] args) throws Throwable
	{
      FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Hospital Project.xlsx");
      Workbook book = WorkbookFactory.create(fis);
      Sheet s = book.getSheet("ADMIN MODULE");
      System.out.println(s.getLastRowNum());
      for(int i=0; i<=s.getLastRowNum();i++)
      {
    	  RichTextString value = s.getRow(i).getCell(0).getRichStringCellValue();
    	  System.out.println(value);
      }
	}

}
