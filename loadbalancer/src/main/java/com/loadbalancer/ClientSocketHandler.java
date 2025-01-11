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
            
            
            
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
