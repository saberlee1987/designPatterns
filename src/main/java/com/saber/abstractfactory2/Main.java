package com.saber.abstractfactory2;

import com.saber.abstractfactory2.configs.ApplicationTheme;
import com.saber.abstractfactory2.factory.DarkGuiFactory;
import com.saber.abstractfactory2.factory.GuiFactory;
import com.saber.abstractfactory2.factory.LightGuiFactory;
import com.saber.abstractfactory2.forms.MainForm;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
public class Main {
    private static final Map<Integer, GuiFactory> guiFactoryHashMap = new HashMap<>();
    static {
        guiFactoryHashMap.put(ApplicationTheme.LIGHT.getCode(), new LightGuiFactory());
        guiFactoryHashMap.put(ApplicationTheme.DARK.getCode(), new DarkGuiFactory());
    }
    private static GuiFactory getGuiFactory(Integer code) {
        GuiFactory guiFactory = guiFactoryHashMap.getOrDefault(code, null);
        if (guiFactory == null) {
            throw new IllegalArgumentException("code is invalid");
        }
        return guiFactory;
    }
    public static void main(String[] args) {
        Random random = new Random();
        int code = random.nextInt(2);
        GuiFactory guiFactory = getGuiFactory(code);
        MainForm mainForm = new MainForm(guiFactory);
        mainForm.createUiForm();
    }
}