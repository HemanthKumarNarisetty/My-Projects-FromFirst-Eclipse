package com.actitime.test;

import java.util.TreeMap;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.actitime.generics.Filelib;

public class DataFetching {

	@Test
	@Parameters("testdata")
	public void demo1(String testdata)
	{
		TreeMap<String, String> data = Filelib.xmlData(testdata);
		Reporter.log(data.get("customerName"));
	}
}
