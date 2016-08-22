import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

	public static void main(String[] args) {		
		WebDriver mydriver = MyWebDriver.getMydriver();
		mydriver.navigate().to("http://demoqa.com/");
		
		//Fill the registration form
		mydriver.findElement(By.xpath("//*[@id='menu-item-374']/a")).click();
		mydriver.findElement(By.xpath("//*[@id='name_3_firstname']")).sendKeys("Pramod");
		mydriver.findElement(By.xpath("//*[@id='name_3_lastname']")).sendKeys("Kumar");
		mydriver.findElement(By.xpath("//*[@id='pie_register']/li[2]/div/div/input[2]")).click();
		mydriver.findElement(By.xpath("//*[@id='pie_register']/li[3]/div/div/input[2]")).click();
		mydriver.findElement(By.xpath("//*[@id='dropdown_7']")).sendKeys("India");
		mydriver.findElement(By.xpath("//*[@id='mm_date_8']")).sendKeys("1");
		mydriver.findElement(By.xpath("//*[@id='dd_date_8']")).sendKeys("11");
		mydriver.findElement(By.xpath("//*[@id='yy_date_8']")).sendKeys("1979");
		mydriver.findElement(By.xpath("//*[@id='phone_9']")).sendKeys("1234567890");
		mydriver.findElement(By.xpath("//*[@id='username']")).sendKeys("testingdemopre");
		mydriver.findElement(By.xpath("//*[@id='email_1']")).sendKeys("preexamtes@gmail.com");
		mydriver.findElement(By.xpath(".//*[@id='profile_pic_10']")).sendKeys("C:\\Users\\madhu\\workspace\\BigRio\\src\\123.jpg");
		mydriver.findElement(By.xpath("//*[@id='description']")).sendKeys("this is text area");
		mydriver.findElement(By.xpath("//*[@id='password_2']")).sendKeys("123456789");
		mydriver.findElement(By.xpath("//*[@id='confirm_password_password_2']")).sendKeys("123456789");
		mydriver.findElement(By.xpath(".//*[@id='pie_register']/li[14]/div/input")).click();
	}
}
