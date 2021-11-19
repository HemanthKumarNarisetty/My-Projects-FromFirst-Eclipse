package com.actitime.generics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

@org.testng.annotations.Listeners(Listeners.class)
public class Filelib extends Base{

	
	public static String readExcelData(int row,int cell) throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		FileInputStream fis=new FileInputStream("./data/InputData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String data = wb.getSheet("Actitimedata").getRow(row).getCell(cell).toString();
		return data;
		
	}
	public static String readPropertyfiledata(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./data/commonData.property");
		Properties p=new Properties();
		p.load(fis);
		String value =p.getProperty(key);
		return value;
		
	}
	public static void takeScreenshot(String method) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File drs=new File("./DefectScreenshots/"+method+".PNG");
		
			FileUtils.copyFile(src, drs);
	}
	public static void write_DataInExcel(int row,int cell,String value) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./data/InputData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		wb.getSheet("Actitimedata").getRow(row).getCell(cell).setCellValue(value);
		FileOutputStream fos=new FileOutputStream("./data/InputData.xlsx");
		wb.write(fos);
		wb.close();
	}
}
