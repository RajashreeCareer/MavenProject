package ReadingDatafromExcel;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Open Excel file---->Workbook------>Sheet------>Rows---<cells
public class WritingDataInToExcel {

	public static void main(String[] args) throws IOException {
		FileOutputStream file =new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Sheet1");

		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("Java");
		row1.createCell(1).setCellValue("3");
		row1.createCell(2).setCellValue("Automation");

		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("Python");
		row2.createCell(1).setCellValue("5");
		row2.createCell(2).setCellValue("Automation");
		
		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("file is created");
	}

}
