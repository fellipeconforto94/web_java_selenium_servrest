package Hooks;
import Core.Dsl.Commands;
import Core.PagesMap.CadastrarPageElements.CadastrarElements;
import Core.PagesMap.LoginPageElements.LoginElements;
import org.junit.After;
import org.junit.Before;

import java.io.IOException;

public class DriverInit extends DriverLoading {

    @Before
    public void beforeRunTest() throws IOException {

        driver = initDriver();
        driver.get(property.getProperty("url"));
    }

    @After
    public void afterRunTest() throws IOException {

        //driver.quit();
    }

    // Base para CTs

    LoginElements loginElements = new LoginElements();
    CadastrarElements cadastrarElements = new CadastrarElements();
}
