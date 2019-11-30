package com.honest.addingproduct.pages;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class AddProductToCart {
	static SelectElements ele = new SelectElements();
	static Screenshot screehshot = new Screenshot();
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://clubkitchen.at");
		System.out.println("Launching the browser");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		screehshot.getScreenshot(driver, ".\\img\\launchScreen.PNG");
		driver.findElement(By.xpath("//*[contains(text(),'Zur Speisekarte')]")).click();
		System.out.println("Navigating to the Menu Page");
		screehshot.getScreenshot(driver, ".\\img\\Menu.PNG");
		driver.findElement(By.xpath("//input[@id=\"address-input\"]")).sendKeys("Semperstraﬂe 44, 1180 Wien, Austria");
		System.out.println("Entering the address");
		screehshot.getScreenshot(driver, ".\\img\\EnteringAddress.PNG");
		driver.findElement(By.xpath("//input[@class=\"btn--honest blattgold--form-banner-submit\"]")).click();
		System.out.println("clicking on the button");
		Scanner sc = new Scanner(System.in);
		driver.findElement(By.xpath("//*[@class='agree-cookie']")).click();
		System.out.println("clicking on the cookie agree button");
		System.out.println("Select the menu item :");
		System.out.println("\n1.Cheesy Pork Burrito\n2.Wicked Classic Burrito (leicht scharf)\n3.Chipotle Chicken Burrito (leicht scharf)\n4.Beef Baby Burrito\n5.Avocado Crush Burrito");
		String menuItem = sc.nextLine();
		switch (menuItem) {
		case "1":
		case "1.Cheesy Pork Burrito":
		case "Cheesy Pork Burrito": {
			ele.dynamicSelect(955);
			System.out.println("Selecting the item");
			screehshot.getScreenshot(driver, ".\\img\\SelectingItem.PNG");
			break;

		}
		case "2":
		case "2.Wicked Classic Burrito (leicht scharf)":
		case "Wicked Classic Burrito (leicht scharf)": {
			ele.dynamicSelect(956);
			System.out.println("Selecting the item");
			screehshot.getScreenshot(driver, ".\\img\\SelectingItem.PNG");
			break;

		}
		case "3":
		case "3.Chipotle Chicken Burrito (leicht scharf)":
		case "Chipotle Chicken Burrito (leicht scharf)": {
			ele.dynamicSelect(957);
			System.out.println("Selecting the item");
			screehshot.getScreenshot(driver, ".\\img\\SelectingItem.PNG");
			break;
			

		}
		case "4":
		case "4.Beef Baby Burrito":
		case "Beef Baby Burrito": {
			ele.dynamicSelect(958);
			System.out.println("Selecting the item");
			screehshot.getScreenshot(driver, ".\\img\\SelectingItem.PNG");
			break;

		}
		case "5":
		case "5.Avocado Crush Burrito":
		case "Avocado Crush Burrito": {
			ele.dynamicSelect(959);
			System.out.println("Selecting the item");
			screehshot.getScreenshot(driver, ".\\img\\SelectingItem.PNG");
			break;

		}
		default:
			break;
		}
		screehshot.getScreenshot(driver, ".\\img\\Modal.PNG");
		driver.findElement(By.xpath("//*[@id='topup-modal--close']")).click();
		screehshot.getScreenshot(driver, ".\\img\\ItemAdded.PNG");
		System.out.println("clicking on the modal window and the item is added to the cart");
		driver.quit();

	}
}