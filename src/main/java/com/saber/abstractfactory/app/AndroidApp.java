package com.saber.abstractfactory.app;

import com.saber.abstractfactory.MobileAppProperties;

public class AndroidApp implements MobileApp {
    private String name;
    private String version;

    public AndroidApp(MobileAppProperties mobileAppProperties) {
        this.name = mobileAppProperties.getName();
        this.version = mobileAppProperties.getVersion();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getName() {
        return this.name;
    }
    public String getVersion() {
        return this.version;
    }

    @Override
    public void buildApp() {
        System.out.printf("building %s  Android app%n",getName());
    }

    @Override
    public String toString() {
        return "AndroidApp{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
