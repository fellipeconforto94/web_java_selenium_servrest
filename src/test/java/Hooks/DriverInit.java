package Hooks;
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
    public void afterExecution() throws IOException {

        driver.quit();
    }
}
