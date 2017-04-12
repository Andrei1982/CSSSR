package ru.csssr.testingtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateOnTheLink {

	public static void main(String[] args) {
		
		String trueUrl = "http://monosnap.com/";
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://blog.csssr.ru/qa-engineer/");
		
		String currentWindow = driver.getWindowHandle();
		
		WebElement link = driver.findElement(By.linkText("НАХОДИТЬ НЕСОВЕРШЕНСТВА"));
		link.click();
		
		WebElement linkToNavigate = driver.findElement(By.linkText("Софт для быстрого создания скриншотов"));
		linkToNavigate.click();
		
		for(String childHandle : driver.getWindowHandles()){
			  if (!childHandle.equals(currentWindow)){
			      driver.switchTo().window(childHandle);
			  }          
		}
		
		if (driver.getCurrentUrl() == trueUrl) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test fail");
		}
	}

}
