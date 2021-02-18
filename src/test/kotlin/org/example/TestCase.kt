package org.example

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.testng.Assert
import org.testng.annotations.*

class TestCase {

    private var driver: WebDriver? = null

    @BeforeClass
    fun setUp(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver")
        driver = ChromeDriver()
    }

    @AfterClass
    fun tearDown(){
        driver!!.quit()
    }

    @Test
    fun test01(){

        val url = "https://zoom.us/"
        driver!!.get(url)
        Assert.assertEquals(driver!!.currentUrl, url)
    }
}