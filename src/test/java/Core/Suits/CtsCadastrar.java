package Core.Suits;

import Core.Action.LoginPage.CadastrarAction;
import Hooks.DriverInit;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CtsCadastrar extends DriverInit {

    CadastrarAction dadosDoCadastro = new CadastrarAction();

    @Test
    public void ct01_cadastrar_sucesso() throws Exception {

        dadosDoCadastro.cadastrarSucesso();
    }

    @Test
    public void ct02_cadastrar_sucesso_admin() throws Exception {

        dadosDoCadastro.cadastrarSucessoAdmin();
    }

    @Test
    public void ct03_email_existente() throws Exception {

        dadosDoCadastro.cadastrarEmailExistente();
    }

}
