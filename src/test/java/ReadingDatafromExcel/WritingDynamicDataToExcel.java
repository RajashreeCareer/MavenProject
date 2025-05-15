package ReadingDatafromExcel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicDataToExcel {

	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\my_dynamic_file.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Sheet1");
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Total Number of Rows");
		int totalNoOfRows = sc.nextInt();
		
		System.out.println("Enter Total Number of Cells");
		int totlNoOfCell = sc.nextInt();
		
		for(int i=0; i<=totalNoOfRows; i++) {
			XSSFRow row= sheet.createRow(i);
			for(int j=0; j<totlNoOfCell; j++) {
				XSSFCell cell = row.createCell(j);
				cell.setCellValue(sc.next());;
			}
		}
		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("File is created");
	}

}
