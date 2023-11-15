package register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Register {

	public static void main(String[] args) throws Throwable {
		
		//launch empty browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Launch the Register application
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		//Identify path for Full name(first name and last name)
		 driver.findElement(By.cssSelector("[placeholder='First Name']")).sendKeys("shwetha");
		 driver.findElement(By.cssSelector("input[ng-model='LastName']")).sendKeys("Nadagi");
		 
		 Thread.sleep(2000);
		//Identify path for Address
		 driver.findElement(By.cssSelector("textarea[ng-model='Adress']")).sendKeys("AECSLayout");
		 
		 Thread.sleep(2000);
		//Identify path for Email address
		 driver.findElement(By.cssSelector("[type='email']")).sendKeys("nadagi@gmail.com");
		 
		 Thread.sleep(2000);
		//Identify path for phone
		 driver.findElement(By.cssSelector("input[ng-model='Phone']")).sendKeys("96208844");
		 
		 Thread.sleep(2000);
		//Identify path for Gender
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		//driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		 
		Thread.sleep(2000);
		//Identify path for hobbies
		driver.findElement(By.xpath("//input[@value='Cricket']")).click();
		//driver.findElement(By.xpath("//input[@value='Movies']")).click();
		//driver.findElement(By.xpath("//input[@value='Hockey']")).click();
		 
		//Identify path for language 
		 //driver.findElement(By.xpath("//div[contains(@class,'ui')]")).sendKeys("H");
		 
		Thread.sleep(2000);
		//Identify path for skills
		 driver.findElement(By.xpath("//select[@id='Skills']")).sendKeys("J");
		 
		 Thread.sleep(2000);
		//Identify path for Country
		 driver.findElement(By.xpath("//select[@ng-model='country']")).sendKeys("I");
		
		 Thread.sleep(2000);
		//Identify path for select country
		 driver.findElement(By.xpath("//span[@role='combobox']")).sendKeys("I");
		 
		 Thread.sleep(2000);
		//Identify path for password date of birth
		 driver.findElement(By.xpath("//select[@id='yearbox']")).sendKeys("1964");
		 driver.findElement(By.xpath("//select[@placeholder='Month']")).sendKeys("April");
		 driver.findElement(By.xpath("//select[@placeholder='Day']")).sendKeys("17");
		 
		 Thread.sleep(2000);
		//Identify path for password
		 driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("shw123");
		
		 Thread.sleep(2000);
		//Identify path for confirm password
		driver.findElement(By.id("secondpassword")).sendKeys("shw123");
		
		Thread.sleep(2000);
		//Identify path for submit button
		driver.findElement(By.id("submitbtn")).click();
		
		Thread.sleep(2000);
		//Identify path for Refresh button
		//driver.findElement(By.id("Button1")).click();
		
		 
		 

	}

}
