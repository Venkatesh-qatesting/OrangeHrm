package imt.demo.OrangeHRM.GenricLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtility {

	/**
	 * This method is created to read the data from property file
	 * @param keys
	 * @return
	 * @throws IOException
	 */
	public String getPropertyFile(String keys) throws IOException {
		FileInputStream fis = new FileInputStream(ipathConstants.propertyLoc);
		Properties property = new Properties();
		property.load(fis);
		String propertyData = property.getProperty(keys);
		return propertyData;
	}
	
	/**
	 * this method is created to read string data from excel file
	 * @param sheetName
	 * @param row
	 * @param cellValue
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readExcelData(String sheetName, int row, int cellValue) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(ipathConstants.excelLoc);
		Workbook workbook = WorkbookFactory.create(fis);
		String stringValue = workbook.getSheet(sheetName).getRow(row).getCell(cellValue).getStringCellValue();
		return stringValue;
	}
}
