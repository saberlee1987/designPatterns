package com.saber.abstractfactory.factory;

import com.saber.abstractfactory.MobileAppProperties;
import com.saber.abstractfactory.app.AndroidApp;
import com.saber.abstractfactory.app.MobileApp;

public class AndroidAbstractAppFactory implements MobileAppFactory {
    @Override
    public MobileApp constructMobileApp(MobileAppProperties mobileAppProperties) {
        return new AndroidApp(mobileAppProperties);
    }
}
