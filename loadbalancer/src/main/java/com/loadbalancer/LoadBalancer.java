package com.loadbalancer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class LoadBalancer 
{
    public static void main( String[] args ) throws IOException
    {
        ServerSocket serverSocket = new ServerSocket(8081);
        System.out.println("LoadBalancer started on port: " + 8081);
        
        while(true) {
            Socket socket = serverSocket.accept();
            System.out.println("New client connected: " + socket.toString());
        }
    }
}
