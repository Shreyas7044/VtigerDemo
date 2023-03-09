package genericutilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExtractDataWithoutMain {

	public static void main(String[] args) throws IOException {

		
	FileInputStream fis = new FileInputStream("./TestData/generic.xlsx");
	

	Workbook workbook = WorkbookFactory.create(fis);
	
	
	String testData1 = workbook.getSheet("Sheet1").getRow(0).getCell(0).toString();
	System.out.println(testData1);
	
	double test2 = workbook.getSheet("Sheet1").getRow(0).getCell(2).getNumericCellValue();
	System.out.println(test2);
	
	LocalDateTime test3 = workbook.getSheet("Sheet1").getRow(0).getCell(3).getLocalDateTimeCellValue();
	System.out.println(test3);

	Boolean test4 = workbook.getSheet("Sheet1").getRow(0).getCell(4).getBooleanCellValue();
	System.out.println(test4);
	

}
}   
