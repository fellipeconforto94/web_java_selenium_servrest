package Core.PagesMap.CadastrarPageElements;

import org.openqa.selenium.By;

public class CadastrarElements {

    public final By inputNome = By.id("nome");
    public final By inputEmailCadastrar = By.id("email");
    public final By inputSenhaCadastrar = By.id("password");
    public final By cbAdmin = By.id("administrador");
    public final By btnCadastrar = By.xpath("//button[text()='Cadastrar']");
    public final By msgCadastroSucesso = By.xpath("//a[text()='Cadastro realizado com sucesso']");
}
