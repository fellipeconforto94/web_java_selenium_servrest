package Core.Action.LoginPage;

import Core.Dsl.Commands;
import Core.PagesMap.HomePageElements.HomeElements;
import Core.PagesMap.LoginPageElements.LoginElements;
import Utils.JsonObj;
import org.json.simple.JSONObject;
import org.junit.Assert;

public class LoginAction extends Commands {
    
    LoginElements dadosLogin = new LoginElements();
    HomeElements homeElements = new HomeElements();

    public void realizarLoginSucesso() throws Exception {

        JSONObject loginJson = JsonObj.getJsonDataObject("LoginData", "valido");
        
        sendKeys(dadosLogin.inputEmailLogin, (String)loginJson.get("email"));
        sendKeys(dadosLogin.inputSenhaLogin, (String)loginJson.get("senha"));
        click(dadosLogin.btnEntrarLogin);
        isVisible(homeElements.btnHome);
    }

    public void realizarLoginInvalido() throws Exception {

        JSONObject loginJson = JsonObj.getJsonDataObject("LoginData", "invalido");

        sendKeys(dadosLogin.inputEmailLogin, (String)loginJson.get("email"));
        sendKeys(dadosLogin.inputSenhaLogin,(String)loginJson.get("senha"));
        click(dadosLogin.btnEntrarLogin);
        isVisible(dadosLogin.msgEmailSenhaInvalidos);
        Assert.assertEquals(loginJson.get("errorMsgEmailSenhaInvalidos"), getTextFromLabel(dadosLogin.msgEmailSenhaInvalidos));
        System.out.println("Result:"+getTextFromLabel(dadosLogin.msgEmailSenhaInvalidos));
    }

    public void realizarLoginSemDados() throws Exception {

        JSONObject loginJson = JsonObj.getJsonDataObject("LoginData", "vazio");

        sendKeys(dadosLogin.inputEmailLogin, (String)loginJson.get("email"));
        sendKeys(dadosLogin.inputSenhaLogin,(String)loginJson.get("senha"));
        click(dadosLogin.btnEntrarLogin);
        isVisible(dadosLogin.msgEmailObg);
        Assert.assertEquals(loginJson.get("errorMsgEmailObrigatorio"), getTextFromLabel(dadosLogin.msgEmailObg));
        Assert.assertEquals(loginJson.get("errorMsgSenhaObrigatorio"), getTextFromLabel(dadosLogin.msgSenhaObg));
    }
}
