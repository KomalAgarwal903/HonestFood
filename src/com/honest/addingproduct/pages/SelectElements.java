package com.honest.addingproduct.pages;

import org.openqa.selenium.By;

public class SelectElements {
	
	public void dynamicSelect(int value)
	{
		AddProductToCart.driver.findElement(By.xpath("//*[@data-details-url=\"https://clubkitchen.at/listingshopware.php?sViewport=detail&sArticle="+value+"\"]//button[contains(text(),' + In den Einkaufswagen ')]")).click();
	}

}
