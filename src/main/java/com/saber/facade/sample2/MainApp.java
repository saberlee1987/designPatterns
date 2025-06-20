package com.saber.facade.sample2;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("facade 2");
        MessagingFacade messagingFacade = new MessagingFacade();
        messagingFacade.sendMessage(MessageType.SMS,"saber","elahe","hello from saber");
        System.out.println("=======================================================================================================");
        messagingFacade.sendMessage(MessageType.EMAIL,"saber","elahe","hello from saber");
        System.out.println("=======================================================================================================");
        messagingFacade.sendMessage(MessageType.PUSH_NOTIFICATION,"saber","elahe","hello from saber");

    }
}
