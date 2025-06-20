package com.saber.command.sample1;

import com.saber.command.sample1.command.Command;
import lombok.Setter;

@Setter
public class RemoteController {
    private Command command;

    public void pressButton(){
        if (command!=null) {
            command.execute();
        }
    }
}
