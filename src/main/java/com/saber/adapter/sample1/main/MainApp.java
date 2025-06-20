package com.saber.adapter.sample1.main;

import com.saber.adapter.sample1.charge.Charger;
import com.saber.adapter.sample1.lightning.LightningCharger;
import com.saber.adapter.sample1.lightning.LightningChargerAdapter;
import com.saber.adapter.sample1.microusb.MicroUSBCharger;
import com.saber.adapter.sample1.microusb.MicroUSBChargerAdapter;
import com.saber.adapter.sample1.usbc.USBCCharger;
import com.saber.adapter.sample1.usbc.USBCChargerAdapter;
import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Charger> chargers = new ArrayList<>();
        USBCChargerAdapter usbcChargerAdapter = new USBCChargerAdapter(
                new USBCCharger()
        );
        MicroUSBChargerAdapter microUSBChargerAdapter = new MicroUSBChargerAdapter(
          new MicroUSBCharger()
        );
        LightningChargerAdapter lightningChargerAdapter = new LightningChargerAdapter(
          new LightningCharger()
        );
        chargers.add(usbcChargerAdapter);
        chargers.add(microUSBChargerAdapter);
        chargers.add(lightningChargerAdapter);
        for (Charger charger : chargers) {
            charger.charge();
        }
    }
}