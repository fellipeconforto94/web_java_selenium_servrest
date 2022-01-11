package Bean.Action.LoginPage;

import Bean.Dsl.Commands;
import Bean.PagesMap.LoginPageElements.LoginElements;

public class LoginAction extends Commands {

    LoginElements dadosLogin = new LoginElements();

    public void realizarLogin() throws Exception {

        sendKeys(dadosLogin.inputEmailLogin, "fellipeteste@teste.com");
        sendKeys(dadosLogin.inputSenhaLogin,"12345678");
        click(dadosLogin.btnEntrarLogin);

    }


}
