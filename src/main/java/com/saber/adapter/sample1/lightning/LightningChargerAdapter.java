package com.saber.adapter.sample1.lightning;

import com.saber.adapter.sample1.charge.Charger;

public class LightningChargerAdapter implements Charger {
  private final LightningCharger lightningCharger;

    public LightningChargerAdapter(LightningCharger lightningCharger) {
        this.lightningCharger = lightningCharger;

    }

    @Override
    public void charge() {
        lightningCharger.lightningCharger();
    }
}
