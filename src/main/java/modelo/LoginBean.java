/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

/**
 *
 * @author gregorio
 */

@RequestScoped

public class LoginBean {
    @Inject
private Usuario usuario;
private String nomeUsuario;
private String senha;
public String login() {
    
FacesContext context = FacesContext.getCurrentInstance();
if ("admin".equals(this.nomeUsuario)
&& "123".equals(this.senha)) {
this.usuario.setNome(this.nomeUsuario);
this.usuario.setDataLogin(new Date());
return "/ConsultaLancamentos?faces-redirect=true";
}else {
    FacesMessage mensagem = new FacesMessage(
        "Usuário/senha inválidos");
    mensagem.setSeverity(FacesMessage.SEVERITY_ERROR);
    context.addMessage(null, mensagem);
}
return null;
}
     public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

}