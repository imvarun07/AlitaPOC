public class GoogleHomePage {

    WebDriver driver;

    @FindBy(linkText = "Gmail")
    private WebElement gmailLink;

    @FindBy(id = "identifierId")
    private WebElement emailInput;

    @FindBy(name = "password")
    private WebElement passwordInput;

    @FindBy(id = "profileIdentifier")
    private WebElement profileIcon;

    @FindBy(xpath = "//a[text()='Sign out']")
    private WebElement logoutButton;

    public GoogleHomePage() {
        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void openGoogleHomePage() {
        driver.get("https://www.google.com/");
    }

    public void clickGmailLink() {
        gmailLink.click();
    }

    public void loginToGmail(String username, String password) {
        emailInput.sendKeys(username);
        emailInput.sendKeys(Keys.ENTER);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(passwordInput)).sendKeys(password);
        passwordInput.sendKeys(Keys.ENTER);
    }

    public boolean isUserLoggedIn() {
        return profileIcon.isDisplayed();
    }

    public void clickProfileIcon() {
        profileIcon.click();
    }

    public void logout() {
        logoutButton.click();
    }

    public boolean isUserLoggedOut() {
        return driver.getCurrentUrl().contains("https://www.google.com/");
    }
}