package kwdf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwt {

	
	 WebDriver dr;
	 
	public explicitwt(WebDriver dr)
	{
		this.dr=dr;
	}
	
	public WebElement waitForElement(By locator, int timeout) {
		
		try {
			WebDriverWait wait=new WebDriverWait(dr, timeout);
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			System.out.println("Element located");
			return element;
		}
		catch(Exception e)
		{
			System.out.println("Element not located" +e);
		
		}
		return null;	
	}
	
	
	public  WebElement elementToBeClickable(By locator, int timeout) {
		
		try {
			WebDriverWait wait=new WebDriverWait(dr, timeout);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
			System.out.println("Element located");
			return element;
		}
		catch(Exception e)
		{
			System.out.println("Element not located" +e);
		
		}
		
		return null;
		
		
	}
}
