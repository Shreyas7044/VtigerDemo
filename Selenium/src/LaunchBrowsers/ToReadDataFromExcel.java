package LaunchBrowsers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		// Create object of IS/FR
		FileInputStream fis = new FileInputStream("./TestData/TestData.xlsx");
		
		//Object of File Type
		Workbook workbook = WorkbookFactory.create(fis);
		
		//read method
		String testData1 = workbook.getSheet("Sheet1").getRow(0).getCell(5).toString();
		System.out.println(testData1);
		
		double testData2 = workbook.getSheet("Sheet2").getRow(0).getCell(0).getNumericCellValue();
		System.out.println(testData2);
	
		Boolean testData3 = workbook.getSheet("Sheet3").getRow(0).getCell(0).getBooleanCellValue();
		System.out.println(testData3);
		
	}

}
