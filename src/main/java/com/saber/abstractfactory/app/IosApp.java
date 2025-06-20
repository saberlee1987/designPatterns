package com.saber.abstractfactory.app;

import com.saber.abstractfactory.MobileAppProperties;

public class IosApp implements MobileApp {
    private String name;
    private String version;

    public IosApp(MobileAppProperties mobileAppProperties) {
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
        System.out.printf("building %s  IOS app%n",getName());
    }

    @Override
    public String toString() {
        return "IosApp{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
