public class GoogleStepDefinitions {

    GoogleHomePage googleHomePage = new GoogleHomePage();

    @Given("User is on Google homepage")
    public void userIsOnGoogleHomepage() {
        googleHomePage.openGoogleHomePage();
    }

    @When("User clicks on the Gmail link")
    public void userClicksOnGmailLink() {
        googleHomePage.clickGmailLink();
    }

    @And("User logs in with correct credentials")
    public void userLogsInWithCorrectCredentials() {
        googleHomePage.loginToGmail("username", "password");
    }

    @Then("User should be logged in successfully")
    public void userShouldBeLoggedInSuccessfully() {
        Assert.assertTrue(googleHomePage.isUserLoggedIn());
    }

    @Given("User is logged in to the account")
    public void userIsLoggedInToTheAccount() {
        googleHomePage.openGoogleHomePage();
        googleHomePage.clickGmailLink();
        googleHomePage.loginToGmail("username", "password");
    }

    @When("User clicks on the profile icon")
    public void userClicksOnTheProfileIcon() {
        googleHomePage.clickProfileIcon();
    }

    @And("User clicks on the logout button")
    public void userClicksOnTheLogoutButton() {
        googleHomePage.logout();
    }

    @Then("User should be logged out successfully")
    public void userShouldBeLoggedOutSuccessfully() {
        Assert.assertTrue(googleHomePage.isUserLoggedOut());
    }
}