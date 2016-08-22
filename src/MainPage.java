import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

	public static void main(String[] args) {
		WebDriver mydriver = MyWebDriver.getMydriver();
		mydriver.navigate().to("http://demoqa.com/");
		
//Checking tab1
		//Click on tab1
		mydriver.findElement(By.xpath("//*[@id='ui-id-1']")).click();
		//Get text from tab1 body
		String str1 = mydriver.findElement(By.xpath("//*[@id='tabs-1']/b")).getText();
		
		//Compare above body text with expected text
		Assert.assertEquals("Content 1 Title", str1);

		//Checking tab2
		//Click on tab2
		mydriver.findElement(By.xpath("//*[@id='ui-id-2']")).click();
		//Get text from tab1 body
		String str2 = mydriver.findElement(By.xpath("//*[@id='tabs-2']/b")).getText();
		//Compare above body text with expected text
		Assert.assertEquals("Content 2 Title", str2);
		
		//Checking tab3
		//Click on tab3
		mydriver.findElement(By.xpath("//*[@id='ui-id-3']")).click();
		//Get text from tab1 body
		String str3 = mydriver.findElement(By.xpath("//*[@id='tabs-3']/b")).getText();
		//Compare above body text with expected text
		Assert.assertEquals("Content 3 Title", str3);
		
		//Checking tab4
		//Click on tab4
		mydriver.findElement(By.xpath("//*[@id='ui-id-4']")).click();
		//Get text from tab1 body
		String str4 = mydriver.findElement(By.xpath("//*[@id='tabs-4']/b")).getText();
		//Compare above body text with expected text
		Assert.assertEquals("Content 4 Title", str4);
		
		//Checking tab5
		//Click on tab5
		mydriver.findElement(By.xpath("//*[@id='ui-id-5']")).click();
		//Get text from tab1 body
		String str5 = mydriver.findElement(By.xpath(".//*[@id='tabs-5']/p[1]/b")).getText();
		//Compare above body text with expected text
		Assert.assertEquals("Content 5 Title", str5);
	}
}
