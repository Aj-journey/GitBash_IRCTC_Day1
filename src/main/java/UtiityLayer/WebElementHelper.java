package UtiityLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class WebElementHelper extends BaseClass{

	public static WebElement visibilityOf(WebElement wb)
	{
		WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(30));
		
		return wait.until(ExpectedConditions.visibilityOf(wb));
	}
	
	
	public static void click(WebElement wb)
	{
		visibilityOf(wb).click();
	}
	
	public static void sendKeys(WebElement wb,String value)
	{
		visibilityOf(wb).sendKeys(value);
	}
}
