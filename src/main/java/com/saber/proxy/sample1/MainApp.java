package com.saber.proxy.sample1;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("sample 1 proxy .... ");
        VPN vpn = new VPNProxy("10.39.27.15");
        vpn.connect();
    }
}
