package com.saber.facade.sample2;

public class SmsMessagingService implements MessagingService {
    private static SmsMessagingService smsMessagingService;
    public static SmsMessagingService getInstance() {
        if (smsMessagingService == null)
            smsMessagingService = new SmsMessagingService();
        return smsMessagingService;
    }
    private SmsMessagingService(){}
    @Override
    public void sendMessage(String sender, String receiver, String message) {
        System.out.printf("send sms message from %s to %s\n", sender, receiver);
        System.out.printf("message sms send with message %s\n", message);
    }
}
