package framework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static String[][] readData(String workbook, String sheet){
		String[][] data = null;
		
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\"+workbook);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh= wb.getSheet(sheet);
			int totalrows = sh.getPhysicalNumberOfRows();
			int totalcolumns=sh.getRow(0).getPhysicalNumberOfCells();
			data = new String[totalrows-1][totalcolumns];
			for(int r=1;r<totalrows;r++) {
				for(int c=0;c<totalcolumns;c++) {
					data[r-1][c]=sh.getRow(r).getCell(c).getStringCellValue();
				}
			}			
		} catch (IOException e) {
			e.printStackTrace();
		}		
		return data;
	}

}
