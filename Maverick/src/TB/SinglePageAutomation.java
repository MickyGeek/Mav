package TB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SinglePageAutomation {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testingbaba.com/old");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[1]/button")).click();
	    driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")).click();
	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/div[2]/div/div/a[1]")).click();
	    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[1]/form/input[1]")).sendKeys("aman");
	    driver.findElement(By.xpath("//*[@id=\"fullemail1\"]")).sendKeys("aman@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\"fulladdresh1\"]")).sendKeys("noida sector 62");
	    driver.findElement(By.xpath("//*[@id=\"paddresh1\"]")).sendKeys("new delhi ashok nagar");
	    driver.findElement(By.xpath("//*[@id=\"tab_1\"]/div/div[1]/form/input[3]")).click();
	    //hzvzhhzv
	}
}

