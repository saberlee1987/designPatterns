package com.saber.abstractfactory2.factory;

import com.saber.abstractfactory2.gui.buttons.Button;
import com.saber.abstractfactory2.gui.buttons.DarkButton;
import com.saber.abstractfactory2.gui.checkboxes.CheckBox;
import com.saber.abstractfactory2.gui.checkboxes.DarkCheckBox;

public class DarkGuiFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new DarkCheckBox();
    }
}
