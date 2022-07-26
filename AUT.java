import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.fail;


public class AUT {

    public WebDriver driver;
    public String url = "https://www.themoviedb.org/movie?language=en-US";
    public String browser = "webdriver.chrome.driver";
    public String path = "/Users/realhowieb/Documents/GitHub/automation-pangram-hb/Okletsgo/src/main/resources/chromedriver";

    public String first_movie;
    public String first_movie_rating = "//*[@id=\"original_header\"]/div[2]/section/ul/li[1]/div[1]/div/div";
    public String first_movie_tags;
    public String first_movie_release_date;
    public String first_movie_description;
    public String first_movie_overview;
    public String get_first_Movie_title = "//div/div/div/div/a/img";
    public String get_page_title;
    public String get_movie_details_title = "//*[@id=\"original_header\"]/div[2]/section/div[1]/h2/a";
    public String get_movie_details_tags = "//*[@id=\"original_header\"]/div[2]/section/div[1]/div/span[3]";
    public String get_movie_release_date = "//*[@id=\"original_header\"]/div[2]/section/div[1]/div/span[2]";
    public String get_movie_description = "//*[@id=\"original_header\"]/div[2]/section/div[2]/h3[1]";
    public String get_movie_overview = "//*[@id=\"original_header\"]/div[2]/section/div[2]/div/p";


    @Test
    public void FindFirstMovieDetails() {

        System.setProperty(browser,path);
        driver = new ChromeDriver();
        driver.get(url);

        get_page_title = driver.getTitle();
        if (get_page_title.contains("Popular Movies")){
            driver.findElement(By.xpath(get_first_Movie_title)).click();
            first_movie = driver.findElement(By.xpath(get_movie_details_title)).getText();
            first_movie_tags = driver.findElement(By.xpath(get_movie_details_tags)).getText();
            first_movie_rating = driver.findElement(By.xpath(first_movie_rating)).getAttribute("data-percent");
            first_movie_release_date = driver.findElement(By.xpath(get_movie_release_date)).getText();
            first_movie_description = driver.findElement(By.xpath(get_movie_description)).getText();
            first_movie_overview = driver.findElement(By.xpath(get_movie_overview)).getText();
            System.out.print("Movie Title: " + first_movie + " Tags: " + first_movie_tags + " Rating: "
                    + first_movie_rating + " Release Date: " + first_movie_release_date
                    + " Description: " + first_movie_description + " Overview: " + first_movie_overview);
        }
        else if (get_page_title.contains("New")){
            driver.findElement(By.xpath(get_first_Movie_title)).click();
            first_movie = driver.findElement(By.xpath(get_movie_details_title)).getText();
            first_movie_tags = driver.findElement(By.xpath(get_movie_details_tags)).getText();
            first_movie_rating = driver.findElement(By.xpath(first_movie_rating)).getAttribute("data-percent");
            first_movie_release_date = driver.findElement(By.xpath(get_movie_release_date)).getText();
            first_movie_description = driver.findElement(By.xpath(get_movie_description)).getText();
            first_movie_overview = driver.findElement(By.xpath(get_movie_overview)).getText();
            System.out.print("Movie Title: " + first_movie + " Tags: " + first_movie_tags + " Rating: "
                    + first_movie_rating + " Release Date: " + first_movie_release_date
                    + " Description: " + first_movie_description + " Overview: " + first_movie_overview);
        }
        else if (get_page_title.contains("Favorite")) {
            driver.findElement(By.xpath(get_first_Movie_title)).click();
            first_movie = driver.findElement(By.xpath(get_movie_details_title)).getText();
            first_movie_tags = driver.findElement(By.xpath(get_movie_details_tags)).getText();
            first_movie_rating = driver.findElement(By.xpath(first_movie_rating)).getAttribute("data-percent");
            first_movie_release_date = driver.findElement(By.xpath(get_movie_release_date)).getText();
            first_movie_description = driver.findElement(By.xpath(get_movie_description)).getText();
            first_movie_overview = driver.findElement(By.xpath(get_movie_overview)).getText();
            System.out.print("Movie Title: " + first_movie + " Tags: " + first_movie_tags + " Rating: "
                    + first_movie_rating + " Release Date: " + first_movie_release_date
                    + " Description: " + first_movie_description + " Overview: " + first_movie_overview);
        }
        driver.quit();
    }
}
