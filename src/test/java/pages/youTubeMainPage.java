package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

public class youTubeMainPage {

    public youTubeMainPage(){

        PageFactory.initElements(Driver.getDriver(),this);


    }

    @FindBy(xpath ="//input[@name='search_query' and @type='text' and @class='ytSearchboxComponentInput yt-searchbox-input title']" )
    public WebElement searchBox;
}
