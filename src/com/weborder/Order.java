package com.weborder;
import java.awt.RenderingHints.Key;
import java.lang.invoke.SwitchPoint;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.jar.asm.commons.GeneratorAdapter;

public class Order {
	
	public static int randNum(int a, int b) {
		Random rd = new Random();
		return rd.nextInt(b + 1 - a) + a;
		}
	
	public static void main(String[] args) throws InterruptedException {
		
		String[] names = {"poo","qwr","sxs","povl","zaq","ddfd","kyuky","wer","avnb","ptre","aiias","dsd","aaghas","dzxad"};
		String name = names[randNum(0, 13)];
		String [] number= {"0","1","2","3","4","5","6","7","8","9"};
		String zipCode = number[randNum(0, 9)]+number[randNum(0, 9)]+number[randNum(0, 9)]+number[randNum(0, 9)];
		
		
		
		System.setProperty("webdriver.chrome.driver",
				"/Users/nasyikatiusupova/Documents/selenium dependencies/drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
			driver.navigate().to("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
			driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
			driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test" + Keys.ENTER);
			//driver.findElement(By.className("button")).click();
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[1]/ul/li[3]/a")).click();
			
			//Thread.sleep(1500);
			
			driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtQuantity")).clear();
			
			driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys(Keys.BACK_SPACE);
			driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys(randNum(1, 100) + "");
			
			driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtName")).sendKeys("John " + name + " Smith");
			driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox2")).sendKeys("123 Any st");
			driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox3")).sendKeys("Anytown");
			driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox4")).sendKeys("VA");
			driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox5")).sendKeys(zipCode); 
			
			//Thread.sleep(1500);
		
			long first15 = (long) Math.random()*(100000000000000L);
			String cardnum ="";
			
			int cardtype = randNum(1,3);
			String elemenType = "";
			switch(cardtype) {
			
					case 1: elemenType = "ctl00_MainContent_fmwOrder_cardList_0";
						cardnum = "4" + first15;
						break;
						
					case 2: elemenType = "ctl00_MainContent_fmwOrder_cardList_1";
						cardnum = "5" + first15;
						break;
						
					case 3: elemenType = "ctl00_MainContent_fmwOrder_cardList_2";
						cardnum = "3" + first15/10;
						break;
			}
				driver.findElement(By.id(elemenType)).click();
				driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys(cardnum);
				driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("12/22");
				driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();
				
				Thread.sleep(1500);
//			if(numb==1) {
//			driver.findElement(By.name("ctl00$MainContent$fmwOrder$cardList")).click();
//			driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_2")).sendKeys("4" + randNum(0, 14));
//			}else if(numb==2) {
//			driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_1")).click();
//			driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_2")).sendKeys("5" + randNum(0, 14));
//			}
//			else if(numb==3) {
//				driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_2")).click();
//				driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_2")).sendKeys("3" + randNum(0, 13));
			
			
			
			
		
		//Thread.sleep(3000);
		//driver.close();
		
}
	}


