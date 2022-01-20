package Core.Suits;

import Core.Action.ListarUsuariosPage.ListarUsuariosAction;
import Core.Action.LoginPage.CadastrarAction;
import Core.Action.LoginPage.LoginAction;
import Hooks.DriverInit;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CtsListarExcluirUsuarios extends DriverInit {

    LoginAction dadosLogin = new LoginAction();
    ListarUsuariosAction listarUsuarios = new ListarUsuariosAction();

    @Test
    // Cadastrar usuario perfil Admin e validar na lista de Usuarios
    public void ct01_validar_nome_lista() throws Exception {

        dadosLogin.realizarLoginSucesso();
        listarUsuarios.validarUsuarioAdminCriado();
    }

    @Test
    // Cadastrar usuario perfil Admin e validar e excluir na lista de Usuarios
    public void ct02_excluir_usuario_lista() throws Exception {

        dadosLogin.realizarLoginSucessoAdmin();
        listarUsuarios.excluirUsuarioPadraoCriado();
        listarUsuarios.excluirUsuarioAdminCriado();
    }
}
