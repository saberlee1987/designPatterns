package com.saber.facade.sample2;

public class MessagingFacade {

    public void sendMessage(MessageType messageType,String sender,String receiver,String content){
        switch (messageType) {
            case SMS -> SmsMessagingService.getInstance().sendMessage(sender,receiver,content);
            case EMAIL -> EmailMessagingService.getInstance().sendMessage(sender,receiver,content);
            case PUSH_NOTIFICATION -> PushNotificationlMessagingService.getInstance().sendMessage(sender,receiver,content);
            default -> System.out.println("unsupported operation");
        }
    }
}
