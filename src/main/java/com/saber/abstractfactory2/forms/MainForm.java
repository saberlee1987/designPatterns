package com.saber.abstractfactory2.forms;

import com.saber.abstractfactory2.factory.GuiFactory;

public class MainForm {
    private final GuiFactory guiFactory;

    public MainForm(GuiFactory guiFactory) {
        this.guiFactory = guiFactory;
    }

    public void createUiForm(){
        guiFactory.createButton().draw();
        guiFactory.createCheckBox().draw();
    }
}
