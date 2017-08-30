package com.package1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Apple1 {
	@BeforeClass
	@Parameters({"browser"})
	public void beforeClass(String browser){
		if(browser.equals("firefox")){
		System.out.println("executing before class" + browser);
		}
		else{
			System.out.println("run in chrome");
		}
		
	}
  @Test
  public void app1_1() {
	  System.out.println("executing app1_1");
  }
  @Test
  public void app1_2() {
	  System.out.println("executing app1_2");
  }
  @Test
  public void app1_3() {
	  System.out.println("executing app1_3");
  }
  @Test
  public void surya() {
	  System.out.println("executing surya");
  }
}
