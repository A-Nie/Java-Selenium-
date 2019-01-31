import org.openqa.selenium.By;

        import org.openqa.selenium.WebDriver;

        import org.openqa.selenium.WebElement;

        import org.openqa.selenium.chrome.ChromeDriver;

        import static java.lang.System.out;

class FindAllLinks {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.itopmusic.com/");

        java.util.List<WebElement> links = driver.findElements(By.tagName("a"));

        out.println(links.size());

        for (int i = 1; i< links.size(); i=i+1)

            out.println(links.get(i).getText());


    }

}