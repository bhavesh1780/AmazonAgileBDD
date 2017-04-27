package Amazon;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

import static Amazon.BasePage.driver;

/**
 * Created by Dell on 27/04/2017.
 */
public class MyStepdefs {

    HomePage homePage = new HomePage();
    CameraPage cameraPage = new CameraPage();


    @Given("^User is on Amazon home page$")
    public void userIsOnAmazonHomePage() {
        homePage.userIsOnHomePage();
        Assert.assertTrue(driver.findElement(By.id("nav-link-yourAccount")).isDisplayed());

    }

    @When("^User navigates to Camera & Photo$")
    public void User_navigates_to_Camera_Photo() {
        homePage.userNavigatesToCameraAndPhoto();
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='acs-category-tile-header']/a")).isDisplayed());

    }

    @When("^User uses refine by \"([^\"]*)\" from left hand menu$")
    public void User_uses_refine_by_from_left_hand_menu(String featuredBrands) {
//        cameraPage.RefineByBrandXPath(featuredBrands);
        cameraPage.refineProductByProduct();
    }

    @Then("^User should able to see products refine by \"([^\"]*)\"$")
    public void User_should_able_to_see_products_refine_by(String arg1) {

    }

}
