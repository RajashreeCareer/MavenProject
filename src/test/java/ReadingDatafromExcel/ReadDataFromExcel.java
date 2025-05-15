package ReadingDatafromExcel;
import java.io.*;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//Open Excel file---->Workbook------>Sheet------>Rows---<cells
public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int totalNoOfRows = sheet.getLastRowNum();
		int totalNoOfCells = sheet.getRow(1).getLastCellNum();
		System.out.println("totalNoOfRows "+ totalNoOfRows);
		System.out.println("totalNoOfCells "+ totalNoOfCells);
		for(int i=0; i<=totalNoOfRows;i++){
		XSSFRow currentRow = sheet.getRow(i);
			for(int j=0;j<totalNoOfCells;j++){
				XSSFCell currentCell = currentRow.getCell(j);
				System.out.print(currentCell.toString()+"\t");
			}
			System.out.println();
		}
		workbook.close();
		file.close();
	}

}
