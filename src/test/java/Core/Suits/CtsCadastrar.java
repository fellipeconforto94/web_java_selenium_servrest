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
    // Cadastrar usuario com sucesso perfil normal
    public void ct01_cadastrar_sucesso() throws Exception {

        dadosDoCadastro.cadastrarSucesso();
    }

    @Test
    // Cadastrar usuario com sucesso como administrador
    public void ct02_cadastrar_sucesso_admin() throws Exception {

        dadosDoCadastro.cadastrarSucessoAdmin();
    }

    @Test
    // Cadastrar usuario com sucesso como administrador Total
    public void ct03_cadastrar_sucesso_admin_total() throws Exception {

        dadosDoCadastro.cadastrarSucessoAdminTotal();
    }

    @Test
    // Cadastrar usuario com email já cadastrado
    public void ct04_email_existente() throws Exception {

        dadosDoCadastro.cadastrarEmailExistente();
    }

}
