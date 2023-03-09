package Basic;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;

	public class ToExtract {

		
		public String readFileInExcel(String location,String sheetName,int rowNumber,int colNumber ) throws EncryptedDocumentException, IOException {
			File absFile = new File(location);
			FileInputStream fis = new FileInputStream(absFile);
			Workbook workbook = WorkbookFactory.create(fis);
			Sheet sheet = workbook.getSheet(sheetName);
			String info	= sheet.getRow(rowNumber).getCell(colNumber).toString();
			return info;
		}


		public String ReadFileInProperty(String location) throws IOException {
			File File = new File(location);
			FileInputStream fis = new FileInputStream(File);
			Properties pro = new Properties();
			pro.load(fis);
			String testUrl = (String) pro.get("url");
			return testUrl;
		}
	}

