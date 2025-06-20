package com.saber.abstractfactory;

import com.saber.abstractfactory.app.MobileApp;
import com.saber.abstractfactory.factory.AndroidAbstractAppFactory;
import com.saber.abstractfactory.factory.IosAbstractFactory;

public class Main {
    public static void main(String[] args) {
        MobileApp app = new IosAbstractFactory().constructMobileApp(
                new MobileAppProperties("iosApp","ver1.0.0")
        );
        app.buildApp();
        app = new AndroidAbstractAppFactory().constructMobileApp(
                new MobileAppProperties("androidApp","ver1.0.0")
        );
        app.buildApp();
    }
}
