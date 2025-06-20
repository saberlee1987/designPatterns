package com.saber.adapter.sample1.microusb;

import com.saber.adapter.sample1.charge.Charger;

public class MicroUSBChargerAdapter implements Charger {
  private final MicroUSBCharger microUSBCharger;

    public MicroUSBChargerAdapter(MicroUSBCharger microUSBCharger) {
        this.microUSBCharger = microUSBCharger;

    }

    @Override
    public void charge() {
        microUSBCharger.microUsbCharger();
    }
}
