package com.saber.abstractfactory2.factory;

import com.saber.abstractfactory2.gui.buttons.Button;
import com.saber.abstractfactory2.gui.buttons.LightButton;
import com.saber.abstractfactory2.gui.checkboxes.CheckBox;
import com.saber.abstractfactory2.gui.checkboxes.LightCheckBox;

public class LightGuiFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new LightCheckBox();
    }
}
