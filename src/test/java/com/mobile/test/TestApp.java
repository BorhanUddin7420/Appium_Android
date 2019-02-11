package com.mobile.test;

import com.mobile.AndroidMbl.AppTest;

import java.net.MalformedURLException;


public class TestApp {
	
	
	public void test() throws MalformedURLException, InterruptedException {
		AppTest.Android_LaunchAPp();
		
	}
	

	public void test2() throws MalformedURLException, InterruptedException {
		
		
		
	}
	
	
	public void TearDown() throws MalformedURLException, InterruptedException {
		
		AppTest.CloseApp();
		
	}
	

}
