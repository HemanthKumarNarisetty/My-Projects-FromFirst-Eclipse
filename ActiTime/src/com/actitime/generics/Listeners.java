package com.actitime.generics;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends Base implements ITestListener{
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		try {
			Filelib.takeScreenshot(result.getName());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
