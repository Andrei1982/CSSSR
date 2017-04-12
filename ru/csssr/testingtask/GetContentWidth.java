package ru.csssr.testingtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetContentWidth {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://blog.csssr.ru/qa-engineer/");
		
		WebElement div = driver.findElement(By.className("wrap"));
		int width = div.getSize().width;
		
		if (width == 1000) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test fail");
		}
	}
}
