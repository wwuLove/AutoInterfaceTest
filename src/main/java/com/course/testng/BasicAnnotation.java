package com.course.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAnnotation {
	
	@Test
	public void testCase1(){
		System.out.println("����1");
	}
	
	@BeforeMethod
	public void beforeMethods(){
		System.out.println("before");
	}
	
	@AfterMethod
	public void aftermethod(){
		System.out.println("after");
	}
	
	@BeforeClass
	public void beforeclass(){
		System.out.println("������������֮ǰ���е�");
	}
	
	@AfterClass
	public void afterclass(){
		System.out.println("������������֮�����е�");
	}

}
