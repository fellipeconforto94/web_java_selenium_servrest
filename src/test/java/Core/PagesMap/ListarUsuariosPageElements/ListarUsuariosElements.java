package Core.PagesMap.ListarUsuariosPageElements;

import org.openqa.selenium.By;

public class ListarUsuariosElements {

    public final By btnListarUsuarios = By.xpath("//a[text()='Listar Usuários']");
    public final By nomeLista = By.xpath("//td[text()='Fc Qa']");
    public final By nomeListaAdmin = By.xpath("//td[text()='Fc Qa Admin']");
    public final By btnExcluirPadrao = By.xpath("//td[text()='Fc Qa']/..//button[text()='Excluir']");
    public final By btnExcluirAdmin = By.xpath("//td[text()='Fc Qa Admin']/..//button[text()='Excluir']");

}
