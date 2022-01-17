package Hooks;
import Core.PagesMap.CadastrarPageElements.CadastrarElements;
import Core.PagesMap.LoginPageElements.LoginElements;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import static Core.Dsl.Commands.getDriver;

public class DriverInit extends DriverLoading {

    @Before
    public void beforeRunTest() throws IOException {

        driver = initDriver();
        driver.get(property.getProperty("url"));
    }

    @Rule
    public TestName testName = new TestName();

    @After
    public void afterRunTest() throws IOException {

        TakesScreenshot ss = (TakesScreenshot) getDriver();
        File arquivo = ss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(arquivo, new File("target" + File.separator + "screenshot" +
                        File.separator + testName.getMethodName() + ".jpg"));


        driver.quit();
    }

    // Base para CTs

    LoginElements loginElements = new LoginElements();
    CadastrarElements cadastrarElements = new CadastrarElements();
}


