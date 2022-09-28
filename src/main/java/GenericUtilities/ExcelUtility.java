package GenericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

/**
 * It's developed using Apache POI Libraries,which is used to handle MS Excel sheet
 * @author Asus
 *
 */

public class ExcelUtility {
	
	/**
	 * It is used to read the data from ExcelFile
	 * @param SheetName
	 * @param RowNo
	 * @param columnNo
	 * @return
	 * @throws Throwable
	 */
	public String readDataFromExcelFile(String SheetName, int RowNo, int columnNo) throws Throwable
	{
		FileInputStream fi=new FileInputStream(IpathInstance.ExcelPath);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet(SheetName);
		Row row = sh.getRow(RowNo);
		Cell cel = row.getCell(columnNo);
		String value = cel.toString();
		wb.close();
		return value;
		
	}
	/**
	 * write data into excel file
	 * @param SheetName
	 * @param RowNo
	 * @param celNo
	 * @param Data
	 * @throws Throwable
	 */
	
	public void writeDataIntoExcel(String SheetName, int RowNo,int celNo, String Data) throws Throwable
	{
		FileInputStream fi=new FileInputStream(IpathInstance.ExcelPath);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet(SheetName);
		Row row = sh.getRow(RowNo);
		Cell ce = row.createCell(celNo);
		ce.setCellValue(Data);
		FileOutputStream fout=new FileOutputStream(IpathInstance.ExcelPath);
		wb.write(fout);
		wb.close();
		
		}
	/**
	 * This method is used to get Last row number
	 * @param SheetName
	 * @return
	 * @throws Throwable
	 */
	public int getLastRowNo(String SheetName) throws Throwable
	{
		FileInputStream fi=new FileInputStream(IpathInstance.ExcelPath);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet("Sheet2");
		int lastrow = sh.getLastRowNum();
		return lastrow;
		
	}
	
	public Object[][] readMultipleSetOfData(String SheetName) throws Throwable
	{
		FileInputStream fi=new FileInputStream(IpathInstance.ExcelPath);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet("Sheet2");
		int lastRow = sh.getLastRowNum()+1;
		int lastCell = sh.getRow(0).getLastCellNum();
		Object[][] obj=new Object[lastRow][lastCell];
		for(int i=0;i<lastRow;i++)
		{
			for(int j=0;j<lastCell;j++)
			{
				obj[i][j]=sh.getRow(i).getCell(j).toString();
			}
		}
		return obj;
	}

}
