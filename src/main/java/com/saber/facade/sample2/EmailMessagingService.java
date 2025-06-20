package com.saber.facade.sample2;

public class EmailMessagingService implements MessagingService {
    private static EmailMessagingService emailMessagingService;
    public static EmailMessagingService getInstance() {
        if (emailMessagingService == null)
            emailMessagingService = new EmailMessagingService();
        return emailMessagingService;
    }
    private EmailMessagingService(){}
    @Override
    public void sendMessage(String sender, String receiver, String message) {
        System.out.printf("send email message from %s to %s\n", sender, receiver);
        System.out.printf("message email send with message %s\n", message);
    }
}
