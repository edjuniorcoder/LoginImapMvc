/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;
import model.MailSession;
import model.Proxy;
import model.User;
import view.ViewLogin;

/**
 *
 * @author jerry
 */
public class LoginController {

    private User user;
    private ViewLogin viewLogin;
    private Proxy proxy;

    public LoginController(User user, Proxy proxy, ViewLogin viewLogin) {
        this.user = user;
        this.viewLogin = viewLogin;
        this.proxy = proxy;
    }

    public void login() {

        viewLogin.changeStatus("Iniciando Login");

        Session session = MailSession.getSessionImap(user, user, proxy);


        try {
            Store store = session.getStore("imap");
            store.connect();

            if (store.isConnected()) {
                //Informa ao usuário o status da conexão
                viewLogin.changeStatus("Conectado");
            } else {
                //Informa ao usuário o status da conexão
                viewLogin.changeStatus("Não Conectado");
            }

        } catch (javax.mail.AuthenticationFailedException ex) {
            viewLogin.changeStatus("AuthenticationFailedException");
        } catch (NoSuchProviderException ex) {
            viewLogin.changeStatus("NoSuchProviderException");
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            viewLogin.changeStatus("MessagingException");
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            viewLogin.changeStatus("Exception");
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ViewLogin getViewLogin() {
        return viewLogin;
    }

    public void setViewLogin(ViewLogin viewLogin) {
        this.viewLogin = viewLogin;
    }

    public Proxy getProxy() {
        return proxy;
    }

    public void setProxy(Proxy proxy) {
        this.proxy = proxy;
    }

    @Override
    public String toString() {
        return "LoginController{" + "user=" + user + ", viewLogin=" + viewLogin + ", proxy=" + proxy + '}';
    }

}
