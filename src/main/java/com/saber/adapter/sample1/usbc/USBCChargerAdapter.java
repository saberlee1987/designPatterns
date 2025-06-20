package com.saber.adapter.sample1.usbc;

import com.saber.adapter.sample1.charge.Charger;

public class USBCChargerAdapter implements Charger {
  private final USBCCharger usbcCharger;

    public USBCChargerAdapter(USBCCharger usbcCharger) {
        this.usbcCharger = usbcCharger;

    }

    @Override
    public void charge() {
        usbcCharger.usbCCharger();
    }
}
