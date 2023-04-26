package com.generic;

import java.io.IOException;
import java.util.jar.Attributes.Name;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;

public class Datap extends Excel
{
	@DataProvider(name="testdata")
	public Object[][] getdataa() throws EncryptedDocumentException, IOException
	{
		Object[][]arr= data("sheet1");
		return arr;
	}

}
