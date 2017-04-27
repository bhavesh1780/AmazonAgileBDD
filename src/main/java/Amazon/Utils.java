package Amazon;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by Dell on 24/04/2017.
 */
public class Utils extends BasePage {


    //re-usable meyhof for click on Element
    public static void clickOnElement(By by){
        driver.findElement(by).click();
    }

    // re-usable method for typing text into element (instead of sendKeys())
    public static void typeText(By by, String text){
        //clearing any existing text from the element
        driver.findElement(by).clear();
        //sending your text to the locator by
        driver.findElement(by).sendKeys(text);
    }

    //Reusable Method for selectByValue
    public static void selectValue(By by, String value){
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }
    //Reusable method for selectByIndex
    public static void selectIndex(By by, int i){
        Select select;
        new Select(driver.findElement(by)).selectByIndex(i);
    }

    //Reusable method for selecting checkbox
    public static void selectCheckbox(By by){
        if (!driver.findElement(by).isSelected()){   // check if the checkbox is NOT ticked/selected
            driver.findElement(by).click();          // tick on the checkbox
        }
    }

    //Reusable method for selectByVisibleText(NameLassObject)
    public static void selectText(By by, String text){

        new Select(driver.findElement(by)).selectByVisibleText(text);
    }

    //Reusable method for date stamp
    public static String dateStamp(){
        DateFormat dateFormat = new SimpleDateFormat("ddmmyyhhss");
        Date date = new Date();
        String date1 = dateFormat.format(date);
        return date1;
    }

    //Reusable method for getText
    public static String getTextFromElement(By by){     //return type as String - why? to store and return the test we are receving from the element
        String text =  driver.findElement(by).getText();                                                          // so we can reuse the text
        return text;
    }

    //Reusable method for mouse hover on any element
    public static void mouseHover(By by){
        Actions action =new Actions(driver);
        WebElement mouse = driver.findElement(by);
        action.moveToElement(mouse).build().perform();
    }

    //Reusable method for popup handeling
    public static void checkAlert() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 2);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (Exception e) {
            //exception handling
        }
    }


}
