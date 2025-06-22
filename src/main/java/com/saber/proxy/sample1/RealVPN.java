package com.saber.proxy.sample1;

public class RealVPN implements VPN {
    private final String serverAddress;

    public RealVPN(String serverAddress) {
        this.serverAddress = serverAddress;
    }

    @Override
    public void connect() {
        System.out.println("connect to server ==> "+serverAddress);
    }
}
