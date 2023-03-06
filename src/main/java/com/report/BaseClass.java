package  com.report;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Alert al;
	public static JavascriptExecutor js;
	public static Select s;

	public static void launchBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void launchEdge() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();

	}

	public static void toPassUrl(String url) {
		driver.get(url);
	}

	public static void tomaximize() {
		driver.manage().window().maximize();
	}

	public static void toPerformImplicit() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void toQuit() {
		driver.quit();
	}

	public static void toInput(WebElement element, String input) {
		element.sendKeys(input);
	}

	public static void toClick(WebElement element) {
		element.click();
	}

	public static String toGetText(WebElement element) {

		String text = element.getText();
		
		return text;
	}
	
	public static void toPrintText(WebElement element) {
		String text = element.getText();
		System.out.println(text);

	}

	public static void toGetAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
	}

	public static void toMouseHouver(WebElement element) {
		a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	public static void toScroll(WebElement element) {
		a = new Actions(driver);
		a.clickAndHold(element).perform();
	}

	public static void toclickUsingMouse(WebElement element) {
		a = new Actions(driver);
		a.click(element).perform();
	}

	public static void toRightClick(WebElement element) {
		a = new Actions(driver);
		a.contextClick(element).perform();
	}

	public static void toDoubleClick(WebElement element) {
		a = new Actions(driver);
		a.doubleClick(element).perform();
	}

	public static void toClickTap() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}

	public static void escape() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
	}

	public static void toClickEnter() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void toClickDown() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	public static void toClickUp() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
	}

	public static void toTakeScreenShot(String Name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\JERNISH\\eclipse-workspace\\Selenium\\screenshot" + Name + ".png");
		FileUtils.copyFile(source, destination);
	}

	public static void toAcceptAlert() {
		driver.switchTo().alert();
		al.accept();
	}

	public static void toDismissAlert() {
		driver.switchTo().alert();
		al.dismiss();
	}

	public static void giveTextAndOkTheAllert(String data) {
		driver.switchTo().alert();
		al.sendKeys(data);
		al.accept();
	}

	public static void giveTextAndDismissTheAllert(String data) {
		driver.switchTo().alert();
		al.sendKeys(data);
		al.dismiss();
	}

	public static void multipleWindows(int i) {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> li = new ArrayList<String>();
		li.addAll(windowHandles);
		driver.switchTo().window(li.get(i));
	}

	public static void clickUsingJavaScript(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}

	public static void sendKeysUsingJavaScrip(WebElement element, String value) {
		js.executeScript("arguments[0].setAttribute('value','')", element);
	}

	public static void scroolDownInJavaScript(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView('true')", element);
	}

	public static void getAttributeInJavaScript(WebElement element) {
		js.executeScript("return arguments[0].getAttribute('value')", element);

	}

	public static void scroolUpInJavaScript(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView('false')", element);
	}

	public static void toSwitchFrame(String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}

	public static void toSwitchFrame(int i) {
		driver.switchTo().frame(i);
	}

	public static void toSwitchFrame(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void dropDownByValue(WebElement element, String value) {
		s = new Select(element);
		s.selectByValue(value);
	}

	public static void dropDownByVisibleText(WebElement element, String text) {
		s = new Select(element);
		s.selectByVisibleText(text);
	}

	public static void dropDownByIndex(WebElement element, int i) {
		s = new Select(element);
		s.selectByIndex(i);

	}

	public static void fistSelectedInDropDown(WebElement element) {
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption);
	}

	public static void allSeectedInDropDown(WebElement element) {
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (int i = 0; i < allSelectedOptions.size(); i++) {
			WebElement option = allSelectedOptions.get(i);
			String text = option.getText();
			System.out.println(text);
		}
	}

	public static String excelRead(int row, int cell) throws IOException {

		File file = new File("C:\\Users\\JERNISH\\eclipse-workspace\\FrameWork\\ExcelFiles\\Data.xlsx");

		FileInputStream fin = new FileInputStream(file);

		Workbook w = new XSSFWorkbook(fin);

		Sheet sheet = w.getSheet("Sheet1");
		Row r = sheet.getRow(row);
		Cell c = r.getCell(cell);

		int cellType = c.getCellType();

		String value;

		if (cellType == 1) {

			value = c.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(c)) {

			Date d = c.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy");
			value = sim.format(d);
		} else {
			double dd = c.getNumericCellValue();

			long l = (long) dd;

			value = String.valueOf(l);
		}
		return value;
	}

}
