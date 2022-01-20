package Core.Action.ListarUsuariosPage;

import Core.Dsl.Commands;
import Core.PagesMap.ListarUsuariosPageElements.ListarUsuariosElements;
import Core.PagesMap.LoginPageElements.LoginElements;

public class ListarUsuariosAction extends Commands {

    ListarUsuariosElements listarUsuarios = new ListarUsuariosElements();

    public void validarUsuarioPadraoCriado(){

        click(listarUsuarios.btnListarUsuarios);
        isVisible(listarUsuarios.nomeLista);
        System.out.println("Nome:"+getTextFromLabel(listarUsuarios.nomeLista));
    }

    public void validarUsuarioAdminCriado(){

        click(listarUsuarios.btnListarUsuarios);
        isVisible(listarUsuarios.nomeListaAdmin);
        System.out.println("Nome:"+getTextFromLabel(listarUsuarios.nomeListaAdmin));
    }

    public void excluirUsuarioPadraoCriado(){

        validarUsuarioPadraoCriado();
        click(listarUsuarios.btnExcluirPadrao);
        isNotVisible(listarUsuarios.nomeLista);
    }

    public void excluirUsuarioAdminCriado(){

        validarUsuarioAdminCriado();
        isAttachedToHtml(listarUsuarios.btnExcluirAdmin);
        click(listarUsuarios.btnExcluirAdmin);
        click(listarUsuarios.btnExcluirAdmin);
        isNotVisible(listarUsuarios.nomeListaAdmin);
    }
}
