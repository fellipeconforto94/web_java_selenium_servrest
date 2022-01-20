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
    JSONObject loginJson = null;

    public void realizarLogin(String json) throws Exception {


        if (json == "valido") {
            loginJson = JsonObj.getJsonDataObject("LoginData", "valido");
        }
        if (json == "admin") {
            loginJson = JsonObj.getJsonDataObject("LoginData", "valido_admin");
        }

        if (json == "invalido") {
            loginJson = JsonObj.getJsonDataObject("LoginData", "invalido");
        }
        if (json == "sem dados") {
            loginJson = JsonObj.getJsonDataObject("LoginData", "vazio");
        }

        sendKeys(dadosLogin.inputEmailLogin, (String) loginJson.get("email"));
        sendKeys(dadosLogin.inputSenhaLogin, (String) loginJson.get("senha"));
        click(dadosLogin.btnEntrarLogin);
    }

    public void realizarLoginSucesso() throws Exception {

        realizarLogin("valido");
        isVisible(homeElements.btnHome);
    }

    public void realizarLoginSucessoAdmin() throws Exception {

        realizarLogin("admin");
        isVisible(homeElements.btnHome);
    }


    public void realizarLoginInvalido() throws Exception {

        realizarLogin("invalido");
        isVisible(dadosLogin.msgEmailSenhaInvalidos);
        Assert.assertEquals(loginJson.get("errorMsgEmailSenhaInvalidos"), getTextFromLabel(dadosLogin.msgEmailSenhaInvalidos));
        System.out.println("Result:"+getTextFromLabel(dadosLogin.msgEmailSenhaInvalidos));
    }

    public void realizarLoginSemDados() throws Exception {

        realizarLogin("sem dados");
        isVisible(dadosLogin.msgEmailObg);
        Assert.assertEquals(loginJson.get("errorMsgEmailObrigatorio"), getTextFromLabel(dadosLogin.msgEmailObg));
        Assert.assertEquals(loginJson.get("errorMsgSenhaObrigatorio"), getTextFromLabel(dadosLogin.msgSenhaObg));
    }
}
