package Amazon;

import org.openqa.selenium.By;

/**
 * Created by Dell on 27/04/2017.
 */
public class CameraPage extends Utils {

    public void refineProductByProduct(){
        clickOnElement(By.xpath("//input[contains(@name,'s-ref-checkbox-SanDisk')]"));
    }

    public void RefineByBrandXPath(String brandname){
//        clickOnElement(By.xpath("//input[contains(@name,'s-ref-checkbox-"+brandname+"')]"));
//        System.out.println(driver.findElement(By.xpath("\"//input[contains(@name,'s-ref-checkbox-\"+brandname+\"')]")));
    }

}
