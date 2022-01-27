package steps;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class test2 {
	WebDriver d1;
	@Given("Open chrome browser and url of the application")
	public void open_chrome_browser_and_url_of_the_application() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ipsita.panda\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		d1 = new ChromeDriver();

		d1.get("http://automationpractice.com/index.php?controller=authentication&back=my-account%22);");

		System.out.println("Given done");
	}
	@When("enter email address, password, click on login button, click on Women, click on tops and click on faded short sleeve t-shirts")
	public void enter_email_address_password_click_on_login_button_click_on_women_click_on_tops_and_click_on_faded_short_sleeve_t_shirts() {
	    // Write code here that turns the phrase above into concrete actions
		
		d1.findElement(By.id("email")).sendKeys("ipsita.panda@gmail.com");
		d1.findElement(By.id("passwd")).sendKeys("12345");
		d1.findElement(By.xpath("//a[@class='sf-with-ul'][normalize-space()='Women']")).click();
		d1.findElement(By.cssSelector(".replace-2x[src='http://automationpractice.com/img/c/4-medium_default.jpg']"))
				.click();
		d1.findElement(By.xpath("//a[@title='Faded Short Sleeve T-shirts']//img[@title='Faded Short Sleeve T-shirts']"))
				.click();

		System.out.println("When done");
	}
	@Then("Success in add to cart and take screenshot of that window")
	public void success_in_add_to_cart_and_take_screenshot_of_that_window() throws InterruptedException, AWTException, IOException {
	    // Write code here that turns the phrase above into concrete actions
		
		d1.findElement(By.xpath("//span[normalize-space()='Add to cart']")).click();
		
		
		Robot robot1=new Robot();
        Dimension sc_size= Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle rect1=new Rectangle(sc_size);
        BufferedImage Source=robot1.createScreenCapture(rect1);
        File destination=new File("C:\\Users\\ipsita.panda\\OneDrive - HCL Technologies Ltd\\Pictures\\Screenshots\\scL.jpg");
        ImageIO.write(Source, "JPG", destination);
        
		Thread.sleep(3000);
		
		System.out.println("Then done");
		
		
	    
	    
	}    
	    
	}  
	    
	    





