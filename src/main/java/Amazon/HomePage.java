package Amazon;

import org.openqa.selenium.By;

/**
 * Created by Dell on 27/04/2017.
 */
public class HomePage extends Utils {

    public void userIsOnHomePage(){
        driver.get("https://www.amazon.co.uk/");
    }

    public void userNavigatesToCameraAndPhoto(){
        //Click on Shop by Department
        mouseHover(By.xpath("//span[@class=\"nav-line-2\"]"));
        mouseHover(By.xpath("//div[@id='nav-flyout-shopAll']/div[2]/span[11]/span"));
        clickOnElement(By.xpath("//div[@id='nav-flyout-shopAll']/div[3]/div[11]/div/div/a/span"));
    }
}
