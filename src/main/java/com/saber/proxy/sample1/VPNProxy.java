package com.saber.proxy.sample1;

public class VPNProxy implements VPN {
    private final VPN realVpn;

    public VPNProxy(String serverAddress) {
        realVpn = new RealVPN(serverAddress);
    }

    @Override
    public void connect() {
        realVpn.connect();
    }
}
