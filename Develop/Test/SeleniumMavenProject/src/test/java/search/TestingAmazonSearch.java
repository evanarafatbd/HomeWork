package search;


import Amazon.AmazonMethodBuild;
//import MavenProjects.AmazonTestData;
import Amazon.AmazonTestData;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import java.util.List;



public class TestingAmazonSearch extends AmazonMethodBuild {

    @Test
    public void testTypingOnSearchBox()throws InterruptedException{
        //connect to db, read it for me

        List<String> list = AmazonTestData.checkListOfItems();
        for(int i=0; i<list.size(); i++){
            driver.findElement(By.cssSelector("#twotabsearchtextbox")).clear();
            driver.findElement(By.id("twotabsearchtextbox")).sendKeys(list.get(i), Keys.ENTER);
            Thread.sleep(2000);

        }

    }
}



