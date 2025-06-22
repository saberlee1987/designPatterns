package com.saber.mediator.sample1;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class User {
    private final String username;
    private final ChatMediator chatMediator;

    public void sendMessage(String message) {
        chatMediator.sendMessage(message,this);
    }

    public void receiveMessage(String message) {
        System.out.println(username+" received message ===> "+message);
    }

}
