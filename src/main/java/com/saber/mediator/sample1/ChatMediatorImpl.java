package com.saber.mediator.sample1;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {
    private List<User> users = new ArrayList<>();

    @Override
    public void joinToChat(User user) {
        if (!users.stream().map(User::getUsername)
                .toList().contains(user.getUsername())) {
            System.out.println(user.getUsername()+" join to group ....");
            users.add(user);
        }
    }

    @Override
    public void sendMessage(String message, User sender) {
        if (sender != null) {
            users = users.stream()
                    .filter(user -> !user.getUsername().equals(sender.getUsername()))
                    .toList();
            for (User user : users) {
                user.receiveMessage(message);
            }
        }
    }
}
