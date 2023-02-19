/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jerry
 */
public class Server {
    
    private String server;
    private String port;

    public Server() {
    }

    public Server(String server, String port) {
        this.server = server;
        this.port = port;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "Server{" + "server=" + server + ", port=" + port + '}';
    }
    
    
    
}
