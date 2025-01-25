package UtiityLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseLayer.BaseClass;

public class ActionsHelper extends BaseClass{
	
	
	public static void actionsHelper()
	{
		Actions act = new Actions(getDriver());
		
		act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
	}
	
	public static void click(WebElement wb)
	{
		Actions act = new Actions(getDriver());
		
		act.click(wb).build().perform();
	}
	
	

}
