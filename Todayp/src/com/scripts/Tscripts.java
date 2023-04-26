package com.scripts;

import org.testng.annotations.Test;


import com.generic.Baseeclass;
import com.generic.Datap;
import com.pom.Pomclasss;

public class Tscripts extends Baseeclass
{

	@Test(dataProvider = "testdata",dataProviderClass = Datap.class)
	public void exe(String v,String x) 
	{
		Pomclasss pmc=new Pomclasss(driver);
		pmc.name().sendKeys(v);
		pmc.pass().sendKeys(x);
	}
}
