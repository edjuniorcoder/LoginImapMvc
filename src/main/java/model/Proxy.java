/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jerry
 */
public class Proxy {
    
   private Boolean useProxy;
   private Boolean useAuth;
   private String host;
   private int port;
   private String username;
   private String pass;

    public Proxy(Boolean useProxy, Boolean useAuth, String host, int port, String username, String pass) {
        this.useProxy = useProxy;
        this.useAuth = useAuth;
        this.host = host;
        this.port = port;
        this.username = username;
        this.pass = pass;
    }
    
    public Proxy() {
    }


    public Boolean getUseProxy() {
        return useProxy;
    }

    public void setUseProxy(Boolean useProxy) {
        this.useProxy = useProxy;
    }

    public Boolean getUseAuth() {
        return useAuth;
    }

    public void setUseAuth(Boolean useAuth) {
        this.useAuth = useAuth;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    
    
    
    
}
