package p1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class File {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties obj = new Properties(); 
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\p1\\File.properties");
		obj.load(objfile);
		 String bp = obj.getProperty("bpath");        
	      System.setProperty("webdriver.gecko.driver","D:\\drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			WebDriver bo=new FirefoxDriver();
			bo.get(bp);
			bo.findElement(By.xpath(obj.getProperty("uid"))).sendKeys("qaplanet1");
			bo.findElement(By.xpath(obj.getProperty("pwd"))).sendKeys("lab1");
		
	}

}
