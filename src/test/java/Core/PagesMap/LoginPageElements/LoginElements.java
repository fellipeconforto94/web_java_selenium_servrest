package Core.PagesMap.LoginPageElements;

import org.openqa.selenium.By;

public class LoginElements {

    public final By inputEmailLogin = By.id("email");
    public final By inputSenhaLogin = By.id("password");
    public final By btnEntrarLogin = By.xpath("//button[text()='Entrar']");
    public final By btnCadastreLogin = By.xpath("//a[text()='Cadastre-se']");
    public final By msgEmailSenhaInvalidos = By.xpath("//span[text()='Email e/ou senha inválidos']");
}
