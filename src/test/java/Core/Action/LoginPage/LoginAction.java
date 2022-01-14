package Core.Action.LoginPage;

import Core.Dsl.Commands;
import Core.PagesMap.LoginPageElements.LoginElements;
import Utils.JsonObj;
import org.json.simple.JSONObject;

public class LoginAction extends Commands {
    
    LoginElements dadosLogin = new LoginElements();

    public void realizarLoginSucesso() throws Exception {

        JSONObject loginJson = JsonObj.getJsonDataObject("LoginData", "valido");
        
        sendKeys(dadosLogin.inputEmailLogin, (String)loginJson.get("email"));
        sendKeys(dadosLogin.inputSenhaLogin, (String)loginJson.get("senha"));
        click(dadosLogin.btnEntrarLogin);
    }

    public void realizarLoginInvalido() throws Exception {

        JSONObject loginJson = JsonObj.getJsonDataObject("LoginData", "invalido");

        sendKeys(dadosLogin.inputEmailLogin, (String)loginJson.get("email"));
        sendKeys(dadosLogin.inputSenhaLogin,(String)loginJson.get("senha"));
        click(dadosLogin.btnEntrarLogin);
    }

    public void realizarLoginSemDados() throws Exception {

        JSONObject loginJson = JsonObj.getJsonDataObject("LoginData", "vazio");

        sendKeys(dadosLogin.inputEmailLogin, (String)loginJson.get("email"));
        sendKeys(dadosLogin.inputSenhaLogin,(String)loginJson.get("senha"));
        click(dadosLogin.btnEntrarLogin);
    }
}
