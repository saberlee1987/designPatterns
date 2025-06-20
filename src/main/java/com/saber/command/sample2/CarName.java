package com.saber.command.sample2;

public enum CarName {
    pride_131("pride 131"),
    pego_206("pego 206"),
    pego_207("pego207"),
    dena_plus("dena plus"),
    soren_plus("soren plus"),
    benz_E("benz E"),
    benz_C("benz C"),
    bmw_x3("bmw x3"),
    bmw_x4("bmw x4"),
    bmw_x6("bmw x6");

  public String name;

    CarName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
