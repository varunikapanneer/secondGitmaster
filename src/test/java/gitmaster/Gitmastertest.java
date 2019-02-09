package gitmaster;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gitmastertest {
	@Test
public void logintest() throws IOException{
		WebDriver wd = new FirefoxDriver();
		wd.get("https://www.google.com/");
		File src =((TakesScreenshot) wd ).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\workspace_107_1\\Gitmaster"));
	}
}
