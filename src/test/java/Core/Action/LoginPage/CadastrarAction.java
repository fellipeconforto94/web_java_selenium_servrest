package Core.Action.LoginPage;

import Core.Dsl.Commands;
import Core.PagesMap.CadastrarPageElements.CadastrarElements;
import Core.PagesMap.LoginPageElements.LoginElements;
import Utils.JsonObj;
import org.json.simple.JSONObject;
import org.junit.Assert;

public class CadastrarAction extends Commands {

    LoginElements dadosLogin = new LoginElements();
    CadastrarElements dadosCadastrar = new CadastrarElements();

    public void cadastrarSucesso() throws Exception {

        JSONObject cadastrarJson = JsonObj.getJsonDataObject("CadastrarData", "sucesso");

        click(dadosLogin.btnCadastreLogin);
        sendKeys(dadosCadastrar.inputNome, (String)cadastrarJson.get("nome_completo"));
        sendKeys(dadosCadastrar.inputEmailCadastrar, (String)cadastrarJson.get("email"));
        sendKeys(dadosCadastrar.inputSenhaCadastrar, (String)cadastrarJson.get("senha"));
        click(dadosCadastrar.btnCadastrar);
        isAttachedToHtml(dadosCadastrar.msgCadastroSucesso);
        Assert.assertEquals("Cadastro realizado com sucesso", getTextFromLabel(dadosCadastrar.msgCadastroSucesso));
        System.out.println(dadosCadastrar.msgCadastroSucesso);
    }

    public void cadastrarSucessoAdmin() throws Exception {

        JSONObject cadastrarJson = JsonObj.getJsonDataObject("CadastrarData", "sucesso");

        sendKeys(dadosCadastrar.inputNome, (String)cadastrarJson.get("nome_completo"));
        sendKeys(dadosCadastrar.inputEmailCadastrar, (String)cadastrarJson.get("email"));
        sendKeys(dadosCadastrar.inputSenhaCadastrar, (String)cadastrarJson.get("senha"));
        click(dadosCadastrar.cbAdmin);
        click(dadosCadastrar.btnCadastrar);
        isAttachedToHtml(dadosCadastrar.msgCadastroSucesso);
        Assert.assertEquals("Cadastro realizado com sucesso", getTextFromLabel(dadosCadastrar.msgCadastroSucesso));
        System.out.println(dadosCadastrar.msgCadastroSucesso);
    }

    public void cadastrarFalha() throws Exception {

        JSONObject cadastrarJson = JsonObj.getJsonDataObject("CadastrarData", "sucesso");

        sendKeys(dadosCadastrar.inputNome, (String)cadastrarJson.get("nome_completo"));
        sendKeys(dadosCadastrar.inputSenhaCadastrar, (String)cadastrarJson.get("senha"));
        click(dadosCadastrar.btnCadastrar);
    }
}
