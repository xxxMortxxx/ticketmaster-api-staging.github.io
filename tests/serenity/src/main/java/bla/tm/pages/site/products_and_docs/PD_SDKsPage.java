package bla.tm.pages.site.products_and_docs;

import bla.tm.pages.AncestorPage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import java.util.HashMap;
import java.util.Map;

@DefaultUrl("/products-and-docs/sdks/")
public class PD_SDKsPage extends AncestorPage {

    public final String pageHeader = "SDKs";

//    @FindBy(xpath = "//div[@id='main-block']/div[@class='content sdks']/div[1]/div/div/div/a")
//    private WebElementFacade sdkJavaButton;
//
//    @FindBy(xpath = "//div[@id='main-block']/div[@class='content sdks']/div[2]/div/div/div/a")
//    private WebElementFacade sdkJavaScriptButton;
//
//    @FindBy(xpath = "//div[@id='main-block']/div[@class='content sdks']/div[3]/div/div/div/a")
//    private WebElementFacade sdkScalaButton;

    @FindBy(xpath = "//div[@class='sdk-front sdk-front-java']/img")
    private WebElementFacade sdkJavaImage;

    @FindBy(xpath = "//div[@class='sdk-front sdk-front-js']/img")
    private WebElementFacade sdkJavaScriptImage;

    @FindBy(xpath = "//div[@class='sdk-front sdk-front-scala']/img")
    private WebElementFacade sdkScalaImage;

    @FindBy(xpath = "//div[div[img[@class='sdk-img-java sdk-img image']]]/a[@class='sdk-back desktop']")
    private WebElementFacade sdkJavaImageLink;

    @FindBy(xpath = "//div[div[img[@class='sdk-img-js sdk-img image']]]/a[@class='sdk-back desktop']")
    private WebElementFacade sdkJavaScriptImageLink;

    @FindBy(xpath = "//div[div[img[@class='sdk-img-scala sdk-img image']]]/a[@class='sdk-back desktop']")
    private WebElementFacade sdkScalaImageLink;

    public Map<String, WebElementFacade> getClickableElements() {
        Map<String, WebElementFacade> elements = new HashMap<String, WebElementFacade>();
        elements.put("SDK-Java Image", sdkJavaImageLink);
        elements.put("SDK-JavaScript Image", sdkJavaScriptImageLink);
        elements.put("SDK-Scala Image", sdkScalaImageLink);
        return elements;
    }

    public Map<String, WebElementFacade> getClickableImages() {
        Map<String, WebElementFacade> elements = new HashMap<String, WebElementFacade>();
        elements.put("SDK-Java Image", sdkJavaImage);
        elements.put("SDK-JavaScript Image", sdkJavaScriptImage);
        elements.put("SDK-Scala Image", sdkScalaImage);
        return elements;
    }
}
