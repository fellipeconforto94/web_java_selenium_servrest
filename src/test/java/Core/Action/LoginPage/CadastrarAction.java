package Core.Action.LoginPage;

import Core.Dsl.Commands;
import Core.PagesMap.CadastrarPageElements.CadastrarElements;
import Core.PagesMap.LoginPageElements.LoginElements;
import Utils.Geradores;
import Utils.JsonObj;
import org.json.simple.JSONObject;
import org.junit.Assert;

public class CadastrarAction extends Commands {

    Geradores geradores;
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
        Assert.assertEquals(cadastrarJson.get("mensagemCadastroSucesso"), getTextFromLabel(dadosCadastrar.msgCadastroSucesso));
        System.out.println(getTextFromLabel(dadosCadastrar.msgCadastroSucesso));
    }

    public void cadastrarSucessoAdmin() throws Exception {

        JSONObject cadastrarJson = JsonObj.getJsonDataObject("CadastrarData", "sucesso");

        System.out.println("Cadastro com Administrador");
        click(dadosLogin.btnCadastreLogin);
        sendKeys(dadosCadastrar.inputNome, (String)cadastrarJson.get("nome_completo"));
        sendKeys(dadosCadastrar.inputEmailCadastrar, (String)cadastrarJson.get("email_admin"));
        sendKeys(dadosCadastrar.inputSenhaCadastrar, (String)cadastrarJson.get("senha"));
        click(dadosCadastrar.cbAdmin);
        click(dadosCadastrar.btnCadastrar);
        isAttachedToHtml(dadosCadastrar.msgCadastroSucesso);
        Assert.assertEquals(cadastrarJson.get("mensagemCadastroSucesso"), getTextFromLabel(dadosCadastrar.msgCadastroSucesso));
        System.out.println(getTextFromLabel(dadosCadastrar.msgCadastroSucesso));
    }

    public void cadastrarEmailExistente() throws Exception {

        JSONObject cadastrarJson = JsonObj.getJsonDataObject("CadastrarData", "email_existente");

        click(dadosLogin.btnCadastreLogin);
        sendKeys(dadosCadastrar.inputNome, (String)cadastrarJson.get("nome_completo"));
        sendKeys(dadosCadastrar.inputEmailCadastrar, (String)cadastrarJson.get("email"));
        sendKeys(dadosCadastrar.inputSenhaCadastrar, (String)cadastrarJson.get("senha"));
        click(dadosCadastrar.cbAdmin);
        click(dadosCadastrar.btnCadastrar);
        Assert.assertEquals(cadastrarJson.get("mensagemEmailUsado"), getTextFromLabel(dadosCadastrar.msgEmailExistente));
        System.out.println("Result:"+getTextFromLabel(dadosCadastrar.msgEmailExistente));
    }
}
