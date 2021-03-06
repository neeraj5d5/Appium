package Test;



import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.testng.annotations.Test;

import Pages.Publishqponsobj;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Grabqupons extends BaseClass {
	int i=0;
	public void screenshot(String path_screenshot) throws IOException{
		File srcFile=driver.getScreenshotAs(OutputType.FILE);
		String filename="ScreenShort"+i; 
		System.out.println(filename);
		File targetFile=new File(path_screenshot + filename +".jpg");
		FileUtils.copyFile(srcFile,targetFile);
		i=i+1;
	}

	public void Scroll(){
		org.openqa.selenium.Dimension dimension = driver.manage().window().getSize();
		int Start_x = (int) (dimension.width * 0.4);
		int start_y = (int) (dimension.width * 0.6);
		int xOffset = (int) (dimension.width * 0.4);
		int yOffset = (int) (dimension.width * 0.4);
		TouchAction touch = new TouchAction(driver);
		touch.press(PointOption.point(Start_x,start_y ))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		.moveTo(PointOption.point(xOffset, yOffset)).release().perform();

	}
	public void Scroll1(){
		org.openqa.selenium.Dimension dimension = driver.manage().window().getSize();
		int Start_x = (int) (dimension.width * 0.1);
		int start_y = (int) (dimension.width * 0.9);
		int xOffset = (int) (dimension.width * 0.1);
		int yOffset = (int) (dimension.width * 0.1);
		TouchAction touch = new TouchAction(driver);
		touch.press(PointOption.point(Start_x,start_y ))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		.moveTo(PointOption.point(xOffset, yOffset)).release().perform();

	}
	@Test(enabled=false)
	public void Home() throws InterruptedException, IOException {

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.Button[@text='Sign Up']").click();
		driver.findElementByXPath("//android.view.View[@index='1']/android.view.View[@index='4']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.widget.EditText[@index=0]").sendKeys("neeraj181@gmail.com");
		driver.findElementByXPath("//android.view.View[@index='1']/android.view.View[@index='0']//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.widget.EditText[@index='0']").sendKeys("Asdf@1234");
		driver.findElementByXPath("//android.view.View[@index='2']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='2']").click();
		driver.findElementByXPath("//android.widget.RadioButton[@index='0']").click();
		driver.findElementByXPath("//android.widget.RadioButton[@index='1']").click();
		driver.findElementByXPath("//android.widget.RadioButton[@index='2']").click();
		driver.findElementByXPath("//android.widget.RadioButton[@index='1']").click();
		driver.findElementByXPath("//android.view.View[@index='1']/android.widget.Button[@index='2']").click();
		driver.findElementByXPath("//android.view.View[@index='2']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='2']").click();
		driver.findElementByXPath("//android.widget.RadioButton[@index='1']").click();
		driver.findElementByXPath("//android.view.View[@index='1']/android.widget.Button[@index='3']").click();

		driver.findElementByXPath("//android.view.View[@index='0']/android.widget.EditText[@index='0']").sendKeys("8317681823");
		screenshot("C:\\Neeraj\\AffineLabs\\Appium");
		driver.findElementByXPath("//android.view.View[@text='SUBMIT ']").click();

		driver.findElementByXPath("//android.view.View[@index='0']/android.widget.Button[@index='0']").click();
		Thread.sleep(20);
		screenshot("C:\\Neeraj\\AffineLabs\\Appium");
	}
	@Test
	public void Login() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.EditText[@index='0']").sendKeys("neeraj505@gmail.com");
		driver.findElementByXPath("//android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.widget.EditText[@index='0']").sendKeys("Asdf@1234");
		Thread.sleep(2);
		driver.findElementByXPath("//android.view.View[@index='1']/android.view.View[@index='3']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='2']").click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	@Test(dependsOnMethods=("Login"))
	public void CreateBissines() {
		// Name
		driver.findElementByXPath("//android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.widget.EditText[@index='0']").sendKeys("NoNo's Cafe");

		//Short Name
		driver.findElementByXPath("//android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.widget.EditText[@index='0']").sendKeys("NoNo's Cafe");
		//Click Category
		driver.findElementByXPath("//android.view.View[@text='Category']/android.widget.Button[@index='2']").click();
		//Category click Cancle
		driver.findElementByXPath("//android.widget.Button[@text='CANCEL ']").click();
		//Click Category
		driver.findElementByXPath("//android.view.View[@text='Category']/android.widget.Button[@index='2']").click();
		//Category click Ok
		driver.findElementByXPath("//android.widget.Button[@text='OK ']").click();
		//Sub Category Click
		driver.findElementByXPath("//android.view.View[@text='Sub Category']/android.widget.Button[@index='2']").click();
		//Sub Category Click Restarent and Ok
		driver.findElementByXPath("//android.app.Dialog[@index='1']/android.view.View[@index='1']/android.view.View[@index='2']/android.widget.RadioButton[@text='Restaurants']").click();
		driver.findElementByXPath("//android.widget.Button[@text='OK ']").click();
		//Sub Category Click
		driver.findElementByXPath("//android.view.View[@text='Sub Category']/android.widget.Button[@index='2']").click();
		//Sub Category Click Cafes and Ok
		driver.findElementByXPath("//android.app.Dialog[@index='1']/android.view.View[@index='1']/android.view.View[@index='2']/android.widget.RadioButton[@text='Cafes']").click();
		//Sub Category Click
		driver.findElementByXPath("//android.view.View[@text='Sub Category']/android.widget.Button[@index='2']").click();

		//Sub Category Click
		driver.findElementByXPath("//android.view.View[@text='Sub Category']/android.widget.Button[@index='2']").click();

		//Sub Category Click Bars and Ok
		driver.findElementByXPath("//android.app.Dialog[@index='1']/android.view.View[@index='1']/android.view.View[@index='2']/android.widget.RadioButton[@text='Bars']").click();
		driver.findElementByXPath("//android.widget.Button[@text='OK ']").click();
		//Sub Category Click
		driver.findElementByXPath("//android.view.View[@text='Sub Category']/android.widget.Button[@index='2']").click();

		//Sub Category Click Pastries and Ok
		List<MobileElement> lists= driver.findElements(By.xpath("//android.widget.RadioButton"));
		//Scroll
		Scroll();
		for(MobileElement e : lists) {
			System.out.println(e.getAttribute("text"));
		}


		driver.findElementByXPath("//android.app.Dialog[@index='1']/android.view.View[@index='1']/android.view.View[@index='2']/android.widget.RadioButton[@text='Pastries']").click();
		driver.findElementByXPath("//android.widget.Button[@text='OK ']").click();

		//Sub Category Click
		driver.findElementByXPath("//android.view.View[@text='Sub Category']/android.widget.Button[@index='2']").click();
		//Sub Category Click Restarent and Ok
		driver.findElementByXPath("//android.app.Dialog[@index='1']/android.view.View[@index='1']/android.view.View[@index='2']/android.widget.RadioButton[@text='Restaurants']").click();
		driver.findElementByXPath("//android.widget.Button[@text='OK ']").click();
		//Clicking On Type
		driver.findElementByXPath("//android.view.View[@text='Type']/android.widget.Button[@index='2']").click();
		driver.findElementByXPath("//android.widget.RadioButton[@text='Indian']").click();
		driver.findElementByXPath("//android.widget.RadioButton[@text='Chinese']").click();
		driver.findElementByXPath("//android.widget.RadioButton[@text='Italian']").click();
		driver.findElementByXPath("//android.widget.RadioButton[@text='American']").click();
		driver.findElementByXPath("//android.widget.RadioButton[@text='Mexican']").click();
		//scroll
		Scroll();
		driver.findElementByXPath("//android.widget.RadioButton[@text='Mediterranean']").click();
		Scroll();
		driver.findElementByXPath("//android.widget.RadioButton[@text='Korean']").click();
		Scroll();
		driver.findElementByXPath("//android.widget.RadioButton[@text='Malaysian']").click();
		Scroll();
		driver.findElementByXPath("//android.widget.RadioButton[@text='Japanese']").click();
		Scroll();
		driver.findElementByXPath("//android.widget.RadioButton[@text='European']").click();
		Scroll();
		driver.findElementByXPath("//android.widget.RadioButton[@text='French']").click();
		Scroll();
		driver.findElementByXPath("//android.widget.RadioButton[@text='Australian']").click();
		Scroll();
		driver.findElementByXPath("//android.widget.RadioButton[@text='Vietnamese']").click();
		Scroll();
		driver.findElementByXPath("//android.widget.RadioButton[@text='Thai']").click();
		Scroll();
		driver.findElementByXPath("//android.widget.RadioButton[@text='Middle Eastern']").click();
		Scroll();
		driver.findElementByXPath("//android.widget.RadioButton[@text='Greek']").click();
		Scroll();
		driver.findElementByXPath("//android.widget.RadioButton[@text='Spanish']").click();
		Scroll();
		driver.findElementByXPath("//android.widget.RadioButton[@text='Other']").click();
		//Clicking Type Ok Button
		driver.findElementByXPath("//android.widget.Button[@text='OK ']").click();
		//Clicking On Type
		driver.findElementByXPath("//android.view.View[@text='Type']/android.widget.Button[@index='2']").click();
		driver.findElementByXPath("//android.widget.RadioButton[@text='Indian']").click();
		//Clicking Type Ok Button
		driver.findElementByXPath("//android.widget.Button[@text='OK ']").click();
		//Clicking Average Per Time
		driver.findElementByXPath("//android.view.View[@index='5']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.widget.Button[@index='2']").click();
		driver.findElementByXPath("//android.app.Dialog[@index='1']/android.view.View[@index='1']/android.view.View[@index='2']/android.widget.RadioButton[@text='15 Minutes']").click();
		driver.findElementByXPath("//android.app.Dialog[@index='1']/android.view.View[@index='1']/android.view.View[@index='2']/android.widget.RadioButton[@text='30 Minutes']").click();
		driver.findElementByXPath("//android.app.Dialog[@index='1']/android.view.View[@index='1']/android.view.View[@index='2']/android.widget.RadioButton[@text='45 Minutes']").click();
		driver.findElementByXPath("//android.app.Dialog[@index='1']/android.view.View[@index='1']/android.view.View[@index='2']/android.widget.RadioButton[@text='60 Minutes']").click();
		driver.findElementByXPath("//android.app.Dialog[@index='1']/android.view.View[@index='1']/android.view.View[@index='2']/android.widget.RadioButton[@text='90 Minutes']").click();
		//Clicking Type Ok Button
		driver.findElementByXPath("//android.widget.Button[@text='OK ']").click();
		//Clicking on Tags
		driver.findElementByXPath("//android.view.View[@index='6']/android.view.View[@index='0']").click();
		//
		driver.findElementByXPath("//android.view.View[@index='1']/android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.CheckBox[@index='1']/android.widget.Button[@index='1']").click();
		//Curbside Pickup
		driver.findElementByXPath("//android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.CheckBox[@index='1']/android.widget.Button[@index='1']").click();
		//Afghani
		driver.findElementByXPath("//android.view.View[@index='2']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.CheckBox[@index='1']/android.widget.Button[@index='1']").click();
		//Africa
		driver.findElementByXPath("//android.view.View[@index='3']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.CheckBox[@index='1']/android.widget.Button[@index='1']").click();
		//Albanian
		driver.findElementByXPath("//android.view.View[@index='4']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.CheckBox[@index='1']/android.widget.Button[@index='1']").click();
		//America
		driver.findElementByXPath("//android.view.View[@index='5']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.CheckBox[@index='1']/android.widget.Button[@index='1']").click();
		//Arabic
		driver.findElementByXPath("//android.view.View[@index='6']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.CheckBox[@index='1']/android.widget.Button[@index='1']").click();
		//Argentinian
		driver.findElementByXPath("//android.view.View[@index='7']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.CheckBox[@index='1']/android.widget.Button[@index='1']").click();
		//Armenian
		driver.findElementByXPath("//android.view.View[@index='8']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.CheckBox[@index='1']/android.widget.Button[@index='1']").click();
		//Asia
		driver.findElementByXPath("//android.view.View[@index='9']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.CheckBox[@index='1']/android.widget.Button[@index='1']").click();
		//Australian
		driver.findElementByXPath("//android.view.View[@index='10']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.CheckBox[@index='1']/android.widget.Button[@index='1']").click();
		//Scroll
		Scroll();
		driver.findElementByXPath("//android.view.View[@index='11']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.CheckBox[@index='1']/android.widget.Button[@index='1']").click();
		//Scroll
		Scroll();
		driver.findElementByXPath("//android.view.View[@index='12']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.CheckBox[@index='1']/android.widget.Button[@index='1']").click();
		//Scroll
		Scroll();
		driver.findElementByXPath("//android.view.View[@index='13']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.CheckBox[@index='1']/android.widget.Button[@index='1']").click();
		//Scroll
		Scroll();
		driver.findElementByXPath("//android.view.View[@index='14']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.CheckBox[@index='1']/android.widget.Button[@index='1']").click();
		//Scroll
		Scroll();
		driver.findElementByXPath("//android.view.View[@index='15']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.CheckBox[@index='1']/android.widget.Button[@index='1']").click();
		//Scroll
		Scroll();
		driver.findElementByXPath("//android.view.View[@index='16']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.CheckBox[@index='1']/android.widget.Button[@index='1']").click();
		//Scroll
		Scroll1();
		driver.findElementByXPath("//android.view.View[@index='16']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.CheckBox[@index='1']/android.widget.Button[@index='1']").click();

		driver.findElementByXPath("//android.widget.Button[@text='done all ']").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Scroll1();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Scroll1();
		driver.findElementByXPath("//android.view.View[@index='9']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.widget.EditText[@index='0']").sendKeys("2");
		Scroll1();

		driver.findElementByXPath("//android.view.View[@index='10']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.widget.EditText[@index='0']").sendKeys("2");
		driver.findElementByXPath("//android.view.View[@index='11']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.widget.EditText[@index='0']").sendKeys("2");

		driver.findElementByXPath("//android.view.View[@index='12']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='2']").click();
		driver.findElementByXPath("//android.widget.RadioButton[@text='+1']").click();
		driver.findElementByXPath("//android.widget.RadioButton[@text='+64']").click();
		driver.findElementByXPath("//android.widget.RadioButton[@text='+91']").click();
		//Clicking Type Ok Button
		driver.findElementByXPath("//android.widget.Button[@text='OK ']").click();
		driver.findElementByXPath("//android.view.View[@index='12']/android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.EditText[@index='0']").sendKeys("8317681823");

		driver.findElementByXPath("//android.view.View[@index='13']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='2']").click();
		driver.findElementByXPath("//android.widget.RadioButton[@text='+1']").click();
		driver.findElementByXPath("//android.widget.RadioButton[@text='+64']").click();
		driver.findElementByXPath("//android.widget.RadioButton[@text='+91']").click();
		//Clicking Type Ok Button
		driver.findElementByXPath("//android.widget.Button[@text='OK ']").click();
		driver.findElementByXPath("//android.view.View[@index='13']/android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.EditText[@index='0']").sendKeys("8317681823");
		//WebSite
		driver.findElementByXPath("//android.view.View[@index='14']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.widget.EditText[@index='0']").sendKeys("https://m.facebook.com/pages/Little-Tokyo-Hibachi-Grill-Sushi/153376314683946");
		//Address
		driver.findElementByXPath("//android.view.View[@index='15']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.widget.EditText[@index='0']").sendKeys("3005 W County Line Rd");
		//City
		driver.findElementByXPath("//android.view.View[@index='16']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.widget.EditText[@index='0']").sendKeys("Littleton");
		//Scroll
		Scroll1();
		//State
		driver.findElementByXPath("//android.view.View[@index='17']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.widget.EditText[@index='0']").sendKeys("CO");
		//Country
		driver.findElementByXPath("//android.view.View[@index='18']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.widget.EditText[@index='0']").sendKeys("United States");
		//Postal Code
		driver.findElementByXPath("//android.view.View[@index='19']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.widget.EditText[@index='0']").sendKeys("80129");
		//Button Submit Click
		driver.findElementByXPath("//android.view.View[@index='20']/android.view.View[@index='0']/android.widget.Button[@text='SUBMIT ']").click();
	}
	@Test(dependsOnMethods=("Login"))
	public void Nvigation() {
		driver.findElementByXPath("//android.widget.TabWidget[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']").click();
		driver.findElementByXPath("//android.widget.TabWidget[@index='1']/android.view.View[@index='1']/android.view.View[@index='0']").click();
		driver.findElementByXPath("//android.widget.TabWidget[@index='1']/android.view.View[@index='2']/android.view.View[@index='0']").click();
		driver.findElementByXPath("//android.widget.TabWidget[@index='1']/android.view.View[@index='3']/android.view.View[@index='0']").click();
		driver.findElementByXPath("//android.widget.TabWidget[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']").click();

	}
	@Test(dependsOnMethods=("Nvigation"))
	public void Dashboard() {
		//CLicking Orders in Home Page
		driver.findElementByXPath("//android.view.View[@index='1']/android.view.View[@index='0']/android.widget.ToggleButton[@index='0']").click();
		//Clicking Qupos in Home Page
		driver.findElementByXPath("//android.view.View[@index='1']/android.view.View[@index='1']/android.widget.ToggleButton[@index='0']").click();
		//CLicking Orders in Home Page
		driver.findElementByXPath("//android.view.View[@index='1']/android.view.View[@index='0']/android.widget.ToggleButton[@index='0']").click();
		//Clicking Filter in Home Page
		driver.findElementByXPath("//android.view.View[@index='1']/android.view.View[@index='1']/android.view.View[@index='0']/android.widget.Button[@index='0']").click();
		//Clicking Order Status Cancel
		driver.findElementByXPath("//android.widget.Button[@text='CANCEL ']").click();
		//Clicking Filter in Home Page
		driver.findElementByXPath("//android.view.View[@index='1']/android.view.View[@index='1']/android.view.View[@index='0']/android.widget.Button[@index='0']").click();
		//Clicking Order Status
		driver.findElementByXPath("//android.view.View[@index='2']/android.widget.CheckBox[@index='0']").click();
		driver.findElementByXPath("//android.view.View[@index='2']/android.widget.CheckBox[@index='1']").click();
		driver.findElementByXPath("//android.view.View[@index='2']/android.widget.CheckBox[@index='2']").click();
		driver.findElementByXPath("//android.view.View[@index='2']/android.widget.CheckBox[@index='3']").click();
		driver.findElementByXPath("//android.view.View[@index='2']/android.widget.CheckBox[@index='4']").click();
		Scroll();
		driver.findElementByXPath("//android.view.View[@index='2']/android.widget.CheckBox[@index='5']").click();
		Scroll();
		driver.findElementByXPath("//android.view.View[@index='2']/android.widget.CheckBox[@index='6']").click();
		//Clicking Order Status Ok
		driver.findElementByXPath("//android.widget.Button[@text='OK ']").click();

	}
	@Test(dependsOnMethods=("Nvigation"))
	public void Publishqpons() {
		Publishqponsobj obj=new Publishqponsobj();
		driver.findElementByXPath("//android.widget.TabWidget[@index='1']/android.view.View[@index='1']/android.view.View[@index='0']").click();
		driver.findElementByXPath(obj.TypeCupon_Xpth).click();
		
		driver.findElementByXPath(obj.Button_Special_Xpath).click();
		driver.findElementByXPath(obj.TypeCupon_Xpth).click();
		driver.findElementByXPath(obj.Button_Promo_Xpath).click();
	}
}

