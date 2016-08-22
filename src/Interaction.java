import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Interaction {
	public static void main(String[] args) throws InterruptedException {
		WebDriver mydriver = MyWebDriver.getMydriver();
		mydriver.navigate().to("http://demoqa.com/");
		
		/// Draggable functionality
		mydriver.findElement(By.xpath("//*[@id='menu-item-140']/a")).click();
		WebElement Object1= mydriver.findElement(By.xpath(".//*[@id='draggable']"));
		//Get the current location coordinates
		Point before1 = Object1.getLocation();
		
		new Actions(mydriver).dragAndDropBy(Object1, 40, 60).build().perform();
		//Get the new location coordinates
		Point after1 = Object1.getLocation();

		//Compares before and after coordinates
		Assert.assertNotEquals(before1, after1);		
		 
		///Droppable functionality		
		mydriver.findElement(By.xpath("//*[@id='menu-item-141']/a")).click();		
		String textbefore= 	mydriver.findElement(By.xpath(".//*[@id='droppableview']")).getText();

		WebElement Object10= mydriver.findElement(By.xpath(".//*[@id='draggableview']"));
		Point before10 = Object10.getLocation();

		new Actions(mydriver).dragAndDropBy(Object10, 150, 30).perform();

		Point after10 = Object10.getLocation();
		Assert.assertNotEquals(before10, after10);
		String textafter = 	mydriver.findElement(By.xpath(".//*[@id='droppableview']")).getText();

		//Check the text to make sure after successfully dropping the object text changes to Dropped
		Assert.assertNotEquals(textbefore, textafter);
		Assert.assertEquals("Dropped!", textafter);
		
		
		///Re-sizable functionality
		mydriver.findElement(By.xpath("//*[@id='menu-item-143']/a")).click();
		//Gets the current size of the object
		Dimension size1 =mydriver.findElement(By.xpath(".//*[@id='resizable']")).getSize();
				
		WebElement resizeElement = mydriver.findElement(By.xpath("//*[@id='resizable']/div[3]"));

		 new Actions(mydriver).dragAndDropBy(resizeElement, 50, 50).build().perform();
				
		//Gets the new size of the object
		Dimension size2 =mydriver.findElement(By.xpath(".//*[@id='resizable']")).getSize();

		//Compares the before and after size of object 
		Assert.assertNotEquals(size1, size2);

				 
		 
		///Selectable functionality 
		mydriver.findElement(By.xpath("//*[@id='menu-item-142']/a")).click();
		//Gets the initial color of the object
		String color1 = mydriver.findElement(By.xpath(".//*[@id='selectable']/li[7]")).getCssValue("color");

		mydriver.findElement(By.xpath(".//*[@id='selectable']/li[7]")).click();
		//Gets the color after selecting the object
		String color2 = mydriver.findElement(By.xpath(".//*[@id='selectable']/li[7]")).getCssValue("color");

		//Compares the initial and after color of the object
		Assert.assertNotEquals(color1, color2);
		
		///Sortable functionality 
		mydriver.findElement(By.xpath("//*[@id='menu-item-151']/a")).click();
		String textvalue= mydriver.findElement(By.xpath("//*[@id='sortable']/li[1]")).getText();

		WebElement list1 = mydriver.findElement(By.xpath("//*[@id='sortable']/li[1]"));
		WebElement list3 = mydriver.findElement(By.xpath("//*[@id='sortable']/li[4]"));
		Thread.sleep(1000);
		// Moves the object from position 1 to position 3 
		new Actions(mydriver).dragAndDrop(list1, list3).build().perform();
			
		String dragvalue= mydriver.findElement(By.xpath("//*[@id='sortable']/li[3]")).getText();

		//To make sure object text matches after moving the object
		Assert.assertEquals(textvalue, dragvalue);		
	}
}