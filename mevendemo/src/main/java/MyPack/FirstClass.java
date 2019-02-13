package MyPack;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mukul\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://spicezet.com");
		
		driver.findElement(By.xpath("//a[@title=Flights]"));
		
		Set<String>window=driver.getWindowHandles();
		Iterator<String> it=window.iterator();
		String childwinId=it.next();
		String parentwinid=it.next();
		System.out.println(childwinId);
		System.out.println(parentwinid);
		
		// TODO Auto-generated method stub
		//System.out.println(Text);
		driver.close();

	}

}
