package com.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel 
{

	public Object[][] data(String sheet) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("\\C:\\Users\\Admin\\Desktop\\Selenium.xlsx\\");
		Sheet sh = WorkbookFactory.create(fis).getSheet(sheet);
		int actrow = sh.getPhysicalNumberOfRows();
		int actcell=sh.getRow(0).getPhysicalNumberOfCells();
		Object[][] arr=new Object[actrow-1][actcell];
		{
			for(int i=0;i<actrow-1;i++)
			{
				for(int j=0;j<actcell;j++)
				{
					arr[i][j]=sh.getRow(i+1).getCell(j).toString();
				}
			}
			return arr;
		}
		
		
	}
}
