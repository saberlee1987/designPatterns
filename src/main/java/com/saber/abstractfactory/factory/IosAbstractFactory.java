package com.saber.abstractfactory.factory;

import com.saber.abstractfactory.MobileAppProperties;
import com.saber.abstractfactory.app.IosApp;
import com.saber.abstractfactory.app.MobileApp;

public class IosAbstractFactory implements MobileAppFactory{
    @Override
    public MobileApp constructMobileApp(MobileAppProperties mobileAppProperties) {
        return new IosApp(mobileAppProperties);
    }
}
