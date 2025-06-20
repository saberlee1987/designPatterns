package com.saber.facade.sample2;

public class PushNotificationlMessagingService implements MessagingService {
    private static PushNotificationlMessagingService pushNotificationlMessagingService;
    public static PushNotificationlMessagingService getInstance() {
        if (pushNotificationlMessagingService == null)
            pushNotificationlMessagingService = new PushNotificationlMessagingService();
        return pushNotificationlMessagingService;
    }
    private PushNotificationlMessagingService(){}
    @Override
    public void sendMessage(String sender, String receiver, String message) {
        System.out.printf("send push notification message from %s to %s\n", sender, receiver);
        System.out.printf("message push notification send with message %s\n", message);
    }
}
