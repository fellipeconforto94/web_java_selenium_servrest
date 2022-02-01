package Hooks;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static Core.Dsl.Commands.getDriver;

public class DriverInit extends DriverLoading {

    public static String caminhoEvidenciaCompletoErros = "";
    public static int contadorPassos = 1;

    @Before
    public void beforeRunTest() throws IOException {

        driver = initDriver();
        driver.get(property.getProperty("url"));
    }

    @Rule
   public TestName testName = new TestName();

    @After
    public void afterRunTest() throws IOException {

        takeScreenshot("Tela Fechamento");
        driver.quit();
    }

    /*
     * Screenshot da tela aplica nome da tela no nome do screenshot variavel screen
     */
    public static void takeScreenshot(String screen) throws IOException {

        String carimbo_data = getCarimboData();
        File arquivo = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
        String fullPath =  "target" + File.separator + "evidencias" +
                File.separator + "/" + carimbo_data + " - " + "Passo " + contadorPassos + " - " + screen + ".png";
        caminhoEvidenciaCompletoErros = fullPath;

        FileUtils.copyFile(arquivo, new File(fullPath));
        contadorPassos++;
    }


     //retorna o carimbo da data no formato selecionado

    public static String getCarimboData() {
        String pattern = "yyyyMMddHHmmss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        System.out.println(date);
        return date;
    }

}


