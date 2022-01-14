package Core.Suits;

import Core.Action.LoginPage.CadastrarAction;
import Core.Dsl.Commands;
import Hooks.DriverInit;
import org.junit.Assert;
import org.junit.Test;

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
    public void ct03_cadastrar_falha() throws Exception {

        dadosDoCadastro.cadastrarFalha();
    }

}
