package com.saber.mediator.sample1;

public interface ChatMediator {
    void joinToChat(User user);
    void sendMessage(String message,User sender);
}
