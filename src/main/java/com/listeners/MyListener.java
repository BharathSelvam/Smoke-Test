package com.listeners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class MyListener implements ITestListener {

	protected static WebDriver driver;
	protected static ExtentReports reports;
	protected static ExtentTest test;

	public void onTestStart(ITestResult result) {
		log("Test "+result.getName()+" Started....");
		System.out.println(result.getName()+" test case started");	
	}


	public void onTestSuccess(ITestResult result) {
		log("Test '" + result.getName() + "' PASSED");
		System.out.println("The name of the testcase passed is :"+result.getName());		
	}

	
	public void onTestFailure(ITestResult result) {
		log("Test '" + result.getName() + "' FAILED");
		System.out.println("The name of the testcase failed is :"+result.getName());
	}

	
	public void onTestSkipped(ITestResult result) {
		log("Test '" + result.getName() + "' SKIPPED");
		System.out.println("The name of the testcase Skipped is :"+result.getName());		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	private void log(String methodName) {
		System.out.println(methodName);
	}

}
