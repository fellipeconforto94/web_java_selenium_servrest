package Core.Action.LoginPage;

import Core.Dsl.Commands;
import Core.PagesMap.CadastrarPageElements.CadastrarElements;
import Core.PagesMap.HomePageElements.HomeElements;
import Core.PagesMap.LoginPageElements.LoginElements;
import Utils.Geradores;
import Utils.JsonObj;
import org.json.simple.JSONObject;
import org.junit.Assert;

public class CadastrarAction extends Commands {

    LoginElements dadosLogin = new LoginElements();
    CadastrarElements dadosCadastrar = new CadastrarElements();
    HomeElements home = new HomeElements();
    JSONObject cadastrarJson = null;

    public void cadastrar(String json, String tipo) throws Exception {

        if (json == "sucesso") {
            cadastrarJson = JsonObj.getJsonDataObject("CadastrarData", "sucesso");
        }
        if (json == "admin_total") {
            cadastrarJson = JsonObj.getJsonDataObject("CadastrarData", "admin_total");
        }
        if (json == "existente") {
            cadastrarJson = JsonObj.getJsonDataObject("CadastrarData", "email_existente");
        }

        click(dadosLogin.btnCadastreLogin);

        if(tipo == "admin") {
            sendKeys(dadosCadastrar.inputNome, (String) cadastrarJson.get("nome_completo_admin"));
            sendKeys(dadosCadastrar.inputEmailCadastrar, (String) cadastrarJson.get("email_admin"));
            click(dadosCadastrar.cbAdmin);
        } else {
            sendKeys(dadosCadastrar.inputNome, (String) cadastrarJson.get("nome_completo"));
            sendKeys(dadosCadastrar.inputEmailCadastrar, (String) cadastrarJson.get("email"));
        }
        sendKeys(dadosCadastrar.inputSenhaCadastrar, (String) cadastrarJson.get("senha"));
        click(dadosCadastrar.btnCadastrar);
    }

    public void cadastrarSucesso() throws Exception {

        cadastrar("sucesso", "padrao");
        isAttachedToHtml(dadosCadastrar.msgCadastroSucesso);
        Assert.assertEquals(cadastrarJson.get("mensagemCadastroSucesso"), getTextFromLabel(dadosCadastrar.msgCadastroSucesso));
        System.out.println(getTextFromLabel(dadosCadastrar.msgCadastroSucesso));
        isVisible(home.btnHome);
    }

    public void cadastrarSucessoAdmin() throws Exception {

        cadastrar("sucesso", "admin");
        isAttachedToHtml(dadosCadastrar.msgCadastroSucesso);
        Assert.assertEquals(cadastrarJson.get("mensagemCadastroSucesso"), getTextFromLabel(dadosCadastrar.msgCadastroSucesso));
        System.out.println(getTextFromLabel(dadosCadastrar.msgCadastroSucesso));
        isVisible(home.btnHome);
    }

    public void cadastrarSucessoAdminTotal() throws Exception {

        cadastrar("admin_total", "admin");
        isAttachedToHtml(dadosCadastrar.msgCadastroSucesso);
        Assert.assertEquals(cadastrarJson.get("mensagemCadastroSucesso"), getTextFromLabel(dadosCadastrar.msgCadastroSucesso));
        System.out.println(getTextFromLabel(dadosCadastrar.msgCadastroSucesso));
        isVisible(home.btnHome);
    }

    public void cadastrarEmailExistente() throws Exception {

        cadastrar("existente", "admin");
        Assert.assertEquals(cadastrarJson.get("mensagemEmailUsado"), getTextFromLabel(dadosCadastrar.msgEmailExistente));
        System.out.println("Result:"+getTextFromLabel(dadosCadastrar.msgEmailExistente));
    }
}
