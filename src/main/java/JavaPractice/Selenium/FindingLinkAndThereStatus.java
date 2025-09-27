package JavaPractice.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v137.fetch.Fetch;
import org.openqa.selenium.devtools.v137.fetch.model.RequestPattern;
import org.openqa.selenium.devtools.v137.network.model.ErrorReason;
import org.openqa.selenium.devtools.v139.network.Network;
import org.openqa.selenium.devtools.v139.network.model.Response;
import org.openqa.selenium.devtools.v139.network.model.Request;

import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class FindingLinkAndThereStatus {

    @Test
    public void findLinksUsingHTTPConnection() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/");

     List<WebElement> links = driver.findElements(By.tagName("a"));

     for(WebElement link: links){
        String url =  link.getAttribute("href");
         //System.out.println(url);

         if(url == null || url.isEmpty()){
             System.out.println("URL is blank");
             continue;
         }
         try {
             URL linkUrl = new URL(url);

             HttpURLConnection httpURLConnection = (HttpURLConnection) linkUrl.openConnection();
             httpURLConnection.setRequestMethod("HEAD");
             httpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0");
             httpURLConnection.setInstanceFollowRedirects(true);
             httpURLConnection.connect();

             int responseCode = httpURLConnection.getResponseCode();

             if (responseCode >= 400) {
                 System.out.println(url + " Link is broken " + responseCode);
             } else {
                 System.out.println(url + " Link is ok " + responseCode);
             }
         }
         catch (Exception e){
             System.out.println(e);
         }
     }

    }

    @Test
    public void useDOMSelenium4(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        DevTools devTools = driver.getDevTools();
        devTools.createSession();




        devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty(),Optional.empty()));
        devTools.addListener(Network.responseReceived(),response->{
            int status = response.getResponse().getStatus();
            String url = response.getResponse().getUrl();
            System.out.println(url + " --> "+ status);
        });
        driver.get("https://rahulshettyacademy.com/");

        List<WebElement> links =driver.findElements(By.tagName("a"));

        for(WebElement link: links) {
            String url = link.getAttribute("href");
            try {
                // Open link in the same tab
                driver.get(url);
                Thread.sleep(1000); // small wait to allow network request to complete
            } catch (Exception e) {
                System.out.println("Failed to open: " + url);
            }

        }

        /*
        devTools.addListener(Network.requestWillBeSent(), request ->

        {
            Request req = request.getRequest();
            System.out.println(req.getUrl());
            //req.getHeaders()

        });

        //Event will get fired-
        devTools.addListener(Network.responseReceived(), response ->

        {
            Response res = response.getResponse();
            System.out.println(res.getUrl());
            System.out.println(res.getStatus());
            if(res.getStatus().toString().startsWith("4"))
            {
                System.out.println(res.getUrl()+"is failing with status code"+res.getStatus());
            }
        });
        driver.get("https://rahulshettyacademy.com/");
        driver.findElement(By.xpath("//li[@class='current']/following-sibling::li")).click();
         */
    }
}
