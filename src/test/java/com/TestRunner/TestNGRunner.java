package com.TestRunner;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Automationhelper.Page_Object_Manager;
import com.Base_class.Base_Class;
import com.configuration.helper.File_Reader_Manager;

public class TestNGRunner extends Base_Class
{

	public static String path="C:\\Users\\Muthu\\eclipse-workspace\\March_First\\Test Case - Automation Practice - Final.xlsx";
	public static WebDriver driver = browser_Configuration("Chrome"); // null
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	public static Logger log = Logger.getLogger(Automation_Runner.class);
	
//	public static void main(String[] args) throws Throwable, IllegalArgumentException
//	{
		@BeforeTest
		private void browser_Lanuch() throws Throwable
		{
		
		PropertyConfigurator.configure("log4j.properties");
		
		String url = File_Reader_Manager.get_Instance_FRM().get_Instance_CR().get_Config_Url();
		//getUrl("http://automationpractice.com/index.php");
		getUrl(url);
		
		implicitWait(30, TimeUnit.SECONDS); 
		log.info("URL Launch");
		
		clickonElement(pom.get_InstanceHp().getSignin_Btn());
		}
		
		@BeforeMethod
		private void signIn() throws Throwable
		{
		String email = File_Reader_Manager.get_Instance_FRM().get_Instance_CR().get_Config_Email();
		inputValueElement(pom.get_InstanceLogin().getEmail(), email);
		Thread.sleep(5000);
		

		String password = File_Reader_Manager.get_Instance_FRM().get_Instance_CR().get_Config_Password();
		inputValueElement(pom.get_InstanceLogin().getPwd(), password);
		
		clickonElement(pom.get_InstanceLogin().getSignin1());
		Thread.sleep(5000);
		
		log.info("Credentials Entered in field");
		
		}		
		@Test(priority =-1)
		private void women() throws Throwable
		{
		
		clickonElement(pom.get_InstanceBack().getStore());
		clickonElement(pom.get_InstanceBack().getWomen());
		
		actionsClass(pom.get_InstanceSh().getShirt(), "click");
		
		actionsClass(pom.get_InstanceCart().getCart(), "click");
		
		explicitWait(pom.get_InstanceCart().getPtc(), 30);
		
		actionsClass(pom.get_InstanceSum().getPtc1(), "click");
		
		actionsClass(pom.get_InstanceAdd().getPtc2(), "click");

		actionsClass(pom.get_InstanceShip().getPtc3(), "click");
 
		actionsClass(pom.get_InstanceShip2().getAgree(),"click");

		actionsClass(pom.get_InstanceShip2().getPtc4(), "click");

		actionsClass(pom.get_InstancePay().getPayment(), "click");

		actionsClass(pom.get_InstanceCon().getConfirm(), "click");
		
	takeScreenshot("C:\\Users\\Muthu\\eclipse-workspace\\March_First\\ScreenShot_Maven\\miniprojectend.png");

		actionsClass(pom.get_InstanceBack2().getBack2(), "click");
			
		takeScreenshot1("C:\\Users\\Muthu\\eclipse-workspace\\March_First\\ScreenShot_Maven\\miniprojectable.png");
		}
@AfterMethod
		private void signOut()
{
		actionsClass(pom.get_InstanceLog().getLogout(), "click");
}
		
//Second purchase		
		//clickonElement(pom.get_InstanceHp().getSignin_Btn());
		
//		String email1 = File_Reader_Manager.get_Instance_FRM().get_Instance_CR().get_Config_Email();
//		inputValueElement(pom.get_InstanceLogin().getEmail(), email1);
//		
//		String password1 = File_Reader_Manager.get_Instance_FRM().get_Instance_CR().get_Config_Password();
//		inputValueElement(pom.get_InstanceLogin().getPwd(), password1);
//		
//		clickonElement(pom.get_InstanceLogin().getSignin1());
//		Thread.sleep(5000);
//		
//		log.info("Credentials Entered in field");
	
	@Test(dependsOnMethods = {"women", "tShirt"})
	private void dress() throws Throwable
		{
		clickonElement(pom.get_InstanceBack().getStore());
		
		actionsClass(pom.get_InstanceBack().getDress(), "click");
		
		actionsClass(pom.get_InstanceSh().getWdress(), "click");
		
		actionsClass(pom.get_InstanceCart().getCart(), "click");
		
		explicitWait(pom.get_InstanceCart().getPtc(), 30);//add to cart	
		
		actionsClass(pom.get_InstanceSum().getPtc1(), "click");
		
		actionsClass(pom.get_InstanceAdd().getPtc2(), "click");

		actionsClass(pom.get_InstanceShip().getPtc3(), "click");
 
		actionsClass(pom.get_InstanceShip2().getAgree(),"click");

		actionsClass(pom.get_InstanceShip2().getPtc4(), "click");

		actionsClass(pom.get_InstancePay().getPayment(), "click");

		actionsClass(pom.get_InstanceCon().getConfirm(), "click");
		
		takeScreenshot("C:\\Users\\Muthu\\eclipse-workspace\\March_First\\ScreenShot_Maven\\miniprojectend.png");

		actionsClass(pom.get_InstanceBack2().getBack2(), "click");
			
		takeScreenshot1("C:\\Users\\Muthu\\eclipse-workspace\\March_First\\ScreenShot_Maven\\miniprojectable.png");
		}

	
	//	actionsClass(pom.get_InstanceLog().getLogout(), "click");
		
//Third purchase
		
//clickonElement(pom.get_InstanceHp().getSignin_Btn());
//		
//
//		String email2 = File_Reader_Manager.get_Instance_FRM().get_Instance_CR().get_Config_Email();
//		inputValueElement(pom.get_InstanceLogin().getEmail(), email2);
//		Thread.sleep(5000);
//		
//
//		String password2 = File_Reader_Manager.get_Instance_FRM().get_Instance_CR().get_Config_Password();
//		inputValueElement(pom.get_InstanceLogin().getPwd(), password2);
//		
//		clickonElement(pom.get_InstanceLogin().getSignin1());
//		Thread.sleep(5000);
//		
//		log.info("Credentials Entered in field");
		
	@Test(invocationCount=2)
	private void tShirt() throws Throwable
	{
	
		clickonElement(pom.get_InstanceBack().getStore());
		
		clickonElement(pom.get_InstanceBack().getTshirt());
		actionsClass(pom.get_InstanceSh().getWTshirt(), "click");
		
		actionsClass(pom.get_InstanceCart().getCart(), "click");
		
		explicitWait(pom.get_InstanceCart().getPtc(), 30);
		
		actionsClass(pom.get_InstanceSum().getPtc1(), "click");
		
		actionsClass(pom.get_InstanceAdd().getPtc2(), "click");

		actionsClass(pom.get_InstanceShip().getPtc3(), "click");
 
		actionsClass(pom.get_InstanceShip2().getAgree(),"click");

		actionsClass(pom.get_InstanceShip2().getPtc4(), "click");

		actionsClass(pom.get_InstancePay().getPayment(), "click");

		actionsClass(pom.get_InstanceCon().getConfirm(), "click");
		
		takeScreenshot("C:\\Users\\Muthu\\eclipse-workspace\\March_First\\ScreenShot_Maven\\miniprojectend.png");

		actionsClass(pom.get_InstanceBack2().getBack2(), "click");
			
		takeScreenshot1("C:\\Users\\Muthu\\eclipse-workspace\\March_First\\ScreenShot_Maven\\miniprojectable.png");
	

		//actionsClass(pom.get_InstanceLog().getLogout(), "click");
		
		
	}
	
}

	

