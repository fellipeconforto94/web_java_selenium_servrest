package Core.Suits;

import Core.Action.LoginPage.LoginAction;
import Core.Dsl.Commands;
import Core.PagesMap.CadastrarPageElements.CadastrarElements;
import Hooks.DriverInit;
import org.junit.Assert;
import org.junit.Test;

public class CtsLogin extends DriverInit {

    LoginAction dadosDoLogin = new LoginAction();

    @Test
    public void ct01_login_sucesso() throws Exception {

        dadosDoLogin.realizarLoginSucesso();

    }

    @Test
    public void ct02_login_invalido() throws Exception {

        dadosDoLogin.realizarLoginInvalido();

    }

    @Test
    public void ct03_login_sem_dados() throws Exception {

        dadosDoLogin.realizarLoginSemDados();

    }

}
