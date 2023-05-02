package com.nopcommerce.sw4.pages;

import com.nopcommerce.sw4.utility.Utilities;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utilities {
    By electronicsCategory = By.xpath("//a[text()='Electronics ']");
    By cellPhone = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");

    public void hoverOnElectronics() {
        mouseHoverToElement(electronicsCategory);
    }

    public void hoverOnCellPhoneAndClick() {
        mouseHoverToElementAndClick(cellPhone);
    }
}
