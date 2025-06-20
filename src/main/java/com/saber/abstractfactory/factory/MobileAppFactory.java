package com.saber.abstractfactory.factory;

import com.saber.abstractfactory.MobileAppProperties;
import com.saber.abstractfactory.app.MobileApp;

public interface MobileAppFactory {
      MobileApp constructMobileApp(MobileAppProperties mobileAppProperties) ;
}
