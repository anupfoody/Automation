package qaclickacademy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTest {

	public static void main(String[] args) throws IOException {
		
		File fi=new File("C:\\Users\\achoudhury21\\Desktop\\Test.xlsx");
		FileInputStream fis=new FileInputStream(fi);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		String data=sheet1.getRow(1).getCell(1).getStringCellValue();

	}

}
