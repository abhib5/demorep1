package TestNGdemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProp {

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("D:\\Edu Stuff\\Selenium\\Selenium Softs\\All Codes\\SeleniumJavaFramework\\src\\test\\java\\TestNGdemo\\config.properties");
		prop.load(ip);
		System.out.println(prop.getProperty("name"));
	}

}
