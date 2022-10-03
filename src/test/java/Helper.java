import org.openqa.selenium.chrome.ChromeDriver;

public class Helper {

    public static final String HBURL = "https://www.youtube.com/watch?v=rUkgltOb3qg";
    public static final String INTURL = "https://the-internet.herokuapp.com";
    public static final String ALERTPATH = "/html/body/div[2]/div/ul/li[29]/a";
    public static final String CHECKCSS = "#content > ul > li:nth-child(6) > a";
    public static final String CHECK1CSS = "#checkboxes > input[type=checkbox]:nth-child(1)";
    public static final String CLICKCSS = "#content > div > ul > li:nth-child(1) > button";
    public static final String ANSWRTXT =  "I LOVE MY JOB";
    public static final String CONFCSS = "#content > div > ul > li:nth-child(2) > button";
    public static final String PROMPTCSS = "#content > div > ul > li:nth-child(3) > button";


    public static final String WIKIURL = "https://www.wikipedia.org/";
    public static final String WCATURL = "https://en.wikipedia.org/wiki/Cat";
    public static final String SEARCHDROP = "searchLanguage";
    public static final String SEARCHID =  "searchInput";
    public static final String SEARVALU = "cat";
    public static final String SERCHBUTN = "/html/body/div[3]/form/fieldset/button/i";
    public static final String COPYCSS = "#mw-content-text > div.mw-parser-output > p:nth-child(36)";
    public static final String FOLDER = "C:\\Users\\Refael Levi\\Desktop\\NEW PROJECTS\\IdeaProjects\\FinallProject\\Screenshots";

    public static final String JPG = ".jpg";
    public static final String TXT = ".txt";

//    public static ChromeDriver setupDriver(){
//        System.setProperty("webdriver.chrome.driver","res\\chromedriver.exe");
//        return new ChromeDriver();
//    }
}
