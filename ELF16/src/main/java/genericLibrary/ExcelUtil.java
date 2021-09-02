package genericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil implements IAutoConstants {
/**
 * this method accepts inputs such as excelsheet name,row num,cell num,for value pass type of data wish to read from excelsheet,
 * ex: for value pass-->1 for string,2 for boolean,3 for numeric,4 for date,5 for time
 * @param sheet
 * @param row
 * @param cell
 * @param value
 * @return String
 * @throws EncryptedDocumentException
 * @throws IOException
 */
	public static String toReadDataFromExcel(String sheet,int row,int cell,int value) throws EncryptedDocumentException, IOException {
		File abspath= new File(EXCEL_PATH);
		FileInputStream fis= new FileInputStream(abspath);
		Workbook workbook = WorkbookFactory.create(fis);
		String result="";	
		switch(value) {
		case 1: result = stringCellValue(workbook,sheet,row,cell,value);
		break;
		case 2: result = String.valueOf(booleanCellValue(workbook,sheet,row,cell,value)) ;
		break;
		case 3: result = String.valueOf(doubleCellValue(workbook,sheet,row,cell,value));
		break;
		case 4: result = localDate(workbook,sheet,row,cell,value);
		break;
		case 5: result = localTime(workbook,sheet,row,cell,value);
		break;
		}
		return result;
	}

	public static String stringCellValue(Workbook workbook,String sheet,int row,int cell,int value) {
		String stringValue = workbook.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		//System.out.println(stringValue);
		return stringValue;	
	}
	public static boolean booleanCellValue(Workbook workbook,String sheet,int row,int cell,int value) {
		boolean booleanValue = workbook.getSheet(sheet).getRow(row).getCell(cell).getBooleanCellValue();
		//System.out.println(booleanValue);
		return booleanValue;
	}
	public static double doubleCellValue(Workbook workbook,String sheet,int row,int cell,int value) {
		double numericValue = workbook.getSheet(sheet).getRow(row).getCell(cell).getNumericCellValue();
		//System.out.println(numericValue);
		return numericValue;
	}
	public static String localDate(Workbook workbook,String sheet,int row,int cell,int value) {
		String date = workbook.getSheet(sheet).getRow(row).getCell(cell).getLocalDateTimeCellValue().toLocalDate().toString();
		// System.out.println(date);
		return date;
	}
	public static String localTime(Workbook workbook,String sheet,int row,int cell,int value) {
		String time = workbook.getSheet(sheet).getRow(row).getCell(cell).getLocalDateTimeCellValue().toLocalTime().toString();
		// System.out.println(time);
		return time;
	}
	
}
