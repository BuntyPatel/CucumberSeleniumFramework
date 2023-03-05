
  package stepDefinitions;
  
  import org.junit.Assert; import org.openqa.selenium.By; import
  org.openqa.selenium.JavascriptExecutor; import org.openqa.selenium.WebDriver;
  import org.openqa.selenium.WebElement; import
  org.openqa.selenium.chrome.ChromeDriver; import
  org.openqa.selenium.interactions.Actions;
  
  import cucumber.api.java.en.Given; import cucumber.api.java.en.Then; import
  cucumber.api.java.en.When;
  
  public class LoginStepDefinition {
  
  WebDriver driver;
  
  @Given("^user is already on Login Page$") public void
  user_already_on_login_page() { System.setProperty("webdriver.chrome.driver",
  "/Users/bunty/Desktop/QA/SeleniumJars/chromedriver"); driver = new
  ChromeDriver(); driver.get("https://classic.freecrm.com"); }
  
  @When("^title of login page is Free CRM$") public void
  title_of_page_is_free_CRM() { String title = driver.getTitle();
  System.out.println("Login Page title ::" + title); Assert.
  assertEquals("Free CRM - CRM software for customer relationship management, sales, and support."
  , title); }
  
  
  // Reg. Exp: //1. \"([^\"]*)\" //2. \"(.*)\"
  
  
  @Then ("^user enters \"(.*)\" and \"(.*)\"$") public void
  enter_username_and_password(String username , String password) {
  driver.findElement(By.name("username")).sendKeys(username);
  driver.findElement(By.name("password")).sendKeys(password);
  
  }
  
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
  
  @Then("^user move to new contact page$") public void
  user_move_to_new_contact_page() { driver.switchTo().frame("mainpanel");
  Actions action = new Actions(driver);
  action.moveToElement(driver.findElement(By.xpath(
  "//a[contains(text(),'Contacts')]"))).build().perform();
  
  }
  
  @Then("^user clicks on New Contacts link$") public void
  user_clicks_on_New_Contacts_link() {
  driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
  }
  
  @Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
  public void user_enters_contactDetails(String firstname, String lastname,
  String position) {
  driver.findElement(By.id("first_name")).sendKeys(firstname);
  driver.findElement(By.id("surname")).sendKeys(lastname);
  driver.findElement(By.id("company_position")).sendKeys(position); }
  
  @Then("^user clicks on save button$") public void
  user_clicks_on_save_button() {
  driver.findElement(By.xpath("//input[@value='Save']")).click(); }
  
  @Then("^verify contact Title \"(.*)\"$") public void
  verify_new_contact_created(String Title){ String actualTitle =
  driver.findElement(By.xpath("//td[@class='tabs_header'][1]")).getText();
  Assert.assertEquals(actualTitle, Title);
  
  }
  
  @Then("^close the browser$") public void close_the_browser() { driver.quit();
  
  }
  
  
  
  
  }
 