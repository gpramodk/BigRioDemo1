import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Frames {

	public static void main(String[] args) {		
		WebDriver mydriver = MyWebDriver.getMydriver();
		mydriver.navigate().to("http://demoqa.com/");
		
		//Click on Frames and windows link
		mydriver.findElement(By.xpath("//*[@id='menu-item-148']/a")).click();
		//Click on "Open New Seprate Window" tab
		mydriver.findElement(By.xpath("//*[@id='ui-id-2']")).click();
		//Get text from text area
		String str1 = mydriver.findElement(By.xpath("//*[@id='tabs-2']/div/p/a")).getText();
		//Compare above text with expected text
		Assert.assertEquals("Open New Seprate Window", str1);
		
		//Get back to main page
		mydriver.navigate().back();
		//Click on logo on top left side
		mydriver.findElement(By.xpath("//*[@id='site_navigation']/div/div[1]/a/img")).click();
	}	
}
