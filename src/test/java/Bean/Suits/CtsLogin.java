package Bean.Suits;

import Bean.Action.LoginPage.LoginAction;
import Hooks.DriverInit;
import org.junit.Test;

public class CtsLogin extends DriverInit {

    LoginAction dadosDoLogin = new LoginAction();

    @Test
    public void ct01_login_sucesso() throws Exception {

        dadosDoLogin.realizarLogin();

    }

}
