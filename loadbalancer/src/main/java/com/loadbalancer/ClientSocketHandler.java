package com.loadbalancer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import com.loadbalancer.utils.BackendServers;

public class ClientSocketHandler implements Runnable {
    
    private Socket clientSocket;
    
    public ClientSocketHandler(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        try {
            InputStream clientToLbInputStream = clientSocket.getInputStream();
            OutputStream lbToClientOutputStream = clientSocket.getOutputStream();
            
            String backendHost = BackendServers.getHost();
            System.out.println("Host selected for this request: " + backendHost);
            
            Socket backendSocket = new Socket(backendHost, 8080);
            OutputStream lbToBackendServerOutputStream = backendSocket.getOutputStream();
            InputStream backendServerToLbInputStream = backendSocket.getInputStream();
            
            
            
            
            
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
