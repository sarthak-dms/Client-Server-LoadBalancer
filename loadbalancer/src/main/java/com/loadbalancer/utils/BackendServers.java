package com.loadbalancer.utils;

import java.util.ArrayList;
import java.util.List;

public class BackendServers {
    private static List<String> servers = new ArrayList<>();
    private static int counter = 0;
    
    static {
        servers.add("IP1");
        servers.add("IP2");
    }
    
    public static String getHost() {
        String host =  servers.get(counter%servers.size());
        counter++;
        return host;
    }
}
