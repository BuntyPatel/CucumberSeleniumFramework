
  package stepDefinitions;
  
  import java.util.List;
  
  import org.junit.Assert; import org.openqa.selenium.By; import
  org.openqa.selenium.JavascriptExecutor; import org.openqa.selenium.WebDriver;
  import org.openqa.selenium.WebElement; import
  org.openqa.selenium.chrome.ChromeDriver; import
  org.openqa.selenium.interactions.Actions;
  
  import cucumber.api.DataTable; import cucumber.api.java.en.Given; import
  cucumber.api.java.en.Then; import cucumber.api.java.en.When;
  
  public class DealsStepDefinition {
  
  WebDriver driver;
  
  @Given("^user is on Login Page$") public void user_on_login_page() {
  System.setProperty("webdriver.chrome.driver",
  "/Users/bunty/Desktop/QA/SeleniumJars/chromedriver"); driver = new
  ChromeDriver(); driver.get("https://classic.freecrm.com"); }
  
  @When("^title of login page is Free CRM$") public void
  title_of_page_is_free_CRM() { String title = driver.getTitle();
  System.out.println("Login Page title ::" + title); Assert.
  assertEquals("Free CRM - CRM software for customer relationship management, sales, and support."
  , title); }
  
  
  @Then ("^user enters username and password$") public void
  enter_username_and_password(DataTable credentials) { List<List<String>> data
  = credentials.raw();
  driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
  driver.findElement(By.name("password")).sendKeys(data.get(0).get(1)); }
  
  @Then("^user clicks on login button$") public void
  user_clicks_on_login_button(){ WebElement loginBtn =
  driver.findElement(By.xpath("//input[@value='Login']")); JavascriptExecutor
  js = (JavascriptExecutor)driver; js.executeScript("arguments[0].click();",
  loginBtn);
  
  }
  
  @Then("^user is on home page$") public void user_is_on_home_page() { String
  title = driver.getTitle(); System.out.println("Home Page title ::" + title);
  Assert.assertEquals("CRMPRO", title);
  
  }
  
  @Then("^user move to new deal page$") public void
  user_move_to_new_deal_page() { driver.switchTo().frame("mainpanel"); Actions
  action = new Actions(driver);
  action.moveToElement(driver.findElement(By.xpath(
  "//a[contains(text(),'Deals')]"))).build().perform();
  
  }
  
  @Then("^user clicks on New Deal link$") public void
  user_clicks_on_New_Deal_link() {
  driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click(); }
  
  @Then("^user enters deal details$") public void
  user_enters_dealDetails(DataTable credentials) { List<List<String >> data =
  credentials.raw();
  driver.findElement(By.id("title")).sendKeys(data.get(0).get(0));
  driver.findElement(By.name("amount")).sendKeys(data.get(0).get(1));
  driver.findElement(By.id("probability")).sendKeys(data.get(0).get(2));
  driver.findElement(By.id("commission")).sendKeys(data.get(0).get(3)); }
  
  @Then("^user clicks on save button$") public void
  user_clicks_on_save_button() {
  driver.findElement(By.xpath("//input[@value='Save']")).click(); }
  
  @Then("^close the browser$") public void close_the_browser() { driver.quit();
  
  }
  
  }
 