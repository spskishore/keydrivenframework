package kwdf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class all_webelements_fns {
   WebDriver dr;
   
   all_webelements_fns(WebDriver dr){
	   
	   this.dr=dr;
   }
   public void enter_txt(String xp, String data) {
	   dr.findElement(By.xpath(xp)).sendKeys(data);
   }
public void click(String xp) {
	dr.findElement(By.xpath(xp)).click();
}

public void launch_chrome(String url) {
System.setProperty("webdriver.chrome.driver","chromedriver_v79.exe");
dr=new ChromeDriver();
dr.get(url);
}

}