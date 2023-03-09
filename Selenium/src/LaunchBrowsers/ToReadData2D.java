package LaunchBrowsers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadData2D {

	public static void main(String[] args) throws IOException {
		
		File absPath = new File("C:\\Users\\win10\\Music\\Eclips\\Selenium\\TestData\\multipledata.xlsx");
		FileInputStream fis = new FileInputStream(absPath);
		
		Workbook workbook = WorkbookFactory.create(fis);
		
		org.apache.poi.ss.usermodel.Sheet MD = workbook.getSheet("Sheet1"); 
		int rowNum = MD.getPhysicalNumberOfRows();
		int colNum = MD.getRow(0).getPhysicalNumberOfCells();
		System.out.println(rowNum);
		System.out.println(colNum);
		
		String [][] data = new String[rowNum-1][colNum];
		
		for(int i=0;i<rowNum-1; i++) {
			for(int j=0;j<colNum;j++) {
				data[i][j] = MD.getRow(i+1).getCell(j).toString();
			}
		}

	}

}
