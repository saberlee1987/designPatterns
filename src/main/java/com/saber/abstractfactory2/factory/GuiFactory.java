package com.saber.abstractfactory2.factory;

import com.saber.abstractfactory2.gui.buttons.Button;
import com.saber.abstractfactory2.gui.checkboxes.CheckBox;

public interface GuiFactory {
    Button createButton();
    CheckBox createCheckBox();
}
