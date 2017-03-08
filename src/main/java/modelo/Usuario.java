/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author gregorio
 */

@SessionScoped
public class Usuario implements Serializable {
private static final long serialVersionUID=1l;    
private  String nome;
private Date dataLogin;
public boolean isLogado(){
    return nome != null;
}

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getNome() {
        return nome;
    }

    public Date getDataLogin() {
        return dataLogin;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataLogin(Date dataLogin) {
        this.dataLogin = dataLogin;
    }
}
